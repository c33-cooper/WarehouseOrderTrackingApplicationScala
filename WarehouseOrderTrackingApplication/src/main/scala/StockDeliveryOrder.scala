import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author callum
 */
class StockDeliveryOrder(app : WarehouseOrderTrackingApplication) {
 
  /**
   * Overloaded constructor
   */
  def this() = this(new WarehouseOrderTrackingApplication)
  
  /**
   * Default Class constructor
   */
  def StockDeliveryorder() {
  }
  
  /**
   * Overload establish order
   */
  def establishStockDeliveryOrdersFromDatabase {
    
    // Create database instance & connection
     val db = new Database
     db createConnection
    
    // Establish the stock delivery orders
    try{
        // Create the SQL statements
        val stmt : Statement = db.getDBConnection().createStatement()
        val sql1 = """SELECT idstockdeliveryorders, stockDeliveryDateReceived,
           supplierName, supplierTelephoneNumber, supplierEmail,
           supplierMethodOfContact, supplierAddress, orderStatus 
            FROM stockdeliveryorders"""
        val rs : ResultSet = stmt.executeQuery(sql1)
        
        // Loop through the database elements
        while (rs next) {
          
          // Store the database elements into attributes
          val stockDeliveryOrderID : String = rs.getString("idstockdeliveryorders")
          val stockDeliveryDateReceived : String = rs.getString("stockDeliveryDateReceived")
          val supplierName : String = rs.getString("supplierName")
          val supplierTelephoneNumber : String = rs.getString("supplierTelephoneNumber")
          val supplierEmail : String = rs.getString("supplierEmail")
          val supplierMethodOfContact : String = rs.getString("supplierMethodOfContact")
          val supplierAddress : String = rs.getString("supplierAddress")
          val orderStatus : String = rs.getString("orderStatus")
          
          // Print orders
          println("\nStock Delivery Order ID: " + stockDeliveryOrderID
            + "\nStock Delivery Date Received: " + stockDeliveryDateReceived
            + "\nSupplier Name: " + supplierName
            + "\nSupplier Telephone Number: " + supplierTelephoneNumber
            + "\nSupplier Email: " + supplierEmail
            + "\nSupplier Method Of Contact: " + supplierMethodOfContact
            + "\nSupplier Address: " + supplierAddress
            + "\nOrder Status: " + orderStatus);
        }
          // close the connection
          rs close
    }
      catch {
        case e => e.printStackTrace
    }
  }
}