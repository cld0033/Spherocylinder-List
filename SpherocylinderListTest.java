import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 /**
 * Creates the SpherocylinderList test class.
 *
 * Project 3
 * @author Chester Davidson
 * @version 03/30/2024
 */ 
public class SpherocylinderListTest {


   /** Fixture initialization (common initialization for all tests). **/
   @Before public void setUp() {
   }
   
/** tests the getName method. **/
   @Test public void getNameTest() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[0];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      Assert.assertEquals("Test", c.getName());
   }  
   
   /** Tests the numberOfSpherocylinders method. **/
   @Test public void numberOfSpherocylindersTest() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[10];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      Assert.assertEquals(0, c.numberOfSpherocylinders());
      c.addSpherocylinder("name1", 3.4, 3.5);
      Assert.assertEquals(1, c.numberOfSpherocylinders());
   }
   
   /** test the total surface area method. **/
   @Test public void totalSurfaceAreaTest() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[10];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      Assert.assertEquals(0.0, c.totalSurfaceArea(), 0.000001);
      c.addSpherocylinder("name1", 3.0, 5.0);
      c.addSpherocylinder("name2", 4.0, 5.0);
      Assert.assertEquals(534.0707511102648, c.totalSurfaceArea(), 0.000001);
   }
   
   /** Tests the totalVolume method. **/
   @Test public void totalVolumeTest() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[10];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      Assert.assertEquals(0.0, c.totalVolume(), 0.000001);
      c.addSpherocylinder("name1", 3.0, 5.0);
      c.addSpherocylinder("name2", 4.0, 5.0);
      Assert.assertEquals(773.8789903342856, c.totalVolume(), 0.000001);
   }
   
   /** Tests the averageVolume Method. **/
   @Test public void averageVolume() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[10];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      Assert.assertEquals(0.0, c.averageVolume(), 0.000001);
      c.addSpherocylinder("name1", 3.0, 5.0);
      c.addSpherocylinder("name2", 4.0, 5.0);
      Assert.assertEquals(386.9394951671428, c.averageVolume(), 0.000001);
   }
   
   /** Tests the averageSurfaceArea method. **/
   @Test public void averageSurfaceArea() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[10];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      Assert.assertEquals(0.0, c.averageSurfaceArea(), 0.000001);
      c.addSpherocylinder("name1", 3.0, 5.0);
      c.addSpherocylinder("name2", 4.0, 5.0);
      Assert.assertEquals(267.0353755551324, c.averageSurfaceArea(), 0.000001);
   }
   
   /** Tests the toString Method. **/
   @Test public void toStringTest() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[10];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      Assert.assertEquals("----- Summary for Test -----"
         + "\nNumber of Spherocylinders: 0"
         + "\nTotal Surface Area: 0.0"
         + "\nTotal Volume: 0.0"
         + "\nAverage Surface Area: 0.0"
         + "\nAverage Volume: 0.0", c.toString());
   }
   
   /** Tests the getList method. **/
   @Test public void getListTest() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[10];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      Assert.assertArrayEquals(a, c.getList());
   }
   
   /** Tests the findSpherocylinder method. **/
   @Test public void findSpherocylinderTest1() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[10];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      Spherocylinder d = new Spherocylinder("a", 3.0, 5.0);
      c.addSpherocylinder("a", 3.0, 5.0);
      c.addSpherocylinder("b", 4.0, 5.0);
      Assert.assertEquals(d, c.findSpherocylinder("a"));
   }
   
   /** Tests the findSpherocylinder method as a null value. **/
   @Test public void findSpherocylinderTest2() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[10];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      Assert.assertNull(c.findSpherocylinder("a"));
   }
   
   /** Tests the findSpherocylinderWithLargestVolume Method. **/
   @Test public void findSpherocylinderWithLargestVolumeTest1() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[2];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      Spherocylinder d = new Spherocylinder("b", 4.0, 5.0);
      c.addSpherocylinder("a", 3.0, 5.0);
      c.addSpherocylinder("b", 4.0, 5.0);
      Assert.assertEquals(d, c.findSpherocylinderWithLargestVolume());
   }
   
   /** Tests the findSpherocylinderWithLargestVolume method. **/
   @Test public void findSpherocylinderWithLargestVolumeTest2() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[2];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      Assert.assertNull(c.findSpherocylinderWithLargestVolume());
   }
   
      /** Tests the findSpherocylinderWithLargestVolume method. **/
   @Test public void findSpherocylinderWithLargestVolumeTest3() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[4];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      c.addSpherocylinder("a", 3.0, 5.0);
      c.addSpherocylinder("b", 4.0, 5.0);
      c.addSpherocylinder("c", 4.0, 5.0);
      Spherocylinder d = new Spherocylinder("b", 4.0, 5.0);
      Assert.assertEquals(d, c.findSpherocylinderWithLargestVolume());
   }
   
   /** Tests the deleteSpherocylinder method on a valid label. **/
   @Test public void deleteSpherocylinderTest1() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[2];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      Spherocylinder d = new Spherocylinder("b", 4.0, 5.0);
      c.addSpherocylinder("a", 3.0, 5.0);
      c.addSpherocylinder("b", 4.0, 5.0);
      Assert.assertEquals(d, c.deleteSpherocylinder("b"));
   }
   
   /** tests the deleteSpherocylinder method on a label that doesnt exist. **/
   @Test public void deleteSpherocylinderTest2() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[2];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      c.addSpherocylinder("a", 3.0, 5.0);
      c.addSpherocylinder("b", 4.0, 5.0);
      Assert.assertNull(c.deleteSpherocylinder("c"));
   }
   
    /** tests the deleteSpherocylinder method on an empty array. **/
   @Test public void deleteSpherocylinderTest3() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[0];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      Assert.assertNull(c.deleteSpherocylinder("c"));
   }
   
  /** tests the deleteSpherocylinder method on a case with multiple
  * labels of the same name. **/
   @Test public void deleteSpherocylinderTest4() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[3];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      c.addSpherocylinder("a", 3.0, 5.0);
      c.addSpherocylinder("b", 4.0, 5.0);
      c.addSpherocylinder("a", 4.0, 5.0);
      Spherocylinder d = new Spherocylinder("a", 3.0, 5.0);
      Assert.assertEquals(d, c.deleteSpherocylinder("a"));
   }
   
   /** Tests the editSpherocylinder method. **/
   @Test public void editSpheroCylinderTest1() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[2];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      c.addSpherocylinder("a", 3.0, 5.0);
      c.addSpherocylinder("b", 4.0, 5.0);
      Assert.assertTrue(c.editSpherocylinder("a", 5.0, 6.0));
   }
   
   /** Tests the editSpherocylinder method. **/
   @Test public void editSpheroCylinderTest2() {
      String name = "Test";
      Spherocylinder[] a = new Spherocylinder[2];
      int b = 0;
      SpherocylinderList c = new SpherocylinderList("Test", a, b);
      c.addSpherocylinder("a", 3.0, 5.0);
      c.addSpherocylinder("b", 4.0, 5.0);
      Assert.assertFalse(c.editSpherocylinder("c", 3.0, 6.0));
   }
}
