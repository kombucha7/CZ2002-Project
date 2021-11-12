import java.io.Serializable;
public class Invoice implements CustPrintable, Serializable {

	private boolean member;
	private Order order;
	private final double gst = 1.17;
	private double finalprice;

	/**
	 * 
	 * @param order
	 * @param member
	 */
	public Invoice(Order order, boolean member) {
		this.order = order;
		this.member = member;
	}

	public void printer() {

		System.out.printf("Order ID: %d\n", order.getorderID());
		System.out.printf("Staff ID: %d\n", order.getStaffID());

		System.out.println("AlaCarte items: ");
		for (int i = 0; i < order.getAlaCarteItemOrder().size(); i++) {
			System.out.printf("%s                     %.2f\n", order.getAlaCarteItemOrder().get(i).getName(),
					order.getAlaCarteItemOrder().get(i).getPrice());
		}

		System.out.println("Set items: ");
		for (int i = 0; i < order.getSetItemOrder().size(); i++) {
			System.out.printf("%s                     %.2f\n", order.getSetItemOrder().get(i).getName(),
					order.getSetItemOrder().get(i).getPrice());
		}

		finalprice = order.getTotalprice();
		System.out.printf("Total Price: %.2f\n", finalprice);

		if (member) {
			finalprice *= 0.9;
			System.out.printf("Total price after member discount: %.2f\n", finalprice);		
		}

		System.out.printf("Total Price after tax: %.2f\n", finalprice * gst);
		order.setOrderCompleted(true);

	}

}