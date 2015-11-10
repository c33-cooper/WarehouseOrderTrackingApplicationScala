package app

import java.sql.SQLException
import java.sql.Statement;
import java.sql.ResultSet

/**
 * @author callum
 */
class Inventory(app : WarehouseOrderTrackingApplication) {
  
  // Class attributes
  var inventoryProduct : Product = new Product
  var productQuantity : Int = _
  var warehouseLocationRow : Int = _
  var warehouseLocationAisle : String = _
  
  /**
   * Overloaded constructor
   */
  def this() = this(new WarehouseOrderTrackingApplication)
  
  /**
   * Default constructor
   */
  def Inventory() {
  }
  
  /**
   * Establish the inventory table
   */
  def establishInventoryFromDatabase {
    
    // Create database instance & connection
     val db = new Database
     db createConnection
     
     try {
         // SQL attributes
       val stmt : Statement = db.getDBConnection().createStatement()
       val sql1 : String = """SELECT idinventory, productQuantity,
             warehouseLocationRow, warehouseLocationAisle,
             Products FROM inventory"""
       val rs : ResultSet = stmt.executeQuery(sql1)
       
       // Loop through database elements
       while (rs next) {
         
         // Store database elements into attributes
         productQuantity = rs getInt("productQuantity")
         warehouseLocationRow = rs getInt("warehouseLocationRow")
         warehouseLocationAisle = rs getString("warehouseLocationAisle")
         
         // Print inventory
         println("Product Quantity: " + productQuantity
              + "\nWarehouse Location Row: " + warehouseLocationRow
              + "\nWarehouse Location Aisle: " + warehouseLocationAisle + "\n")
       }
     }
    catch {
        case e : Throwable => e.printStackTrace
    }
  }
}