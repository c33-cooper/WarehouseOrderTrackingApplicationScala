import java.sql.DriverManager
import java.sql.Connection

/**
 * @author callum
 */
class Database {
  var connection:Connection = null
  
  /**
   * Create a database connection
   * to my database.
   */
  def connect() : Connection =
  {
    // Database attributes
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/warehousedatabase"
    val username = "root"
    val password = "password"
  
    try {
      //Makes the initial connection
      Class forName(driver)
      connection = DriverManager getConnection(url, username, password)
    
    } catch {
     case e : Throwable => e printStackTrace // Error handling
    }
    
   connection // return the connection
  }

  /**
   * closes the connection to the database
   */
  def closeConnection() : Unit =
  {
    if(connection != null)
    {
      connection close
    }
  }
}