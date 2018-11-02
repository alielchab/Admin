package javaTest;

import java.util.Scanner;

public class TestDate {

	public static void main(String[] args) {
		//
		try {
		Date date = new Date();
		
		int day;
		int month;
		int year;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Set Day: ");
		day = scanner.nextInt();
		System.out.println("Set Month: ");
		month = scanner.nextInt();
		System.out.println("Set Year: ");
		year = scanner.nextInt();
		
		date.setDay(day);
		date.setMonth(month);
		date.setYear(year);
		
		System.out.println(date.toString());}
		catch(Exception e) {
			System.out.print("You made a mistake, runn programm again");
		}
		

	}

}
