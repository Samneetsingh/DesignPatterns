package behavioral.stratergy

class ChatClient {

  def send(message: String, encryption: Encryption): Unit = {
    System.out.println(s"Sending the encrypted ${encryption.encrypt(message)}...");
  }
}
