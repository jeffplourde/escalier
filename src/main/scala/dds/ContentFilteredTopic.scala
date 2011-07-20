package dds


object ContentFilteredTopic {

  def apply[T](name: String,
               topic: Topic[T],
               filter: String,
               params: List[String]) (implicit m: Manifest[T]) =
    topic.dp.createContentFilteredTopic[T](name, topic, filter, params)(m)

  def apply[T](name: String, topic: Topic[T],
               filter: String) (implicit m: Manifest[T]) =
    topic.dp.createContentFilteredTopic[T](name, topic, filter, List[String]())(m)

}

abstract class ContentFilteredTopic[T](name: String,
                                       val topic: Topic[T],
                                       val filter: String,
                                       val params: List[String]) (implicit m: Manifest[T])
  extends BaseTopic[T](topic.dp, name)(m) {

  override type Peer = DDS.ContentFilteredTopic

}
