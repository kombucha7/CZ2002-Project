public class AlaCarteItem {

	private String name;
	private float price;
	private String description;
	private foodType foodType;
	private int foodID;
	private boolean availability;

	/**
	 * 
	 * @param name
	 * @param price
	 * @param description
	 * @param foodtype
	 * @param foodID
	 * @param availability
	 */
	public AlaCarteItem(String name, float price, String description, foodType foodtype, int foodID,
			boolean availability) {
		// TODO - implement AlaCarteItem.AlaCarteItem
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

	public boolean getAvailability() {
		return this.availability;
	}

	/**
	 * 
	 * @param availability
	 */
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

}