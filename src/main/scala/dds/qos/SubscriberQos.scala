package dds.qos

object SubscriberQos {
	def apply() = new SubscriberQos(Partition(""))
}
class SubscriberQos(val partition: Partition) {
  def <=(p: Partition) = new SubscriberQos(p)
}