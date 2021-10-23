import java.util.ArrayList;

public class SetMenu {

	private String name;
	private float price;
	private int setID; // sorry i added this -Elliot
	private ArrayList<alaCarteMenu> alaCarteMenuList;

	/**
	 * 
	 * @param AlaCarteMenu
	 * @param name
	 * @param price
	 */
	public void setMenu(int[] AlaCarteMenu, String name, float price) {
		// TODO - implement SetMenu.setMenu
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getSetID() {				// added setID setter
		return this.setID;
	}

	/**
	 * 
	 * @param name
	 */
	public void setSetID(int setID) {		// added setID gettter
		this.setID = setID;
	}

	public float getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	public ArrayList<alaCarteMenu> getAlaCarteMenuList() {
		return this.alaCarteMenuList;
	}

	/**
	 * 
	 * @param alaCarteMenuList
	 */
	public void setAlaCarteMenuList(ArrayList<alaCarteMenu> alaCarteMenuList) {
		this.alaCarteMenuList = alaCarteMenuList;
	}

}