package behavioral.stratergy

case class AESEncryption() extends Encryption {
  override def encrypt(message: String): String = s"AES"
}
