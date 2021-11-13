import java.io.Serializable;

/**
 * Used to print out invoice for orders
 *
 * @author Chan Hui De, Elliot
 */
public class Invoice implements CustPrintable, Serializable {

	/**
	 * flag for whether the guest is a member or not
	 */
	private boolean member;

	/**
	 * To temporarily store the order for invoice printing
	 */
	private Order order;

	/**
	 * final attribute which stores tax multiplier
	 */
	private final double gst = 1.17;

	/**
	 * attribute to store calculated price after tax and/or member discount
	 */
	private double finalprice;

	/**
	 * Constructor which takes in the order to be printed and member status
	 * 
	 * @param order  to be printed
	 * @param member whether customer is subject to member discount or not
	 */
	public Invoice(Order order, boolean member) {
		this.order = order;
		this.member = member;
	}

	/**
	 * to print out each individual item and price split by alaCarte or setitem
	 * counts the final price of all items in order and applies tax and or member
	 * discounts
	 */
	public void printer() {

		System.out.printf("Order ID: %d\n", order.getorderID());
		System.out.printf("Staff ID: %d\n", order.getStaffID());

		System.out.println("AlaCarte items: ");
		for (int i = 0; i < order.getAlaCarteItemOrder().size(); i++) {
			System.out.printf("%s                     $%.2f\n", order.getAlaCarteItemOrder().get(i).getName(),
					order.getAlaCarteItemOrder().get(i).getPrice());
		}

		System.out.println("Set items: ");
		for (int i = 0; i < order.getSetItemOrder().size(); i++) {
			System.out.printf("%s                     $%.2f\n", order.getSetItemOrder().get(i).getName(),
					order.getSetItemOrder().get(i).getPrice());
		}

		finalprice = order.getTotalprice();
		System.out.printf("Total Price: $%.2f\n", finalprice);

		if (member) {
			finalprice *= 0.9;
			System.out.printf("Total price after member discount: $%.2f\n", finalprice);
		}

		System.out.printf("Total Price after tax: $%.2f\n", finalprice * gst);
		order.setOrderCompleted(true);

	}

}