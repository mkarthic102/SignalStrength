/**
 * Cell represents a square in a 2dimensional rectangle
 * that may have different types of walls, and contains
 * a wifi signal strength.
 *
 */
public class Cell {


   /** The signal strength of the cell. */
   private double signal;
   /** The accumulated attenuation rating of the cell. */
   private int attenuation;
   /** The direction from the router cell to the current cell. */
   private String direction;
   /** The distance from the router cell to the current cell. */
   private double distance;
   
   /** A character representing the north wall type. */
   private char north;
   /** A character representing the east wall type. */
   private char east;
   /** A character representing the south wall type. */
   private char south;
   /** A character representing the west wall type. */
   private char west;

   
   /**
    * Construct a cell that doesn't have any walls and whose
    * signal strength is lower than the lowest value (-100).
    * The accumulated attenuation rate is assumed to be 0 to start,
    * as is the distance. The direction is initialized to "--".
    */
   public Cell() {
      this.signal = -101.0;
      this.north = 'n';
      this.east = 'n';
      this.south = 'n';
      this.west = 'n';
      this.attenuation = 0;
      this.direction = "--";
      this.distance = 0;
   }
   

   /**
    * Use a string in NESW (north-east-south-west) order to 
    * represent and set the walls of this cell.
    * The given string is assumed to have length 4.
    * @param walls the string representation of wall types
    */
   public void setWalls(String walls) {
      this.north = walls.charAt(0);
      this.east = walls.charAt(1);
      this.south = walls.charAt(2);
      this.west = walls.charAt(3);
   }
   
    
   /**
    * The the type of the north wall.
    * @return the type
    */
   public char getNorth() {
      return this.north;
   }
   
   /**
    * The the type of the north wall.
    * @return the type
    */
   public char getEast() {
      return this.east;
   }
   
   /**
    * The the type of the north wall.
    * @return the type
    */
   public char getSouth() {
      return this.south;
   }
   
   /**
    * The the type of the north wall.
    * @return the type
    */
   public char getWest() {
      return this.west;
   }


   /** 
    * Get the signal strength of this cell.
    * @return the signal strength
    */
   public double getSignal() {
      return this.signal;  
   }
   
   /** 
    * Set the signal strength of this cell.
    * @param sig the calculated signal value
    */
   public void setSignal(double sig) {
      this.signal = sig;  
   }
   
   /** 
    * Get the attenuation rate of this cell.
    * @return the accumulated attenuation
    */
   public int getRate() {
      return this.attenuation;  
   }
   
   /** 
    * Set the attenuation rate of this cell.
    * @param att the new attenuation value
    */
   public void setRate(int att) {
      this.attenuation = att;  
   }
   
   /** 
    * Get the direction from the router to this cell.
    * @return the direction heading
    */
   public String getDirection() {
      return this.direction;  
   }
   
   /** 
    * Set the direction from the router to this cell.
    * @param dir the direction heading
    */
   public void setDirection(String dir) {
      this.direction = dir;  
   }

   /** 
    * Get the distance from the router to this cell.
    * @return the distance (in km)
    */
   public double getDistance() {
      return this.distance;  
   }
   
   /** 
    * Set the distance from the router to this cell.
    * @param dist the calculated distance
    */
   public void setDistance(double dist) {
      this.distance = dist;  
   } 
     
   /**
    * Clone the values of this cell to make
    * a copy cell.
    * @return the copied new cell
    */
   public Cell makeCopy() {
      Cell copy = new Cell();
      copy.north = this.north;
      copy.east = this.east;
      copy.south = this.south;
      copy.west = this.west;
      copy.signal = this.signal;
      copy.attenuation = this.attenuation;
      copy.distance = this.distance;
      copy.direction = this.direction;
      return copy;
   }
   
   /** Create a string representation of the cell measurements.
    *  @return the string in format: [signal, direction, atten, distance]
    */
   public String toString() {
      return String.format("[%8.4f, %2s, %2d, %7.4f]", signal, direction, 
                           attenuation, distance);
   }
   
}