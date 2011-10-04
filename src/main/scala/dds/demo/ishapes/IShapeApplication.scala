package dds.demo.ishapes

import scala.swing._
import scala.util._
import scala.swing.Swing._
import scala.swing.event._
import java.awt.{BorderLayout}
import javax.swing.{JPanel, JButton}


object IShapeConstants {
	val MINIMUM_SHAPE_SIZE = 10
	val MAXIMUM_SHAPE_SIZE = 100
	val DEFAULT_SHAPE_SIZE = 50
	val MINIMUM_SHAPE_SPEED = 1
	val MAXIMUM_SHAPE_SPEED = 10
	val DEFAULT_SHAPE_SPEED = 3
	val REFRESH_TIMEOUT = 40
	val SHAPE_PANEL_WIDTH  = 500
	val SHAPE_PANEL_HEIGHT = 360
}
import IShapeConstants._



object IShapeApplication extends SimpleSwingApplication {
		
	// create a ShapesDataReader according to ShapeKind and ShapeType
	def createShapesDataReader(shape: ShapeKind) = shape match {
		case `circleKind` => new CircleDataReader
		case `squareKind` => new SquareDataReader
		case `triangleKind` => new TriangleDataReader
	}

	// create a BouncingShape according to ShapeKind and ShapeType
	def createBouncingShapeComponent(kind: ShapeKind, size: Int, color: String, shapeSpeed: Int) = {
		val data = BouncingShape.shapeWithRandomPosition(size, color)
		kind match {
			case `circleKind` =>
			 	new Circle(data) with CircleTag with BouncingShape with PublishedShape {
			 		override val whiteTagColor = true
			 		override val speed = shapeSpeed
			 		override val datawriter = ShapesDDSTopics.getDataWriter(kind)
			 		override def updatePosition() = {
			 			super.updatePosition()
			 			publish()
			 		}
			 	}
			case `squareKind` => 
				new Square(data) with CircleTag with BouncingShape with PublishedShape {
			 		override val whiteTagColor = true
					override val speed = shapeSpeed
			 		override val datawriter = ShapesDDSTopics.getDataWriter(kind)
			 		override def updatePosition() = {
			 			super.updatePosition()
			 			publish()
			 		}
				}
			case `triangleKind` => 
				new Triangle(data) with CircleTag with BouncingShape with PublishedShape {
			 		override val whiteTagColor = true
					override val speed = shapeSpeed
			 		override val datawriter = ShapesDDSTopics.getDataWriter(kind)
			 		override def updatePosition() = {
			 			super.updatePosition()
			 			publish()
			 		}
				}
		}
	}

	// define a ComboBox for shape selection
	def shapeBox = new ComboBox(List(circleKind, squareKind, triangleKind)) {
		renderer = ListView.Renderer(_.name)
	}

	// define a ComboBox for color selection	
	def colorBox = new ComboBox(List("blue", "red", "green", "orange", "yellow", "magenta", "cyan"))
	
	val pubShapeBox = shapeBox
	val pubColorBox = colorBox
	val pubQosButton = new Button("QoS")
	object pubSizeSlider extends Slider {
		min = MINIMUM_SHAPE_SIZE
		max = MAXIMUM_SHAPE_SIZE
		value = DEFAULT_SHAPE_SIZE
	}
	object pubSpeedSlider extends Slider {
		min = MINIMUM_SHAPE_SPEED
		max = MAXIMUM_SHAPE_SPEED
		value = DEFAULT_SHAPE_SPEED
	}
	val pubButton   = new Button("publish")
	
	
	val subShapeBox = shapeBox
	val subQosButton = new Button("QoS")
	val subFilterButton = new Button("Filter")
	val subButton   = new Button("subscribe")
	
	
	def top = new MainFrame {
		title = "DDS IShape"
		resizable = false
		contents = new BoxPanel(Orientation.Horizontal) {
			border = Swing.EmptyBorder(10, 10, 10, 10)
			
			contents += new BoxPanel(Orientation.Vertical) {
				border = Swing.EmptyBorder(5, 5, 5, 5)
				
				contents += new BoxPanel(Orientation.Vertical) {
					border = CompoundBorder(TitledBorder(EtchedBorder, "Publisher"), EmptyBorder(5,5,5,10))
					contents += new FlowPanel(new Label("Shape:"), pubShapeBox)
					contents += new FlowPanel(new Label("Color:"), pubColorBox)
					contents += new FlowPanel(new Label("Size:"), pubSizeSlider)
					contents += new FlowPanel(new Label("Speed:"), pubSpeedSlider)
					contents += pubQosButton
					contents += pubButton
				}
				
				contents += new Separator
				contents += new BoxPanel(Orientation.Vertical) {
					border = CompoundBorder(TitledBorder(EtchedBorder, "Subscriber"), EmptyBorder(5,5,5,10))
					contents += new FlowPanel(new Label("Shape:"), subShapeBox)
					contents += subQosButton
					contents += subFilterButton
					contents += subButton
				}
			}
			
			contents += new Separator
			
			contents += ShapesPanel
		}
	}

	
	listenTo(pubQosButton, subQosButton, subFilterButton, pubButton, subButton)
	reactions += {
		case ButtonClicked(`pubQosButton`) =>
			WriterQosDialog.open()
		case ButtonClicked(`subQosButton`) =>
		case ButtonClicked(`subFilterButton`) =>
		case ButtonClicked(`pubButton`) =>
			val shape = createBouncingShapeComponent(pubShapeBox.selection.item,
												     pubSizeSlider.value,
												     pubColorBox.selection.item.toUpperCase,
													 pubSpeedSlider.value)
			ShapesManager += shape
		case ButtonClicked(`subButton`) =>
			val shapeDataReader = createShapesDataReader(subShapeBox.selection.item)
			ShapesManager += shapeDataReader
		
		
	}
	

	
	override def startup(args: Array[String]): Unit = {
		super.startup(args)
		ShapesManager start()
		println("IShapeApplication started")
	}
	
}