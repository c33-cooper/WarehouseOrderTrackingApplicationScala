import java.sql.DriverManager
import java.sql.Connection
import java.sql.SQLException

/**
 * @author callum
 */
class Database() {
  
  // Database attributes
  val JDBC_DRIVER : String = "com.mysql.jdbc.Driver"
  val DB_URL : String = "jdbc:mysql://10.50.15.50:3306/warehousedatabase"
  
  // Database user name attributes
  val USER : String = "root"
  val PASS : String = "password"
  
  // Connection attribute
  var conn : Connection = null
  
  // Class constructor
  def Database {
    
    // Initialise the database connection
    try{
        // make the connection
        Class.forName(JDBC_DRIVER)
        conn = DriverManager.getConnection(DB_URL, USER, PASS)
    } catch {
          case e => e.printStackTrace
    }
  }
}