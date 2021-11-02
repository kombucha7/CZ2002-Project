public class Invoice implements CustPrintable {

	private boolean member;
	private Order order;

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
		for (int i = 0; i < order.getAlaCarteMenuOrder().size(); i++) {
			System.out.printf("%s                     %d\n", order.getAlaCarteMenuOrder().get(i).getName(),
					order.getAlaCarteMenuOrder().get(i).getPrice());
		}

		System.out.println("Set items: ");
		for (int i = 0; i < order.getSetMenuOrder().size(); i++) {
			System.out.printf("%s                     %d\n", order.getSetMenuOrder().get(i).getName(),
					order.getSetMenuOrder().get(i).getPrice());
		}

		System.out.printf("Total Price: %d\n", order.getTotalPrice());

		if (member) {
			System.out.printf("Total price after member discount: %d\n", order.getTotalPrice() * 0.9);
		}
		order.setOrderCompleted(true);

	}

}