/**
 * Imports
 */
import scalafx.Includes._
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.Scene.sfxScene2jfx
import scalafx.stage.Stage.sfxStage2jfx
import scalafx.scene.layout.{HBox, VBox}
import scalafx.application.JFXApp.PrimaryStage
import scalafx.application.JFXApp
import scalafx.scene.control.{TabPane, Tab}
import scalafx.geometry.Insets
import scalafx.scene.paint.Color._
import scalafx.scene.paint._
import scalafx.scene.control.Button
import java.awt.event.ActionEvent
import scalafx.application.JFXApp.PrimaryStage

/**
 * @author callum
 * @description MenuGUI.scala is the interface class for the
 *              menu within the application once the user has
 *              logged on.
 */
class MenuGUI extends JFXApp {
  
  /**
   * Initialise View orders button
   */
  def initViewOrdersButton() : Button = {
    
    // Create a button so the user can view orders
    val button : Button = new Button {
      // Text field
      text = ("View Customer Orders")
      
//      // Add an event listener to the button
//      onAction = (ae : ActionEvent) => {
//        // Do something
//      }
    }
    button
  }
  
  /**
   * Initialise the scene
   */
  def initScene : Scene = {
    
    // Create a new scene for the menu
    val menuScene = new Scene{
      
      // Fill the scene with a color
      fill = CornflowerBlue
      
      // Content of the scene goes here
      content = new HBox {
        // Child 1
        children = Seq(initViewOrdersButton)
      }
    }
    menuScene
  }
  
  /**
   * Show the menu interface
   */
  def renderMenu : Unit = {
    // Create a new stage for the menu and set
    // the scene
    stage = new PrimaryStage
    stage setScene(initScene)
    stage.show
    stage title = "Warehouse Order Tracking Application V1.3"
    stage width = 500
    stage height = 500
  }
}