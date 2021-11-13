import java.io.Serializable;

public class AlaCarteItem implements Serializable {

	/**
	 * Ala Carte Item Name
	 * 
	 */
	private String name;
	/**
	 * Price of each Ala Carte Item
	 */
	private double price;
	/**
	 * Description of the Ala Carte Item
	 */
	private String description;
	/**
	 * Ala Carte Item Food Type which consist of (Mains, Appetizer, Drinks,
	 * Desserts)
	 */
	private foodType foodType;
	/**
	 * Food ID of the Ala Carte Item
	 */
	private int foodID;
	/**
	 * Availability of the Food. Removed Items will be set to FALSE
	 */
	private boolean availability;

	/**
	 * Empty Constructor Class for AlaCarteItem
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

	/**
	 * Constructor Class for AlaCarteItem, with parameters of Name, Price,
	 * Description, foodType and foodID
	 * 
	 * @param name
	 * @param price
	 * @param description
	 * @param foodtype
	 * @param foodID
	 * @param availability
	 */
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
	 * Get Name of Ala Carte Item
	 * 
	 * @param name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set Name of Ala Carte Item
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get Price of Ala Carte Item
	 * 
	 * @param price
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Set Price of Ala Carte Item
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Get Description of Ala Carte Item
	 * 
	 * @param description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Set Description of Ala Carte Item
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get foodType of Ala Carte Item
	 * 
	 * @param foodType
	 */
	public foodType getFoodType() {
		return this.foodType;
	}

	/**
	 * Set foodType of Ala Carte Item
	 * 
	 * @param foodType
	 */
	public void setFoodType(foodType foodType) {
		this.foodType = foodType;
	}

	/**
	 * Get FoodID for Ala Carte Item
	 * 
	 * @param foodID
	 */

	public int getFoodID() {
		return this.foodID;
	}

	/**
	 * Set FoodID for Ala Carte Item
	 * 
	 * @param foodID
	 */
	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}

	/**
	 * Get Availability of Ala Carte Item
	 * 
	 * @param availability
	 */
	public boolean getAvailability() {
		return this.availability;
	}

	/**
	 * Set Availability of Ala Carte Item
	 * 
	 * @param availability
	 */
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

}