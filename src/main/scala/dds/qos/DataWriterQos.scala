package dds.qos


object DataWriterQos {
  def apply() = new DataWriterQos(Durability.Volatile,
    History.KeepLast(1),
    Ownership.Shared,
    Reliability.BestEffort)
}

class DataWriterQos(val durability: Durability,
                    val history: History,
                    val ownership: Ownership,
                    val reliability: Reliability) {

  def <= (d: Durability) = new DataWriterQos(d, history, ownership, reliability)
  def <= (h: History) = new DataWriterQos(durability, h, ownership, reliability)
  def <= (o: Ownership) = new DataWriterQos(durability, history, o, reliability)
  def <= (r: Reliability) = new DataWriterQos(durability, history, ownership, r)
}