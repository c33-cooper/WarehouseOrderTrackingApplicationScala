

package app

import java.security.MessageDigest

/**
 * @author callum
 */

class Encryption {
  
  /**
   * Encryption attributes
   */
  val crypt : MessageDigest = MessageDigest.getInstance("MD5")
  
  /**
   * Default constructor
   */
  def Encryption{
  }
  
  /**
   * Check password string against a SHA1 conversion
   */
  def checkMD5(password : String) {
    
    val md5hash1 = crypt.digest(password.getBytes).map("%02x".format(_)).mkString
  }
  
}