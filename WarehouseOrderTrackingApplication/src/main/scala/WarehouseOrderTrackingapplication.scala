

/**
 * @author callum
 */
object WarehouseOrderTrackingApplication {
  
  def main(args: Array[String]) {
    
    // Instantiate the application class and run
    val app = new WarehouseOrderTrackingApplication
    app runApp
  } 
}

class WarehouseOrderTrackingApplication {
  
  // Attributes
  val employee : Employee = new Employee(this)
  
  /**
   * Default Class Constructor
   */
  def WarehouseOrderTrackingApplication() {
  }
  
  /**
   * Run the app
   */
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
  
  /**
   * Display the application title
   */
  def displayApplicationTitle() {
    
    // Print application title
    println("\n*******************************************")
    println(" Warehouse Order Tracking Application V1.0")
    println("*******************************************\n")
  }
  
  /**
   * Prompt user for login details
   */
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
    
    // Initialise local employee and 
    // pass data to the class
    employee setUsername(username)
    employee setPassword(password)
    
    // Establish the employee login details
    // from the employee database.
    employee establishEmployeesFromDatabase
  }
  
  /**
   * Prompt user for program order choice
   */
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
    
    // Class instances
    val stockDeliveryOrder = new StockDeliveryOrder(this)
    val order = new Order(this)
    
    // Match for user functions
    // and based outcomes.
    programFunctions match {
      case "1" => println("\nSTOCK DELIVERY ORDER LIST...")
                  // Call stock delivery order list from database
                  stockDeliveryOrder establishStockDeliveryOrdersFromDatabase
                  
                  // Prompt user for stock delivery order selector option
                  stockDeliveryOrder selectStockDeliveryOrderToView
                  
                  // Update the status of the orders
                  stockDeliveryOrder updateTheStockDeliverOrderStatus
                  
      case "2" => 
                  // Call get stock delivery order details
                  stockDeliveryOrder getNewStockDeliveryOrderDetails
                  
                  // Call create new order
                  stockDeliveryOrder createNewDeliveryOrder
      
      case "3" => println("\nORDER LIST...")
                  // Call order list from database
                  order establishOrdersFromDatabase
                  
                  // Prompt user for order selector option
                  order selectOrderToView
                  
                  // Update the status of the orders
                   order updateTheOrderStatus
                   
      case "7" => println(employee.getUsername() +
          " IS LOGGING OUT...")
      
      case "8" => 
                 // Display exit message & exit the program
                  println("Exiting Program...")                   
                   System.exit(1);
      
      case _ => println("Nothing chosen..")
    }
  }
}