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
//        City city5 = new City(20, 160);
//        TourManager.addCity(city5);
//        City city6 = new City(100, 160);
//        TourManager.addCity(city6);
//        City city7 = new City(200, 160);
//        TourManager.addCity(city7);
//        City city8 = new City(140, 140);
//        TourManager.addCity(city8);
//        City city9 = new City(40, 120);
//        TourManager.addCity(city9);
//        City city10 = new City(100, 120);
//        TourManager.addCity(city10);
//        City city11 = new City(180, 100);
//        TourManager.addCity(city11);
//        City city12 = new City(60, 80);
//        TourManager.addCity(city12);
//        City city13 = new City(120, 80);
//        TourManager.addCity(city13);
//        City city14 = new City(180, 60);
//        TourManager.addCity(city14);
//        City city15 = new City(20, 40);
//        TourManager.addCity(city15);
//        City city16 = new City(100, 40);
//        TourManager.addCity(city16);
//        City city17 = new City(200, 40);
//        TourManager.addCity(city17);
//        City city18 = new City(20, 20);
//        TourManager.addCity(city18);
//        City city19 = new City(60, 20);
//        TourManager.addCity(city19);
//        City city20 = new City(160, 20);
//        TourManager.addCity(city20);
        
     // Initialise population
        Population pop = new Population(50, true);
        System.out.println("Initial distance: " + pop.getFittest().getDistance());

        // Evolve population for 100 generations
        pop = GA.evolvePopulation(pop);
        for (int i = 0; i < 100; i++) {
            pop = GA.evolvePopulation(pop);
        }

        // Print final results
        System.out.println("Finished");
        System.out.println("Final distance: " + pop.getFittest().getDistance());
        System.out.println("Solution:");
        System.out.println(pop.getFittest());
	}
}