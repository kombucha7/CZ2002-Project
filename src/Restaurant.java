import java.util.Scanner;
import java.time.Instant;

public class Restaurant {

	// <<<<<<< Updated upstream

	public static void main(String[] args) {
		// TODO - implement Restaurant.main
		TableList restaTable = new TableList();
		Menu restaMenu = new Menu();
		OrderList restaOrderList = new OrderList();
		StaffList restaStaffList = new StaffList();
		MemberList restaMember = new MemberList();
		TimeHandler handler = new TimeHandler();
		RevenueReport restaReport = new RevenueReport();
		ReservationList restaReserve = new ReservationList();

		int option;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("SELECT OPTION: ");
			System.out.println("1. Create/Update/Remove menu item\n" + "2. Create/Update/Remove promotion\n"
					+ "3. Create order\n" + "4. View order\n" + "5. Add/Remove order item/s to/from order\n"
					+ "6. Create reservation booking\n" + "7. Check/Remove reservation booking\n"
					+ "8. Check table availability\n" + "9. Assign customer to table\n"
					+ "10. Print order invoice\n"
					+ "11. Print sale revenue report by period (eg day or month)\n" + "12. Advance time(1 hour)\n"
					+ "13. Exit");

			option = sc.nextInt();

			// troubleshooting
			while (option < 0 || option > 13) {
				System.out.println("Invalid option selected. Re-enter: ");
				option = sc.nextInt();
			}
			// exit app
			if (option == 13) {
				System.out.println("Exiting...");
				break;
			}
			;

			switch (option) {
			case 1: // Create/Update/Remove menu item
				System.out.println("\n");
				break;

			case 2: // Create/Update/Remove promotion
				String tempsetname, tempdes;
				double tempprice;
				int tempSetID, tempfoodID;

				while (true) {
					System.out.println("Select an option: ");
					System.out.println("1.Create promotion items");
					System.out.println("2.Update promotion set items");
					System.out.println("3.Remove promotion set items");
					System.out.println("4.Go back");
					option = sc.nextInt();
					while (option < 0 | option > 4) {
						System.out.println("Invalid option selected. Re-enter: ");
						option = sc.nextInt();
					}
					if (option == 4) {
						System.out.println("Returning to previous option...");
						break;
					}
					switch (option) {
					case 1:
						// Create New Set Promotion
						System.out.println("Enter new Set Name:");
						tempsetname = sc.nextLine();

						System.out.println("Enter new Set Price:");
						tempprice = sc.nextDouble();

						System.out.println("Enter new Set description:");
						tempdes = sc.nextLine();

						tempSetID = restaMenu.getSetMenuList().size();
						SetItem temp = new SetItem(tempSetID, tempsetname, tempprice, tempdes);
						restaMenu.getSetMenuList().add(temp);

						System.out.println("Available Alacarte to add into Promotional set: ");
						for (int i = 0; i < restaMenu.getAlaCarteList().size(); i++) {
							if (restaMenu.getAlaCarteList().get(i).getAvailability()) {
								System.out.println("FoodID: " + restaMenu.getAlaCarteList().get(i).getFoodID()
										+ " Name: " + restaMenu.getAlaCarteList().get(i).getName());
							}
						}
						System.out.println("Enter Alacarte Food FoodID to Add into promotional set:");
						System.out.println("Enter -1 to stop adding!");
						tempfoodID = sc.nextInt();
						boolean found = false;
						while (tempfoodID > 0) {
							for (int i = 0; i < restaMenu.getAlaCarteList().size(); i++) {
								if (restaMenu.getAlaCarteList().get(i).getFoodID() == tempfoodID) {
									temp.addItem(restaMenu.getAlaCarteList().get(i));
									found = true;
								}
							}
						}
						while (!found) {
							System.out.println("Invalid FoodID! Enter a valid foodID :");
							tempfoodID = sc.nextInt();
						}
						if (tempfoodID < 0) {
							break;
						}
						break;
					case 2:
						// Update existing Set promotion
						System.out.println("Set Menu:");
						System.out
								.println("===========================================================================");
						for (int i = 0; i < restaMenu.getSetMenuList().size(); i++) {
							if (restaMenu.getSetMenuList().get(i).getAvailability()) {
								System.out.println(restaMenu.getSetMenuList().get(i).getSetID() + ") Name: "
										+ restaMenu.getSetMenuList().get(i).getName());
								System.out.println("Price: " + restaMenu.getSetMenuList().get(i).getPrice());
								System.out
										.println("Description: " + restaMenu.getSetMenuList().get(i).getDescription());
								System.out.print("Contains: ");
								for (int j = 0; j < restaMenu.getSetMenuList().get(i).getAlaCarteMenuList()
										.size(); j++) {
									System.out.print(
											restaMenu.getSetMenuList().get(i).getAlaCarteMenuList().get(j).getName()
													+ " , ");
								}
								System.out.println("");
								System.out.println(
										"============================================================================");
							}
						}
						System.out.println("Enter SetID to Update:");
						tempSetID = sc.nextInt();

						boolean exist = false;

						for (int i = 0; i < restaMenu.getSetMenuList().size(); i++) {
							if (restaMenu.getSetMenuList().get(i).getSetID() == tempSetID) {

								System.out.println("Enter new name:");
								tempsetname = sc.nextLine();
								restaMenu.getSetMenuList().get(i).setName(tempsetname);

								System.out.println("Enter new price:");
								tempprice = sc.nextDouble();
								restaMenu.getSetMenuList().get(i).setPrice(tempprice);

								System.out.println("Enter SetID to Update:");
								tempdes = sc.nextLine();
								restaMenu.getSetMenuList().get(i).setDescription(tempdes);

								exist = true;
								break;
							}
						}
						if (!exist) {
							System.out.println("FoodID not valid!");
						}

						break;
					case 3:
						System.out.println("Set Menu:");
						System.out
								.println("===========================================================================");
						for (int i = 0; i < restaMenu.getSetMenuList().size(); i++) {
							if (restaMenu.getSetMenuList().get(i).getAvailability()) {
								System.out.println(restaMenu.getSetMenuList().get(i).getSetID() + ") Name: "
										+ restaMenu.getSetMenuList().get(i).getName());
								System.out.println("Price: " + restaMenu.getSetMenuList().get(i).getPrice());
								System.out
										.println("Description: " + restaMenu.getSetMenuList().get(i).getDescription());
								System.out.print("Contains: ");
								for (int j = 0; j < restaMenu.getSetMenuList().get(i).getAlaCarteMenuList()
										.size(); j++) {
									System.out.print(
											restaMenu.getSetMenuList().get(i).getAlaCarteMenuList().get(j).getName()
													+ " , ");
								}
								System.out.println("");
								System.out.println(
										"============================================================================");
							}
						}
						System.out.println("Enter SetID to delete:");
						tempSetID = sc.nextInt();

						for (int i = 0; i < restaMenu.getSetMenuList().size(); i++) {
							if (restaMenu.getSetMenuList().get(i).getSetID() == tempSetID) {
								restaMenu.getSetMenuList().get(i).setAvailability(false);
								break;
							}
						}
						break;

					}
				}
				System.out.println("\n");
				break;

			case 3: // Create order
				System.out.println("Please enter StaffID");
				int staffID3 = sc.nextInt();
				System.out.println("Please enter number of customers");
				int pax3 = sc.nextInt();
				// use pax3 to find which available table
				int tableID3 = 1;
				System.out.printf("Please pick Order Type\n(1) Dine In\n(2) Takeout\n");
				int choice3 = sc.nextInt();
				orderType type3 = orderType.dine_in;
				boolean flag3 = true;
				while (flag3) {
					switch (choice3) {
					case 1:
						type3 = orderType.dine_in;
						flag3 = false;
						break;
					case 2:
						type3 = orderType.takeout;
						flag3 = false;
						break;
					default:
						System.out.println("wrong entry please enter again");
						break;
					}
				}
				Instant time3 = handler.getInstant();
				int toprintorderid = restaOrderList.addOrder(staffID3, time3, pax3, type3, tableID3);
				System.out.printf("Order ID: %d\n", toprintorderid);
				System.out.println("\n");
				break;

			case 4: // View order
				System.out.println("Please enter orderID");
				int orderid4 = sc.nextInt();
				Order toprintorder = restaOrderList.getOrderByOrderID(orderid4);
				if (toprintorder != null) {
					toprintorder.printList();
				}
				System.out.println("\n");
				break;

			case 5: // Add/Remove order item/s to/from order
				System.out.println("Please enter orderID");
				int orderid5 = sc.nextInt();
				restaOrderList.updateOrder(orderid5, restaMenu);
				System.out.println("\n");
				break;

			case 6: // Create reservation booking
				System.out.println("###Creating a new reservation###");
				System.out.println("Enter Date in the format (DDMMYYYY):");	//truncate D/M/Y
				String dateInput = sc.next();
				String day = dateInput.substring(0,2);
				String month = dateInput.substring(0,2);
				String year = dateInput.substring(0,4);

				System.out.println("Enter Time in the format (HHmm):");
				String timeInput = sc.next();
				String hours = timeInput.substring(0,2);
				String minute = timeInput.substring(0,2);

				System.out.println("Enter no. pax");
				int pax = sc.nextInt();

				System.out.println("Enter phone no.:");
				int phoneNum = sc.nextInt();

				Instant inst1 = Instant.parse(year + "-" + month + "-" + day +"T" + hours +":" + minute + ":00.00Z");
				Reservation addNew = new Reservation(inst1, pax, phoneNum);

				int tables[] = restaTable.matchCurrentTable(pax);

				int index = restaReserve.checkUpcomingReserved(tables,addNew);
				if (index > -1) {
					addNew.setTableNum(index);
					restaReserve.createReservation(addNew);
				}
				else {
					System.out.println("Reservation list full");
				}
				System.out.println("\n");
				break;

			case 7: // Check/Remove reservation booking
				restaReserve.removeReservation(123);
				System.out.println("\n");
				break;

			case 8: // Check table availability
				System.out.println("Number of tables available: " + restaTable.getEmpty() + "\n");
				// table_list.printTable();
				System.out.println("\n");
				break;

			case 9: // Assign customer to table
				System.out.println("Enter number of pax: ");
				int pax9 = sc.nextInt();
				int[] availableTables9 = restaTable.matchCurrentTable(pax9);
				int tableID9 = restaReserve.checkCurrentReserved(availableTables9);

				restaTable.occupyTable(tableID9);
				System.out.println("Table with ID of " + tableID9 + " occupied!");
				System.out.println("\n");
				break;

			case 10: // Print order invoice
				System.out.println("Please enter order ID: ");
				int orderid10 = sc.nextInt();
				Boolean memberstat10 = sc.nextBoolean(); // check for member or ask for member
				restaOrderList.generateInvoice(orderid10, memberstat10);
				restaReport.addToArchive(restaOrderList.getOrderByOrderID(orderid10));
				System.out.println("\n");
				break;

			case 11: // Print sale revenue report by period (eg day or month)
				System.out.println("Please enter initial year: (YYYY)");
				String iniyear = sc.next();
				System.out.println("Please enter initial month: (MM)");
				String inimon = sc.next();
				System.out.println("Please enter initial day: (DD)");
				String iniday = sc.next();
				System.out.println("Please enter final year: (YYYY)");
				String finyear = sc.next();
				System.out.println("Please enter final month: (MM)");
				String finmon = sc.next();
				System.out.println("Please enter final day: (DD)");
				String finday = sc.next();
				String ini = iniyear + "-" + inimon + "-" + iniday + "T00:00:00Z";
				String fin = finyear + "-" + finmon + "-" + finday + "T00:00:00Z";
				restaReport.periodRevenue(Instant.parse(ini), Instant.parse(fin));
				System.out.println("\n");
				break;

			case 12: // Advance time by 1 hour
				handler.advanceTime(60);
				// add code to check reservations
				System.out.println("\n");
				break;
			}

		}

		// throw new UnsupportedOperationException();
	}
	// >>>>>>> Stashed changes
}