import java.io.Serializable;
import java.util.ArrayList;

/**
 * Represents the promotion set item to be added into menu A promotion set
 * contains many alacarte item.
 * 
 * @author arron tay & kwang wee
 * @version 1.0
 * @since 2021-11-12
 */

public class Menu implements CustPrintable, Serializable {

	/**
	 * List containning the alacarte menu items
	 */
	private ArrayList<AlaCarteItem> alaCarteList;
	/**
	 * List containning the set menu items
	 */
	private ArrayList<SetItem> setMenuList;

	public Menu() {

	}

	/**
	 * Gets the Alacartelist
	 * 
	 * @param alaCarteList get alacarte object list
	 */

	public ArrayList<AlaCarteItem> getAlaCarteList() {
		return this.alaCarteList;
	}

	/**
	 * set the alacartelist
	 * 
	 * @param alaCarteList get alacarte object list
	 */
	public void setAlaCarteList(ArrayList<AlaCarteItem> alaCarteList) {
		this.alaCarteList = alaCarteList;
	}

	public ArrayList<SetItem> getSetMenuList() {
		return this.setMenuList;
	}

	/**
	 * Set the setMenuList
	 * 
	 * @param setMenuList set the set object list
	 */
	public void setSetMenuList(ArrayList<SetItem> setMenuList) {
		this.setMenuList = setMenuList;
	}

	/**
	 * Update the alaracate Name by putting FoodID
	 * 
	 * @param foodID foodID of the alacarte item
	 * @param name alacarte food name 
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
	 * Update alacarte item price by using its foodID and price input
	 * 
	 * @param foodID foodID of the alacarte item
	 * @param price  alacarte food name 
	 */
	public void update_alaCartePrice(int foodID, double price) {
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
	 * Update the alacarte item description by using its foodID
	 * 
	 * @param foodID alacarte food ID
	 * @param description alacarte food description
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
	 * Update the alacarte item name by using its foodID
	 * 
	 * @param setID set item ID
	 * @param name set item name
	 */
	public void update_setMenuName(int setID, String name) {
		// TODO - implement Menu.update_setMenuName
		boolean search = false;

		for (int i = 0; i < setMenuList.size(); i++) {
			if (setMenuList.get(i).getSetID() == setID) {
				setMenuList.get(i).setName(name);
				search = true;
			}
		}
		if (search) {
			System.out.println("Successfully updated set name for SetID: " + setID);
		} else {
			System.out.println("No such SetID to be Updated.");
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Update the set item price by using its setID
	 * 
	 * @param setID set item ID
	 * @param price set item price
	 */
	public void update_setMenuPrice(int setID, double price) {
		// TODO - implement Menu.update_setMenuPrice
		boolean search = false;
		for (int i = 0; i < setMenuList.size(); i++) {
			if (setMenuList.get(i).getSetID() == setID) {
				setMenuList.get(i).setPrice(price);
				search = true;
			}
		}
		if (search) {
			System.out.println("Successfully updated price for SetID: " + setID);
		} else {
			System.out.println("No such SetID to be Updated.");
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Update the set item description by using its SetID
	 * 
	 * @param setID set item ID
	 * @param description set item description
	 */
	public void update_setMenuDescription(int setID, String description) {
		// TODO - implement Menu.update_setMenuDescription
		boolean search = false;
		for (int i = 0; i < setMenuList.size(); i++) {
			if (setMenuList.get(i).getSetID() == setID) {
				setMenuList.get(i).setDescription(description);
				search = true;
			}
		}
		if (search) {
			System.out.println("Successfully updated description for SetID: " + setID);
		} else {
			System.out.println("No such SetID to be Updated.");
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * remove the alacarte item from set item
	 * 
	 * @param foodID foodID to remove the alacarte object from the alacarte object list
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
	 * Remove the whole setID from the setMenulist
	 * 
	 * @param setID set item ID to remove the set item object from the set item object list
	 */
	public void removeMenuItem(int setID) {
		// TODO - implement Menu.removeMenuItem
		boolean search = false;
		for (int i = 0; i < setMenuList.size(); i++) {
			if (setMenuList.get(i).getSetID() == setID) {
				setMenuList.get(i).setAvailability(false);
				search = true;
			}
		}
		if (search) {
			System.out.println("Successfully remove SetID : " + setID + "from the Menu.");
		} else {
			System.out.println("No such SetID found to be removed.");
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Add alacarte item into the alacarte list
	 * 
	 * @param item alacarte item to be added in the alacarte list
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
	 * Add set item into setmenu list
	 * 
	 * @param item set item to be added inside the set item list (set menu list)
	 */
	public void addSetMenuItem(SetItem item) {
		// TODO - implement Menu.addSetMenuItem
		boolean search = false;
		for (int i = 0; i < setMenuList.size(); i++) {
			if (setMenuList.get(i).getSetID() == item.getSetID()) {
				System.out.println("Duplicated Set item is found inside set menu");
				search = true;
			}
		}
		if (!search) {
			setMenuList.add(item);
		}
		throw new UnsupportedOperationException();
	}

	public void printer() {
		// TODO -print all alacarte item and set item in one menu
		System.out.println("Set Menu:");
		System.out.println("===========================================================================");
		for (int i = 0; i < setMenuList.size(); i++) {
			if (setMenuList.get(i).getAvailability()) {
				System.out.println(setMenuList.get(i).getSetID() + ") Name: " + setMenuList.get(i).getName());
				System.out.println("Price: $" + setMenuList.get(i).getPrice());
				System.out.println("Description: " + setMenuList.get(i).getDescription());
				System.out.print("Contains: ");
				for (int j = 0; j < setMenuList.get(i).getAlaCarteMenuList().size(); j++) {
					System.out.print(setMenuList.get(i).getAlaCarteMenuList().get(j).getName() + " , ");
				}
				System.out.println("");
				System.out.println("============================================================================");
			}
		}

		System.out.println("\n\nAlacarte Menu:");
		System.out.println("===========================================================================");
		for (int i = 0; i < alaCarteList.size(); i++) {
			if (alaCarteList.get(i).getAvailability()) {

				System.out.println(alaCarteList.get(i).getFoodID() + ") Name: " + alaCarteList.get(i).getName());
				System.out.println("Price: $" + alaCarteList.get(i).getPrice());
				System.out.println("Description: " + alaCarteList.get(i).getDescription());
				System.out.println("===========================================================================");
			}
		}
	}

}