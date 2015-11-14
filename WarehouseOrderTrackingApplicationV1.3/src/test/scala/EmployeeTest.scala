

/**
 * @author callum
 * @description EmployeeTest.scala is the test class that
 *              test employee login verification.
 */
class EmployeeTest extends TestBase {
  
  /**
   * Test establish employees table
   */
  def establishEmployeesFromDatabaseTest{
    "Calling establish employees from database" should """generate an array buffer of employee usernames
     that are not null""" in 
     {
        // create an object and run test
        val employee : Employee = new Employee("_", "_")
        // Call testing functions
        employee.establishEmployeesFromDatabase
        employee.employeeUsernames should not be (null)
     } 
    it should "generate an array buffer of employee passwords that are not null" in
     {
       // create an object and run test
        val employee : Employee = new Employee("_", "_")
        // Call testing functions
        employee.establishEmployeesFromDatabase
        employee.employeePasswords should not be (null)
     }
  }
  
  /**
   * Test verify employee login
   */
  def verifyEmployeeLoginTest{
    "Calling verify Employee Login" should """return true if verification of employee username matches
      a corresponding employee password""" in
      {
        // Create an object and run test
        val employee : Employee = new Employee("BenBack", "2130844d272f0ebb6bbc66e404bb0b80")
        // Call testing functions
        employee.establishEmployeesFromDatabase
        employee.verifyEmployeeLogin should be (true)
      }
  }
  
  // Call tests
  establishEmployeesFromDatabaseTest
  verifyEmployeeLoginTest
}