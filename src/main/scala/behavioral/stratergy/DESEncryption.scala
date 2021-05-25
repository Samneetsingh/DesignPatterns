package behavioral.stratergy

case class DESEncryption() extends Encryption {
  override def encrypt(message: String): String = s"DES"
}
