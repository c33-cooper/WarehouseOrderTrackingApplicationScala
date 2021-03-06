package app

import java.sql.SQLException
import java.sql.Statement;
import java.sql.ResultSet

/**
 * @author callum
 */
class Product(app : WarehouseOrderTrackingApplication) {
  
  // Product attributes
  var productID : Int = _
  var productName : String = _
  var productDescription : String = _
  var productType : String = _
  var productCost : Double = _
  var canHavePorousWare : String = _
  var productDiscontinued : String = _
  var x : Int = _
  var y : Int = _
  
  /**
   * Overloaded constructor
   */
  def this() = this(new WarehouseOrderTrackingApplication)
  
  /**
   * Default Class constructor
   */
  def Order {
  }
  
  // Establish products table
  def establishProductsFromDatabase {
    
    // Create database instance & connection
     val db = new Database
     db createConnection
    
    // Establish the products
    try {
          // Sql attributes
          val stmt : Statement = db.getDBConnection().createStatement()
          val sql1 : String = """SELECT idproducts, productName,
           productDescription, productType,
           productCost, canHavePorousWare,
           productDiscontinued, x, y FROM products"""
          val rs : ResultSet = stmt executeQuery(sql1)
          
          // Loop through database elements
          while (rs next) {
            
            // Store database elements into attributes
            productID = rs getInt("idproducts")
            productName = rs getString("productName")
            productDescription = rs getString("productDescription")
            productType = rs getString("productType")
            productCost = rs getDouble("productCost")
            canHavePorousWare = rs getString("canHavePorousWare")
            productDiscontinued = rs getString("productDiscontinued")
            x = rs getInt("x")
            y = rs getInt("y")
            
            // Print products
            System.out.println("Product ID: " + productID
            + "\nProduct Name: " + productName
            + "\nProduct Description: " + productDescription
            + "\nProduct Type: " + productType
            + "\nProduct Cost: " + productCost + " GBP"
            + "\nProduct Discontinued: " + productDiscontinued
            + "\nCan Have Porousware: " + canHavePorousWare 
            + "\nX: " + x 
            + "\nY: " + y + "\n");
          }
    } catch {
        case e : Throwable => e.printStackTrace
    }
  }
}