import java.util.ArrayList;
import java.time.Instant;
import java.util.Scanner;

public class OrderList implements ListPrinter {

	private ArrayList<Order> orderList;
	private static int orderID = 1;

	public OrderList() {
		orderList = new ArrayList<Order>();
	}

	public ArrayList<Order> getOrderList() {
		return this.orderList;
	}

	/**
	 * 
	 * @param orderList
	 */
	public void setOrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;
	}

	public boolean deleteOrder(int orderID) {
		if (orderList.remove(orderID) != null)
			return true;
		else
			return false;
	}

	public boolean updateOrder(int orderID, Menu menulist) {
		int choice, ID, qty;
		Scanner sc = new Scanner(System.in);

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
					if (menulist.getAlaCarteList().get(i).getFoodID() == ID) {
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
					if (menulist.getSetMenuList().get(i).getSetID() == ID) {
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
				if(getOrderByOrderID(orderID).deleteAlaFood(ID))
				{
					System.out.println("Success");
				}
				else
				{
					System.out.println("Failed");
				}
				break;

			case 2:
				System.out.println("Please enter Set Item ID");
				ID = sc.nextInt();
				if(getOrderByOrderID(orderID).deleteSetFood(ID))
				{
					System.out.println("Success");
				}
				else
				{
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
		return true;
	}

	public boolean addOrder(int staffID, Instant date, int pax, orderType ordertype, int tableID) {
		Order tempOrder = new Order(orderID++, staffID, date, pax, ordertype, tableID);
		if (orderList.add(tempOrder))
			return true;
		else
			return false;
	}

	public boolean updateArchive(RevenueReport revport, int orderID) {
		Order temporder = getOrderByOrderID(orderID);
		if (temporder != null) {
			revport.addToArchive(temporder);
			return true;
		} else
			return false;
	}

	public void printList() {
		System.out.println("Active Order:");
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i) != null) {
				System.out.printf("Order Number: %d\n", orderList.get(i).getorderID());
			}
		}
	}

	/**
	 * 
	 * @param orderID
	 * @param member
	 */
	public void generateInvoice(int orderID, boolean member) {
		Invoice newinvoice = new Invoice(getOrderByOrderID(orderID), member);
		newinvoice.printer();
	}

	/**
	 * 
	 * @param orderID
	 */
	public Order getOrderByOrderID(int orderID) {
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getorderID() == orderID) {
				return orderList.get(i);
			}
		}
		return null;
	}

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

}