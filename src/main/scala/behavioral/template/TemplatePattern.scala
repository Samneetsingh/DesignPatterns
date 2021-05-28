package behavioral.template

object TemplatePattern {
  def main(args: Array[String]): Unit = {
    val exampleOne = new ExampleOneWindow()
    exampleOne.close()

    val exampleTwo = new ExampleTwoWindow()
    exampleTwo.close()
  }

}
