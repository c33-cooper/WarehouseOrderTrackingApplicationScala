package support;
/*
* Route.java
* Stores a candidate route
*/

import java.util.ArrayList;
import java.util.Collections;

public class Route{

    // Holds our route of locations
    private ArrayList route = new ArrayList<Location>();
    // Cache
    private double fitness = 0;
    private int distance = 0;
    
    // Constructs a blank route
    public Route(){
        for (int i = 0; i < LocationManager.numberOfLocations(); i++) {
            route.add(null);
        }
    }
    
    public Route(ArrayList route){
        this.route = route;
    }

    // Creates a random individual
    public void generateIndividual() {
        // Loop through all our destination locations and add them to our route
        for (int locationIndex = 0; locationIndex < LocationManager.numberOfLocations(); locationIndex++) {
          setLocation(locationIndex, LocationManager.getLocation(locationIndex));
        }
        // Randomly reorder the route
        Collections.shuffle(route);
    }

    // Gets a location from the route
    public Location getLocation(int routePosition) {
        return (Location)route.get(routePosition);
    }

    // Sets a location in a certain position within a route
    public void setLocation(int routePosition, Location location) {
        route.set(routePosition, location);
        // If the route has been altered we need to reset the fitness and distance
        fitness = 0;
        distance = 0;
    }
    
    // Gets the routes fitness
    public double getFitness() {
        if (fitness == 0) {
            fitness = 1/(double)getDistance();
        }
        return fitness;
    }
    
    // Gets the total distance of the route
    public int getDistance(){
        if (distance == 0) {
            int routeDistance = 0;
            // Loop through our routes locations
            for (int locationIndex=0; locationIndex < routeSize(); locationIndex++) {
                // Get location we're travelling from
                Location fromLocation = getLocation(locationIndex);
                // Location we're travelling to
                Location destinationLocation;
                // Check we're not on our route's last location, if we are set our 
                // route's final destination location to our starting location
                if(locationIndex+1 < routeSize()){
                    destinationLocation = getLocation(locationIndex+1);
                }
                else{
                    destinationLocation = getLocation(0);
                }
                // Get the distance between the two locations
                routeDistance += fromLocation.distanceTo(destinationLocation);
            }
            distance = routeDistance;
        }
        return distance;
    }

    // Get number of locations on our route
    public int routeSize() {
        return route.size();
    }
    
    // Check if the route contains a location
    public boolean containsLocation(Location location){
        return route.contains(location);
    }
    
    @Override
    public String toString() {
        String geneString = "|";
        for (int i = 0; i < routeSize(); i++) {
            geneString += getLocation(i)+"|";
        }
        return geneString;
    }
}
