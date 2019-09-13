package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int totalcustomers = scan.nextInt();
		
			for (int i=0; i<totalcustomers; i++) {
				String firstName = scan.next();
				String lastName = scan.next(); 
				int numberofItems = scan.nextInt();
				double mult = 0;
					for (int s= 0; s<numberofItems; s++) {
						int quantity = scan.nextInt();
						String itemName = scan.next();
						double price = scan.nextDouble();
						mult += price * quantity; 

						}
					System.out.println(firstName.charAt(0) + ". " + lastName + ": "  + String.format("%.2f", mult)); 	
						
					}
			scan.close();	

					}
	
	static int calculateSum(double[] price) {	
		int sum = 0;
		for (int i=0; i<price.length; i++) {
			sum += price[i];  
			}
		return sum;
	}
}
