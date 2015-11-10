package app

import java.sql.SQLException
import java.sql.Statement;
import java.sql.ResultSet

/**
 * @author callum
 */
class StockDeliveryOrder(app : WarehouseOrderTrackingApplication) {
 
  // Attributes
  var stockDeliveryOrderSelector : String = _
  
  // StockDeliveryOrder attributes
  var stockDeliveryOrderID : String = _
  var stockDeliveryDateReceived : String = _
  var supplierName : String = _
  var supplierTelephoneNumber : String = _
  var supplierEmail : String = _
  var supplierMethodOfContact : String = _
  var supplierAddress : String = _
  var orderStatusCreate : String = _
  
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
     
     // Re-initialise stock delivery order line instance
      val stockDeliveryOrderLine : StockDeliveryOrderLine = new StockDeliveryOrderLine
    
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
            + "\nOrder Status: " + orderStatus)
            
            // List stock delivery order lines
            stockDeliveryOrderLine establishStockDeliveryOrderLine(stockDeliveryOrderSelector);
        }
          // close the connection
          rs close
    }
      catch {
        case e: Throwable => e.printStackTrace
    }
  }
  
  /**
   * Prompt user to select stock delivery order
   * to view.
   */
  def selectStockDeliveryOrderToView
  {
    // create a new connection to the database 
     val db = new Database
     db createConnection
    
    // Re-initialise stock delivery order line instance.
    val stockDeliveryOrderLine : StockDeliveryOrderLine = new StockDeliveryOrderLine
    
    // Prompt the user for the stock delivery order and view
    println("\nENTER STOCK DELIVERY ORDER TO SELECT: ")
    stockDeliveryOrderSelector = readLine
    
    // Run check of stock delivery order selected against the order ID
    println("\nCURRENT SELECTED STOCK DELIVERY ORDER...")
    
    try {
      // Create a new connection to the database
      val stmt : Statement = db.getDBConnection().createStatement()
      
      // SQL Attributes
      val sql2 : String = """SELECT idstockdeliveryorders, stockDeliveryDateReceived,
            supplierName, supplierTelephoneNumber, supplierEmail,
           supplierMethodOfContact, supplierAddress, orderStatus 
            FROM stockdeliveryorders WHERE idstockdeliveryorders = """ + stockDeliveryOrderSelector
      
      // Log database into result set
      val rsSelectedStockDeliveryOrder : ResultSet = stmt.executeQuery(sql2)
      
      // Loop through the selected orders
      while (rsSelectedStockDeliveryOrder next) {
        
        // Store database elements into attributes
        val stockDeliveryOrderID : String = rsSelectedStockDeliveryOrder.getString("idstockdeliveryorders")
        val stockDeliveryDateReceived : String = rsSelectedStockDeliveryOrder.getString("stockDeliveryDateReceived")
        val supplierName : String = rsSelectedStockDeliveryOrder.getString("supplierName")
        val supplierTelephoneNumber : String = rsSelectedStockDeliveryOrder.getString("supplierTelephoneNumber")
        val supplierEmail : String = rsSelectedStockDeliveryOrder.getString("supplierEmail")
        val supplierMethodOfContact : String = rsSelectedStockDeliveryOrder.getString("supplierMethodOfContact")
        val supplierAddress : String = rsSelectedStockDeliveryOrder.getString("supplierAddress")
        val orderStatus : String = rsSelectedStockDeliveryOrder.getString("orderStatus")
        
        // Print orders
        println("Stock Delivery Order ID: " + stockDeliveryOrderID
            + "\nStock Delivery Date Received: " + stockDeliveryDateReceived
            + "\nSupplier Name: " + supplierName
            + "\nSupplier Telephone Number: " + supplierTelephoneNumber
            + "\nSupplier Email: " + supplierEmail
            + "\nSupplier Method Of Contact: " + supplierMethodOfContact
            + "\nSupplier Address: " + supplierAddress
            + "\nOrder Status: " + orderStatus + "\n")
        
         // List stock delivery order lines
         println("Stock Delivery Order Lines: ")
         stockDeliveryOrderLine establishStockDeliveryOrderLine(stockDeliveryOrderSelector)
      }
      // Close the connection
      rsSelectedStockDeliveryOrder close
    }
    catch {
      case e : Throwable => e.printStackTrace
    }
  }
  
  /**
   * Update the status of the stock delivery order
   */
  def updateTheStockDeliverOrderStatus {
    
    // Ask the user if they want to update the
    // the status of the order
    println("\nType 'CHECKOUT' to check out the stock delivery order and update the status...")
    println("Type 'AVAILABLE' to make the stock delivery order available and update the status...")
    val stockDeliveryOrderStatusChoice : String = readLine
    
    // Run check to see if order wants to be checked out
    if (stockDeliveryOrderStatusChoice.equalsIgnoreCase("CHECKOUT")) {
        // checkout the stock delivery order
        updateCheckOutStockDeliveryOrdersFromDatabase
        
        // Check out the order from database
        println("Stock Delivery Order checked out...")
    } 
    else {
          // Display default message
          println("No Stock Delivery Orders have been checked out...")
    }
    
    // Run check to see if order wants to be re-set to available
    if (stockDeliveryOrderStatusChoice.equalsIgnoreCase("AVAILABLE")) {
      // Re-set the status of the order
      resetStockDeliveryOrderStatusFromDatabase
      
      // Re-set stock deliver order from database
      println("Stock Delivery Order is now available...")
    }
    else {
      // Display default message
      println("No Stock Delivery Orders have been made available...")
    }
  }
  
  /**
   * Update checked out orders from the database
   */
  def updateCheckOutStockDeliveryOrdersFromDatabase {
    
     // create a new connection to the database 
     val db = new Database
     db createConnection
    
    // Connect to the stock delivery order database and update
    // the checked out orders
    try {
          // Create a new connection to the database
          val stmt : Statement = db.getDBConnection().createStatement()
          
          // SQL attributes
          val sql3 : String = "UPDATE stockdeliveryorders SET orderStatus = 'CHECKED OUT' WHERE idstockdeliveryorders = " + stockDeliveryOrderSelector
          stmt executeUpdate(sql3)
    }
     catch {
       case e : Throwable => e.printStackTrace
     }
  }
  
  /**
   * Re-set the status of the order
   */
  def resetStockDeliveryOrderStatusFromDatabase {
     // create a new connection to the database 
     val db = new Database
     db createConnection
    
    // Connect to the stock delivery order database and update
    // the checked out orders
    try {
          // Create a new connection to the database
          val stmt : Statement = db.getDBConnection().createStatement()
          
          // SQL attributes
          val sql3 : String = "UPDATE stockdeliveryorders SET orderStatus = 'AVAILABLE' WHERE idstockdeliveryorders = " + stockDeliveryOrderSelector
          stmt executeUpdate(sql3)
    }
     catch {
       case e : Throwable => e.printStackTrace
     }
  }
  
  /**
   * Create a new stock delivery order details
   */
  def getNewStockDeliveryOrderDetails {
    
    // Get user stock delivery order details
    println("\nNEW STOCK DELIVERY ORDER FORM...")
    
    // Get SDOrder ID
    println("Stock Delivery Order ID: ")
    stockDeliveryOrderID = readLine
    
    // Get SDOrder date received
    println("Stock Delivery Order Date Received: ")
    stockDeliveryDateReceived = readLine()
    
    // Get SDOrder supplier name
    println("Supplier Name: ")
    supplierName = readLine()
    
    // Get SDOrder supplier telephone number
    println("Supplier Telephone Number: ")
    supplierTelephoneNumber = readLine()
    
    // Get SDOrder supplier email
    println("Supplier Email: ")
    supplierEmail = readLine()
    
    // Get SDOrder supplier method of contact
    println("Supplier Method Of Contact: ")
    supplierMethodOfContact = readLine()
    
    // Get SDOrder supplier address
    println("Supplier Address: ")
    supplierAddress = readLine()
    
    // Get SDOrder supplier telephone number
    println("Order Status: ")
    orderStatusCreate = readLine()
    
  }
  
  /**
   * Create a new stock delivery order
   */
  def createNewDeliveryOrder {
    
        // Establish the new delivery order
        try {
              // Re-initialise the stock delivery order
              // database instance every new order created
              val db : Database = new Database();
              db createConnection
              
              // Create the SQL attributes
              val stmt : Statement = db.getDBConnection().createStatement();
              
              val sql2 : String = "INSERT INTO stockdeliveryorders VALUES ('" + stockDeliveryOrderID + "', '" + stockDeliveryDateReceived + "', '" + supplierName + "', '" + supplierTelephoneNumber + "', '" + supplierEmail + "', '" + supplierMethodOfContact + "', '" + supplierAddress + "', '" + orderStatusCreate + "')";
              stmt executeUpdate(sql2)
        }
        catch {
          case e : Throwable => e.printStackTrace()
        }
  }
}