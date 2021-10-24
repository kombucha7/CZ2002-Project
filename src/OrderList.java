import java.util.ArrayList;
import java.util.Scanner;
import java.time.Clock;

public class OrderList {

	private ArrayList<Order> orderList;
	private static int orderID = 0;

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
			System.out.println("Press 1 for AlaCarte Item");
			System.out.println("Press 2 for Set Item");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Please enter AlaCarte Item ID");
				ID = sc.nextInt();
				System.out.println("Please enter number of items");
				qty = sc.nextInt();
				temporder = orderList.get(orderID);
				alaCarteMenu tempfood = menulist.getAlaCarteList().get(ID);
				temporder.addFood(tempfood, qty);
				break;

			case 2:
				System.out.println("Please enter Set Item ID");
				ID = sc.nextInt();
				System.out.println("Please enter number of items");
				qty = sc.nextInt();
				temporder = orderList.get(orderID);
				SetMenu tempset = menulist.getSetMenuList().get(ID);
				temporder.addFood(tempset, qty);
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
				orderList.get(orderID).deleteAlaFood(ID);
				break;

			case 2:
				System.out.println("Please enter Set Item ID");
				ID = sc.nextInt();
				orderList.get(orderID).deleteSetFood(ID);
				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}
			break;

		default:
			sc.close();
			return false;
		}
		sc.close();
		return true;
	}

	public boolean addOrder(int staffID, Clock date, int pax, orderType ordertype) {
		Order tempOrder = new Order(orderID++, staffID, date, pax, ordertype);
		if (orderList.add(tempOrder))
			return true;
		else
			return false;
	}

	public boolean updateArchive(RevenueReport revport, int orderID) {
		Order temporder = getOrder(orderID);
		if (temporder != null) {
			revport.addToArchive(temporder);
			return true;
		} else
			return false;
	}

	public void showOrderList() {
		System.out.println("Active Order:");
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i) != null) {
				System.out.printf("Order Number: %d\n", i);
			}
		}
	}

	public boolean generateInvoice(int orderID, boolean member) {
		Order temporder = getOrder(orderID);
		if (temporder == null)
			return false;
		else {
			System.out.printf("Order ID: %d\n", temporder.getorderID());
			System.out.printf("Staff ID: %d\n", temporder.getStaffID());

			System.out.println("AlaCarte items: ");
			for (int i = 0; i < temporder.getAlaCarteMenuOrder().size(); i++) {
				System.out.printf("%s                     %d\n", temporder.getAlaCarteMenuOrder().get(i).getName(),
						temporder.getAlaCarteMenuOrder().get(i).getPrice());
			}

			System.out.println("Set items: ");
			for (int i = 0; i < temporder.getSetMenuOrder().size(); i++) {
				System.out.printf("%s                     %d\n", temporder.getSetMenuOrder().get(i).getName(),
						temporder.getSetMenuOrder().get(i).getPrice());
			}

			System.out.printf("Total Price: %d\n", temporder.getTotalPrice());

			if (member) {
				System.out.printf("Member Price: %d\n", temporder.getTotalPrice() * 0.9);
			}
			temporder.setOrderCompleted(true);
			return true;
		}
	}

	public Order getOrder(int orderID) {
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getorderID() == orderID) {
				return orderList.get(i);
			}
		}
		return null;
	}

}