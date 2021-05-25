package behavioral.iterator

trait Iterator[T] {

  def hasNext: Boolean
  def next(): T

}
