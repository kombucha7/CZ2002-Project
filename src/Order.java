public class Order extends Table {

	private int orderID;
	private ArrayList<Menu> orderList;
	private int staffID;
	private dateTime date;
	private int pax;
	private orderType orderType;
	private int itemQty;
	private ArrayList<alaCarteMenu> alaCarteMenuOrder;
	private ArrayList<SetMenu> setMenuOrder;
	private boolean orderCompleted;

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

	public ArrayList<Menu> getorderList() {
		return this.orderList;
	}

	/**
	 * 
	 * @param orderList
	 */
	public void setorderList(ArrayList<Menu> orderList) {
		this.orderList = orderList;
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

	public dateTime getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(dateTime date) {
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

	public ArrayList<alaCarteMenu> getAlaCarteMenuOrder() {
		return this.alaCarteMenuOrder;
	}

	/**
	 * 
	 * @param alaCarteMenuOrder
	 */
	public void setAlaCarteMenuOrder(ArrayList<alaCarteMenu> alaCarteMenuOrder) {
		this.alaCarteMenuOrder = alaCarteMenuOrder;
	}

	public ArrayList<SetMenu> getSetMenuOrder() {
		return this.setMenuOrder;
	}

	/**
	 * 
	 * @param setMenuOrder
	 */
	public void setSetMenuOrder(ArrayList<SetMenu> setMenuOrder) {
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

}