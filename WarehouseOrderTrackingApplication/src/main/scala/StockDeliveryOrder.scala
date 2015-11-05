import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author callum
 */
class StockDeliveryOrder {
  
//  // StockDeliveryOrder attributes
//  var stockDeliveryOrderID: String;
//  var stockDeliveryDateReceived: String;
//  var supplierName : String;
//  var supplierTelephoneNumber: String;
//  var supplierEmail: String;
//  var supplierMethodOfContact: String;
//  var supplierAddress: String;
//  var stockDeliveryOrderSelector: String;
//  var orderStatus: String;
//  
//  // Order status variable
//  var stockDeliveryOrderStatusChoice: String;
  
  // Overload Class instances
  var app = new WarehouseOrderTrackingApplication
  val db = new Database
  
  // Class constructor
  def StockDeliveryorder(app: WarehouseOrderTrackingApplication) {
    
    // Initialise the application
    this.app = app;
  }
  
  // Class constructor
  def StockDeliveryorder() {
    
    // Initialise attributes
    var stockDeliveryOrderID = null
    var stockDeliveryDateReceived = null
    var supplierName = null
    var supplierTelephoneNumber = null
    var supplierEmail = null
    var supplierMethodOfContact = null
    var supplierAddress = null
    var stockDeliveryOrderSelector = null
    var orderStatus = null
  }
  
  // Overload establish order
  def establishStockDeliveryOrdersFromDatabase() {
    
    // Establish the stock delivery orders
    try{
        // Create the SQL statements
        val stmt : Statement = db.conn.createStatement()
        val sql1 : String = """SELECT idstockdeliveryorders, stockDeliveryDateReceived,
           supplierName, supplierTelephoneNumber, supplierEmail,
           supplierMethodOfContact, supplierAddress, orderStatus 
            FROM stockdeliveryorders"""
        val rs : ResultSet = stmt.executeQuery(sql1)
        
        
    }
  }
}