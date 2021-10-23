import java.time.Instant;
import java.util.ArrayList;
import java.time.Clock;

public class Order {

	private int orderID;
	private int staffID;
	private Instant date;
	private int pax;
	private orderType ordertype;
	private int itemQty;
	private int setqty; // add to vpp
	private ArrayList<alaCarteMenu> alaCarteMenuOrder;
	private ArrayList<SetMenu> setMenuOrder;
	private boolean orderCompleted;
	private double totalprice; // add to vpp

	/**
	 * 
	 * @param orderID
	 * @param staffID
	 * @param date
	 * @param pax
	 * @param orderType
	 */
	public Order(int orderID, int staffID, Clock date, int pax, orderType ordertype) {
		this.orderID = orderID;
		this.staffID = staffID;
		this.date = Instant.now(date);
		this.pax = pax;
		this.ordertype = ordertype;
		this.itemQty = 0;
		this.setqty = 0;
		this.alaCarteMenuOrder = new ArrayList<alaCarteMenu>();
		this.setMenuOrder = new ArrayList<SetMenu>();
		this.orderCompleted = false;
		this.totalprice = 0;
	}

	// add to VPP
	public void addFood(alaCarteMenu fooditem, int qty)
	{
		for(int i=0; i<qty; i++, itemQty++) {
		alaCarteMenuOrder.add(fooditem);
		this.totalprice += fooditem.getPrice();
		}
	}

	public void addFood(SetMenu fooditem, int qty)
	{
		for(int i=0; i<qty; i++, setqty++) 
		{setMenuOrder.add(fooditem); this.totalprice += fooditem.getPrice();}
	}

	public int getorderID() {
		return this.orderID;
	}

	public boolean deleteAlaFood(int foodID)
	{
		for(int i =0; i<alaCarteMenuOrder.size(); i++)
		{
			if(alaCarteMenuOrder.get(i).getFoodID()==foodID)
			{
				alaCarteMenuOrder.remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean deleteSetFood(int foodID)
	{
		for(int i =0; i<setMenuOrder.size(); i++)
		{
			if(setMenuOrder.get(i).getSetID()==foodID)
			{
				setMenuOrder.remove(i);
				return true;
			}
		}
		return false;
	}

	// add to vpp
	public void printOrder()
	{
		System.out.printf("Order ID: %d\n", this.getorderID());
		System.out.println("-------------------------------------------------");
		System.out.println("AlaCarte Items Ordered: ");
		for(int i = 0; i<alaCarteMenuOrder.size(); i++)
		{
			System.out.println(alaCarteMenuOrder.get(i).getName());
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Set Items Ordered: ");
		for(int j = 0; j<setMenuOrder.size(); j++)
		{
			System.out.println(setMenuOrder.get(j).getName());
		}
		System.out.println("-------------------------------------------------");
		System.out.printf("Total cost: %d\n", this.getTotalPrice());
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
		return this.ordertype;
	}

	/**
	 * 
	 * @param orderType
	 */
	public void setOrderType(orderType ordertype) {
		this.ordertype = ordertype;
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

	public int getSetQty() {
		return this.setqty;
	}

	/**
	 * 
	 * @param itemQty
	 */
	public void setSetQty(int setqty) {
		this.setqty = setqty;
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


	// add to vpp
	public double getTotalPrice() {
		return this.totalprice;
	}
	
	/**
	 * add to vpp
	 * @param totalprice
	 */
	public void setTotalPrice(double totalprice) {
		this.totalprice = totalprice;
	}
}