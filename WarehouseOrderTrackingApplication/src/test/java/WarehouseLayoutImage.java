import java.io.File;
import java.io.IOException;


/**
 * 
 * @author callum
 *
 */
public class WarehouseLayoutImage {

	/**
	 *  class constructor
	 */
	public WarehouseLayoutImage(){
	}
	
	/**
	 * Show warehouse image
	 */
	public void ShowWarehouseLayoutImage() {
		try {
			// Store resource image file in memory
			// And call cmd prompt to run resource.
			// ****PLATFORM DEPENDENT on WINDOWS****
			// ****MAY HAVE TO BE CHANGED FOR LINUX ***
            File imgFile = new File("wh.jpg");
            System.out.println(imgFile.toString());
            Runtime.getRuntime().exec("cmd /c start " + imgFile.getAbsolutePath());
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
