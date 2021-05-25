package behavioral.memento

object MementoPattern {

  def main(args: Array[String]): Unit = {
    val history = new WordDocumentHistory()
    val wordDocument: WordDocument = new WordDocument("")
    history.push(wordDocument.createState())
    println(wordDocument)

    wordDocument.content = "This is some example content"
    history.push(wordDocument.createState())
    println(wordDocument)

    wordDocument.fontSize = 16
    history.push(wordDocument.createState())
    println(wordDocument)

    wordDocument.fontName = "Minion Web"
    wordDocument.content = "This is updated content"
    println(wordDocument)

    println("Undo...")
    wordDocument.restoreState(history.pop())
    println(wordDocument)
  }

}
