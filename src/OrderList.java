public class OrderList {

	private ArrayList<Order> orderList;
	private static int orderID;

	public OrderList() {
		// TODO - implement OrderList.OrderList
		throw new UnsupportedOperationException();
	}

	public ArrayList<Order> getOrderList() {
		return this.orderList;
	}

	/**
	 * 
	 * @param orderList
	 */
	public void setOrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;
	}

	/**
	 * 
	 * @param orderID
	 */
	public boolean deleteOrder(int orderID) {
		// TODO - implement OrderList.deleteOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param orderID
	 * @param Menu
	 */
	public boolean updateOrder(int orderID, menulist Menu) {
		// TODO - implement OrderList.updateOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param staffID
	 * @param date
	 * @param pax
	 * @param ordertype
	 */
	public boolean addOrder(int staffID, Instant date, int pax, orderType ordertype) {
		// TODO - implement OrderList.addOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param RevenueReport
	 * @param orderID
	 */
	public boolean updateArchive(report RevenueReport, int orderID) {
		// TODO - implement OrderList.updateArchive
		throw new UnsupportedOperationException();
	}

	public void printList() {
		// TODO - implement OrderList.printList
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param orderID
	 * @param member
	 */
	public void generateInvoice(int orderID, boolean member) {
		// TODO - implement OrderList.generateInvoice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param orderID
	 */
	public Order getOrder(int orderID) {
		// TODO - implement OrderList.getOrder
		throw new UnsupportedOperationException();
	}

}