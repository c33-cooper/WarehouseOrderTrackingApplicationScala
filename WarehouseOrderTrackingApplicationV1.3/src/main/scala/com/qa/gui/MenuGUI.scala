package com.qa.gui

import scalafx.Includes.eventClosureWrapperWithParam
import scalafx.Includes.jfxActionEvent2sfx
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.event.ActionEvent
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.Scene.sfxScene2jfx
import scalafx.scene.control.Button
import scalafx.scene.layout.GridPane
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color.CornflowerBlue
import scalafx.stage.Stage.sfxStage2jfx

/**
 * @author callum
 * @description MenuGUI.scala is the interface class for the
 *              menu within the application once the user has
 *              logged on.
 */
class MenuGUI extends JFXApp {
  
  /**
   * Initialise Log out button
   */
  def initLogOutButton() : Button = {
    
    // Create a return to login button so the user can return to login
    val button : Button = new Button {
      // Text field
      text = ("Log Out")
      minWidth = 225
      minHeight = 150
      // Add an event listener to the button
      onAction = (ae : ActionEvent) => {
        // Create a new primary stage 
        stage = new PrimaryStage
  
        // Create a logout instance
        val loginGUI : LoginGUI = new LoginGUI(stage)
        loginGUI renderLogin
      }
    }
    button
  }
  
  /**
   * Initialise View orders button
   */
  def initViewOrdersButton() : Button = {
    
    // Create a button so the user can view orders
    val button : Button = new Button {
      // Text field
      text = ("View Customer Orders")
      minWidth = 225
      minHeight = 150
      // Add an event listener to the button
      onAction = (ae : ActionEvent) => {
        // Create a Customer order GUI and show scene
        val customerOrderGUI : CustomerOrdersGUI = new CustomerOrdersGUI
        customerOrderGUI renderCustomerOrders
      }
    }
    button
  }
  
   /**
   * Initialise View Stock delivery orders button
   */
  def initViewStockDeliveryOrdersButton() : Button = {
    
    // Create a button so the user can view orders
    val button : Button = new Button {
      // Text field
      text = ("View Stock Delivery Orders")
      minWidth = 225
      minHeight = 150
//      // Add an event listener to the button
//      onAction = (ae : ActionEvent) => {
//        // Do something
//      }
    }
    button
  }
  
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
      add(initViewOrdersButton, 20, 8)
      add(initViewStockDeliveryOrdersButton(), 20, 9)
      add(initLogOutButton, 20, 10)
    }
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
        children = Seq(initGridPane)
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
    stage width = 700
    stage height = 700
  }
}