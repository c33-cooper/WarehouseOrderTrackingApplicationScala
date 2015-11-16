package com.qa.model

import scala.collection.mutable.ArrayBuffer
import java.sql.Connection
import com.qa.model.Database
import java.sql.SQLException

/**
 * @author callum
 * @description Employee.scala holds the implementation for
 *             the users login details.  
 */
class Employee(username : String, password : String) {
  
  // Employee log on details
  var employeeUsernames = new ArrayBuffer[String](10)
  var employeePasswords = new ArrayBuffer[String](10)
  
  /**
   * Establish employees table
   */
  def establishEmployeesFromDatabase{
    try {
      // create a database connection
      val db = new Database
      val connection : Connection = db makeConnection
      
      // Create the statement and run SQL query 
      val stmt = connection createStatement
      val resultSet = stmt executeQuery("SELECT employeeUsername, employeePassword FROM employees")
      
      // Loop through the db
      while (resultSet next) {
        // Store table data into array buffers
        employeeUsernames += resultSet getString("employeeUsername")
        employeePasswords += resultSet getString("employeePassword")
      }
    } catch {
      case e : SQLException => e printStackTrace
    }
    println(employeeUsernames length)
  }
  
  /**
   *  Verify employee login
   */
  def verifyEmployeeLogin : Boolean = {
    // Run a for loop method through the user name
    // and password buffer.
    forLoop((employeeUsernames length) - 1)
  }
  
  /**
   * Recursive method to iterate through the employee usernames and passwords
   * Checks whether username matches any of the usernames within the array
   * and if true, checks the password at the same position in the password 
   * array to see if the password matches. Returns boolean dependant on the 
   * results
   */
  def forLoop(n : Int) : Boolean = 
  {
    if(n <= 0)
    {
      if(employeeUsernames(n) == username)
      {
        if(employeePasswords(n) == password)
        {
          true  
        }
        else
          false
      }
      else
      {
        false
      }
    }
    else
    {
      if(employeeUsernames(n) == username)
      {
        if(employeePasswords(n) == password)
        {
          true  
        }
        else
        {
          forLoop(n - 1)
        }
      }
      else
      {
         forLoop(n - 1)
      }
    }      
  }
}