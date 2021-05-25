package behavioral.iterator;

import scala.collection.mutable.ListBuffer


class ProductCollection {
  var products: ListBuffer[Product] = ListBuffer[Product]()

  def add(product: Product): Unit = products.append(product)

  class ProductIterator() extends Iterator[Product] {
    override def hasNext: Boolean = ???

    override def current: Product = ???

    override def next(): Unit = ???
  }

}
