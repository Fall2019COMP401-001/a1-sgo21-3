package a1;


import java.util.Scanner;


public class A1Jedi {
	
	public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
	 
			
			int count  = scan.nextInt();
			
			// customers amounts, items, and price arrays
			// changed amountItems[] to a [][] array
			//ignore price
			int [] amountItems = new int[count]; 
			String [] itemName = new String [count];
			double[] price = new double [count];
						
			//putting all items in an array; ignore price array input
			for (int i=0; i<count; i++) {
				itemName [i] = scan.next(); 
				price [i]= scan.nextDouble(); 
			}
		
			// total customers; ignore priceArray and custName arays
			
			int customers = scan.nextInt(); 
			
			int [] custAmount =  new int[count]; 
			String[] custName = new String[customers];
			double [] priceArray =  new double[customers]; 
			boolean[] duplicates = new boolean[count]; 
			// going through each customer; ignore customer names for jedi

			for (int j=0; j<customers; j++) {
				//feed in names ignore for jedi
				String firstName =  scan.next();
				String lastName = scan.next();
				
				int totalqty = scan.nextInt();
				
				//check for duplicates;  account for them later
				for (int t=0; t<count; t++) {
					duplicates[t] = false; 
				}
				
				for (int n=0; n<totalqty; n++) {
					int eachqty = scan.nextInt();
					String purchasedItem = scan.next();
				
					
					for (int p=0; p<itemName.length; p++) {
						if (purchasedItem.equals(itemName[p])) {
							amountItems[p]+= eachqty;
							// account for duplicates
							if (!duplicates[p]) {
								custAmount[p]++; 
								duplicates[p] = true; 
							}
						}				
					}
				
					}
				
			}
			
			
			for (int i=0; i<count; i++) {
				if (custAmount[i] == 0) {
					System.out.println("No customers bought " + itemName[i]); ;
				} else {
					System.out.println(custAmount[i] + " customers bought " + amountItems[i] + " " + itemName[i]); 
				}
			}
			scan.close(); 
			
		}

}
