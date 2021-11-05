import java.util.ArrayList;

public class Menu implements CustPrintable {

	private ArrayList<AlaCarteItem> alaCarteList;
	private ArrayList<SetItem> setMenuList;

	public Menu() {
		AlaCarteItem FilletOFish = new AlaCarteItem("FilletOFish",2.00,"Fish Burger",foodType.Main,1000,true);
		alaCarteList.add(FilletOFish);

		AlaCarteItem McChicken = new AlaCarteItem("McChicken",2.50,"Chicken Burger",foodType.Main,1001,true);
		alaCarteList.add(McChicken);

		AlaCarteItem McSpicy = new AlaCarteItem("McSpicy",6.30,"Spicy Chicken Patty Burger",foodType.Main,1002,true);
		alaCarteList.add(McSpicy);

		AlaCarteItem McPepper =  new AlaCarteItem("McPepper",3.20,"Beef Pepper Burger",foodType.Main,1003,true);
		alaCarteList.add(McPepper);

		AlaCarteItem McWrap =  new AlaCarteItem("McWrap",4.70,"Chicken Wrap",foodType.Main,1004,true);
		alaCarteList.add(McWrap);

		AlaCarteItem CocaCola =  new AlaCarteItem("CocaCola",1.50,"Coca Cola Drink",foodType.Drinks,2000,true);
		alaCarteList.add(CocaCola);

		AlaCarteItem Sprite =  new AlaCarteItem("Sprite",1.50,"Sprite",foodType.Drinks,2001,true);
		alaCarteList.add(Sprite);

		AlaCarteItem LemonTea =  new AlaCarteItem("LemonTea",2.10,"Ice Lemon Tea",foodType.Drinks,2002,true);
		alaCarteList.add(LemonTea);

		AlaCarteItem Dasani = new AlaCarteItem("Dasani",1.20,"Dasani Ice Water",foodType.Drinks,2003,true);
		alaCarteList.add(Dasani);

		AlaCarteItem OrangeJuice = new AlaCarteItem("OrangeJuice",1.80,"Orange Juice",foodType.Drinks,2004,true);
		alaCarteList.add(OrangeJuice);

		AlaCarteItem ApplePie = new AlaCarteItem("ApplePie",1.50,"Apple Pie",foodType.Dessert,3000,true);
		alaCarteList.add(ApplePie);

		AlaCarteItem IceCream = new AlaCarteItem("IceCream",2.0,"Ice Cream",foodType.Dessert,3001,true);
		alaCarteList.add(IceCream);

		AlaCarteItem MilkShake = new AlaCarteItem("MilkShake",2.50,"Milk Shake",foodType.Dessert,3002,true);
		alaCarteList.add(MilkShake);

		AlaCarteItem Mochi = new AlaCarteItem("Mochi",1.30,"Mochi",foodType.Dessert,3003,true);
		alaCarteList.add(Mochi);

		AlaCarteItem Jelly = new AlaCarteItem("Jelly",1.00,"Jelly",foodType.Dessert,3004,true);
		alaCarteList.add(Jelly);

		AlaCarteItem CornCup = new AlaCarteItem("CornCup",2.0,"Corn Cup",foodType.Appetizer,4000,true);
		alaCarteList.add(CornCup);

		AlaCarteItem Fries = new AlaCarteItem("Fries",1.5,"Fries",foodType.Appetizer,4001,true);
		alaCarteList.add(Fries);

		AlaCarteItem Wedges = new AlaCarteItem("Wedges",2.3,"Wedges",foodType.Appetizer,4002,true);
		alaCarteList.add(Wedges);

		AlaCarteItem Spam = new AlaCarteItem("Spam",2.8,"Spam",foodType.Appetizer,4003,true);
		alaCarteList.add(Spam);

		AlaCarteItem CrabCakes = new AlaCarteItem("CrabCakes",3.0,"Crab Cakes",foodType.Appetizer,4004,true);
		alaCarteList.add(CrabCakes);

		SetItem FilletoFishSet = new SetItem(01, "Filet o Fish Set", 5.00, "Filet o fish set");
		FilletoFishSet.addAlaCarteItem(FilletOFish);

	}

	public ArrayList<AlaCarteItem> getAlaCarteList() {
		return this.alaCarteList;
	}

	/**
	 * 
	 * @param alaCarteList
	 */
	public void setAlaCarteList(ArrayList<AlaCarteItem> alaCarteList) {
		this.alaCarteList = alaCarteList;
	}

	public ArrayList<SetItem> getSetMenuList() {
		return this.setMenuList;
	}

	/**
	 * 
	 * @param setMenuList
	 */
	public void setSetMenuList(ArrayList<SetItem> setMenuList) {
		this.setMenuList = setMenuList;
	}

	/**
	 * 
	 * @param foodID
	 * @param name
	 */
	public void update_alaCarteName(int foodID, String name) {
		// TODO - implement Menu.update_alaCarteName
		boolean search = false;
		for (int i = 0; i < alaCarteList.size(); i++) {
			if (alaCarteList.get(i).getFoodID() == foodID) {
				alaCarteList.get(i).setName(name);
				search = true;
			}
		}
		if (search) {
			System.out.println("Successfully updated name for foodID " + foodID);
		} else {
			System.out.println("No Such FoodID in List!");
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param foodID
	 * @param price
	 */
	public void update_alaCartePrice(int foodID, float price) {
		// TODO - implement Menu.update_alaCartePrice
		boolean search = false;
		for (int i = 0; i < alaCarteList.size(); i++) {
			if (alaCarteList.get(i).getFoodID() == foodID) {
				alaCarteList.get(i).setPrice(price);
				search = true;
			}
		}
		if (search) {
			System.out.println("Successfully updated name for foodID " + foodID);
		} else {
			System.out.println("No Such FoodID in List!");
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param foodID
	 * @param description
	 */
	public void update_alaCarteDescription(int foodID, String description) {
		// TODO - implement Menu.update_alaCarteDescription
		boolean search = false;
		for (int i = 0; i < alaCarteList.size(); i++) {
			if (alaCarteList.get(i).getFoodID() == foodID) {
				alaCarteList.get(i).setFoodID(foodID);
				search = true;
			}
		}
		if (search) {
			System.out.println("Successfully updated Description for foodID" + foodID);
		} else {
			System.out.println("No Such FoodID in List!");
		}

		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param setID
	 * @param name
	 */
	public void update_setMenuName(int setID, String name) {
		// TODO - implement Menu.update_setMenuName
		boolean search = false;

		for(int i =0 ; i <setMenuList.size();i++)
		{
			if(setMenuList.get(i).getSetID() == setID)
			{
				setMenuList.get(i).setName(name);
				search = true;
			}
		}
		if(search)
		{
			System.out.println("Successfully updated set name for SetID: "+setID);
		}
		else
		{
			System.out.println("No such SetID to be Updated.");
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param setID
	 * @param price
	 */
	public void update_setMenuPrice(int setID, float price) {
		// TODO - implement Menu.update_setMenuPrice
		boolean search = false;
		for(int i =0 ; i <setMenuList.size();i++)
		{
			if(setMenuList.get(i).getSetID() == setID)
			{
				setMenuList.get(i).setPrice(price);
				search = true;
			}
		}
		if(search)
		{
			System.out.println("Successfully updated price for SetID: "+setID);
		}
		else
		{
			System.out.println("No such SetID to be Updated.");
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param setID
	 * @param description
	 */
	public void update_setMenuDescription(int setID, String description) {
		// TODO - implement Menu.update_setMenuDescription
		boolean search = false;
		for(int i =0 ; i <setMenuList.size();i++)
		{
			if(setMenuList.get(i).getSetID() == setID)
			{
				setMenuList.get(i).setDescription(description);
				search = true;
			}
		}
		if(search)
		{
			System.out.println("Successfully updated description for SetID: "+setID);
		}
		else
		{
			System.out.println("No such SetID to be Updated.");
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param foodID
	 */
	public void removeAlaCarteItem(int foodID) {
		// TODO - implement Menu.removeAlaCarteItem
		boolean search = false;

		for (int i = 0; i < alaCarteList.size(); i++) {
			if (alaCarteList.get(i).getFoodID() == foodID) {
				alaCarteList.get(i).setAvailability(false);
				search = true;
			}
		}
		if (search) {
			System.out.println("Successfully removed AlaCarteItem.");
		} else {
			System.out.println("No such item exist in AlaCarteList.");
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param setID
	 */
	public void removeMenuItem(int setID) {
		// TODO - implement Menu.removeMenuItem
		boolean search = false;
		for(int i =0 ; i <setMenuList.size();i++)
		{
			if(setMenuList.get(i).getSetID() == setID)
			{
				setMenuList.get(i).setAvailability(false);
				search = true;
			}
		}
		if(search)
		{
			System.out.println("Successfully remove SetID : "+setID+"from the Menu.");
		}
		else
		{
			System.out.println("No such SetID found to be removed.");
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param item
	 */
	public void addAlaCarteItem(AlaCarteItem item) {
		// TODO - implement Menu.addAlaCarteItem
		boolean search = false;

		for (int i = 0; i < alaCarteList.size(); i++) {
			if (alaCarteList.get(i).getFoodID() == item.getFoodID()) {
				alaCarteList.get(i).setAvailability(true);
				search = true;
			}
		}

		if (search) {
			System.out.println("Successfully added AlaCarteItem.");
		} else {
			alaCarteList.add(item);
			System.out.println("Successfully added AlaCarteItem " + item.getName());
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param item
	 */
	public void addSetMenuItem(SetItem item) {
		// TODO - implement Menu.addSetMenuItem
		boolean search = false;
		for(int i = 0 ; i <setMenuList.size();i++)
		{
			if(setMenuList.get(i).getSetID() == item.getSetID())
			{
				System.out.println("Duplicated Set item is found inside set menu");
				search = true;
			}
		}
		if(!search)
		{
			setMenuList.add(item);
		}
		throw new UnsupportedOperationException();
	}

	public void printer() {
		// TODO - implement Menu.printer
		System.out.println("Set Menu:");
		for(int i = 0;i<setMenuList.size();i++)
		{
			if(setMenuList.get(i).getAvailability())
			{
				System.out.println(setMenuList.get(i).getSetID()+"Name: "+setMenuList.get(i).getName());
				System.out.println("Price: "+setMenuList.get(i).getPrice());
				System.out.println("Description: "+setMenuList.get(i).getDescription());
				System.out.println("");
			}
		}

		System.out.println("Alacarte Menu:");
		for(int i = 0;i<alaCarteList.size();i++)
		{
			if(setMenuList.get(i).getAvailability())
			{
				
				System.out.println(alaCarteList.get(i).getFoodID()+"Name: "+alaCarteList.get(i).getName());
				System.out.println("Price: "+alaCarteList.get(i).getPrice());
				System.out.println("Description: "+alaCarteList.get(i).getDescription());
				System.out.println("");
			}
		}
		throw new UnsupportedOperationException();
	}

}