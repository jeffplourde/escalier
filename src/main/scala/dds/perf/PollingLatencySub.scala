package dds.perf

import dds.pub.DataWriter._
import dds.qos.DataReaderQos._
import dds.qos.DataWriterQos._
import dds.qos.Reliable._
import dds.qos.TransientDurability._
import dds.sub.DataReader._
import dds.Topic
import dds.pub._
import dds.sub._
import dds.qos._

import org.opensplice.perf.SeqPayload
import dds.event.DataAvailable


import org.opensplice.perf.SeqPayload
import DDS.DATAREADERVIEW_QOS_DEFAULT


object PolllingLatencySub {
  def main(args: Array[String]) {
    val wtopic = Topic[SeqPayload]("RSeqPayload")
    val dwqos = DataWriterQos() <= Reliable()
    val writer = DataWriter[SeqPayload](wtopic, dwqos)

    val rtopic = Topic[SeqPayload]("WSeqPayload")
    val drqos = DataReaderQos() <= Reliable()
    val reader = DataReader[SeqPayload](rtopic, drqos)

    while (true) {
      var data: Array[SeqPayload] = null
      do {
        data = reader.read
      }
      while(data.length == 0)
      writer ! data(0)
    }
  }

}