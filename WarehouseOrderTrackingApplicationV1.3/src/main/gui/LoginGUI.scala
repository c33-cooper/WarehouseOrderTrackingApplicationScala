/**
 * Imports
 */
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
 * @description LoginGUI.scala is the class that sets
 *              up the interfaces for the user login.
 */
class LoginGUI(stage : PrimaryStage) {
  
  // Window attributes
  stage title = "Login User"
  stage width = 300
  stage height = 200
  
  /**
   * Initialise the scene
   */
  def initScene : Scene = {
    
    // Create a new scene for the login
    val loginScene = new Scene{
      
      // fill the scene Cornflower blue
      fill = CornflowerBlue
      
      // content of the scene goes here
      content = new HBox {
        // child 1
        children = Seq(initGridPane)
      }
    }
    loginScene
  }
  
  /**
   * Initialise login button
   */
//  def initLoginButton(usernameField : TextField, passwordField : TextField) : Button = {
//    
//    // Create a button so the user can login
//    val button = new Button
//    {
//      // text field
//      text = ("Log in")
//      
//      // Adds an event listener to the button
//      onAction = (ae : ActionEvent) => {
//        // Login details
//        val user : String = usernameField.text getValue
//        val pass : String = passwordField.text getValue
//        
//        // Create a Employee object
//        val employee = new Employee(user, pass)
//      }
//    }
//  }
  
  /**
   * Create a rectangle for high cohesion
   */
//  def createRect : Rectangle = {
//    
//  }
  
  /**
   * Create a username text field
   */
  val username = new TextField{
    promptText = ("Username: ")
  }
  
  /**
   * Create a password text field
   */
  val passwordField = new PasswordField{
    promptText = "Password: "
  }
  
  /**
   * Initialise grid pane for the scene
   */
  def initGridPane : GridPane = {
    
    // Initialise a grid pane for the scene, the gridpane
    // basically sets a horizontal gap and a vertical gap
    // within the scene, so that items can be added to the
    // scene. Also creates padding from 
    new GridPane {
      hgap = 10
      vgap = 10
      padding = Insets(20, 100, 10, 10)
      
      // UI login features
      add(new Label("Username: "), 0, 4)
      add(username, 1, 4)
      add(new Label("Password: "), 0, 5)
      add(passwordField, 1, 5)
    }
  }
  
  /**
   * Show the login interface
   */
  def renderLogin : Unit = {
    stage.setScene(initScene)
  }
}