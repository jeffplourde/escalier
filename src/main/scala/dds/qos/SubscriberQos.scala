package dds.qos

object SubscriberQos {
	def apply() = new SubscriberQos(Partition(""))
	def apply(p: Partition) = new SubscriberQos(p)
}
class SubscriberQos(val partition: Partition) {
  def <= (p: Partition) = SubscriberQos(p)
  def + (p: Partition) = SubscriberQos(p)
}