import java.sql.DriverManager
import java.sql.Connection

/**
 * @author callum
 */
class Database {
  var connection:Connection = null
  
  def connect() : Connection =
  {
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/warehousedatabase"
    val username = "root"
    val password = "password"
  
    try {
    
      //Makes the initial connection
      Class forName(driver)
      connection = DriverManager getConnection(url, username, password)
    
    
    } catch {
     case e : Throwable => e printStackTrace
    }
    
   connection
  }

  /*
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