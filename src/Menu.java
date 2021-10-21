import java.util.ArrayList;

public class Menu {

	private ArrayList<alaCarteMenu> alaCarteList;
	private ArrayList<SetMenu> setMenuList;

	public Menu() {
		// TODO - implement Menu.Menu
		throw new UnsupportedOperationException();
	}

	public ArrayList<alaCarteMenu> getAlaCarteList() {
		return this.alaCarteList;
	}

	/**
	 * 
	 * @param alaCarteList
	 */
	public void setAlaCarteList(ArrayList<alaCarteMenu> alaCarteList) {
		this.alaCarteList = alaCarteList;
	}

	public ArrayList<SetMenu> getSetMenuList() {
		return this.setMenuList;
	}

	/**
	 * 
	 * @param setMenuList
	 */
	public void setSetMenuList(ArrayList<SetMenu> setMenuList) {
		this.setMenuList = setMenuList;
	}

	/**
	 * 
	 * @param name
	 * @param price
	 * @param description
	 * @param foodType
	 * @param foodID
	 */
	public void add_alaCarteMenu(String name, float price, String description, foodType foodType, int foodID) {
		// TODO - implement Menu.add_alaCarteMenu
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 * @param price
	 */
	public boolean createSetMenu(String name, float price) {
		// TODO - implement Menu.createSetMenu
		throw new UnsupportedOperationException();
	}

}