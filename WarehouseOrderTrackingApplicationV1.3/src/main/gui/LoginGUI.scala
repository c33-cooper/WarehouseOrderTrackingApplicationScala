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
import javafx.scene.layout.GridPane

/**
 * @author callum
 * @description LoginGUI.scala is the class that sets
 *              up the interfaces for the user login.
 */
class LoginGUI(stage : PrimaryStage) {
  
  // Window attributes
  stage title = "Login User"
  stage width = 300
  stage height = 400
  
  /**
   * Initialise the scene
   */
  def initScene : Scene = {
    
    // Create a new scene for the login
    val loginScene = new Scene{
      fill = CornflowerBlue
    }
    loginScene
  }
  
  /**
   * Create a rectangle for high cohesion
   */
//  def createRect : Rectangle = {
//    
//  }
  
  /**
   * Initialise grid pane for the scene
   */
  def initGridPane : GridPane = {
    
    // Initialise a grid pane for the scene, the gridpane
    // basically sets a horizontal gap and a vertical gap
    // within the scene, so that items can be added to the
    // scene. Also creates padding from 
    new GridPane {
      horizontalGap = 10
      verticalGap = 10
      p
    }
  }
  
  /**
   * Show the login interface
   */
  def renderLogin : Unit = {
    stage.setScene(initScene)
  }
}