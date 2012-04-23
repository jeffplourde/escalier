package dds.sub

import DDS.SampleInfo
import collection.IndexedSeqOptimized

object Samples {
  implicit def samples2Data[T](s: Samples[T]): Iterator[T] = s.data.iterator
}
/**
 * This class represent a collections of samples and associated samples
 * info.
 */
class Samples[T](val data: Array[T], val info: Array[SampleInfo]) {
  def length = data.length
}
