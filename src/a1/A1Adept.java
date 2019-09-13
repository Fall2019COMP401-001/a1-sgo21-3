package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
 
		// read total amount of items in store
		
		int count  = scan.nextInt();
		
		// customers amounts, items, and price arrays
		
		int [] amountItems = new int[count]; 
		String [] itemName = new String [count];
		double[] price = new double [count];
		
		for (int i=0; i<count; i++) {
			itemName [i] = scan.next(); 
			price [i]= scan.nextDouble(); 
		}
	
		// total customers
		
		int customers = scan.nextInt(); 
		
		int [] custAmount =  new int[customers]; 
		String[] custName = new String[customers];
		double [] priceArray =  new double[customers]; 
		
		// going through each customer

		for (int j=0; j<custAmount.length; j++) {
			
			String firstName =  scan.next();
			String lastName = scan.next();
			
			int totalqty = scan.nextInt();
			int[] totalqtyArray = new int[totalqty]; 
			
			double mult = 0;
				
			for (int n=0; n<totalqtyArray.length; n++) {
				int eachqty = scan.nextInt();
				String purchasedItem = scan.next();
				
				// make a static method to match price and item bought
				
				double cost = costMethod(purchasedItem, itemName, price);
				
				mult += (eachqty * cost); 
							
			}
			custName[j] = firstName + " " + lastName;
			priceArray[j] = mult; 
		}
		
		scan.close(); 
		
		System.out.println("Biggest: " + custName[maxIndex(priceArray)] + " (" + String.format("%.2f",  findValueMax(priceArray)) + ")" ); 
		System.out.println("Smallest: " + custName[minIndex(priceArray)] + " (" + String.format("%.2f",  findValueMin(priceArray)) + ")" ); 
		System.out.println("Average: " + String.format("%.2f", (calculateValueSum(priceArray))/(double)customers));
	}

// static method costMethod that compares purhcasedItem with items in store array and gives the price of that item 
public static double costMethod(String purchasedItem, String[] itemName, double[] price) {
	for (int i=0; i<itemName.length; i++) {
		if (purchasedItem.equals(itemName[i])) {
			return price[i]; 
		}
	}
	return 0; 
}

//static method looks thru array of $$ and gives which index of max $$
public static int maxIndex(double[] priceArray ) {
	for (int i=0; i<priceArray.length; i++) {
		if (priceArray [i] == (findValueMax(priceArray))) {
			return i;
		}
	}
	return 0; 
}


//static method looks thru array of $$ and gives which index of min $$
public static int minIndex(double[] priceArray ) {
	for (int i=0; i<priceArray.length; i++) {
		if (priceArray [i] == (findValueMin(priceArray))) {
			return i;
		}
	}
	return 0; 
}



static double calculateValueSum(double[] vals) {
	
	double sum = 0;
	
	for (int i=0; i<vals.length; i++) {
		sum += vals[i];
	}
	
	return sum;
}


static double findValueMin(double[] vals) {
		
		double cur_min = vals[0];
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		
		return cur_min;
	}


static double findValueMax(double[] vals) {
		
		double cur_max = vals[0];
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		
		return cur_max;
	}
}