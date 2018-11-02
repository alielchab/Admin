package CarInfo;

import java.util.Scanner;

public class Bugatti extends SuperCar{
	
	int topSpeed = 0;
	double accelaration = 0;
	double  price = 0;
	

	
	
	public void modelSelect() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Select a Model:");
		int modelSelect = input.nextInt();
		
		
		
	}
	
	
	public void chiron() {
		
		topSpeed = 420;
		accelaration = 2.4;
		price = 2.86;
		
		
		
		
		
	}

}
