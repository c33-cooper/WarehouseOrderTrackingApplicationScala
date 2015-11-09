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

/**
 * @author callum
 */
class LoginGui(stage : PrimaryStage) {
  
  // Class Attributes
  stage title = ""
  stage width = 400
  stage height = 400
  
  def initLoginButton(usernameField : TextField, passwordField : TextField) : Button = {
    
    val button = new Button
    {
      text = ("Log in")
      
      onAction = (ae : ActionEvent) =>
        {
          val user : String = usernameField.text getValue
          val pass : String = passwordField.text getValue
          
          val login = new SQLLogin(user, pass)
          
           login logIn()
         
           val bool = login verifyLogIn()
           if(bool)
         {
           val gui : GuiMain = new GuiMain()
           
           gui.showLogin()
         }
       }
    }
    button
  }   
  
   val username = new TextField()
    {
   
      promptText = "Username: "
    }

  val passwordField = new PasswordField
    {
    
      promptText = "Password: "
    }
  
    def createRect(): Rectangle = 
  {
     val image = new Image("file:src/main/gui/logo.png")
     val rect = new Rectangle(0, 0, 125, 125)
     rect setFill(new ImagePattern(image))
     rect
  }
  
    def initGridPane() : GridPane = {
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
    
    def initScene() : Scene = {
      
      // Create new scene object
      val scene = new Scene
      {
        content = new HBox
        {
          children = Seq(initGridPane())
        }
      }
      scene
    }
    
    def showLogin(): Unit = 
    {
      stage setScene(initScene())
    }
  }
