import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.text.DecimalFormat;
  /**
 * Unit tests for the Spherocylinder class.
 * 
 * Project 2
 * @author - Chester Davidson
 * @version - 03/121/2024
 */

public class SpherocylinderTest {


/** Fixture initialization (common initialization for all tests). **/
   @Before public void setUp() {
   }


/** Tests the getLabel method. **/
   @Test public void getLabelTest() {
      Spherocylinder a = new Spherocylinder("ex 1", 0.5, 0.25);
      Assert.assertEquals(" ", "ex 1", a.getLabel());
   }
   
/** Tests the setLabel method. **/
   @Test public void setLabelTest() {
      Spherocylinder a = new Spherocylinder("ex1", 0.5, 0.25);
      Assert.assertTrue(" ", a.setLabel("ex 2"));
      Assert.assertFalse(" ", a.setLabel(null));
   }

/** Tests the getRadius method. **/
   @Test public void getRadiusTest() {
      Spherocylinder a = new Spherocylinder("ex1", 0.5, 0.25);
      Assert.assertEquals(" ", 0.5, a.getRadius(), 0.000001);
   }

/** Tests the setRadius method. **/
   @Test public void setRadiusTest() {
      Spherocylinder a = new Spherocylinder("ex1", 0.5, 0.25);
      Assert.assertTrue(a.setRadius(1.0));
      Assert.assertFalse(a.setRadius(-0.5));
   }

/** Tests the getCylinderHeight method. **/
   @Test public void getCylinderHeightTest() {
      Spherocylinder a = new Spherocylinder("ex1", 0.5, 0.25);
      Assert.assertEquals(" ", 0.25, a.getCylinderHeight(), 0.000001);
   }

/** Tests the setCylinderHeight method. **/
   @Test public void setCylinderHeightTest() {
      Spherocylinder a = new Spherocylinder("ex1", 0.5, 0.25);
      Assert.assertTrue(a.setCylinderHeight(0.28));
      Assert.assertFalse(a.setCylinderHeight(-0.98));
   }

/** Tests the cicrumference method. **/
   @Test public void circumferenceTest() {
      Spherocylinder a = new Spherocylinder("ex1", 0.5, 0.25);
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
      Assert.assertEquals(" ", "3.142", df1.format(a.circumference()));
   }

/** Tests the surfaceArea method. **/
   @Test public void surfaceAreaTest() {
      Spherocylinder a = new Spherocylinder("ex1", 0.5, 0.25);
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
      Assert.assertEquals(" ", "3.927", df1.format(a.surfaceArea()));
   }

/** Tests the volume method. **/
   @Test public void volumeTest() {
      Spherocylinder a = new Spherocylinder("ex1", 0.5, 0.25);
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
      Assert.assertEquals(" ", "0.72", df1.format(a.volume()));
   }

/** Tests the toString method. **/
   @Test public void toStringTest() {
      Spherocylinder a = new Spherocylinder("ex1", 0.5, 0.25);
      String expected = "Spherocylinder \"ex1\" with radius 0.5 and"
         + " cylinder height 0.25 has:"
         + "\n\tcircumference = 3.142 units"
         + "\n\tsurface area = 3.927 square units"
         + "\n\tvolume = 0.72 cubic units";
      Assert.assertEquals(" ", expected, a.toString());
   }

/** Tests the getCount method. **/
   @Test public void getCountTest() {
      Spherocylinder.resetCount();
      Spherocylinder a = new Spherocylinder("ex1", 0.5, 0.25);
      Assert.assertEquals(" ", 1, Spherocylinder.getCount());
   }

/** Tests the resetCount method. **/
   @Test public void resetCountTest() {
      Spherocylinder.resetCount();
      Assert.assertEquals(" ", 0, Spherocylinder.getCount());
   }
   
   /** Tests the hash code test method. **/
   @Test public void hashCodeTest() {
      Spherocylinder a = new Spherocylinder("ex1", 0.5, 0.25);
      Assert.assertEquals(" ", 0, a.hashCode());
   }
   
   /** Tests the equals method. **/
   @Test public void equalsTest() {
      Spherocylinder a = new Spherocylinder("ex1", 0.5, 0.25);
      Spherocylinder b = new Spherocylinder("ex1", 0.5, 1.25);
      Assert.assertFalse(a.equals(b));
      Spherocylinder c = new Spherocylinder("ex1", 0.5, 0.25);
      Assert.assertTrue(a.equals(c));
      Spherocylinder d = new Spherocylinder("ex2", 0.5, 0.25);
      Assert.assertFalse(a.equals(d));
      Spherocylinder e = new Spherocylinder("ex1", 1.5, 0.25);
      Assert.assertFalse(a.equals(e));
      Object obj = new String("ex1");
      Assert.assertFalse(a.equals(obj));
   }
   
   /** Tests the equals portion of the compareTo method. **/
   @Test public void compareToTest1() {
      Spherocylinder a = new Spherocylinder("ex 1", 0.5, 0.25);
      Spherocylinder b = new Spherocylinder("ex 2", 0.5, 0.25);
      Assert.assertTrue(a.compareTo(b) == 0);
   }
   
   /** Tests the less than portion of the compareTo method. **/
   @Test public void compareToTest2() {
      Spherocylinder a = new Spherocylinder("ex 1", 0.5, 0.25);
      Spherocylinder b = new Spherocylinder("ex 2", 1.5, 3.0);
      Assert.assertTrue(a.compareTo(b) < 0);
   }
   
   /** Tests the less than portion of the compareTo method. **/
   @Test public void compareToTest3() {
      Spherocylinder a = new Spherocylinder("ex 1", 5.0, 6.0);
      Spherocylinder b = new Spherocylinder("ex 2", 1.5, 3.0);
      Assert.assertTrue(a.compareTo(b) > 0);
   }
}



