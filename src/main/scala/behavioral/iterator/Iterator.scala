package behavioral.iterator

trait Iterator[T] {

  def hasNext: Boolean
  def current: T
  def next(): Unit

}
