

/**
 * @author callum
 * @description MD5EncryptionTest.scala is a test class
 *              the checks the validity of MD5Encryption.
 */
class MD5EncryptionTest extends TestBase{
  
  /**
   * Test encrypt password
   */
  def encryptPasswordTest() {
    "Calling encrypt password" should "return an ecrypted 32 digit hexadecimal number" in
    {
      // Create an object and run test
      val md5Encryption : MD5Encryption = new MD5Encryption
      md5Encryption encryptPassword("pigsInBlankets") should be ("9e90485f86a3563a4b33e0f1d40fe331")
    }
  }
  
  // Call tests
  encryptPasswordTest
}