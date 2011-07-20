package dds.ospl

import dds.{Topic, DomainParticipant, ContentFilteredTopic}
import dds.pub.Publisher
import dds.sub.Subscriber
import dds.qos.{TopicQos, PublisherQos, SubscriberQos}

class DomainParticipantImpl(domain: Int) extends DomainParticipant(domain) {

	val ddsPeer : DDS.DomainParticipant = createDdsDP
	
	private def createDdsDP() : DDS.DomainParticipant = {
		val dpf = DDS.DomainParticipantFactory.get_instance()
		val holder = new DDS.DomainParticipantQosHolder
		dpf.get_default_participant_qos(holder)
    // @TODO: Pass the proper domain
		dpf.create_participant("", holder.value, null, DDS.STATUS_MASK_ANY_V1_2.value)
	}
	
	
	def ignoreEntity(name: String) : Unit = { }	
	
	def createTopic[T](name: String, qos: TopicQos)(implicit m: Manifest[T]) : Topic[T] = {
		new TopicImpl[T](this, name, qos)
	}
	
	
	def createPublisher(partition: Array[String]) : Publisher = null
	
	def createPublisher( partition: String) : Publisher = null
	
	def createPublisher(qos: PublisherQos) : Publisher = {
		new PublisherImpl(this, qos)
	}
	
	def createSubscriber(name: String, partition: Array[String]) : Subscriber = null
	
	def createSubscriber(name: String, partition: String) : Subscriber = null
	
	def createSubscriber(qos: SubscriberQos) : Subscriber = {
		new SubscriberImpl(this, qos)
	}

  def createContentFilteredTopic[T](name: String, topic: Topic[T],filter: String,params: List[String])
  (implicit m: Manifest[T]): ContentFilteredTopic[T]  = new ContentFilteredTopicImpl[T](name, topic, filter, params)

}
	