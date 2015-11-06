import java.sql.Statement
import java.sql.ResultSet

/**
 * @author callum
 */
class OrderLine(app : WarehouseOrderTrackingApplication) {
  
  /**
   * Overloaded Constructor
   */
  def this() = this(new WarehouseOrderTrackingApplication)
  
  /**
   * Default Class Constructor
   */
  def OrderLine(){
  }
  
  /**
   * Establish the order line from database
   */
  def establishOrderLine(orderID : String) {
    
    // Create database instance & connection
     val db = new Database
     db createConnection
    
    // Establish the order lines 
    try {
          // Re-initialise the order line database 
          // every new order line
          val db = new Database
          
          // Create the SQL attributes
          val stmt : Statement = db.getDBConnection().createStatement()
          
          // SQL attributes
          val sql1 : String = """SELECT idorderline, idorders, productName,
          porousware, productQuantity FROM orderline, products WHERE orderline.idproducts = products.idproducts
          AND idorders = """ + orderID
          var rs : ResultSet = stmt.executeQuery(sql1)
          
          // Loop through the database
          while (rs next) {
            
              // Store database elements into attributes
              val orderLineID : Int = rs.getInt("idorderline");
              val orderID : String = rs.getString("idorders");
              val productName : String = rs.getString("productName");
              val porousware : String = rs.getString("porousware");
              val productQuantity : Int = rs.getInt("productQuantity");
              
              // Print orderline
              println("|Product Name: " + productName
                                + "|Porousware: " + porousware
                                + "|Product Quantity: " + productQuantity
                                + "|")
          }
             // Close the connection
             rs close
    }
     catch {
        case e => e.printStackTrace
     }
  }
}