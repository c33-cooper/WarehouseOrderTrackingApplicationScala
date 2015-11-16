package com.qa.model

import java.security.MessageDigest

/**
 * @author callum
 * @description MD5Encryption.scala is an ecryption class
 *              that handles a message digest algorithm
 *              to enhance security of sensitive data
 *              such as user passwords.
 * 
 */
class MD5Encryption {
  
  /**
   * Encryption attributes
   */
  val crypt : MessageDigest = MessageDigest.getInstance("MD5")
  
  /**
   * Check password string against a MD5 conversion
   */
  def encryptPassword(password : String) : String = {
    // Create hash attribute
    val md5hash1 = crypt.digest(password.getBytes).map("%02x".format(_)).mkString
    // return hash
    md5hash1
  }
}