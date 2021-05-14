package behavioral.memento

import scala.collection.mutable.{Stack => MutableStack}

class WordDocumentHistory {
  private val wordDocumentStates = new MutableStack[WordDocumentState]()

  def push(state: WordDocumentState): Unit = wordDocumentStates.push(state)

  def pop(): WordDocumentState = wordDocumentStates.pop()

}
