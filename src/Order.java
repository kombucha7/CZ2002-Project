import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Order {

	private int orderID;
	private ArrayList<Fooditem> Orderlist;
	private int staffID;
	private int tableID;
	private Date date;
	private int pax;
	private int size; // not sure what is size
	private int itemqty;
	private int setqty;
	private double totalprice;

	/**
	 * create order object
	 * @param staffID
	 * @param tableID
	 * @param pax
	 */
	public Order(int staffID, int tableID, int pax) {
		// TODO - implement Order.Order
		this.orderID = Calendar.getInstance().hashCode(); // generate orderID based on time of order+hash
		this.Orderlist = new ArrayList<Fooditem>();
		this.staffID = staffID;
		this.tableID = tableID;
		this.pax = pax;
		this.itemqty = 0;
		this.setqty = 0;
		this.totalprice = 0;
		this.date = new Date();
	}

	/**
	 * function to add fooditem to arraylist
	 * @param item
	 * @param itemqty
	 */
	public void appendOrderItem(Fooditem item, int itemqty) {
		// TODO - implement Order.appendOrderItem
		int i;
		for (i = 0; i < itemqty; i++) {
			this.Orderlist.add(item);
			this.itemqty++;
			this.totalprice += item.getPrice();
		}
	}

	/**
	 * function to add set and included food items to arraylist
	 * @param set
	 * @param setqty
	 */
	public void appendOrderItem(Set set, int setqty)
	{
		int i;
		for(i=0; i<setqty; i++)
		{
			this.Orderlist.add(set.getItems());
			this.setqty++;
			this.totalprice += set.getPrice();
		}
	}

	/**
	 * create invoice object and call functions or calculate and print invoice
	 * @param order
	 * @param member
	 */
	public void tabulateOrderBill(Order order, boolean member) {
		// TODO - implement Order.tabulateOrderBill
		Invoice bill = new Invoice(this);
		bill.calculateInvoice();
		bill.printInvoice();
	}

	/**
	 * 
	 * @param set
	 * @param setqty
	 */

	public int getOrderID() {
		// TODO - implement Order.getOrderID
		return this.orderID;
	}

	/**
	 * 
	 * @param orderID
	 */
	public void setOrderID(int orderID) {
		// TODO - implement Order.setOrderID
		this.orderID = orderID;
	}

	public ArrayList<Fooditem> getOrderlist() {
		// TODO - implement Order.getOrderlist
		return this.Orderlist;
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

	public Date getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
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

	public int getSize() {
		return this.size;
	}

	/**
	 * 
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	public int getItemqty() {
		return this.itemqty;
	}

	/**
	 * 
	 * @param itemqty
	 */
	public void setItemqty(int itemqty) {
		this.itemqty = itemqty;
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
}