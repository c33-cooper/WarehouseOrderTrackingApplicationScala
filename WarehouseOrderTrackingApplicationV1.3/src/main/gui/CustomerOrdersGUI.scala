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
import scalafx.scene.layout.GridPane
import scalafx.scene.Node
import scalafx.scene.control.TableColumn._
import scalafx.scene.control.{TableCell, TableColumn, TableView}
import scalafx.collections.ObservableBuffer

/**
 * @author callum
 * @description CustomerOrdersGUI.scala is the interface class for the
 *              customer orders within the application.
 */
class CustomerOrdersGUI extends JFXApp{
  
  /**
   * Customer orders attributes
   */
  val orders = ObservableBuffer[CustomerOrder](
      new CustomerOrder())
  
  /**
   * Initialise grid pane for the scene
   * to allow items to be placed in an
   * efficient manner.
   */
  def initGridPane : GridPane = {
    
    // Initialise a grid pane for the scene, the gridpane
    // basically sets a horizontal gap and a vertical gap
    // within the scene, so that items can be added to the
    // scene. Also creates padding from 
    new GridPane {
      // Horizontal and vertical gaps are the distance
      // between items in the layout of the UI.
      hgap = 10
      vgap = 10
      padding = Insets(20, 100, 10, 10)
      
      /* UI menu features with X, Y coordinates
      * for column -----
      * and row    |
      * of the     |
      * grid pane  |
      *            
      */
      
    }
  }
  
  /**
   * Create a customer order table to display the orders
   */
//  def createCustomerOrderTable : Node = {
//    
//    // Create a table view of customer orders
//    val table = new TableView[CustomerOrder](orders) {
//       columns ++= List{
//         new TableColumn[CustomerOrder, Int] {
//           text = "Customer Order ID"
//           cellValueFactory = { _.value.orderID }
//           prefWidth = 100
//         }
//       } 
//    }
//  }
  
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
        children = Seq(initGridPane)
      }
    }
    menuScene
  }
  
  /**
   * Show the menu interface
   */
  def renderCustomerOrders : Unit = {
    // Create a new stage for the menu and set
    // the scene
    stage = new PrimaryStage
    stage setScene(initScene)
    stage.show
    stage title = "Warehouse Order Tracking Application V1.3"
    stage width = 700
    stage height = 700
  }
}