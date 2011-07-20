package dds.ospl

import dds._
import dds.qos._
import dds.time._
import DDS.ReliabilityQosPolicyKind.{RELIABLE_RELIABILITY_QOS, BEST_EFFORT_RELIABILITY_QOS}
import DDS.DurabilityQosPolicyKind.{
VOLATILE_DURABILITY_QOS,
TRANSIENT_LOCAL_DURABILITY_QOS,
TRANSIENT_DURABILITY_QOS,
PERSISTENT_DURABILITY_QOS}

import DDS.HistoryQosPolicyKind.{KEEP_ALL_HISTORY_QOS, KEEP_LAST_HISTORY_QOS}
import DDS.{PublisherQosHolder, DomainParticipant, DataReaderQosHolder, DataReaderQos}

object Runtime {



  def topicQos2DDSQos(dp: dds.DomainParticipant, qos: dds.qos.TopicQos) : DDS.TopicQos = {

      val qosH = new DDS.TopicQosHolder
      dp.ddsPeer.get_default_topic_qos(qosH)
      val ddsQos = qosH.value

      qos.durability match {
        case v: VolatileDurability =>
          ddsQos.durability.kind = DDS.DurabilityQosPolicyKind.VOLATILE_DURABILITY_QOS
        case v: TransientLocalDurability =>
          ddsQos.durability.kind = DDS.DurabilityQosPolicyKind.TRANSIENT_LOCAL_DURABILITY_QOS
        case v: TransientDurability =>
          ddsQos.durability.kind = DDS.DurabilityQosPolicyKind.TRANSIENT_DURABILITY_QOS
        case v: PersistentDurability =>
          ddsQos.durability.kind = DDS.DurabilityQosPolicyKind.PERSISTENT_DURABILITY_QOS
      }

      qos.history match {
        case kl: dds.qos.KeepLastHistory => {
          ddsQos.history.kind = DDS.HistoryQosPolicyKind.KEEP_LAST_HISTORY_QOS
          ddsQos.history.depth = kl.depth
        }
        case ka: dds.qos.KeepAllHistory => {
          ddsQos.history.kind = DDS.HistoryQosPolicyKind.KEEP_ALL_HISTORY_QOS
        }
      }

      qos.ownership match {
        case o: SharedOwnership =>
          ddsQos.ownership.kind = DDS.OwnershipQosPolicyKind.SHARED_OWNERSHIP_QOS

        case o: ExclusiveOwnership =>
          ddsQos.ownership.kind = DDS.OwnershipQosPolicyKind.EXCLUSIVE_OWNERSHIP_QOS
      }

      qos.reliability match {
        case r: BestEffort =>
          ddsQos.reliability.kind = DDS.ReliabilityQosPolicyKind.BEST_EFFORT_RELIABILITY_QOS

        case r: Reliable =>
          ddsQos.reliability.kind = DDS.ReliabilityQosPolicyKind.RELIABLE_RELIABILITY_QOS
      }

      ddsQos
    }

    def publisherQos2DDSQos(dp: dds.DomainParticipant, qos: dds.qos.PublisherQos) : DDS.PublisherQos = {
      val qosH = new DDS.PublisherQosHolder
      dp.ddsPeer.get_default_publisher_qos(qosH)
      val ddsQos = qosH.value

      ddsQos.partition.name = qos.partition.partitions.toArray
      ddsQos
    }

    def subscriberQos2DDSQos(dp: dds.DomainParticipant, qos: dds.qos.SubscriberQos) : DDS.SubscriberQos = {
      val qosH = new DDS.SubscriberQosHolder
      dp.ddsPeer.get_default_subscriber_qos(qosH)
      val ddsQos = qosH.value

      ddsQos.partition.name = qos.partition.partitions.toArray
      ddsQos
    }


    def dataReaderQos2DDSQos(qos: dds.qos.DataReaderQos,
                             sub: dds.sub.Subscriber) : DDS.DataReaderQos = {
      val qosH = new DDS.DataReaderQosHolder
      sub.ddsPeer.get_default_datareader_qos(qosH)
      val ddsQos = qosH.value

      qos.durability match {
        case v: VolatileDurability =>
          ddsQos.durability.kind = DDS.DurabilityQosPolicyKind.VOLATILE_DURABILITY_QOS
        case v: TransientLocalDurability =>
          ddsQos.durability.kind = DDS.DurabilityQosPolicyKind.TRANSIENT_LOCAL_DURABILITY_QOS
        case v: TransientDurability =>
          ddsQos.durability.kind = DDS.DurabilityQosPolicyKind.TRANSIENT_DURABILITY_QOS
        case v: PersistentDurability =>
          ddsQos.durability.kind = DDS.DurabilityQosPolicyKind.PERSISTENT_DURABILITY_QOS
      }

      qos.history match {
        case kl: dds.qos.KeepLastHistory => {
          ddsQos.history.kind = DDS.HistoryQosPolicyKind.KEEP_LAST_HISTORY_QOS
          ddsQos.history.depth = kl.depth
        }
        case ka: dds.qos.KeepAllHistory => {
          ddsQos.history.kind = DDS.HistoryQosPolicyKind.KEEP_ALL_HISTORY_QOS
        }
      }

      qos.ownership match {
        case o: SharedOwnership =>
          ddsQos.ownership.kind = DDS.OwnershipQosPolicyKind.SHARED_OWNERSHIP_QOS

        case o: ExclusiveOwnership =>
          ddsQos.ownership.kind = DDS.OwnershipQosPolicyKind.EXCLUSIVE_OWNERSHIP_QOS
      }

      qos.reliability match {
        case r: BestEffort =>
          ddsQos.reliability.kind = DDS.ReliabilityQosPolicyKind.BEST_EFFORT_RELIABILITY_QOS

        case r: Reliable =>
          ddsQos.reliability.kind = DDS.ReliabilityQosPolicyKind.RELIABLE_RELIABILITY_QOS
      }

      ddsQos

    }

    def dataWriterQos2DDSQos(qos: dds.qos.DataWriterQos,
                             sub: dds.pub.Publisher) : DDS.DataWriterQos = {
      val qosH = new DDS.DataWriterQosHolder
      sub.ddsPeer.get_default_datawriter_qos(qosH)
      val ddsQos = qosH.value

      qos.durability match {
        case v: VolatileDurability =>
          ddsQos.durability.kind = DDS.DurabilityQosPolicyKind.VOLATILE_DURABILITY_QOS
        case v: TransientLocalDurability =>
          ddsQos.durability.kind = DDS.DurabilityQosPolicyKind.TRANSIENT_LOCAL_DURABILITY_QOS
        case v: TransientDurability =>
          ddsQos.durability.kind = DDS.DurabilityQosPolicyKind.TRANSIENT_DURABILITY_QOS
        case v: PersistentDurability =>
          ddsQos.durability.kind = DDS.DurabilityQosPolicyKind.PERSISTENT_DURABILITY_QOS
      }

      qos.history match {
        case kl: dds.qos.KeepLastHistory => {
          ddsQos.history.kind = DDS.HistoryQosPolicyKind.KEEP_LAST_HISTORY_QOS
          ddsQos.history.depth = kl.depth
        }
        case ka: dds.qos.KeepAllHistory => {
          ddsQos.history.kind = DDS.HistoryQosPolicyKind.KEEP_ALL_HISTORY_QOS
        }
      }

      qos.ownership match {
        case o: SharedOwnership =>
          ddsQos.ownership.kind = DDS.OwnershipQosPolicyKind.SHARED_OWNERSHIP_QOS

        case o: ExclusiveOwnership =>
          ddsQos.ownership.kind = DDS.OwnershipQosPolicyKind.EXCLUSIVE_OWNERSHIP_QOS
      }

      qos.reliability match {
        case r: BestEffort =>
          ddsQos.reliability.kind = DDS.ReliabilityQosPolicyKind.BEST_EFFORT_RELIABILITY_QOS

        case r: Reliable =>
          ddsQos.reliability.kind = DDS.ReliabilityQosPolicyKind.RELIABLE_RELIABILITY_QOS
      }

      ddsQos

    }

    implicit def topic2DDSTopic(t: TopicImpl[_]) : DDS.Topic = {
      t.ddsPeer
    }

    implicit def DP2DDSDP(dp: DomainParticipantImpl) : DDS.DomainParticipant = {
      dp.ddsPeer
    }
  }