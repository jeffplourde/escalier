package dds.demo.ishapes

import scala.swing._
import scala.swing.event._
import BorderPanel.Position._
import Swing._
import dds.qos.DataWriterQos

object WriterQosDialog extends Dialog {
	
	title = "Writer QoS"

	var qos: DataWriterQos = DataWriterQos()
		
	private def setQos = {
		// set qos according to values set in Dialog
		println("update QoS")
	}
	
	private def initDialog = {
		// set Dialog's buttons + spinners values accorindg to qos
		println("init buttons")
		reliability.select(besteffort)
		ownership.select(shared)
		strength.setValue(50)
		durability.selection.item = Volatile
		priority.setValue(50)
	}
	
	override def open = {
		initDialog
		super.open
	}
	
	private val reliability = new ButtonGroup
	private val reliable = new RadioButton("Reliable")
	private val besteffort = new RadioButton("Best Effort")
	private val reliabilityButtons = List(reliable, besteffort)
	reliability.buttons ++= reliabilityButtons
	
	private val ownership = new ButtonGroup
	private val shared = new RadioButton("Shared")
	private val exclusive = new RadioButton("Exclusive")
	private val strength = new javax.swing.JSpinner
	private val ownershipButtons = List(shared, exclusive)
	ownership.buttons ++= ownershipButtons
	
	case class DurabilityKind(name: String)
	object Volatile   extends DurabilityKind("Volatile")
	object Transient  extends DurabilityKind("Transient")
	object Persistent extends DurabilityKind("Persistent")
	private val durability = new ComboBox(List(Volatile, Transient, Persistent)) { 
		renderer = ListView.Renderer(_.name) 
	}
	
	private val priority = new javax.swing.JSpinner

	private val ok = new Button("OK")
	private val cancel = new Button("Cancel")
	
	contents = new BoxPanel(Orientation.Vertical) {
		border = Swing.EmptyBorder(10, 10, 10, 10)

		contents += new BoxPanel(Orientation.Vertical) {
			border = CompoundBorder(TitledBorder(EtchedBorder, "Reliability QoS"), EmptyBorder(5,5,5,10))
			
			contents += new BoxPanel(Orientation.Horizontal) {
				contents ++= reliabilityButtons
			}
		}

		contents += new BoxPanel(Orientation.Vertical) {
			border = CompoundBorder(TitledBorder(EtchedBorder, "Ownership QoS"), EmptyBorder(5,5,5,10))
			
			contents += new BoxPanel(Orientation.Horizontal) {
				contents ++= ownershipButtons
			}
			contents += Component.wrap(strength)
		}

		contents += new BoxPanel(Orientation.Vertical) {
			border = CompoundBorder(TitledBorder(EtchedBorder, "Durability QoS"), EmptyBorder(5,5,5,10))
			
			contents += durability
		}

		contents += new BoxPanel(Orientation.Vertical) {
			border = CompoundBorder(TitledBorder(EtchedBorder, "Transport Priority QoS"), EmptyBorder(5,5,5,10))
			
			contents += Component.wrap(priority)
		}

		contents += new BoxPanel(Orientation.Horizontal) {
			contents += ok
			contents += cancel
		}
	}
	
	listenTo(ok, cancel)
	reactions += {
		case ButtonClicked(`ok`) =>
			println("OK "+durability.selection.item.name)
			setQos
			close
		case ButtonClicked(`cancel`) =>
			println("Cancel "+durability.selection.item.name)
			close
	}

}