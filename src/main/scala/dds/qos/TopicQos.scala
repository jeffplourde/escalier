package dds.qos

object TopicQos {
	def apply() = new TopicQos(Durability.Volatile,
                                  History.KeepLast(1),
                                  Ownership.Shared,
                                  Reliability.BestEffort)
}

class TopicQos(val durability: Durability,
                    val history: History,
                    val ownership: Ownership,
                    val reliability: Reliability) {

  def <= (d: Durability) = new TopicQos(d, history, ownership, reliability)
  def <= (h: History) = new TopicQos(durability, h, ownership, reliability)
  def <= (o: Ownership) = new TopicQos(durability, history, o, reliability)
  def <= (r: Reliability) = new TopicQos(durability, history, ownership, r)
}