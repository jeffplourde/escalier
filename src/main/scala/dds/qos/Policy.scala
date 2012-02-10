package dds.qos

/**
 * Base class for all QoS Policies.
 *  
 * @author Angelo Corsaro <mailto:angelo.corsaro@gmail.com>
 *
 */
abstract class Policy {
	def name: String
	def id: Int
}


/**
 * The <code>Reliability</code> QoS Policy controls whether data will be 
 * distributed reliably among the publisher and matched subscribers or 
 * in a best effor manner.
 *   
 * @author Angelo Corsaro  <mailto:angelo.corsaro@gmail.com>
 *
 */
abstract class Reliability() extends Policy {
	def name = "Reliability"
	def id = 11
}


object Reliability {
  case object Reliable extends Reliability {
    override def toString = name + "[reliable]"
  }

  case object BestEffort extends Reliability {
    override def toString = name + "[best-effort]"
  }
}
/**
 * The <code>History</code> QoS Policy allows to control the number
 * of samples per instance that the infrastructure will store in the
 * local cache (either on the reader or writer side). 
 * 
 * @author Angelo Corsaro  <mailto:angelo.corsaro@gmail.com>
 */
abstract class History() extends Policy {
	def name = "History"
	def id   = 13

}

object History {

  case class KeepLast(depth: Int) extends History {
    require(depth > 0)
    override def toString = name + "[" + depth + "]"
  }

  case object KeepAll extends History {
    override def toString = name
  }
}
/**
 * The <code>Owenership</code> QoS Policy controls whether 
 * more than one writer can concurrently change the same instance or not.
 * 
 * @author Angelo Corsaro  <mailto:angelo.corsaro@gmail.com>
 *
 */
abstract class Ownership() extends Policy {
	def name = "Ownership"
	def id = 6
	
}

object Ownership {
  case object Shared extends Ownership {
    override def toString = name + "[shared]"
  }

  case class Exclusive(strength: Int = 0) extends Ownership {
    require (strength > 0)
    override def toString = name + "[exclusive]"
  }
}
/**
 * The <code>Durability</code> QoS Policy controls the degrees of time
 * decoupling between the producer and consumers of data.
 * 
 * @author Angelo Corsaro  <mailto:angelo.corsaro@gmail.com>
 *
 */
abstract class Durability() extends Policy {
	def name = "Durability"
	def id = 22
}
object Durability {

  case object Volatile extends Durability {
    override def toString = name + "[Volatile]"
  }

  case object TransientLocal extends Durability {
    override def toString = name + "[TransientLocal]"
  }

  case object Transient extends Durability {
    override def toString = name + "[Transient]"
  }

  case object Persistent extends Durability {
    override def toString = name + "[Persistent]"
  }

}
case class TopicData() extends Policy {
	def name = "TopicData"
	def id = 18
	override def toString = name
}
case class DurabilityService() extends Policy {
	def name = "DurabilityService"
	def id = 22
	override def toString = name
}

case class Deadline() extends Policy {
	def name = "Deadline"
	def id = 4
	override def toString = name
}

case class LatencyBudget() extends Policy {
	def name = "LatencyBudget"
	def id = 5
	override def toString = name
}
case class Liveliness() extends Policy {
	def name = "Liveliness"
	def id = 8
	override def toString = name
}

abstract class DestinationOrder() extends Policy {
	def name = "DestinationOrder"
	def id = 12
}
object DestinationOrder {
  case object SourceTimeStamp extends DestinationOrder {
    override def toString = name + "[Source]"
  }
  case object DestinationTimeStamp extends DestinationOrder {
    override def toString = name + "[Destination]"
  }
}
case class ResourceLimits() extends Policy {
	def name = "ResourceLimits"
	def id = 14
	override def toString = name
}

case class TransportPriority(prio: Int) extends Policy {
	require(prio > 0)
	def name = "TransportPriority"
	def id = 20
	override def toString = name

}

case class Lifespan() extends Policy {
	def name = "LifeSpan"
	def id = 21
	override def toString = name
}

object Partition {
  def apply(p: String) = new Partition(List[String](p))
}

case class Partition(val partitions: List[String]) extends Policy {
  val id = 10
  val name = "Partition"

  override def toString = name + partitions.toString

}