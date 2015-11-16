package com.qa.gui

/**
 * Imports
 */
import scalafx.Includes._
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.Scene.sfxScene2jfx
import scalafx.scene.layout.HBox
import scalafx.application.JFXApp
import scalafx.geometry.Insets
import scalafx.scene.paint.Color._
import scalafx.scene.paint._
import scalafx.scene.control.Button
import scalafx.event.ActionEvent
import scalafx.scene.layout.GridPane
import scalafx.scene.Node
import scalafx.scene.control.TableColumn._
import scalafx.scene.control.{Button, TableView}
import scalafx.collections.ObservableBuffer
import com.qa.entities.StockDeliveryOrderEntity
import com.qa.model.StockDeliveryOrders
import scalafx.scene.control.TableColumn

/**
 * @author callum
 * @description CustomerOrdersGUI.scala is the interface class for the
 *              customer orders within the application.
 */
class StockDeliveryOrder extends JFXApp{
  
  /**
   * Customer orders attributes
   */
   var currentSDOrderID : Int = 0
   
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
      add(initHomeButton, 1, 0)
      add(initLogOutButton, 1, 1)
    }
  }
   
   /**
    * Initialise a home button
    */
   def initHomeButton : Button = {
     
     // Create a button so the user can view orders
     val button : Button = new Button {
       // Text field
       text = ("Home")
       minWidth = 100
       minHeight = 100
       
       // Add an event listener to the button
       onAction = (ae : ActionEvent) => {
         // Create a menu gui and show scene
         val menuGUI : MenuGUI = new MenuGUI
         menuGUI renderMenu
       }
     }
     button
   }
   
   /**
    * Initialise a logout button
    */
   def initLogOutButton : Button = {
     
     // Create a button so the user can view orders
     val button : Button = new Button {
       // Text field
       text = ("Log Out")
       minWidth = 100
       minHeight = 100
       
       // Add an event listener to the button
       onAction = (ae : ActionEvent) => {
         // Create a new stage
         val stage = new PrimaryStage
         
         // Create a menu gui and show scene
         val logInGUI : LoginGUI = new LoginGUI(stage)
         logInGUI renderLogin
       }
     }
     button
   }
  
  /**
   * Create a stock delivery table to display the orders
   */
  def createStockDeliveryTable : Node = {
    
    // Create stock delivery orders table
    val stockDeliveryOrders : StockDeliveryOrders = new StockDeliveryOrders
    val orders : ObservableBuffer[StockDeliveryOrderEntity] = stockDeliveryOrders.establishStockDeliveryOrders()
    
    // Generate tables with entities
    val table = new TableView[StockDeliveryOrderEntity](orders){
      // Generate the table columns
    columns ++= (List(new TableColumn[StockDeliveryOrderEntity, Int]
    {
      text = "Stock Delivery Order ID"
      cellValueFactory = {_.value.idStockDeliveryOrders}
      prefWidth = 130
    }))
    }
  
    table.onMouseClicked = handle
    {
      try
      {
        currentSDOrderID = table.getSelectionModel.selectedItemProperty.get.idStockDeliveryOrders.value
      }
      catch
      {
        case e : Throwable => println()
      } 
    }
    table
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
        children = Seq(initGridPane, createStockDeliveryTable)
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
    val stage = new PrimaryStage
    stage setScene(initScene)
    stage.show
    stage title = "Warehouse Order Tracking Application V1.3"
    stage width = 910
    stage height = 440
  }
}