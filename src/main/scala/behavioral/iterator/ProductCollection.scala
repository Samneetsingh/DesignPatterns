package behavioral.iterator;

import scala.collection.mutable.ListBuffer


class ProductCollection {
  var products: ListBuffer[Product] = ListBuffer[Product]()

  def add(product: Product): Unit = products.append(product)

  def iterator(): Iterator[Product] = new ProductIterator()

  class ProductIterator(var index: Int = 0) extends Iterator[Product] {

    override def hasNext: Boolean = this.index < products.length

    override def next(): Product = {
      val product = products(index)
      index += 1
      product
    }
  }

}
