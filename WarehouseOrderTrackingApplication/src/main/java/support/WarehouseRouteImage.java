package support;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author callum
 *
 */
public class WarehouseRouteImage {

	/**
	 * Class constructor
	 */
	public WarehouseRouteImage() {
	}
	
	/**
	 * Display warehouse route image
	 */
	public void ShowWarehouseRouteImage() {
		
		try{
		// Store resource image file in memory
					// And call cmd prompt to run resource.
					// ****PLATFORM DEPENDENT on WINDOWS****
					// ****MAY HAVE TO BE CHANGED FOR LINUX ***
		            File imgFile = new File("map2.png");
		            System.out.println(imgFile.toString());
		            Runtime.getRuntime().exec("cmd /c start " + imgFile.getAbsolutePath());
		            
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
