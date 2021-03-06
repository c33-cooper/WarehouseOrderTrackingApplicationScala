import scalafx.Includes._
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.Label
import scalafx.scene.layout.GridPane
import scalafx.geometry.Insets
import scalafx.scene.layout.HBox
import scalafx.scene.image.Image
import scalafx.scene.control.Button
import scalafx.event.ActionEvent
import scalafx.scene.control.PasswordField
import scalafx.scene.control.TextField
import javafx.scene.shape.Rectangle
import javafx.scene.paint.ImagePattern
import scalafx.beans.property.StringProperty.sfxStringProperty2jfx
import scalafx.scene.image.Image.sfxImage2jfx
import scalafx.scene.paint.Color._

/**
 * @author callum
 */
class LoginGui(stage : PrimaryStage) {
  
  // Class Attributes
  stage title = ""
  stage width = 300
  stage height = 400
  
  /**
   * Initialise the login button for the login window
   */
  def initLoginButton(usernameField : TextField, passwordField : TextField) : Button = {
    
    // Create a new button
    val button = new Button
    {
      // text field of button is login
      text = ("Log in")
      
      // Add an action event listener to the button
      onAction = (ae : ActionEvent) =>
        {
          val user : String = usernameField.text getValue
          val pass : String = passwordField.text getValue
          
          // Create a new login sql instance
          val login = new SQLLogin(user, pass)
          
          // Call the login function from the sql class
           login logIn()
         
          // Verify the login 
           val bool = login verifyLogIn()
           if(bool)
         {
           // If user has been verified to login create
           // a new GUI window
           val gui : GuiMain = new GuiMain()
           gui.showLogin()
         } else {
           failedLoginMessage
         }
       }
    }
    button
  }   
  
  /**
   * Create a new text field
   */
   val username = new TextField()
   {
     // Assign username to the textfield
      promptText = "Username: "
   }

   /**
    * Create a new password field
    */
  val passwordField = new PasswordField
  {
    // Assign password to the textfield
      promptText = "Password: "
  }
  
  /**
   * Create a rectangle
   */
  def createRect(): Rectangle = 
  {
    // Create a logo image & rectangle to place within scene
     val image = new Image("file:src/main/gui/logo.png")
     val rect = new Rectangle(0, 0, 125, 125)
     rect setFill(new ImagePattern(image))
     rect
  }
  
    /**
     * Initialise the grid pane for the scene
     */
    def initGridPane() : GridPane = {
      // Create a new grid pane and return
       new GridPane {
        hgap = 10
        vgap = 10
        padding = Insets(20, 100, 10, 10)
      
        add(createRect, 1, 1)
        add(new Label("Please Log In: "), 1, 3)
        add(new Label("Username: "), 0, 4)
        add(username, 1, 4)
        add(new Label("Password: "), 0, 5)
        add(passwordField, 1, 5)
        add(initLoginButton(username, passwordField), 1, 7)
       }
  }
    
    /**
     * Show error message for failed login
     */
    def failedLoginMessage() {
      println("LOG IN FAILED!!")
    }
    
    /**
     * Initialise the scene
     */
    def initScene() : Scene = {
      
      // Create new scene object
      val scene = new Scene
      {
        fill = LightGreen
        content = new HBox
        {
          children = Seq(initGridPane())
        }
      }
      scene
    }
    
    // Show the login window
    def showLogin(): Unit = 
    {
      stage setScene(initScene())
    }
  }
