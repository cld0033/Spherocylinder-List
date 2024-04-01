import java.text.DecimalFormat;
/**
 * Creates the SpherocylinderList class.
 *
 * Project 3
 * @author Chester Davidson
 * @version 03/30/2024
 */
public class SpherocylinderList {
   private String nameOfList;
   private Spherocylinder[] spherocylinderArray;
   private int numberOfObjects;

   /**
    * Constructor of SpherocylinderList Class.
    * @param nameOfListIn sets name of list
    * @param spherocylinderArrayIn sets spherocylinderArray
    * @param numberOfObjectsIn sets number of objects
    */
   public SpherocylinderList(String nameOfListIn,
                             Spherocylinder[] spherocylinderArrayIn,
                             int numberOfObjectsIn) {
      nameOfList = nameOfListIn;
      spherocylinderArray = spherocylinderArrayIn;
      numberOfObjects = numberOfObjectsIn;
   }

   /**
    * getName method.
    * @return nameOfList - gets name of list
    */
   public String getName() {
      return nameOfList;
   }

   /**
    * numberOfSpherocylinders method.
    * @return numberOfObjects - gets the number of spherocylinders.
    */
   public int numberOfSpherocylinders() {
      return numberOfObjects;
   }

   /**
    * calculates the total surface area.
    * @return total - sum of all surface areas.
    */
   public double totalSurfaceArea() {
      double total = 0;
      for (int i = 0; i < numberOfObjects; i++) {
         total += spherocylinderArray[i].surfaceArea();
      }
      return total;
   }

   /**
    * calculates the total volume.
    * @return total - sum of all volumes
    */
   public double totalVolume() {
      double total = 0.0;
      for (int i = 0; i < numberOfObjects; i++) {
         total += spherocylinderArray[i].volume();
      }
      return total;
   }

   /**
    * calculates the average volume.
    * @return average - average of all volumes.
    */
   public double averageVolume() {
      double average = 0.0;
      if (numberOfObjects != 0) {
         average = totalVolume() / numberOfObjects;
      } else {
         return 0.0;
      }
      return average;
   }

   /**
    * calculates the average surface area.
    * @return average - average of all surface areas
    */
   public double averageSurfaceArea() {
      double average = 0.0;
      if (numberOfObjects != 0) {
         average = totalSurfaceArea() / numberOfObjects;
      } else {
         return 0.0;
      }
      return average;
   }

   /**
    * toString method.
    * @return output - returns the array in a string.
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + nameOfList + " -----"
             + "\nNumber of Spherocylinders: " + numberOfSpherocylinders()
             + "\nTotal Surface Area: " + df.format(totalSurfaceArea())
             + "\nTotal Volume: " + df.format(totalVolume())
             + "\nAverage Surface Area: " + df.format(averageSurfaceArea())
             + "\nAverage Volume: " + df.format(averageVolume());
      return output;
   }

   /**
    * getList method.
    * @return spherocylinderArray - the array of spherocylinders.
    */
   public Spherocylinder[] getList() {
      return spherocylinderArray;
   }

   /**
    * addSpherocylinder method.
    * @param labelIn - sets label of new spherocylinder
    * @param radiusIn - sets radius of new spherocylinder
    * @param cylinderHeightIn - sets cylinderheight of new spherocylinder
    */
   public void addSpherocylinder(String labelIn, double radiusIn,
                                 double cylinderHeightIn) {
      Spherocylinder add = new Spherocylinder(labelIn, radiusIn,
         cylinderHeightIn);
      spherocylinderArray[numberOfObjects] = add;
      numberOfObjects++;
   }

   /**
    * findSpherocylinder method.
    * @param labelIn - sets the label to search for in array.
    * @return spherocylinderArray[i] - the toString method of the matching
    *          spherocylinder
    */
   public Spherocylinder findSpherocylinder(String labelIn) {
      for (Spherocylinder spherocylinder : spherocylinderArray) {
         if (spherocylinder == null) {
            continue;
         }
         if (spherocylinder.getLabel().equalsIgnoreCase(labelIn)) {
            return spherocylinder;
         }
      }
      return null;
   }


   /**
    * edits a spherocylinder in the array.
    * @param labelIn - sets label to find in array.
    * @param radiusIn - sets new radius of spherocylinder.
    * @param heightIn - sets new cylinder of height
    * @return true - if label is found in array.
    */
   public boolean editSpherocylinder(String labelIn, double radiusIn,
                                     double heightIn) {
      Spherocylinder foundSpherocylinder = findSpherocylinder(labelIn);
      if (foundSpherocylinder != null) {
         foundSpherocylinder.setRadius(radiusIn);
         foundSpherocylinder.setCylinderHeight(heightIn);
         return true;
      }
      else {
         return false;
      }
   }


   /**
    * finds a spherocylinder with the largest volume.
    * @return largestVolumeSpherocylinder - contains largest volume.
    */
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      if (numberOfObjects != 0) {
         Spherocylinder largestVolumeSpherocylinder = spherocylinderArray[0];
         for (int i = 0; i < spherocylinderArray.length; i++) {
            
            if (spherocylinderArray[i] != null 
               && spherocylinderArray[i].volume()
               > largestVolumeSpherocylinder.volume()) {
            
               largestVolumeSpherocylinder = spherocylinderArray[i];
            }
         }
         return largestVolumeSpherocylinder;
      }
      return null;
   }

   /**
    * deletes a spherocylinder from the array.
    * @param labelIn - sets the label in which to search in the array
    * @return foundSpherocylinder - and deletes it
    */
     
   public Spherocylinder deleteSpherocylinder(String labelIn) {
      Spherocylinder foundSpherocylinder = null;
       
      for (int i = 0; i < numberOfObjects; i++) {
         if (spherocylinderArray[i].getLabel().equalsIgnoreCase(labelIn)) {
            foundSpherocylinder = spherocylinderArray[i];
            for (int j = i; j < numberOfObjects - 1; j++) {
               spherocylinderArray[j] = spherocylinderArray[j + 1];
            }
            
            spherocylinderArray[numberOfObjects - 1] = null; //overwrites
            numberOfObjects--;
            break;
         }
         
      }
      return foundSpherocylinder;
   }
     
}