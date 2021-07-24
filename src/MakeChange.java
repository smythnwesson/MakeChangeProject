import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("What is the price of the item: ");
		double price = sc.nextDouble();
		System.out.println(price);

		System.out.println("How much money was tendered by the customer: ");
		double tendered = sc.nextDouble();
		System.out.println(tendered);

		double change = 0.0;

		if (tendered < price) {
			System.out.println("Not enough money. Please provide appropriate ammount for the purchase.\n");

		} else if (tendered == price) {
			System.out.println("Thank you for your transaction. No change required.\n");
		} else {
			change = tendered - price;
			System.out.println("Please provide change for $" + change + "\n");

		}

		int penny = (int) (change * 100);

		int twenty = penny / 2000;
		penny = penny % 2000;

		int ten = penny / 1000;
		penny = penny % 1000;

		int five = penny / 500;
		penny = penny % 500;

		int one = penny / 100;
		penny = penny % 100;

		int quarter = penny / 25;
		penny = penny % 25;

		int dime = penny / 10;
		penny = penny % 10;

		int nickel = penny / 5;
		penny = penny % 5;

		if (twenty == 0) {

		} else {

			System.out.println("Twenties: " + twenty);
		}
		if (ten == 0) {

		}

		else {

			System.out.println("Tens: " + ten);
		}

		if (five == 0) {

		}

		else {

			System.out.println("Fives: " + five);
		}

		if (one == 0) {

		}

		else {

			System.out.println("Ones: " + one);
		}

		if (quarter == 0) {

		} else {
			System.out.println("Quarters: " + quarter);
		}

		if (dime == 0) {

		} else {

			System.out.println("Dimes: " + dime);
		}

		if (nickel == 0) {

		} else {

			System.out.println("Nickels: " + nickel);
		}

		if (penny == 0) {

		}

		else {

			System.out.println("Pennies: " + penny);
		}

	}

}
