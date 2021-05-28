package behavioral.template

trait Window {
     protected def beforeClose(): Unit
     protected def afterClose(): Unit

     def close(): Unit = {
         beforeClose()
         println("Removing the window from the screen")
         afterClose()
    }
}
