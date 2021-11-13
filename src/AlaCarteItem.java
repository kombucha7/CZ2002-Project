import java.io.Serializable;

public class AlaCarteItem implements Serializable {

	private String name;
	private double price;
	private String description;
	private foodType foodType;
	private int foodID;
	private boolean availability;

	/**
	 * Constructor Class for AlaCarteItem
	 * 
	 * @param name
	 * @param price
	 * @param description
	 * @param foodtype
	 * @param foodID
	 * @param availability
	 */
	public AlaCarteItem() {
	}

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

	/**
	 * Get Name of Food
	 * 
	 * @param name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set Name of Food
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get Price of Food
	 * 
	 * @param price
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Set Price of Food
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Get Description of Food
	 * 
	 * @param description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Set Description of Food
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get foodType of Food
	 * 
	 * @param foodType
	 */
	public foodType getFoodType() {
		return this.foodType;
	}

	/**
	 * Set foodType of Food
	 * 
	 * @param foodType
	 */
	public void setFoodType(foodType foodType) {
		this.foodType = foodType;
	}

	/**
	 * get FoodID for Food
	 * 
	 * @param foodID
	 */

	public int getFoodID() {
		return this.foodID;
	}

	/**
	 * Set FoodID for Food
	 * 
	 * @param foodID
	 */
	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}

	/**
	 * Get Availability of Food
	 * 
	 * @param availability
	 */
	public boolean getAvailability() {
		return this.availability;
	}

	/**
	 * Set Availability of Food
	 * 
	 * @param availability
	 */
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

}