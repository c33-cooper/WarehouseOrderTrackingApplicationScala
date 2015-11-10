import java.sql.DriverManager
import java.sql.Connection
import java.sql.SQLException

/**
 * @author callum
 */
class Database() {
  
  /**
   * Database attributes
   */
  val JDBC_DRIVER = "com.mysql.jdbc.Driver"
  val DB_URL = "jdbc:mysql://localhost:3306/warehousedatabase"
  
  // Database user name attributes
  val USER = "root"
  val PASS = "password"
  
  // Connection attribute
  var conn : Connection = null
  
  /**
   * Class constructor
   */
  def createConnection {
    
    // Initialise the database connection
    try{
        // make the connection
        Class.forName(JDBC_DRIVER)
        conn = DriverManager.getConnection(DB_URL, USER, PASS)
    } catch {
          case e : Throwable => e.printStackTrace
    }
  }
  
  /**
   * Return the connection of the database
   */
  def getDBConnection(): Connection = {
    conn
  }
}