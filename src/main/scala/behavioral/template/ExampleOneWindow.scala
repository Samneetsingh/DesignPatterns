package behavioral.template

class ExampleOneWindow extends Window {
  override protected def beforeClose(): Unit = {
    println(s"${this.getClass.getName} is printing ...")
  }

  override protected def afterClose(): Unit = {
    println(s"... ${this.getClass.getName} is done printing!")
  }
}
