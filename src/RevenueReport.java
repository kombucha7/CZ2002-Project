import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;

public class RevenueReport {

	private ArrayList<Order> orderList;

	public RevenueReport() {
		orderList = new ArrayList<Order>();
	}

	public ArrayList<Order> getOrderList() {
		return this.orderList;
	}

	public boolean addToArchive(Order order) // add to vpp
	{
		if (orderList.add(order))
			return true;
		else
			return false;
	}

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
	 * 
	 * @param orderList
	 */
	public void setOrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;
	}

	/**
	 * 
	 * @param start
	 * @param end
	 */
	public void periodRevenue(Instant start, Instant end) {
		ArrayList<Order> temporderlist = new ArrayList<Order>();
		ArrayList<alaCarteMenu> alalist = new ArrayList<alaCarteMenu>();
		ArrayList<SetMenu> setlist = new ArrayList<SetMenu>();
		Order temporder;
		int i, size = orderList.size();

		for (i = 0; i < size; i++) {
			temporder = orderList.get(i);
			if (temporder.getDate().isAfter(start) && temporder.getDate().isBefore(end)) {
				temporderlist.add(temporder);
				alalist.addAll(temporder.getAlaCarteMenuOrder());
				setlist.addAll(temporder.getSetMenuOrder());
			}
		}
		if(temporderlist.isEmpty()) System.out.println("No Sales in specified period");
		else
		{
			int total=0;
			for(i = 0; i<temporderlist.size(); i++)
				total+=temporderlist.get(i).getTotalPrice();
			System.out.printf("Total Revenue: %d\n", total);
			System.out.println("------------------------------------------------------");
			if (!alalist.isEmpty()) {
				Set<alaCarteMenu> uniqueala = new HashSet<alaCarteMenu>(alalist);
				Iterator<alaCarteMenu> iterala = uniqueala.iterator();
				alaCarteMenu tempala;
				for (i = 0; i < uniqueala.size(); i++) {
					tempala = iterala.next();
					System.out.printf("Number of %s: %d\n", tempala.getName(), Collections.frequency(alalist, tempala));
				}
			}
			System.out.println("------------------------------------------------------");
			if (!setlist.isEmpty()) {
				Set<SetMenu> uniqueset = new HashSet<SetMenu>(setlist);
				Iterator<SetMenu> iterset = uniqueset.iterator();
				SetMenu tempset;
				for (i = 0; i < uniqueset.size(); i++) {
					tempset = iterset.next();
					System.out.printf("Number of %s: %d\n", tempset.getName(), Collections.frequency(setlist, tempset));
				}
			}
		}	
	}
}