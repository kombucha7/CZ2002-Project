public class SetMenu {

	private ArrayList<SetMenu> setMenuList;
	private String name;
	private float price;

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

}