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
  var warehouseLocationX : Int = _
  var warehouseLocationY : Int = _
  var products : String = _
  
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
             warehouseLocationX, warehouseLocationY,
             productName FROM inventory, products where inventory.products = products.idproducts"""
       val rs : ResultSet = stmt.executeQuery(sql1)
       
       // Loop through database elements
       while (rs next) {
         
         // Store database elements into attributes
         productQuantity = rs getInt("productQuantity")
         warehouseLocationX = rs getInt("warehouseLocationX")
         warehouseLocationY = rs getInt("warehouseLocationY")
         products = rs getString("productName")
         
         // Print inventory
         println("Product Quantity: " + productQuantity
              + "\nProduct: " + products
              + "\nWarehouse Location X: " + warehouseLocationX
              + "\nWarehouse Location Y: " + warehouseLocationY + "\n")
       }
     }
    catch {
        case e : Throwable => e.printStackTrace
    }
  }
}