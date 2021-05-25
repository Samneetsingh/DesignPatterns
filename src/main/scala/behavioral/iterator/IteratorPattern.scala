package behavioral.iterator

object IteratorPattern {

  def main(args: Array[String]): Unit = {
    val collection = new ProductCollection()
    val productOne = new Product(1, "one")
    val productTwo = new Product(2, "two")
    val productThree = new Product(3, "three")
    collection.add(productOne)
    collection.add(productTwo)
    collection.add(productThree)

    val productIterator: Iterator[Product] = collection.iterator()
    while (productIterator.hasNext) println(productIterator.next())

  }

}
