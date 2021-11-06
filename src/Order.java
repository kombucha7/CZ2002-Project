import java.util.ArrayList;
import java.time.Instant;

public class Order implements ListPrinter {

	private int orderID;
	private int staffID;
	private Instant date;
	private int pax;
	private orderType orderType;
	private int itemQty;
	private ArrayList<AlaCarteItem> alaCarteItemOrder;
	private ArrayList<SetItem> setItemOrder;
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
	public Order(int orderID, int staffID, Instant date, int pax, orderType ordertype, int tableID) {
		this.orderID = orderID;
		this.staffID = staffID;
		this.date = date;
		this.pax = pax;
		this.orderType = ordertype;
		this.itemQty = 0;
		this.setqty = 0;
		this.alaCarteItemOrder = new ArrayList<AlaCarteItem>();
		this.setItemOrder = new ArrayList<SetItem>();
		this.orderCompleted = false;
		this.totalprice = 0.00;
		this.tableID = tableID;
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

	public ArrayList<AlaCarteItem> getAlaCarteItemOrder() {
		return this.alaCarteItemOrder;
	}

	/**
	 * 
	 * @param alaCarteItemOrder
	 */
	public void setAlaCarteItemOrder(ArrayList<AlaCarteItem> alaCarteItemOrder) {
		this.alaCarteItemOrder = alaCarteItemOrder;
	}

	public ArrayList<SetItem> getSetItemOrder() {
		return this.setItemOrder;
	}

	/**
	 * 
	 * @param setItemOrder
	 */
	public void setSetItemOrder(ArrayList<SetItem> setItemOrder) {
		this.setItemOrder = setItemOrder;
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

	public void printList() {
		System.out.printf("Order ID: %d\n", this.getorderID());
		System.out.println("-------------------------------------------------");
		System.out.println("AlaCarte Items Ordered: ");
		for (int i = 0; i < alaCarteItemOrder.size(); i++) {
			System.out.println(alaCarteItemOrder.get(i).getName());
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Set Items Ordered: ");
		for (int j = 0; j < setItemOrder.size(); j++) {
			System.out.println(setItemOrder.get(j).getName());
		}
		System.out.println("-------------------------------------------------");
		System.out.printf("Total cost: %.2f\n", this.getTotalprice());
	}

	/**
	 * 
	 * @param fooditem
	 * @param qty
	 */
	public void add_OrderFood(SetItem fooditem, int qty) {
		for (int i = 0; i < qty; i++, setqty++) {
			setItemOrder.add(fooditem);
			this.totalprice += fooditem.getPrice();
		}
	}

	/**
	 * 
	 * @param fooditem
	 * @param qty
	 */
	public void add_OrderFood(AlaCarteItem fooditem, int qty) {
		for (int i = 0; i < qty; i++, itemQty++) {
			alaCarteItemOrder.add(fooditem);
			this.totalprice += fooditem.getPrice();
		}
	}

	/**
	 * 
	 * @param foodID
	 */
	public boolean deleteAlaFood(int foodID) {
		for (int i = 0; i < alaCarteItemOrder.size(); i++) {
			if (alaCarteItemOrder.get(i).getFoodID() == foodID) {
				totalprice -= alaCarteItemOrder.get(i).getPrice();
				alaCarteItemOrder.remove(i);
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param foodID
	 */
	public boolean deleteSetFood(int foodID) {
		for (int i = 0; i < setItemOrder.size(); i++) {
			if (setItemOrder.get(i).getSetID() == foodID) {
				totalprice -= setItemOrder.get(i).getPrice();
				setItemOrder.remove(i);
				return true;
			}
		}
		return false;
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

	// add to vpp
	public double getTotalPrice() {
		return this.totalprice;
	}

	/**
	 * add to vpp
	 * 
	 * @param totalprice
	 */
	public void setTotalPrice(double totalprice) {
		this.totalprice = totalprice;
	}
}