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
	 * Ala Carte Item Food Type which consist of (Mains, Appetizer, Drinks, Dessert)
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
	 */
	public AlaCarteItem() {
	}

	/**
	 * Constructor Class for AlaCarteItem
	 * 
	 * @param name         Name of the Ala Carte Item
	 * @param price        Price of the Ala Carte Item
	 * @param description  Description of Ala Carte Item
	 * @param foodtype     FoodType(Main, Appetizer, Drinks, Dessert) of Ala Carte
	 *                     Item
	 * @param foodID       FoodID of Ala Carte Item
	 * @param availability Availability of Ala Carte Item
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
	 * @return Return the current name of Ala Carte Item
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name Set Name of Ala Carte Item
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get Price of Ala Carte Item
	 * 
	 * @return Return the price of Ala Carte Item
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * @param price Set Price of Ala Carte Item
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Get Description of Ala Carte Item
	 * 
	 * @return Return Description of Ala Carte Item
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param description Set Description of Ala Carte Item
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get foodType of Ala Carte Item
	 * 
	 * @return Return foodType of Ala Carte Item
	 */
	public foodType getFoodType() {
		return this.foodType;
	}

	/**
	 * @param foodType Set foodType of Ala Carte Item
	 */
	public void setFoodType(foodType foodType) {
		this.foodType = foodType;
	}

	/**
	 * Get FoodID for Ala Carte Item
	 * 
	 * @return Return FoodID of Ala Carte Item
	 */

	public int getFoodID() {
		return this.foodID;
	}

	/**
	 * @param foodID Set FoodID for Ala Carte Item
	 */
	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}

	/**
	 * Get Availability of Ala Carte Item
	 * 
	 * @return Return Availability of Ala Carte Item
	 */
	public boolean getAvailability() {
		return this.availability;
	}

	/**
	 * @param availability Set Availability of Ala Carte Item
	 */
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

}