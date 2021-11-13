import java.util.ArrayList;
import java.io.Serializable;
import java.time.Instant;

/**
 * Order class which keeps track of all attributes for a "seating"
 * 
 * @author Chan Hui De, Elliot
 */
public class Order implements ListPrinter, Serializable {

	/**
	 * unique orderID for specific order Object mostly used to search for specific
	 * order
	 */
	private int orderID;

	/**
	 * ID of staff that served this order
	 */
	private int staffID;

	/**
	 * the time in which the order is created
	 */
	private Instant date;

	/**
	 * the type of order based on enum orderType Dine-in or takeout
	 */
	private orderType orderType;

	/**
	 * total number alacarte items ordered
	 */
	private int itemQty;

	/**
	 * total number of set items ordered
	 */
	private int setqty;

	/**
	 * ArrayList to store all alacarte item ordered
	 */
	private ArrayList<AlaCarteItem> alaCarteItemOrder;

	/**
	 * ArrayList to store all set items ordered
	 */
	private ArrayList<SetItem> setItemOrder;

	/**
	 * flag for whether the order is completed or not defaults as false set to true
	 * when invoice is generated
	 */
	private boolean orderCompleted;

	/**
	 * to store the total price of all items ordered
	 */
	private double totalprice;

	/**
	 * tableID which the customers are seated at
	 */
	private int tableID;

	/**
	 * Constructor for order Object initialises itemqty, setqty and totalprice as 0
	 * defaults orderCompleted flag as false
	 * 
	 * @param orderID   unique orderID assigned to this order
	 * @param staffID   ID of staff that serves this order
	 * @param date      date and time which order was created
	 * @param ordertype type of order (dine-in or takeout)
	 * @param tableID   table which customers are seated at
	 */
	public Order(int orderID, int staffID, Instant date, orderType ordertype, int tableID) {
		this.orderID = orderID;
		this.staffID = staffID;
		this.date = date;
		this.orderType = ordertype;
		this.itemQty = 0;
		this.setqty = 0;
		this.alaCarteItemOrder = new ArrayList<AlaCarteItem>();
		this.setItemOrder = new ArrayList<SetItem>();
		this.orderCompleted = false;
		this.totalprice = 0.00;
		this.tableID = tableID;
	}

	/**
	 * gets the orderID for specific order object
	 * 
	 * @return orderID of this order
	 */
	public int getorderID() {
		return this.orderID;
	}

	/**
	 * overrides the orderID for specific order object should not be used unless for
	 * debugging
	 * 
	 * @param OrderID to replace current orderID set during construction
	 */
	public void setorderID(int OrderID) {
		this.orderID = OrderID;
	}

	/**
	 * gets staffID from order Object
	 * 
	 * @return staffID of this order
	 */
	public int getStaffID() {
		return this.staffID;
	}

	/**
	 * overrides the staffID for specific order object should not be used unless for
	 * debugging
	 * 
	 * @param staffID to replace current staffID set during construction
	 */
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	/**
	 * gets the date from order object
	 * 
	 * @return date from this order
	 */
	public Instant getDate() {
		return this.date;
	}

	/**
	 * overrides the date for specific order object should not be used unless for
	 * debugging
	 * 
	 * @param date to replace current date set during construction
	 */
	public void setDate(Instant date) {
		this.date = date;
	}

	/**
	 * gets the orderType from order object
	 * 
	 * @return ordertype from this order
	 */
	public orderType getOrderType() {
		return this.orderType;
	}

	/**
	 * overrides the orderType for specific order object should not be used unless
	 * for debugging
	 * 
	 * @param orderType to replace current orderType set during construction
	 */
	public void setOrderType(orderType orderType) {
		this.orderType = orderType;
	}

	/**
	 * gets the number of alacarteitems ordered
	 * 
	 * @return itemqty from this order
	 */
	public int getItemQty() {
		return this.itemQty;
	}

	/**
	 * overrides the number of alacarteitems ordered should not be used unless for
	 * debugging
	 * 
	 * @param itemQty to replace current itemqty in order
	 */
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	/**
	 * gets the arraylist which stores all alacarte items ordered
	 * 
	 * @return alacarte arraylist
	 */
	public ArrayList<AlaCarteItem> getAlaCarteItemOrder() {
		return this.alaCarteItemOrder;
	}

	/**
	 * overrides arraylist for storing alacarte items should not be used unless for
	 * debugging
	 * 
	 * @param alaCarteItemOrder to replace current alacarte arraylist in order
	 */
	public void setAlaCarteItemOrder(ArrayList<AlaCarteItem> alaCarteItemOrder) {
		this.alaCarteItemOrder = alaCarteItemOrder;
	}

	/**
	 * gets the arraylist which stores all set items ordered
	 * 
	 * @return setitem arraylist
	 */
	public ArrayList<SetItem> getSetItemOrder() {
		return this.setItemOrder;
	}

	/**
	 * overrides arraylist for storing set items should not be used unless for
	 * debugging
	 * 
	 * @param setItemOrder to replace current set item arraylist in order
	 */
	public void setSetItemOrder(ArrayList<SetItem> setItemOrder) {
		this.setItemOrder = setItemOrder;
	}

	/**
	 * gets flag for order status
	 * 
	 * @return orderCompleted flag
	 */
	public boolean getOrderCompleted() {
		return this.orderCompleted;
	}

	/**
	 * sets the order completion flag used in restaurant class when invoice is
	 * generated
	 * 
	 * @param orderCompleted sets true when invoice is generated
	 */
	public void setOrderCompleted(boolean orderCompleted) {
		this.orderCompleted = orderCompleted;
	}

	/**
	 * gets the total number of set items ordered
	 * 
	 * @return setqty from order
	 */
	public int getSetqty() {
		return this.setqty;
	}

	/**
	 * overrides number of set items ordered should not be used unless for debugging
	 * purposes
	 * 
	 * @param setqty to replace current setqty
	 */
	public void setSetqty(int setqty) {
		this.setqty = setqty;
	}

	/**
	 * gets the sum of prices of all items ordered
	 * 
	 * @return totalprice of order
	 */
	public double getTotalprice() {
		return this.totalprice;
	}

	/**
	 * overrides the totalprice attribute in order should not be used as it is
	 * automatically updated when items are added to order
	 * 
	 * @param totalprice to override current totalprice
	 */
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	/**
	 * prints orderID of order parses through arraylists and prints out each
	 * individual item prints total price at the end
	 */
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
		System.out.printf("Total cost: $%.2f\n", this.getTotalprice());
	}

	/**
	 * overloaded funciton for setitems used to add set item to set item array list
	 * 
	 * @param fooditem set item to be added to setitem arraylist
	 * @param qty      number of said item to be added
	 */
	public void add_OrderFood(SetItem fooditem, int qty) {
		for (int i = 0; i < qty; i++, setqty++) {
			setItemOrder.add(fooditem);
			this.totalprice += fooditem.getPrice();
		}
	}

	/**
	 * overloaded funciton for alacarteitems used to add alacarte items to alacarte
	 * arraylist
	 * 
	 * @param fooditem alacarte item to be added to alacarte arraylist
	 * @param qty      number of said items to be added
	 */
	public void add_OrderFood(AlaCarteItem fooditem, int qty) {
		for (int i = 0; i < qty; i++, itemQty++) {
			alaCarteItemOrder.add(fooditem);
			this.totalprice += fooditem.getPrice();
		}
	}

	/**
	 * used to delete an item from alacarte array list parses through alacarte
	 * arraylist and deletes an item when its foodID matches given foodID
	 * 
	 * @param foodID of item to be deleted
	 * @return true if successful, false if failed
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
	 * used to delete an item from setitem array list parses through setitem
	 * arraylist and deletes an item when its foodID matches given foodID
	 * 
	 * @param foodID of item to be deleted
	 * @return true if successful, false if failed
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

	/**
	 * gets the tableID that is occupied by this order
	 * 
	 * @return tableID from this order
	 */
	public int getTableID() {
		return this.tableID;
	}

	/**
	 * overrides the tableID created during constructor should not be used unless
	 * debugging
	 * 
	 * @param tableID to override tableID attribute
	 */
	public void setTableID(int tableID) {
		this.tableID = tableID;
	}
}