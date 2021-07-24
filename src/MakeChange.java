import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the price of the item: ");
		double price = sc.nextDouble();
		System.out.println("price ");
		
		System.out.println("How much money was tendered by the customer: ");
		double tendered = sc.nextDouble();
		System.out.println(tendered);
		
		if(tendered < price) {
			System.out.println("Not enough money. Please provide appropriate ammount for the purchase.");
			
		}
		else if(tendered == price) {
			System.out.println("Thank you for your transaction. No change required.");
		}
		else {
			double change = tendered - price;
			System.out.println("Please prove change for $" + change);
		
		}
		
	}

}
