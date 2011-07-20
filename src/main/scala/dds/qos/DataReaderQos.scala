package dds.qos


object DataReaderQos {
	def apply() = new DataReaderQos(VolatileDurability(),
                                  KeepLastHistory(1),
                                  SharedOwnership(),
                                  BestEffort())
}

class DataReaderQos(val durability: Durability,
                    val history: History,
                    val ownership: Ownership,
                    val reliability: Reliability) {

  def <= (d: Durability) = new DataReaderQos(d, history, ownership, reliability)
  def <= (h: History) = new DataReaderQos(durability, h, ownership, reliability)
  def <= (o: Ownership) = new DataReaderQos(durability, history, o, reliability)
  def <= (r: Reliability) = new DataReaderQos(durability, history, ownership, r)
}