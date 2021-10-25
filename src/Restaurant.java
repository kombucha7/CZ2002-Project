import java.time.Clock;
import java.util.Scanner;

public class Restaurant {

	private int restaurantID;
	private String location;
	private int currentPax;
	private Clock runTime;

	/**
	 * 
	 * @param args
	 */
	public void main(String[] args) {
		// TODO - implement Restaurant.main
		TableList table_list = new TableList();

		int option;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("SELECT OPTION: ");
			System.out.println("1. Create/Update/Remove menu item\n" +
					"2. Create/Update/Remove promotion\n" +
					"3. Create order\n" +
					"4. View order\n" +
					"5. Add/Remove order item/s to/from order\n" +
					"6. Create reservation booking\n" +
					"7. Check/Remove reservation booking\n" +
					"8. Check table availability\n" +
					"9. Print order invoice\n" +
					"10. Print sale revenue report by period (eg day or month)\n" +
					"11. Exit");

			option = sc.nextInt();

			// troubleshooting
			while (option < 0 || option > 11) {
				System.out.println("Invalid option selected. Re-enter: ");
				option = sc.nextInt();
			}
			// exit app
			if (option == 11) {
				System.out.println("Exiting...");
				break;
			};

			switch (option) {
				case 1:		// Create/Update/Remove menu item
					System.out.println("\n");
					break;

				case 2:		// Create/Update/Remove promotion
					System.out.println("\n");
					break;

				case 3:		// Create order
					System.out.println("\n");
					break;

				case 4:		// View order
					System.out.println("\n");
					break;

				case 5:		// Add/Remove order item/s to/from order
					System.out.println("\n");
					break;

				case 6:		// Create reservation booking
					System.out.println("\n");
					break;

				case 7:		// Check/Remove reservation booking
					System.out.println("\n");
					break;

				case 8:		// Check table availability
					System.out.println("Number of tables available: " + table_list.getEmpty() + "\n");
					table_list.printTable();
					System.out.println("\n");
					break;

				case 9:		// Print order invoice
					System.out.println("\n");
					break;

				case 10:	// Print sale revenue report by period (eg day or month)
					System.out.println("\n");
					break;
			}

		}

		//throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param restaurantID
	 * @param location
	 * @param currentPax
	 */
	public Restaurant(int restaurantID, String location, int currentPax) {
		// TODO - implement Restaurant.Restaurant
		throw new UnsupportedOperationException();
	}

	public int getRestaurantID() {
		return this.restaurantID;
	}

	/**
	 * 
	 * @param restaurantID
	 */
	public void setRestaurantID(int restaurantID) {
		this.restaurantID = restaurantID;
	}

	public String getLocation() {
		return this.location;
	}

	/**
	 * 
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * 
	 * @param order
	 */
	public void getInvoice(Order order) {
		// TODO - implement Restaurant.getInvoice
		throw new UnsupportedOperationException();
	}

	public boolean isMax() {
		// TODO - implement Restaurant.isMax
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param currentPax
	 */
	public int remainingCap(int currentPax) {
		// TODO - implement Restaurant.remainingCap
		throw new UnsupportedOperationException();
	}

}