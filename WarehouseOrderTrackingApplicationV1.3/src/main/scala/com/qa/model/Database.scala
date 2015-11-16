package com.qa.model
/**
 * Imports
 */


import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException

/**
 * @author callum
 * @description Database.scala is a class that deals with all 
 *              the generic functionality when using CRUD functions
 *              from the database. This is to improve higher 
 *              cohesion and prevent the re-writing of the
 *              the same code. 
 */
class Database {
  
  // Database attributes
  var connection : Connection = _
  
  /**
   * Make a connection to the database
   */
  def makeConnection : Connection = {
    // connection attributes
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/warehousedatabase"
    val username = "root"
    val password = "password"
    
    try {
      // Make the initial connection
      Class forName(driver)
      connection = DriverManager getConnection(url, username, password)
    }
    catch {
      case e : Throwable => e printStackTrace // Error handling
    }
    connection // Return the connection
  }
  
  /**
   * Close the connection
   */
  def closeConnection : Unit ={
    // If connection is established, close.
    if (connection != null){
      connection close
    }
  }
  
  /**
   * Find a generic SQL table
   */
  def findAllSQLTables(query : String) : ResultSet ={
    
    try{
        val connection : Connection = makeConnection
        val statement = connection createStatement
        val resultSet = statement executeQuery(query)
  
        resultSet
    }
    catch 
    {
      case e : SQLException => e.printStackTrace
      null
    }
  }
}