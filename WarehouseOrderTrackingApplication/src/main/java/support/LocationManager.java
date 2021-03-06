package support;
/*
* LocationManager.java
* Holds the locations of a route
*/
import java.util.ArrayList;

public class LocationManager {

    // Holds our locations
    private static ArrayList destinationLocations = new ArrayList<Location>();

    // Adds a destination location
    public static void addLocation(Location location) {
        destinationLocations.add(location);
    }
    
    // Get a location
    public static Location getLocation(int index){
        return (Location)destinationLocations.get(index);
    }
    
    // Get the number of destination locations
    public static int numberOfLocations(){
        return destinationLocations.size();
    }
}