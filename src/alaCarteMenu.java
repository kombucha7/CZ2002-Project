public class alaCarteMenu {

	private String name;
	private float price;
	private String description;
	private foodType foodType;
	private int foodID;

	/**
	 * 
	 * @param name
	 * @param price
	 * @param description
	 * @param foodtype
	 * @param foodID
	 */
	public alaCarteMenu(String name, float price, string description, foodType foodtype, int foodID) {
		// TODO - implement alaCarteMenu.alaCarteMenu
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

	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public foodType getFoodType() {
		return this.foodType;
	}

	/**
	 * 
	 * @param foodType
	 */
	public void setFoodType(foodType foodType) {
		this.foodType = foodType;
	}

	public int getFoodID() {
		return this.foodID;
	}

	/**
	 * 
	 * @param foodID
	 */
	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}

}