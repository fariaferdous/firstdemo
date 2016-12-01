import java.util.Scanner;
import java.util.Arrays;

public class Table {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		CustomTableSize();
		DefaultTable(6,6.3);
		TableType();
		TableColor();
		Shipping CustomOrDefault = new Shipping();
		CustomOrDefault.Ship();

	}

	public Table() {

	}
	// Create table program
	// Table should have dynamic length and width which user can input
	// table should have option to chose either glass top or wooden top
	// If the user chose wooden top then the table should allow user to chose
	// available color from list
	// there should be default table which is always available
	// Custom table will take 30 days to deliver where default table will take
	// 15 days to deliver
	// Prompt user to chose installation along with delivery
	// If user choses installation as yes then notify user that it will cost
	// $100 additional charge
	// Allow user to create multiple tables
	// Once table is created and customer is done with ordering process, Print
	// out the receipt of customers itinerary with all details regarding table
	// configuration and delivery details.

	public static void CustomTableSize() {

		String prompt = "Please enter tables's ";
		System.out.println(prompt + "length :");
		double myLength = scan.nextDouble();

		System.out.println(prompt + "width : ");
		double myWidth = scan.nextDouble();

		double tableArea = myLength * myWidth;
		System.out.println("The area of you custom table is :" + tableArea);

	}

	public static double DefaultTable(double length, double width) {
		double area = length * width;
		System.out.println("You have choosen the Default table size :" + area);
		return area;
	}

	public static void TableType() {
		System.out.println("What type of table would you like, Glass or Wood?");
		String type = scan.nextLine();
		if (type.isEmpty()) {
			System.out.println("Please choose a type of table!");
		} else if (type.contains("glass") || type.contains("Glass")) {
			System.out.println("You have choosen Glass as you table type");
		} else if (type.contains("wood") || type.contains("Wood")) {
			System.out.println("You have choosen Wood as your table type");
		}

	}

	public static void TableColor() {
		String color[] = { "Red", "White", "Blue", "Green", "Black" };

		System.out.println("you have selected wood as you table type, please select the color from the list: ");
		System.out.println(Arrays.toString(color));
		String prompt = "You have selected ";
		String myColor = scan.nextLine();
		if ("Red".equals(myColor)) {
			System.out.println(prompt + myColor);
		} else if ("White".equals(myColor)) {
			System.out.println(prompt + myColor);
		} else if ("Blue".equals(myColor)) {
			System.out.println(prompt + myColor);
		} else if ("Green".equals(myColor)) {
			System.out.println(prompt + myColor);
		} else if ("Black".equals(myColor)) {
			System.out.println(prompt + myColor);
		} else {
			System.out.println("Please make a selection!!!");
		}
	}

}
