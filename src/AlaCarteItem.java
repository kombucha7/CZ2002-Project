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
<<<<<<< HEAD
	public AlaCarteItem(String name, float price, String description, foodType foodtype, int foodID,
			boolean availability) {
=======
	public AlaCarteItem(String name, float price, String description, foodType foodtype, int foodID, boolean availability) {
>>>>>>> 54964d2203f8866ff0a1458d434eb7cea15f1175
		// TODO - implement AlaCarteItem.AlaCarteItem
		this.name = name;
		this.price = price;
		this.description = description;
		this.foodType = foodtype;
		this.foodID = foodID;
		this.availability = availability;
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