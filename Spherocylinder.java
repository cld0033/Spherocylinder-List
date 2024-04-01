import java.text.DecimalFormat;

/**
 * Creates a Spherocylinder class.
 * 
 * Project 2
 * @author Chester Davidson
 * @version - 03/21/2024
 */
public class Spherocylinder implements Comparable<Spherocylinder> {
   private String label = "";
   private double radius = 0;
   private double cylinderHeight = 0;
   private static int count = 0;

	/**
	 * Sets up the Spherocylinder constructor.
	 * @param labelIn - String in
    * @param radiusIn - Double radius
    * @param cylinderHeightIn - double cylinder height
	 */
   public Spherocylinder(String labelIn, double radiusIn,
   		double cylinderHeightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylinderHeightIn);
      count++;
   }
	/**
	 * getLabel method.
	 * @return label
	 */
   public String getLabel() {
      return label;
   }
	/**
	 * setLabel method.
	 * @param labelIn - string label
	 * @return boolean
	 */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
	/**
	 * getRadius method.
	 * @return radius
	 */
   public double getRadius() {
      return radius;
   }
	
	/**
	 * set radius method.
	 * @param radiusIn - double radius
	 * @return boolean
	 */
   public boolean setRadius(double radiusIn) {
      if (radiusIn >= 0) {
         radius = radiusIn;
         return true;
      }
      return false;
   }
	
	/**
	 * get Cylinder Height.
	 * @return cylinderHeight
	 */
   public double getCylinderHeight() {
      return cylinderHeight;
   }
	/**
	 * Sets Cylinder Height.
	 * @param cylinderHeightIn - double cylinder height
	 * @return cylinderHeight
	 */
   public boolean setCylinderHeight(double cylinderHeightIn) {
      if (cylinderHeightIn >= 0) {
         cylinderHeight = cylinderHeightIn;
         return true;
      }
      return false;
   }
	/**
	 * Calculates circumference.
	 * @return circumference
	 */
   public double circumference() {
      double circumference = 2 * Math.PI * radius;
      return circumference;
   }
	
	/**
	 * calculates surface area.
	 * @return surfaceArea
	 */
   public double surfaceArea() {
      double surfaceArea = 2 * Math.PI * radius
         	* (2 * radius + cylinderHeight);
      return surfaceArea;
   }
	
	/**
	 * calculates volume.
	 * @return volume
	 */
   public double volume() {
      double volume = Math.PI * Math.pow(radius, 2)
         	* ((4.0 / 3.0) * radius + cylinderHeight);
      return volume;
   }
	
	/**
	 * toString Method.
	 * @return output
	 */
   public String toString() {
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder \"" + label + "\" with radius "
         	+ radius + " and cylinder height " + cylinderHeight + " has:"
         	+ "\n\tcircumference = " + df1.format(circumference())
            + " units"
         	+ "\n\tsurface area = " + df1.format(surfaceArea())
            + " square units"
         	+ "\n\tvolume = " + df1.format(volume()) + " cubic units";
      return output;
   }
	
	/**
	 * gets the count.
	 * @return count
	 */
   public static int getCount() {
      return count;
   }
	
	/**
	 * resets the count.
	 */
   public static void resetCount() {
      count = 0;
   }
	
	/**
	 * checks equality of two objects.
    * @param obj - object
    * @return boolean
	 */
   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder)) {
         return false;
      }
      else {
         Spherocylinder d = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(d.getLabel())
            && Math.abs(radius - d.getRadius()) < .000001
            && Math.abs(cylinderHeight - d.getCylinderHeight())
            	< .000001);
      }
   }
	
   /**
   * creates hashcode.
   * @return 0
   **/
   public int hashCode() {
      return 0;
   }

    /**
     * creates compareTo method.
     * @param obj - Spherocylinder obj to compare to
     * @return 0 if equal, -1 if less than, 1 if greater than
     */
   public int compareTo(Spherocylinder obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0;
      }
      else if (this.volume() < obj.volume()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}
