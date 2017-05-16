package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

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
		LinkedList<Appt> listUpdatedAppts=timeTable.deleteAppt(listAppts, appt4);
		if (listUpdatedAppts!=null) {															
			calDays = new LinkedList<CalDay>();
			calDays = timeTable.getApptRange(listAppts, today, tomorrow);
		}
		assertEquals(1, calDays.size());
		assertEquals(2,calDays.get(0).getSizeAppts());
		assertEquals(2017, calDays.get(0).getYear());
		assertEquals(4, calDays.get(0).getMonth());
		assertEquals(20, calDays.get(0).getDay());
	 }
	@Test
	public void test02()  throws Throwable  {
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		TimeTable timeTable=new TimeTable();
		//Construct a new Appointment object with the initial data	 
		Appt appt1 = new Appt(13, 30, 20, 4, 2017, "Date one", "Date one description/should be in list");
		listAppts.add(appt1);
		Appt appt2 = new Appt(13, 30, 20, 4, 2017, "Date two", "Date two description/should be in list");
		listAppts.add(appt2);
		Appt appt3 = new Appt(13, 30, 22, 4, 2017, "Date three", "Date three description/should not be in list");
		listAppts.add(appt3);
		GregorianCalendar today = new GregorianCalendar(2017,4,20);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(today.DAY_OF_MONTH,1);
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();      
		calDays=timeTable.getApptRange(listAppts,today,tomorrow);
		LinkedList<Appt> listUpdatedAppts=timeTable.deleteAppt(listAppts, null);
		assertEquals(null, listUpdatedAppts);
	}
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
		GregorianCalendar today = new GregorianCalendar(2017,4,20);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(today.DAY_OF_MONTH,1);
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();      
		calDays=timeTable.getApptRange(listAppts,today,tomorrow);
		LinkedList<Appt> listUpdatedAppts=timeTable.deleteAppt(null, appt2);
		if (listUpdatedAppts!=null) {															
			calDays = new LinkedList<CalDay>();
			calDays = timeTable.getApptRange(listAppts, today, tomorrow);
		}
		assertEquals(null, listUpdatedAppts);
	}

}
