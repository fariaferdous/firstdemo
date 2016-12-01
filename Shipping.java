import java.util.Scanner;

public class Shipping {

	public static void Ship() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please select what table would you choose");
		String TableType = scan.nextLine();
		if (TableType.contains("DefaultType")) {
			System.out.println("you have selected the " + TableType);
			System.out.println("Your table will be diliverd within two to three business days!");
		} else if (TableType.contains("CustomTable")) {
			System.out.println("You have selected " + TableType);
			System.out.println("you table should be dilivered within 30 business days!!");
		} else {
			System.out.println("Please make a selection!!");
		}
	}
	
	
	
	

}
