import scalafx.application.JFXApp.PrimaryStage
import scalafx.application.JFXApp

/**
 * @author callum
 */
object Main extends JFXApp{
  
    /**
     * Initialise the database connections &
     * Interface objects.
     */
    val db : Database = new Database()
    stage = new PrimaryStage
    val logIn : LoginGui = new LoginGui(stage)
    logIn showLogin() 
}