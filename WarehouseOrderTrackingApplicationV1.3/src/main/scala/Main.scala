/**
 * Imports
 */
import scalafx.application.JFXApp.PrimaryStage
import scalafx.application.JFXApp
import java.sql.ResultSet

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