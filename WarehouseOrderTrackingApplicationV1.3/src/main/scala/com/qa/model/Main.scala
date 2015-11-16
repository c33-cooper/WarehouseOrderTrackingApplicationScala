/**
 * Imports
 */
package com.qa.model

import scalafx.application.JFXApp.PrimaryStage
import scalafx.application.JFXApp
import com.qa.gui.LoginGUI

/**
 * @author callum
 * @description entry point to the application.
 */
object Main extends JFXApp{
 
  // Initialise interface objects
  stage = new PrimaryStage
  val loginInterface : LoginGUI = new LoginGUI(stage)
  loginInterface renderLogin
}