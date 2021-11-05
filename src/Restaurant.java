import java.util.Scanner;

public class Restaurant {

//<<<<<<< Updated upstream

	public static void main(String[] args) {
		// TODO - implement Restaurant.main
		TableList table_list = new TableList();
		Menu restaMenu = new Menu();
		OrderList restaOrderList = new OrderList();
		StaffList restaStaffList = new StaffList();
		MemberList restaMember = new MemberList();
		TimeHandler handler = new TimeHandler();
		RevenueReport restaReport = new RevenueReport();

		int option;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("SELECT OPTION: ");
			System.out.println(
					"1. Create/Update/Remove menu item\n" +
					"2. Create/Update/Remove promotion\n" +
					"3. Create order\n" +
					"4. View order\n" +
					"5. Add/Remove order item/s to/from order\n" +
					"6. Create reservation booking\n" +
					"7. Check/Remove reservation booking\n" +
					"8. Check table availability\n" +
					"9. Print order invoice\n" +
					"10. Print sale revenue report by period (eg day or month)\n" +
					"11. Exit");

			option = sc.nextInt();

			// troubleshooting
			while (option < 0 || option > 11) {
				System.out.println("Invalid option selected. Re-enter: ");
				option = sc.nextInt();
			}
			// exit app
			if (option == 11) {
				System.out.println("Exiting...");
				break;
			};

			switch (option) {
				case 1:		// Create/Update/Remove menu item
					System.out.println("\n");
					break;

				case 2:		// Create/Update/Remove promotion
					System.out.println("\n");
					String tempsetname,tempdes;
					double tempprice;
					int tempSetID,tempfoodID;

					while (true) 
					{
						System.out.println("Select a option: ");
						System.out.println("1.Create promotion items");
						System.out.println("2.Update promotion set items");
						System.out.println("3.Remove promotion set items");
						System.out.println("4.Go back");
						option = sc.nextInt();
						while(option < 0| option > 4)
						{
							System.out.println("Invalid option selected. Re-enter: ");
							option = sc.nextInt();
						}
						if(option == 4)
						{
							System.out.println("Returning to previous option...");
							break;
						}
						switch(option)
						{
							case 1:
							//Create New Set Promotion
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
								for(int i = 0; i<restaMenu.getAlaCarteList().size(); i++)
								{
									if(restaMenu.getAlaCarteList().get(i).getAvailability())
									{
										System.out.println("FoodID: "+restaMenu.getAlaCarteList().get(i).getFoodID()+ " Name: "+ restaMenu.getAlaCarteList().get(i).getName());
									}
								}
								System.out.println("Enter Alacarte Food FoodID to Add into promotional set:");
								System.out.println("Enter -1 to stop adding!");
								tempfoodID = sc.nextInt();
								boolean found = false;
								while(tempfoodID >0)
								{
									for(int i = 0;i<restaMenu.getAlaCarteList().size() ;i++)
									{
										if(restaMenu.getAlaCarteList().get(i).getFoodID() == tempfoodID)
										{
											temp.addItem(restaMenu.getAlaCarteList().get(i));
											found = true;
										}
									}
								}
								while(!found)
								{
									System.out.println("Invalid FoodID! Enter a valid foodID :");
									tempfoodID = sc.nextInt();
								}
								if(tempfoodID <0)
								{
									break;
								}
								break;
							case 2:
							//Update exisitng Set promotion
								System.out.println("Set Menu:");
								System.out.println("===========================================================================");
								for(int i = 0;i<restaMenu.getSetMenuList().size();i++)
								{
									if(restaMenu.getSetMenuList().get(i).getAvailability())
									{
										System.out.println(restaMenu.getSetMenuList().get(i).getSetID() + ") Name: "+restaMenu.getSetMenuList().get(i).getName());
										System.out.println("Price: "+restaMenu.getSetMenuList().get(i).getPrice());
										System.out.println("Description: "+restaMenu.getSetMenuList().get(i).getDescription());
										System.out.print("Contains: ");
										for(int j = 0; j <restaMenu.getSetMenuList().get(i).getAlaCarteMenuList().size();j++)
										{
											System.out.print(restaMenu.getSetMenuList().get(i).getAlaCarteMenuList().get(j).getName() + " , ");
										}
										System.out.println("");
										System.out.println("============================================================================");
									}
								}
								System.out.println("Enter SetID to Update:");
								tempSetID = sc.nextInt();

								boolean exist = false;
								
								for(int i= 0; i<restaMenu.getSetMenuList().size();i++)
								{
									if(restaMenu.getSetMenuList().get(i).getSetID() == tempSetID)
									{

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
								if(!exist)
								{
									System.out.println("FoodID not valid!");
								}

								break;
							case 3:
								System.out.println("Set Menu:");
								System.out.println("===========================================================================");
								for(int i = 0;i<restaMenu.getSetMenuList().size();i++)
								{
									if(restaMenu.getSetMenuList().get(i).getAvailability())
									{
										System.out.println(restaMenu.getSetMenuList().get(i).getSetID() + ") Name: "+restaMenu.getSetMenuList().get(i).getName());
										System.out.println("Price: "+restaMenu.getSetMenuList().get(i).getPrice());
										System.out.println("Description: "+restaMenu.getSetMenuList().get(i).getDescription());
										System.out.print("Contains: ");
										for(int j = 0; j <restaMenu.getSetMenuList().get(i).getAlaCarteMenuList().size();j++)
										{
											System.out.print(restaMenu.getSetMenuList().get(i).getAlaCarteMenuList().get(j).getName() + " , ");
										}
										System.out.println("");
										System.out.println("============================================================================");
									}
								}
								System.out.println("Enter SetID to delete:");
								tempSetID = sc.nextInt();

								for(int i = 0; i<restaMenu.getSetMenuList().size(); i++)
								{
									if(restaMenu.getSetMenuList().get(i).getSetID() == tempSetID)
									{
										restaMenu.getSetMenuList().get(i).setAvailability(false);
										break;
									}
								}
								break;

						}
					}
					
					
					break;

				case 3:		// Create order
					System.out.println("\n");

					break;

				case 4:		// View order
					System.out.println("\n");
					break;

				case 5:		// Add/Remove order item/s to/from order
					System.out.println("\n");
					break;

				case 6:		// Create reservation booking
					System.out.println("\n");
					break;

				case 7:		// Check/Remove reservation booking
					System.out.println("\n");
					break;

				case 8:		// Check table availability
					System.out.println("Number of tables available: " + table_list.getEmpty() + "\n");
					//table_list.printTable();
					System.out.println("\n");
					break;

				case 9:		// Print order invoice
					System.out.println("\n");
					break;

				case 10:	// Print sale revenue report by period (eg day or month)
					System.out.println("\n");
					break;
			}

		}

		//throw new UnsupportedOperationException();
	}
//>>>>>>> Stashed changes
}