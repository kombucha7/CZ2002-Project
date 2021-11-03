public class Order extends Table {

	private int orderID;
	private int staffID;
	private Instant date;
	private int pax;
	private orderType orderType;
	private int itemQty;
	private ArrayList<AlaCarteItem> alaCarteMenuOrder;
	private ArrayList<SetItem> setMenuOrder;
	private boolean orderCompleted;
	private int setqty;
	private double totalprice;
	private int tableID;

	/**
	 * 
	 * @param orderID
	 * @param staffID
	 * @param date
	 * @param pax
	 * @param orderType
	 */
	public Order(int orderID, int staffID, Instant date, int pax, orderType orderType) {
		// TODO - implement Order.Order
		throw new UnsupportedOperationException();
	}

	public int getorderID() {
		return this.orderID;
	}

	/**
	 * 
	 * @param OrderID
	 */
	public void setorderID(int OrderID) {
		this.orderID = OrderID;
	}

	public int getStaffID() {
		return this.staffID;
	}

	/**
	 * 
	 * @param staffID
	 */
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	public Instant getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Instant date) {
		this.date = date;
	}

	public int getPax() {
		return this.pax;
	}

	/**
	 * 
	 * @param pax
	 */
	public void setPax(int pax) {
		this.pax = pax;
	}

	public orderType getOrderType() {
		return this.orderType;
	}

	/**
	 * 
	 * @param orderType
	 */
	public void setOrderType(orderType orderType) {
		this.orderType = orderType;
	}

	public int getItemQty() {
		return this.itemQty;
	}

	/**
	 * 
	 * @param itemQty
	 */
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public ArrayList<AlaCarteItem> getAlaCarteMenuOrder() {
		return this.alaCarteMenuOrder;
	}

	/**
	 * 
	 * @param alaCarteMenuOrder
	 */
	public void setAlaCarteMenuOrder(ArrayList<AlaCarteItem> alaCarteMenuOrder) {
		this.alaCarteMenuOrder = alaCarteMenuOrder;
	}

	public ArrayList<SetItem> getSetMenuOrder() {
		return this.setMenuOrder;
	}

	/**
	 * 
	 * @param setMenuOrder
	 */
	public void setSetMenuOrder(ArrayList<SetItem> setMenuOrder) {
		this.setMenuOrder = setMenuOrder;
	}

	public boolean getOrderCompleted() {
		return this.orderCompleted;
	}

	/**
	 * 
	 * @param orderCompleted
	 */
	public void setOrderCompleted(boolean orderCompleted) {
		this.orderCompleted = orderCompleted;
	}

	public int getSetqty() {
		return this.setqty;
	}

	/**
	 * 
	 * @param setqty
	 */
	public void setSetqty(int setqty) {
		this.setqty = setqty;
	}

	public double getTotalprice() {
		return this.totalprice;
	}

	/**
	 * 
	 * @param totalprice
	 */
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	/**
	 * 
	 * @param fooditem
	 * @param qty
	 */
	public void add_OrderFood(SetItem fooditem, int qty) {
		// TODO - implement Order.add_OrderFood
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fooditem
	 * @param qty
	 */
	public void add_OrderFood(AlaCarteItem fooditem, int qty) {
		// TODO - implement Order.add_OrderFood
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param foodID
	 */
	public boolean deleteAlaFood(int foodID) {
		// TODO - implement Order.deleteAlaFood
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param foodID
	 */
	public boolean deleteSetFood(int foodID) {
		// TODO - implement Order.deleteSetFood
		throw new UnsupportedOperationException();
	}

	public void printOrder() {
		// TODO - implement Order.printOrder
		throw new UnsupportedOperationException();
	}

	public int getTableID() {
		return this.tableID;
	}

	/**
	 * 
	 * @param tableID
	 */
	public void setTableID(int tableID) {
		this.tableID = tableID;
	}

}