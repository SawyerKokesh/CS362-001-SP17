package edu.osu.cs362;
/**
*  This class provides a basic set of test cases for the
*  CalDay class.
*/
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class CalDayTest {
	/**
	* Test that tests for the span on one day
	*/
	@Test
	public void test01()  throws Throwable  {

		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		TimeTable timeTable=new TimeTable();
		//Construct a new Appointment object with the initial data	 
		Appt appt1 = new Appt(13, 30, 20, 4, 2017, "Date one", "Date one description/should be in list");
		listAppts.add(appt1);
		Appt appt2 = new Appt(13, 30, 20, 4, 2017, "Date two", "Date two description/should be in list");
		listAppts.add(appt2);
		Appt appt3 = new Appt(13, 30, 22, 4, 2017, "Date three", "Date three description/should not be in list");
		listAppts.add(appt3);
		Appt appt4 = new Appt(13, 30, 20, 4, 2017, "Date four", "Date four description/should be in list");
		listAppts.add(appt4);
		GregorianCalendar today = new GregorianCalendar(2017,4,20);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(today.DAY_OF_MONTH,1);
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();      
		calDays=timeTable.getApptRange(listAppts,today,tomorrow);
		assertEquals(1, calDays.size());
		assertEquals(3,calDays.get(0).getSizeAppts());
		assertEquals(2017, calDays.get(0).getYear());
		assertEquals(4, calDays.get(0).getMonth());
		assertEquals(20, calDays.get(0).getDay());
	}

	/**
	* Test that tests for the span on two day
	*/
	@Test
	public void test02()  throws Throwable  {

		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		TimeTable timeTable=new TimeTable();
		//Construct a new Appointment object with the initial data	 
		Appt appt1 = new Appt(11, 30, 20, 4, 2017, "Date one", "Date one description/should be in list");
		listAppts.add(appt1);
		Appt appt2 = new Appt(12, 30, 20, 4, 2017, "Date two", "Date two description/should be in list");
		listAppts.add(appt2);
		Appt appt3 = new Appt(13, 30, 21, 4, 2017, "Date three", "Date three description/should be in list");
		listAppts.add(appt3);
		Appt appt4 = new Appt(14, 30, 20, 4, 2017, "Date four", "Date four description/should be in list");
		listAppts.add(appt4);
		Appt appt5 = new Appt(15, 30, 22, 4, 2017, "Date five", "Date five description/should not be in list");
		listAppts.add(appt5);
		GregorianCalendar today = new GregorianCalendar(2017,4,20);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(today.DAY_OF_MONTH,2);
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();      
		calDays=timeTable.getApptRange(listAppts,today,tomorrow);

		assertEquals(2, calDays.size());

		assertEquals(3,calDays.get(0).getSizeAppts());
		assertEquals(2017, calDays.get(0).getYear());
		assertEquals(4, calDays.get(0).getMonth());
		assertEquals(20, calDays.get(0).getDay());

		assertEquals(1,calDays.get(1).getSizeAppts());
		assertEquals(2017, calDays.get(1).getYear());
		assertEquals(4, calDays.get(1).getMonth());
		assertEquals(21, calDays.get(1).getDay());
	}

	/**
	* Test that tests for the span on one day
	*/
	@Test
	public void test03()  throws Throwable  {

		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		TimeTable timeTable=new TimeTable();
		//Construct a new Appointment object with the initial data	 
		Appt appt1 = new Appt(13, 30, 20, 4, 2017, "Date one", "Date one description/should be in list");
		listAppts.add(appt1);
		Appt appt2 = new Appt(13, 30, 20, 4, 2017, "Date two", "Date two description/should be in list");
		listAppts.add(appt2);
		Appt appt3 = new Appt(13, 30, 22, 4, 2017, "Date three", "Date three description/should not be in list");
		listAppts.add(appt3);
		Appt appt4 = new Appt(13, 30, 20, 4, 2017, "Date four", "Date four description/should be in list");
		listAppts.add(appt4);
		GregorianCalendar today = new GregorianCalendar(2017,4,20);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(today.DAY_OF_MONTH,1);
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();      
		calDays=timeTable.getApptRange(listAppts,today,tomorrow);
		
		
		assertEquals( "\t --- " + 4 + "/" + 20 + "/" + "2017" + " --- \n" + " --- -------- Appointments ------------ --- \n" + "\t" + 4 + "/" + 20 + "/" + 2017 + " at " + 1 + ":" + 30 + "pm" + " ," + "Date one" + ", " + "Date one description/should be in list" + "\n" + " " + "\t" + 4 + "/" + 20 + "/" + 2017 + " at " + 1 + ":" + 30 + "pm" + " ," + "Date two" + ", " + "Date two description/should be in list" + "\n" + " " + "\t" + 4 + "/" + 20 + "/" + 2017 + " at " + 1 + ":" + 30 + "pm" + " ," + "Date four" + ", " + "Date four description/should be in list" + "\n" + " " + "\n", calDays.get(0).toString());
	}

		/**
	* Test that tests for the span on one day
	*/
	@Test
	public void test04()  throws Throwable  {

		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		TimeTable timeTable=new TimeTable();
		//Construct a new Appointment object with the initial data	 
		Appt appt1 = new Appt(13, 30, 20, 4, 2017, "Date one", "Date one description/should be in list");
		listAppts.add(appt1);
		Appt appt2 = new Appt(13, 30, 20, 4, 2017, "Date two", "Date two description/should be in list");
		listAppts.add(appt2);
		Appt appt3 = new Appt(13, 30, 22, 4, 2017, "Date three", "Date three description/should not be in list");
		listAppts.add(appt3);
		Appt appt4 = new Appt(13, 30, 20, 4, 2017, "Date four", "Date four description/should be in list");
		listAppts.add(appt4);
		GregorianCalendar today = new GregorianCalendar(2017,4,24);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(today.DAY_OF_MONTH,1);
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();      
		calDays=timeTable.getApptRange(listAppts,today,tomorrow);
		assertEquals(true, calDays.get(0).isValid());
	}

	/**
	* Test that tests for the span on one day
	*/
	@Test
	public void test05()  throws Throwable  {
		CalDay calDays = new CalDay();      
		assertEquals(false, calDays.valid);
	}

		/**
	* Test that tests for the span on one day
	*/
	@Test
	public void test06()  throws Throwable  {
		Appt appt1 = new Appt(13, 30, 20, 4, 2017, "Date one", "Date one description/should be in list");
		GregorianCalendar today = new GregorianCalendar(2017,4,20);
		CalDay calDays = new CalDay(today);      
		calDays.addAppt(appt1);
		assertEquals(1, calDays.appts.size());
		assertEquals(calDays.appts.get(0), appt1);

		Appt appt2 = new Appt(13, 30, 70, 4, 2017, "Date two", "Date one description/should not be in list");
		calDays.addAppt(appt2);
		assertEquals(1, calDays.appts.size());

		Appt appt3 = new Appt(15, 30, 20, 4, 2017, "Date three", "Date three description/should be in list");
		calDays.addAppt(appt3);
		assertEquals(2, calDays.appts.size());
		assertEquals(calDays.appts.get(1), appt3);
	}

	/**
	* Test that tests for the span on one day
	*/
	@Test
	public void test07()  throws Throwable  {

		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		TimeTable timeTable=new TimeTable();
		//Construct a new Appointment object with the initial data	 
		Appt appt1 = new Appt(13, 30, 20, 4, 2017, "Date one", "Date one description/should be in list");
		listAppts.add(appt1);
		Appt appt2 = new Appt(13, 30, 20, 4, 2017, "Date two", "Date two description/should be in list");
		listAppts.add(appt2);
		Appt appt3 = new Appt(13, 30, 22, 4, 2017, "Date three", "Date three description/should not be in list");
		listAppts.add(appt3);
		Appt appt4 = new Appt(13, 30, 20, 4, 2017, "Date four", "Date four description/should be in list");
		listAppts.add(appt4);
		GregorianCalendar today = new GregorianCalendar(2017,4,20);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(today.DAY_OF_MONTH,1);
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();      
		calDays=timeTable.getApptRange(listAppts,today,tomorrow);
	    calDays.get(0).valid = false;
		assertEquals("",calDays.get(0).toString());
	}

			/**
	* Test that tests for the span on one day
	*/
	@Test
	public void test08()  throws Throwable  {
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		TimeTable timeTable=new TimeTable();
		Appt appt1 = new Appt(13, 30, 20, 4, 2017, "Date one", "Date one description/should be in list");
		listAppts.add(appt1);
		Appt appt2 = new Appt(15, 30, 20, 4, 2017, "Date two", "Date two description/should be in list");
				listAppts.add(appt2);
		Appt appt3 = new Appt(14, 30, 20, 4, 2017, "Date three", "Date three description/should be in list");
				listAppts.add(appt3);
		Appt appt4 = new Appt(13, 30, 20, 4, 2017, "Date four", "Date four description/should be in list");
				listAppts.add(appt4);
		GregorianCalendar today = new GregorianCalendar(2017,4,20);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(today.DAY_OF_MONTH,1);
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();      
		calDays=timeTable.getApptRange(listAppts,today,tomorrow);
		Iterator<Appt> itr = calDays.get(0).appts.iterator();
		Object element = itr.next();

		CalDay calDays2 = new CalDay(today);     
		calDays2.addAppt(appt1); 
		calDays2.addAppt(appt2);
		calDays2.addAppt(appt3);
		calDays2.addAppt(appt4);

		//Iterator<Appt> itr = calDays2.appts.iterator();
		//while(itr.hasNext()) {
		//	Object element = itr.next();
		//}

		//assertEquals(colDays2, calDays);
	}
}
