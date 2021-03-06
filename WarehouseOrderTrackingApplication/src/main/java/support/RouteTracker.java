package support;

public class RouteTracker {

	/**
	 *  Class Constructor
	 */
	public RouteTracker(){
	}
	
	/**
	 * Run the tracker
	 */
	public void RunRouteTracker() {
		
		// Create and add locations in the warehouse
		// Create and add our cities
        Location location = new Location(60, 200);
        LocationManager.addLocation(location);
        Location location2 = new Location(180, 200);
        LocationManager.addLocation(location2);
        Location location3 = new Location(80, 180);
        LocationManager.addLocation(location3);
        Location location4 = new Location(140, 180);
        LocationManager.addLocation(location4);
        Location location5 = new Location(20, 160);
        LocationManager.addLocation(location5);
        Location location6 = new Location(100, 160);
        LocationManager.addLocation(location6);
        Location location7 = new Location(200, 160);
        LocationManager.addLocation(location7);
        Location location8 = new Location(140, 140);
        LocationManager.addLocation(location8);
        Location location9 = new Location(40, 120);
        LocationManager.addLocation(location9);
        Location location10 = new Location(100, 120);
        LocationManager.addLocation(location10);
        Location location11 = new Location(180, 100);
        LocationManager.addLocation(location11);
        Location lcoation12 = new Location(60, 80);
        LocationManager.addLocation(lcoation12);
        Location location13 = new Location(120, 80);
        LocationManager.addLocation(location13);
        Location location14 = new Location(180, 60);
        LocationManager.addLocation(location14);
        Location location15 = new Location(20, 40);
        LocationManager.addLocation(location15);
        Location location16 = new Location(100, 40);
        LocationManager.addLocation(location16);
        Location location17 = new Location(200, 40);
        LocationManager.addLocation(location17);
        Location location18 = new Location(20, 20);
        LocationManager.addLocation(location18);
        Location location19 = new Location(60, 20);
        LocationManager.addLocation(location19);
        Location location20 = new Location(160, 20);
        LocationManager.addLocation(location20);
        
     // Initialise population
        Population pop = new Population(50, true);
        System.out.println("\nInitial distance: " + pop.getFittest().getDistance() + " Metres");

        // Evolve population for 100 generations
        pop = GA.evolvePopulation(pop);
        for (int i = 0; i < 1000; i++) {
            pop = GA.evolvePopulation(pop);
        }

        // Print final results
        System.out.println("Finished");
        System.out.println("Final distance: " + pop.getFittest().getDistance() + " Metres");
        System.out.println("Solution:");
        System.out.println(pop.getFittest());
	}
}
