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

/**
 * @author callum
 */
class GuiMain extends JFXApp(){
  
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
 
  /*
   * Creates the scene to hold the tabs
   */
  def createScene() : Scene =
  {
    val scene2 = new Scene
    {
        
      content = new HBox
      {   
        children = Seq(
        
            createTabs()
           //createGridPane()      
        )
      }
    }
    
    scene2
  }

  def showLogin(): Unit = 
  {
    stage = new PrimaryStage()
  
    stage setScene(createScene())
    
    stage.show()
    
    stage title = "Warehouse Order Tracking Application"
    stage width = 800
    stage height = 600

  }
  
}