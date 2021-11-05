public class AlaCarteItem {

	private String name;
	private double price;
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
	public AlaCarteItem() { }

	public AlaCarteItem(String name, double price, String description, foodType foodtype, int foodID,
			boolean availability) {
		// TODO - implement AlaCarteItem.AlaCarteItem
		this.name = name;
		this.price = price;
		this.description = description;
		this.foodType = foodtype;
		this.foodID = foodID;
		this.availability = availability;
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

	public double getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
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