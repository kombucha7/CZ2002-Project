import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;

/**
 * Class to store completed orders for archival purposes Prints collates and
 * prints out order details during a given period specified during the function
 * call
 * 
 * @author Chan Hui De, Elliot
 */
public class RevenueReport implements Serializable {

	/**
	 * ArrayList to store individual Order objects which are added when orders are
	 * completed
	 */
	private ArrayList<Order> orderList;

	/**
	 * Constructor for RevenueReport object Constructs an Order ArrayList
	 */
	public RevenueReport() {
		orderList = new ArrayList<Order>();
	}

	/**
	 * Gets the arraylist which stores all completed orders
	 * 
	 * @return archival arraylist
	 */
	public ArrayList<Order> getOrderList() {
		return this.orderList;
	}

	/**
	 * used to add order to the Order ArrayList within the class
	 * 
	 * @param order to be added
	 * @return true if successful, false if failed
	 */
	public boolean addToArchive(Order order) // add to vpp
	{
		if (orderList.add(order))
			return true;
		else
			return false;
	}

	/**
	 * Used to delete order from archive for loop to parse through entire list and
	 * delete only if orderID matches
	 * 
	 * @param orderID of order to be deleted
	 * @return true if successful, false if failed
	 */
	public boolean deleteFromArchive(int orderID) {
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getorderID() == orderID) {
				orderList.remove(orderID);
				return true;
			}
		}
		return false;
	}

	/**
	 * Used to set a new arrayList should not be used unless for debugging purposes
	 * as it overrides all previous records
	 * 
	 * @param orderList to override current orderlist
	 */
	public void setOrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;
	}

	/**
	 * Takes in a start and end date Prints out all order contents within the
	 * specified period Prints number of each individual item as well as total
	 * revenue during this period Starts by duplicating all orders within date range
	 * into temporary arraylist Then calculates the total price for all these orders
	 * Next uses hashset to get a set of each unique foodtype and counts the number
	 * of each unique foodtype and prints the count
	 * 
	 * @param start date
	 * @param end   date
	 */
	public void periodRevenue(Instant start, Instant end) {
		ArrayList<Order> temporderlist = new ArrayList<Order>();
		ArrayList<AlaCarteItem> alalist = new ArrayList<AlaCarteItem>();
		ArrayList<SetItem> setlist = new ArrayList<SetItem>();
		Order temporder;
		int i, size = orderList.size();

		for (i = 0; i < size; i++) {
			temporder = orderList.get(i);
			if (temporder.getDate().isAfter(start) && temporder.getDate().isBefore(end)) {
				temporderlist.add(temporder);
				alalist.addAll(temporder.getAlaCarteItemOrder());
				setlist.addAll(temporder.getSetItemOrder());
			}
		}
		if (temporderlist.isEmpty())
			System.out.println("No Sales in specified period");
		else {
			double total = 0;
			for (i = 0; i < temporderlist.size(); i++)
				total += temporderlist.get(i).getTotalprice();
			System.out.printf("Total Revenue: $%.2f\n", total);
			System.out.println("------------------------------------------------------");
			if (!alalist.isEmpty()) {
				Set<AlaCarteItem> uniqueala = new HashSet<AlaCarteItem>(alalist);
				Iterator<AlaCarteItem> iterala = uniqueala.iterator();
				AlaCarteItem tempala;
				for (i = 0; i < uniqueala.size(); i++) {
					tempala = iterala.next();
					System.out.printf("Number of %s: %d\n", tempala.getName(), Collections.frequency(alalist, tempala));
				}
			}
			System.out.println("------------------------------------------------------");
			if (!setlist.isEmpty()) {
				Set<SetItem> uniqueset = new HashSet<SetItem>(setlist);
				Iterator<SetItem> iterset = uniqueset.iterator();
				SetItem tempset;
				for (i = 0; i < uniqueset.size(); i++) {
					tempset = iterset.next();
					System.out.printf("Number of %s: %d\n", tempset.getName(), Collections.frequency(setlist, tempset));
				}
			}
		}
	}
}