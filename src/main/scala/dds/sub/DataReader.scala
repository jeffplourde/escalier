package dds.sub

import dds.qos.{DataReaderQos, SubscriberQos, Partition}
import dds.{BaseTopic, ContentFilteredTopic, Entity, Topic}
import swing.Reactions


object DataReader {

	var defaultSubscriber: Subscriber = null

	def apply[T](sub: Subscriber,
                 t: BaseTopic[T],
                 qos: DataReaderQos) (implicit m: Manifest[T])
        = sub.createDataReader(t, qos)

    def apply[T](sub: Subscriber,
                t: BaseTopic[T]) (implicit m: Manifest[T])
        = sub.createDataReader(t, DataReaderQos())

    def apply[T](t: BaseTopic[T],
                 qos: DataReaderQos) (implicit m: Manifest[T]) = {
        if (defaultSubscriber == null)
        	defaultSubscriber = Subscriber(t.dp)
    	defaultSubscriber.createDataReader(t, qos)
  	}

    def apply[T](t: BaseTopic[T]) (implicit m: Manifest[T]) = {
    	if (defaultSubscriber == null)
    		defaultSubscriber = Subscriber(t.dp)
		defaultSubscriber.createDataReader(t, DataReaderQos())
  	}

    def apply[T](t: BaseTopic[T],
                 qos: DataReaderQos,
                 subQos: SubscriberQos) (implicit m: Manifest[T]) = {
        def sub = Subscriber(t.dp, subQos)
        sub.createDataReader(t, qos)
    }

    def apply[T](t: BaseTopic[T],
                 qos: DataReaderQos,
                 partitions: String*) (implicit m: Manifest[T]) = {
        def sub = Subscriber(t.dp, SubscriberQos(partitions toList))
        sub.createDataReader(t, qos)
    }

}

abstract class DataReader[T](val sub: Subscriber,
                             val topic: BaseTopic[T],
                             val qos: DataReaderQos)
                            (implicit m: Manifest[T]) extends Entity {


    type Peer = DDS.DataReader

    val reactions = new Reactions.Impl

    def read(s: SampleSelector): Array[T]

    def read: Array[T] =  this.read(SampleSelector.NewData)

  def read(n: Int, s: SampleSelector = SampleSelector.NewData): Array[T]
  def read(instance: T): Array[T]
  def read(handle: Long): Array[T]

  def read[SampleSeqHolder](data: SampleSeqHolder)

  def take(s: SampleSelector): Array[T]
  // def take(handle: Long): Array[T]
  def take: Array[T] = this.take(SampleSelector.NewData)
  def take(n: Int, s: SampleSelector = SampleSelector.NewData): Array[T]

  def history(): Array[T] = {
    this.read(SampleSelector.AllData)
  }
  def history(instance: T): Array[T]

  def history(handle: Long): Array[T]

  def lookupInstance(instance: T): Option[Long]
}
