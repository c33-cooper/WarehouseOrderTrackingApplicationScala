package support;
/*
* Location.java
* Models a location in the warehouse
*/

public class Location {
    int x;
    int y;
    
    // Constructs a randomly placed location
    public Location(){
        this.x = (int)(Math.random()*200);
        this.y = (int)(Math.random()*200);
    }
    
    // Constructs a location at chosen x, y location
    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // Gets location's x coordinate
    public int getX(){
        return this.x;
    }
    
    // Gets location's y coordinate
    public int getY(){
        return this.y;
    }
    
    // Gets the distance to given location
    public double distanceTo(Location location){
        int xDistance = Math.abs(getX() - location.getX());
        int yDistance = Math.abs(getY() - location.getY());
        double distance = Math.sqrt( (xDistance*xDistance) + (yDistance*yDistance) );
        
        return distance;
    }
    
    @Override
    public String toString(){
        return getX()+", "+getY();
    }
}
