public class SetMenu {

	private String name;
	private float price;
	private ArrayList<alaCarteMenu> alaCarteMenuList;

	/**
	 * 
	 * @param AlaCarteMenu
	 * @param name
	 * @param price
	 */
	public void setMenu(int[] AlaCarteMenu, string name, float price) {
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