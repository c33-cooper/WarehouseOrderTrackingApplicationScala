import scalafx.Includes._
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.Scene.sfxScene2jfx
import scalafx.stage.Stage.sfxStage2jfx
import scalafx.scene.layout.HBox
import scalafx.application.JFXApp.PrimaryStage
import scalafx.application.JFXApp
import scalafx.scene.control.TabPane
import scalafx.scene.control.Tab
import scalafx.scene.paint.Color._
import scalafx.scene.control.TableColumn

/**
 * @author callum
 */
class GuiMain extends JFXApp(){
  
  /**
   * Create the tabs for the main window
   */
   def createTabs() : TabPane = 
  {
    new TabPane {
      
      tabs = List(
       new Tab {
         text = "Customer Orders"
         //val custOrderGUI : CustomerOrderGUI = new CustomerOrderGUI()
         //content = custOrderGUI.createGridPane()
       },
       new Tab{
         text = "Purchase Orders"
       }
      )
    }
  }
 
  /**
   * Creates the scene to hold the tabs
   */
  def createScene() : Scene =
  {
    // Main GUI SCENE *****
    val scene2 = new Scene
    {
      fill = LightGreen
      content = new HBox
      {   
        // Inside of the scene, has a set of children which
        // contains elements of the scene.
        children = Seq(
          
            //createTabs()
           //createGridPane()      
        )
      }
    }
    scene2 // return the new scene
  }

  // Show the login scene
  def showLogin(): Unit = 
  {
    stage = new PrimaryStage()
  
    stage setScene(createScene())
    
    stage.show()
    
    stage title = "Warehouse Order Tracking Application V1.2"
    stage width = 800
    stage height = 600

  }
}