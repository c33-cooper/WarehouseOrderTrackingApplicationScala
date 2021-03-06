package app

import java.sql.SQLException
import java.sql.Statement;
import java.sql.ResultSet

/**
 * @author callum
 */
class Employee(app : WarehouseOrderTrackingApplication) {
  
  // Employee attributes
  var _employeeUsername : String = _
  var _employeePassword : String = _
  var loggedIn : Boolean = _
  
   /**
   * Overloaded constructor
   */
  def this() = this(new WarehouseOrderTrackingApplication)
  
  /**
   * Default Class constructor
   */
  def Employee() {
  }
  
  /**
   * Establish employee table
   */
  def establishEmployeesFromDatabase() {
    
    // Create database instance & connection
     val db = new Database
     db createConnection
    
    // Establish the customer
    try {
      val stmt : Statement = db.getDBConnection().createStatement()
      val sql1 : String = "SELECT idEmployee, employeeUsername, employeePassword FROM employees"
      val rs : ResultSet = stmt.executeQuery(sql1)
      
      // Loop through the database elements
      while (rs next) {
        
        // User input login details matches database
        if (login(getUsername, getPassword, rs.getString(2), rs.getString(3)) == 0) {
          
          // Set logged in flag to true
          loggedIn = true
          
          // Print welcome message to user
          println("\nWelcome " + _employeeUsername 
            + ", you are now logged in...")
        }
        // User input doesn't match database
        else if (login(getUsername, getPassword, rs.getString(2), rs.getString(3)) == 1
            && !loggedIn) {
          
          // Set logged in flag to false
          loggedIn = false
        }
      }
      // If login fails
      if (!loggedIn) {
        
        // Print failed login error message
        println("\nFAILED LOGIN!!\n")
        
        // Prompt user for login details
        // if there login fails.
        app promptUserForLoginDetails
      }
      // close the connection
      rs close
    } catch {
        case e : Throwable => e.printStackTrace
  }
  }
  
  // Employee login function
  def login(username : String, password : String, dbUser : String,
      dbPass : String) : Int = {
    
    // Create an encryption instance
    val encryption = new Encryption
    encryption checkMD5(password)
    
    // Run check
    if (username.equalsIgnoreCase(dbUser) && encryption.getEncryption().equalsIgnoreCase(dbPass)) {
      0
    }
    else{
      1
    }
  }
  
  // employee username accessor
  def getUsername() : String = {
    _employeeUsername
  }
  
  // employee password accessor
  def getPassword() : String = {
    _employeePassword
  }
  
  // Employee username mutator
  def setUsername(employeeUsername : String) {
    _employeeUsername = employeeUsername
  }
  
  // Employee password mutator
  def setPassword(employeePassword : String) {
    _employeePassword = employeePassword
  }
}