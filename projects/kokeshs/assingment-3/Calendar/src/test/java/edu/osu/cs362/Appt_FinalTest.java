package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class Appt_FinalTest {
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

	 @Test
	  public void test15()  throws Throwable  {
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
		 assertEquals("\t4/10/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
	 }

	/*
	 *		Test invalid cases
	 *
	 */
	@Test
	public void test16()  throws Throwable  {
		int startHour=350;
		int startMinute=89;
		int startDay=40;
		int startMonth=20;
		int startYear=-50;
		String title="Begin spiral of self destructive habits";
		String description="Find as much Skooma as possible and go nuts.";
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

		// test sets and isValid
		appt.setStartHour(20);
		assertFalse(appt.getValid());

		appt.setStartMinute(30);
		assertFalse(appt.getValid());

		appt.setStartDay(15);
		assertFalse(appt.getValid());

		assertEquals(null, appt.toString());

		appt.setStartMonth(5);
		assertTrue(appt.getValid());

		appt.setStartYear(5000);
		assertTrue(appt.getValid());

		// reset values and check isValid
		appt.setStartHour(0);
		assertTrue(appt.getValid());

		assertEquals("\t5/15/5000 at 12:30am ,Begin spiral of self destructive habits, Find as much Skooma as possible and go nuts.\n", appt.toString());
	}

	/*
	*		test toString, setTitle, and setDescription NULL cases
	 */

	@Test
	public void test17()  throws Throwable  {
		int startHour=350;
		int startMinute=89;
		int startDay=40;
		int startMonth=13;
		int startYear=-50;
		String title="Begin spiral of self destructive habits";
		String description="Find as much Skooma as possible and go nuts.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions

		// test toString of invalid
		appt.setStartHour(999);
		assertEquals(null, appt.toString());

		appt.setDescription(null);
		appt.setTitle(null);

		assertEquals("", appt.getTitle());
		assertEquals("", appt.getDescription());
	}

	@Test
	  public void test18()  throws Throwable  {
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
	
	@Test
	 public void test19 () throws Throwable	{
		 int startHour=17;
		 int startMinute=30;
		 int startDay=20;
		 int startMonth=3;
		 int startYear=2017;
		 String title="test2";
		 String description="This is a test";
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		String temp = appt.toString();
		assertEquals("	3/20/2017 at 5:30pm ,test2, This is a test\n",temp);
	 }

	@Test
	 public void test20 () throws Throwable	{
	 	int startHour=17;
		int startMinute=30;
		int startDay=20;
		int startMonth=3;
		int startYear=2017;
		String title="";
		String description="";
		Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		startHour=1;
		startMinute=59;
		startDay=25;
		startMonth=1;
		startYear=2013;
		title="test3";
		description="This is a test";
		appt.setStartHour(startHour);
		appt.setStartMinute(startMinute);
		appt.setStartDay(startDay);
		appt.setStartMonth(startMonth);
		appt.setStartYear(startYear);
		appt.setTitle(title);
		appt.setDescription(description);
		String temp = appt.toString();
		assertEquals("	1/25/2013 at 1:59am ,test3, This is a test\n",temp);
	 }
	@Test
	 public void test21 () throws Throwable	{
		int startHour=17;
		int startMinute=30;
		int startDay=20;
		int startMonth=3;
		int startYear=2017;
		String title="";
		String description="";
		Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		startHour=1;
		startMinute=59;
		startDay=25;
		startMonth=1;
		startYear=2013;
		title="test4";
		description="This is a test";
		appt.setStartHour(startHour);
		appt.setStartMinute(startMinute);
		appt.setStartDay(startDay);
		appt.setStartMonth(startMonth);
		appt.setStartYear(startYear);
		appt.setTitle(title);
		appt.setDescription(description);	
		assertTrue(appt.getValid());
		assertEquals(1, appt.getStartHour());
		assertEquals(59, appt.getStartMinute());
		assertEquals(25, appt.getStartDay());
		assertEquals(01, appt.getStartMonth());
		assertEquals(2013, appt.getStartYear());
		assertEquals("test4", appt.getTitle());
		assertEquals("This is a test", appt.getDescription());  	
	 }	
	@Test
	 public void test22 () throws Throwable	{
		int startHour=0;
		int startMinute=30;
		int startDay=20;
		int startMonth=3;
		int startYear=2017;
		String title="";
		String description="";
		Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		assertTrue(appt.getValid());
		String temp = appt.toString();
		assertEquals("	3/20/2017 at 12:30am ,, \n",temp);	
	 }
	@Test
	 public void test23 () throws Throwable	{
		 int startHour=-13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertFalse(appt.getValid());
	 }
	@Test
	 public void test24 () throws Throwable	{
		 int startHour=13;
		 int startMinute=400;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertFalse(appt.getValid());
	 }
	@Test
	 public void test25 () throws Throwable	{
		 int startHour=13;
		 int startMinute=30;
		 int startDay=32;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertFalse(appt.getValid());
	 }
	@Test
	 public void test26 () throws Throwable	{
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=-5;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertFalse(appt.getValid());
	 }
	@Test
	 public void test27 () throws Throwable	{
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title=null;
		 String description=null;
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		assertTrue(appt.getValid());
		assertEquals("",appt.getDescription());
		assertEquals("",appt.getTitle());
	 }
	@Test
	 public void test28 () throws Throwable	{
		int startHour=0;
		int startMinute=-30;
		int startDay=20;
		int startMonth=3;
		int startYear=2017;
		String title=null;
		String description="";
		Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		String temp = appt.toString();
		appt.setTitle(title);
		assertEquals("",appt.getTitle());
		assertFalse(appt.getValid());
	 }
	@Test
         public void test29 () throws Throwable {
                int startHour=17;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="";
                String description="";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                startHour=-1;
                description="This is a test";
                appt.setStartHour(startHour);
		assertFalse(appt.getValid());
         }
	@Test
         public void test30 () throws Throwable {
                int startHour=17;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="test13";
                String description="This is a test";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                startHour=55;
                appt.setStartHour(startHour);
		String temp = appt.toString();
                assertNull(temp);
                assertFalse(appt.getValid());
         }
	@Test
         public void test31 () throws Throwable {
                int startHour=17;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="";
                String description="";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                startMinute=-1;
                appt.setStartMinute(startMinute);
                assertFalse(appt.getValid());
         }
	@Test
         public void test32 () throws Throwable {
                int startHour=17;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="";
                String description="";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                startMinute=70;
                appt.setStartMinute(startMinute);
                assertFalse(appt.getValid());
         }
	@Test
         public void test33 () throws Throwable {
                int startHour=17;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="";
                String description="";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                startDay=-10;
                appt.setStartDay(startDay);
                assertFalse(appt.getValid());
         }
	@Test
         public void test34 () throws Throwable {
                int startHour=17;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="";
                String description="";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                startDay=40;
                appt.setStartDay(startDay);
                assertFalse(appt.getValid());
         }
	@Test
         public void test35 () throws Throwable {
                int startHour=17;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="";
                String description="";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                startMonth=-1;
                appt.setStartMonth(startMonth);
                assertFalse(appt.getValid());
         }
	@Test
         public void test36 () throws Throwable {
                int startHour=17;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="";
                String description="";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                startMonth=20;
                appt.setStartMonth(startMonth);
                assertFalse(appt.getValid());
         }
	@Test
         public void test37 () throws Throwable {
                int startHour=11;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="test20";
                String description="This is a test";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                appt.setStartHour(startHour);
                appt.setStartMinute(startMinute);
                appt.setStartDay(startDay);
                appt.setStartMonth(startMonth);
                appt.setStartYear(startYear);
                appt.setTitle(title);
                appt.setDescription(description);
                String temp = appt.toString();
                assertEquals("\t3/20/2017 at 11:30am ,test20, This is a test\n",temp);
         }
	@Test
         public void test38 () throws Throwable {
                int startHour=23;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="test21";
                String description="This is a test";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                appt.setStartHour(startHour);
                appt.setStartMinute(startMinute);
                appt.setStartDay(startDay);
                appt.setStartMonth(startMonth);
                appt.setStartYear(startYear);
                appt.setTitle(title);
                appt.setDescription(description);
                String temp = appt.toString();
                assertEquals("\t3/20/2017 at 11:30pm ,test21, This is a test\n",temp);
         }
	@Test
         public void test39 () throws Throwable {
                int startHour=17;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="";
                String description="";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
		startHour=0;
                appt.setStartHour(startHour);
                assertTrue(appt.getValid());
         }
	@Test
         public void test40 () throws Throwable {
                int startHour=4;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="";
                String description="";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                startYear=-3;
                appt.setStartYear(startYear);
                assertTrue(appt.getValid());
         }
	@Test
         public void test41 () throws Throwable {
                int startHour=17;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="";
                String description="";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                startMinute=0;
                appt.setStartMinute(startMinute);
                assertTrue(appt.getValid());
         }
	@Test
         public void test42 () throws Throwable {
                int startHour=17;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="";
                String description="";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                startDay=1;
                appt.setStartDay(startDay);
                assertTrue(appt.getValid());
         }
	@Test
         public void test43 () throws Throwable {
                int startHour=17;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="";
                String description="";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                startMonth=12;
                appt.setStartMonth(startMonth);
                assertTrue(appt.getValid());
         }
	@Test
         public void test44 () throws Throwable {
                int startHour=17;
                int startMinute=30;
                int startDay=20;
                int startMonth=3;
                int startYear=2017;
                String title="";
                String description="";
                Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
                startDay=31;
                appt.setStartDay(startDay);
                assertTrue(appt.getValid());
         }
}
