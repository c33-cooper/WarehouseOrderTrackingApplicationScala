

/**
 * @author callum
 */
object WarehouseOrderTrackingapplication {
  
  def main(args: Array[String]) {
    
    // Instantiate the application class and run
    val app = new WarehouseOrderTrackingapplication
    app runApp
  } 
}

class WarehouseOrderTrackingapplication {
  
  // Class Constructor
  def WarehouseOrderTrackingapplication() {
    
  }
  
  // Run the app
  def runApp() {
    
    // Prompt the user for login details
    promptUserForLoginDetails
    
    // Create a run options flag
    var runOptions: Boolean = true
    
    while (runOptions){
      // Prompt user for order display
      promptUserForProgramOptions
    }
  }
  
  // Display the application title
  def displayApplicationTitle() {
    
    // Print application title
    println("\n*******************************************")
    println(" Warehouse Order Tracking Application V1.0")
    println("*******************************************\n")
  }
  
  // Prompt user for login details
  def promptUserForLoginDetails() {
    
    // Display the application title
    displayApplicationTitle
    
    // Login title
    println("LOGIN FORM")
    println("----------")
    
    // Prompt user for login details
    println("Employee Username: ")
    var username = readLine
    println("Employee Password: ")
    var password = readLine
  }
  
  // Prompt user for program order choice
  def promptUserForProgramOptions() {
    
    // Program attributes
    var programFunctions: String = null
    
    // Display list of program functions
    println("\n***PROGRAM FUNCTIONS***");
    println("1: DISPLAY STOCK DELIVERY ORDER LIST");
    println("2: CREATE NEW STOCK DELIVERY ORDER");
    println("3: DISPLAY ORDER LIST");
    println("4: DISPLAY PRODUCT LIST");
    println("5: DISPLAY INVENTORY LIST");
    println("6: VIEW WAREHOUSE LAYOUT");
    println("7: LOG OUT");
    println("8: ***EXIT THE PROGRAM***");
    programFunctions = readLine
    
    
  }
}