import scalafx.application.JFXApp.PrimaryStage
import scalafx.application.JFXApp

/**
 * @author callum
 */
object MainClass extends JFXApp{
  
   val db : Database = new Database()
    
    stage = new PrimaryStage
    
    val logIn : LoginGui = new LoginGui(stage)
   
    logIn showLogin()
  
}