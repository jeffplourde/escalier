package dds.demo.ishapes

import org.opensplice.demo.ShapeType
import dds._
import dds.pub.{Publisher, DataWriter}
import dds.sub.{Subscriber, DataReader}


object ShapesDDSTopics {
	
	lazy val topics: Map[ShapeKind, Topic[ShapeType]] = 
		Map( ((circleKind, Topic[ShapeType]("Circle"))),
			 ((squareKind, Topic[ShapeType]("Square"))),
			 ((triangleKind, Topic[ShapeType]("Triangle")))
		)
	
	def getDataWriter(kind: ShapeKind) =
		DataWriter[ShapeType](topics(kind))
	
	def getDataReader(kind: ShapeKind) = 
		DataReader[ShapeType](topics(kind))
	
	def apply() {
		println("DDS Runtime start")
		//Runtime start
	}
}