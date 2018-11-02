package javaTest;

import java.util.Scanner;

public class Date {
	

	private int year;
	private int month;
	private int day;

	public Date() {
		super();
		this.year = year;
		this.month = month;
		this.day = day;

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		
		this.year = year;
	}

	public int getMonth() {
		
		return month;
	}

	public void setMonth(int month) {
		if (month > 12) {
			System.out.println("Fake date");
			
		}
		this.month = month;
	}

	public int getDay() {
		
		return day;
	}

	public void setDay(int day) {
		if (day > 32) {
			System.out.println("Fake date");
			
		}
		
		this.day = day;
	}

	public void setDate() {
		setDay(day);
		setMonth(month);
		setYear(year);

	}

	private String checkIfMonthHasLeadingZero() {

		String month = "" + getMonth();
		

		if (getMonth() < 10) {
			month = "0" + getMonth();

		}
		return month;
	}

	private String checkIfDayHasLeadingZero() {
		String day = ""+getDay();
		if (getDay() < 10) {
			day = "0" + getDay();

		}
		return day;
	}

	@Override
	public String toString() {
		return checkIfMonthHasLeadingZero() + "/" + checkIfDayHasLeadingZero() + "/" + getYear();
	}

}
