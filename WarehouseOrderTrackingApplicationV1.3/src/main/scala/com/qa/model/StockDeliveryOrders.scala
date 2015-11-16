package com.qa.model

import scalafx.collections.ObservableBuffer
import java.sql.ResultSet
import com.qa.entities.StockDeliveryOrderEntity

/**
 * @author callum
 * @description StockDeliveryOrder.scala is the class that holds
 *              the purchase orders functionality for the application.
 */
class StockDeliveryOrders {
  
  // Create a database object
  val database : Database = new Database
  
   /**
   * Establish all the stockDelivery orders from the
   * customer orders database table.
   */
  def establishStockDeliveryOrders() : ObservableBuffer[StockDeliveryOrderEntity] = {
    
    // Create an array of customer orders
    val stockDeliveryOrders : ObservableBuffer[StockDeliveryOrderEntity] = 
      new ObservableBuffer[StockDeliveryOrderEntity]()
      
    /* 
     * Create a local result set to pull data from the generic
     * database class and store locally. This can be considered
     * as a collection of data that has been pulled from the
     * stock delivery order table.
     * 
     */
     val rs : ResultSet = database.findAllSQLTables("""SELECT idstockdeliveryorders, stockDeliveryDateReceived,
           supplierName, supplierTelephoneNumber, supplierEmail,
           supplierMethodOfContact, supplierAddress, orderStatus 
            FROM stockdeliveryorders"""
)
           
    // Loop through result set
     while(rs next){
       // Add result set to customer orders array
       stockDeliveryOrders += new StockDeliveryOrderEntity(rs.getInt(1), rs.getString(2), rs.getString(3),
           rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8))
     }
    
    // close the connection to the database
    database closeConnection
    
    // Return the customer orders
    stockDeliveryOrders
  }
}