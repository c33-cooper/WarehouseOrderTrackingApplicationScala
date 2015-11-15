package support;

import java.util.ArrayList;

/**
 * 
 * @author callum
 *
 */
public class OrderRoutes {

	// class constructor
	public OrderRoutes(){
	}
	
	/**
	 * Show order line routes
	 */
	public void addLocationsToRoute(int x, int y) {
		
		// Create locations
		Location location = new Location(x, y);
		LocationManager.addLocation(location);
	}
	
	/**
	 * Mutate Routes & get fitness and display route
	 */
	public void populateRoutes(){
		
		// Initialise population
		System.out.println("\nTRAVELLING SALESMAN:");
        Population pop = new Population(100, true);
        System.out.println("Initial distance: " + pop.getFittest().getDistance() + " Metres");

        // Evolve population for 100 generations
        pop = GA.evolvePopulation(pop);
        for (int i = 0; i < 1000; i++) {
            pop = GA.evolvePopulation(pop);
        }

        // Print final results
        System.out.println("Final distance: " + pop.getFittest().getDistance() + " Metres");
        System.out.println("Quickest Route:");
        System.out.println(pop.getFittest());
	}
	
}