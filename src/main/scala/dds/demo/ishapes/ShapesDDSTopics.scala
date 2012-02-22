package dds.demo.ishapes

import org.opensplice.demo.ShapeType
import dds._
import dds.pub.{Publisher, DataWriter}
import dds.sub.{Subscriber, DataReader}
import scala.sys.SystemProperties


object ShapesDDSTopics {
  
    lazy val domainId = sys.props.getOrElse("dds.domainId", "0")
	
    lazy val domainParticipant = DomainParticipant(domainId.toInt)
  
	lazy val topics: Map[ShapeKind, Topic[ShapeType]] = 
		Map( ((circleKind, Topic[ShapeType](domainParticipant, "Circle"))),
			 ((squareKind, Topic[ShapeType](domainParticipant, "Square"))),
			 ((triangleKind, Topic[ShapeType](domainParticipant, "Triangle")))
		)
	
	def getDataWriter(kind: ShapeKind) = {
    	println("Create DataWriter for " + kind + " with qos: " + WriterQosDialog.qos)
		DataWriter[ShapeType](topics(kind), WriterQosDialog.qos)
    }
	
	def getDataReader(kind: ShapeKind) = {
    	println("Create DataReader for " + kind + " with qos: " + ReaderQosDialog.qos)
		DataReader[ShapeType](topics(kind), ReaderQosDialog.qos)
	}
}