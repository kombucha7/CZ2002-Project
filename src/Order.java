import java.time.Instant;
import java.util.ArrayList;

public class Order {

	private int orderID;
	private int staffID;
	private Instant date;
	private int pax;
	private orderType orderType;
	private int itemQty;
	private ArrayList<alaCarteMenu> alaCarteMenuOrder;
	private ArrayList<SetMenu> setMenuOrder;
	private boolean orderCompleted;

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