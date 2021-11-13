import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.Serializable;
import java.time.Instant;
import java.util.Scanner;

/**
 * Class to manage and interface with order objects
 * 
 * @author Chan Hui De Elliot
 */
public class OrderList implements ListPrinter, Serializable {

	/**
	 * ArrayList to store all orders
	 */
	private ArrayList<Order> orderList;

	/**
	 * static attribute orderID initialises as 1 every new order is assigned an
	 * orderID based on this static attribute used to maintain a unique orderID for
	 * every order
	 */
	private static int orderID = 1;

	/**
	 * used to construct a new orderList object constructs an ArrayList of orders
	 * within
	 */
	public OrderList() {
		orderList = new ArrayList<Order>();
	}

	/**
	 * gets the arraylist of orders within orderlist object
	 * 
	 * @return orderList arraylist
	 */
	public ArrayList<Order> getOrderList() {
		return this.orderList;
	}

	/**
	 * overriddes the current order arraylist should not be used unless for
	 * debugging purposes
	 * 
	 * @param orderList to override current arraylist
	 */
	public void setOrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;
	}

	/**
	 * to delete an order in arraylist based on orderID mostly used for debugging
	 * purposes only
	 * 
	 * @param orderID of order to be deleted
	 * @return true if succesful, false if failed
	 */
	public boolean deleteOrder(int orderID) {
		if (orderList.remove(orderID) != null)
			return true;
		else
			return false;
	}

	/**
	 * function to add or delete items in the order choose add or delete then choose
	 * set or alacarte item for adding item, specific item object has to be searched
	 * for in menu object via itemID for deletion of item, itemID is searched for in
	 * arrayLists and deleted if it matches specified ID
	 * 
	 * @param orderID  of order to be updated
	 * @param menulist menu object for food object to be retrieved from
	 * @return true if succesful, false if failed
	 */

	public boolean updateOrder(int orderID, Menu menulist) {
		int choice, ID, qty;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Press 1 to add item");
			System.out.println("Press 2 to delete item");
			System.out.println("Press 0 to end");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Order temporder;
				boolean flag = false;
				System.out.println("Press 1 for AlaCarte Item");
				System.out.println("Press 2 for Set Item");
				choice = sc.nextInt();
				switch (choice) {
				case 1:

					System.out.println("Please enter AlaCarte Item ID");
					ID = sc.nextInt();
					System.out.println("Please enter number of items");
					qty = sc.nextInt();

					temporder = getOrderByOrderID(orderID);
					for (int i = 0; i < menulist.getAlaCarteList().size(); i++) {
						if (menulist.getAlaCarteList().get(i).getFoodID() == ID
								&& menulist.getAlaCarteList().get(i).getAvailability()) {
							AlaCarteItem tempfood = menulist.getAlaCarteList().get(i);
							temporder.add_OrderFood(tempfood, qty);
							flag = true;
							break;
						}
					}
					if (!flag) {
						System.out.println("Invalid Food ID");
						flag = false;
					}
					break;

				case 2:
					System.out.println("Please enter Set Item ID");
					ID = sc.nextInt();
					System.out.println("Please enter number of items");
					qty = sc.nextInt();
					temporder = getOrderByOrderID(orderID);
					for (int i = 0; i < menulist.getSetMenuList().size(); i++) {
						if (menulist.getSetMenuList().get(i).getSetID() == ID
								&& menulist.getSetMenuList().get(i).getAvailability()) {
							SetItem tempset = menulist.getSetMenuList().get(i);
							temporder.add_OrderFood(tempset, qty);
							flag = true;
							break;
						}
					}
					if (!flag) {
						System.out.println("Invalid Set ID");
						flag = false;
					}
					break;

				default:
					System.out.println("Invalid Choice");
					break;
				}
				break;

			case 2:
				System.out.println("Press 1 for AlaCarte Item");
				System.out.println("Press 2 for Set Item");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Please enter AlaCarte Item ID");
					ID = sc.nextInt();
					if (getOrderByOrderID(orderID).deleteAlaFood(ID)) {
						System.out.println("Success");
					} else {
						System.out.println("Failed");
					}
					break;

				case 2:
					System.out.println("Please enter Set Item ID");
					ID = sc.nextInt();
					if (getOrderByOrderID(orderID).deleteSetFood(ID)) {
						System.out.println("Success");
					} else {
						System.out.println("Failed");
					}
					break;

				default:
					System.out.println("Invalid Choice");
					break;
				}
				break;

			default:
				return false;
			}
		} catch (InputMismatchException e) {
			System.out.println("Wrong Entry");
			return false;
		}
		return true;
	}

	/**
	 * creates a new order object and adds it to the order ArrayList used static
	 * attribute orderID as orderID for objects and increments it afterwards so that
	 * each orderID is unique
	 * 
	 * @param staffID   of staff that served this order
	 * @param date      date and time the order is created
	 * @param ordertype enum orderType(dine-in or takeout)
	 * @param tableID   tableID of table where order is seated
	 * @return orderID of order created
	 */
	public int addOrder(int staffID, Instant date, orderType ordertype, int tableID) {
		Order tempOrder = new Order(orderID++, staffID, date, ordertype, tableID);
		orderList.add(tempOrder);
		return orderID - 1;
	}

	/**
	 * adds order into revenue report object order to be added based on orderID
	 * 
	 * @param revport revenue report object where order is added to
	 * @param orderID of order to be added
	 * @return true if succesful, false if failed
	 */
	public boolean updateArchive(RevenueReport revport, int orderID) {
		Order temporder = getOrderByOrderID(orderID);
		if (temporder != null) {
			revport.addToArchive(temporder);
			return true;
		} else
			return false;
	}

	/**
	 * implemented function from ListPrinter interface prints all orderIDs in
	 * orderlist that have yet to be completed condition is based on orderCompleted
	 * flag in order
	 */
	public void printList() {
		System.out.println("Active Order:");
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i) != null && !orderList.get(i).getOrderCompleted()) {
				System.out.printf("Order Number: %d\n", orderList.get(i).getorderID());
			}
		}
	}

	/**
	 * creates new invoice object from order object order object is searched for
	 * with getOrderByOrderID function then calls printer function for said invoice
	 * object to generate the invoice for this order
	 * 
	 * @param orderID of order to be added
	 * @param member  to decide whether to apply member discount or not
	 */
	public void generateInvoice(int orderID, boolean member) {
		Invoice newinvoice = new Invoice(getOrderByOrderID(orderID), member);
		newinvoice.printer();
	}

	/**
	 * Uses orderID to search for a specific order
	 * 
	 * @param orderID to be found
	 * @return order if found, else returns null
	 */
	public Order getOrderByOrderID(int orderID) {
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getorderID() == orderID) {
				return orderList.get(i);
			}
		}
		return null;
	}

	/**
	 * Uses tableID to search for an active order with matching tableID
	 * 
	 * @param tableID to search
	 * @return order if found, else return null
	 */
	public Order getOrderByTableID(int tableID) {
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getTableID() == tableID) {
				if (orderList.get(i).getOrderCompleted() == false)
					return orderList.get(i);
				else {
					break;
				}
			}
		}
		return null;
	}

	/**
	 * returns the table occupied by an order
	 * 
	 * @param orderID to be used for searching
	 * @return the tableID if found, else returns -1
	 */
	public int getTableIDByOrderID(int orderID) {
		Order temporder = getOrderByOrderID(orderID);
		if (temporder != null) {
			return temporder.getTableID();
		} else
			return -1;
	}
}
