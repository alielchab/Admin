package CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SuperCar {
	
	Map<String, Integer> carBrands = new TreeMap<String, Integer>();

	public static void main(String[] args) {
		

	}
	
	
	// Add more brands if you want to
	public void fillBrands() {
		carBrands.put("Bugatti", 1);
		carBrands.put("Ferrari", 2);
		carBrands.put("Aston Martin", 3);
		carBrands.put("Bentley", 4);
		carBrands.put("Maserati", 5);
		carBrands.put("Tesla", 6);
	}
	
	public void carSelect() {
		fillBrands();
		Scanner input = new Scanner(System.in);
		System.out.printf("Select a car brand: " + carBrands);
		int choice = input.nextInt();
		//Add more cases if you have added more brands
		switch(choice) {
		case 1: {
			
		}
		
		case 2:{
			
		}
		
		case 3:{
			
		}
		case 4:{
			
		}
		case 5:{
		}
		case 6:{
			
		}
		
		
		}
		
		
		
		
	}
	
	

}
