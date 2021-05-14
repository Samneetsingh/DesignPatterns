package behavioral.memento

class WordDocument(var content: String,
                   var fontName: String = "Times New Roman",
                   var fontSize: Int = 14) {


  def createState(): WordDocumentState = WordDocumentState(this.content, this.fontName, this.fontSize)

  def restoreState(newState: WordDocumentState): Unit = {
    this.content = newState.content
    this.fontName = newState.fontName
    this.fontSize = newState.fontSize
  }

  override def toString: String = {
    s"[${this.fontName}:${this.fontSize}]\n${this.content}"
  }

}
