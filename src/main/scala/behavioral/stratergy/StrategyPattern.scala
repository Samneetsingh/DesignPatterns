package behavioral.stratergy

object StrategyPattern {

  def main(args: Array[String]): Unit = {
    val client = new ChatClient()
    val aes = new AESEncryption()
    val des = new DESEncryption()
    client.send("A message!", aes)
    client.send("A message!", des)
  }

}
