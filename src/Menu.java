import java.util.ArrayList;

public class Menu implements CustPrintable {

	private ArrayList<AlaCarteItem> alaCarteList;
	private ArrayList<SetItem> setMenuList;

	public Menu() {
		// TODO - implement Menu.Menu
		throw new UnsupportedOperationException();
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
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param foodID
	 * @param price
	 */
	public void update_alaCartePrice(int foodID, float price) {
		// TODO - implement Menu.update_alaCartePrice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param foodID
	 * @param description
	 */
	public void update_alaCarteDescription(int foodID, String description) {
		// TODO - implement Menu.update_alaCarteDescription
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param setID
	 * @param name
	 */
	public void update_setMenuName(int setID, String name) {
		// TODO - implement Menu.update_setMenuName
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param setID
	 * @param price
	 */
	public void update_setMenuPrice(int setID, float price) {
		// TODO - implement Menu.update_setMenuPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param setID
	 * @param description
	 */
	public void update_setMenuDescription(int setID, String description) {
		// TODO - implement Menu.update_setMenuDescription
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param foodID
	 */
	public void removeAlaCarteItem(int foodID) {
		// TODO - implement Menu.removeAlaCarteItem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param setID
	 */
	public void removeMenuItem(int setID) {
		// TODO - implement Menu.removeMenuItem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param item
	 */
	public void addAlaCarteItem(AlaCarteItem item) {
		// TODO - implement Menu.addAlaCarteItem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param item
	 */
	public void addSetMenuItem(SetItem item) {
		// TODO - implement Menu.addSetMenuItem
		throw new UnsupportedOperationException();
	}

	public void printer() {
		// TODO - implement Menu.printer
		throw new UnsupportedOperationException();
	}

}