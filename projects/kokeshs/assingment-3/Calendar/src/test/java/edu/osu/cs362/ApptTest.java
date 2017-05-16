package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	  /**
      * Test for when you have negative starting hour
      */
	  @Test
	  public void test02()  throws Throwable  {
		 int startHour=-13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 assertFalse(appt.getValid());
		 assertEquals(-13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());     
	}

	  /**
      * Test for when you have negative start minute
      */
	  @Test
	  public void test03()  throws Throwable  {
		 int startHour=13;
		 int startMinute=-30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 assertFalse(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(-30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());     
	}

      /**
      * Test for when you have negative start day
      */
	  @Test
	  public void test04()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=-10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 assertFalse(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(-10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());     
	}
	  /**
      * Test for when you have negative Month
      */
	  @Test
	  public void test05()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=-4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 assertFalse(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(-04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());     
	}

	  /**
      * Test for when you have negative Year 
      */
	  @Test
	  public void test06()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=-2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(-2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());     
	}

	/**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test07()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 appt.setStartHour(14);
		 appt.setStartMinute(31);
		 appt.setStartDay(11);
		 appt.setStartMonth(5);
		 appt.setStartYear(2018);
		 appt.setTitle("New Title");
		 appt.setDescription("New Description");

		 assertTrue(appt.getValid());
		 assertEquals(14, appt.getStartHour());
		 assertEquals(31, appt.getStartMinute());
		 assertEquals(11, appt.getStartDay());
		 assertEquals(5, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("New Title", appt.getTitle());
		 assertEquals("New Description", appt.getDescription());    
	}

	 /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test08()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 appt.setStartHour(14);
		 appt.setStartMinute(31);
		 appt.setStartDay(11);
		 appt.setStartMonth(5);
		 appt.setStartYear(2018);
		 appt.setTitle(null);
		 appt.setDescription(null);

		 assertTrue(appt.getValid());
		 assertEquals(14, appt.getStartHour());
		 assertEquals(31, appt.getStartMinute());
		 assertEquals(11, appt.getStartDay());
		 assertEquals(5, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());   
	} 

	 /**
     * Test print method that has time not equal to 0
     */
	 @Test
	  public void test09()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);       
		String printAppt = appt.toString();
		assertEquals( "\t" + 4 + "/" + 10 + "/" + 2017 + " at " + 1 + ":" + 30 + "pm" + " ," + "Birthday Party" + ", " + "This is my birthday party." + "\n", printAppt);
	 }

	 /**
     * Test time that has hours equals 0
     */
	 @Test
	  public void test10()  throws Throwable  {
		 int startHour=0;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);       
		String printAppt = appt.toString();
		assertEquals( "\t" + 4 + "/" + 10 + "/" + 2017 + " at " + 12 + ":" + 30 + "am" + " ," + "Birthday Party" + ", " + "This is my birthday party." + "\n", printAppt);
	 }

	 /**
     * Test print method that has invaild hour
     */
	 @Test
	  public void test11()  throws Throwable  {
		 int startHour=25;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);       
		assertEquals( null, appt.toString());
	 }
	 /**
     * Test print method that has invaild minute
     */
	 @Test
	  public void test12()  throws Throwable  {
		 int startHour=13;
		 int startMinute=70;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);       
		assertEquals( null, appt.toString());
	 }
	 /**
     * Test print method that has invaild day
     */
	 @Test
	  public void test13()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=35;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);       
		assertEquals( null, appt.toString());
	 }
	 /**
     * Test print method that has invaild Month
     */
	 @Test
	  public void test14()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=16;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);       
		assertEquals( null, appt.toString());
	 }
}
