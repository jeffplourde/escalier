package dds.qos

object PublisherQos {
	def apply() = new PublisherQos(Partition(""))
	def apply(p: Partition) = new PublisherQos(p)
}
class PublisherQos(val partition: Partition) {
  def <= (p: Partition) = PublisherQos(p)
  
  def + (p: Partition) = PublisherQos(p)
}
