/**
 * 	Represents the promotion set item to be added into menu
 * 	A promotion set contains many alacarte item.
 * @author arron tay
 * @version 1.0
 * @since 2021-11-12
 */
import java.util.ArrayList;
public class SetItem {

	private String name;
	private double price;
	private ArrayList<AlaCarteItem> alaCarteMenuList  ;
	private int setID;
	private String description;
	private boolean availability;
	
	/**
	 * promotion Set ID unique to each set item created
	 * @param setID
	 * promotion Set Name assign to each set item created
	 * @param name
	 * promotion set price assign to each set item created
	 * @param price
	 * Promotion set description stored for each set item
	 * @param description
	 */
	public SetItem(int setID, String name, double price, String description) {
		this.setID = setID;
		this.name = name;
		this.price = price;
		this.description = description;
		this.alaCarteMenuList = new ArrayList<AlaCarteItem>();
		this.availability = true;

	}

	/**
	 * Add alacarte item to the alaCarteMenuList list to store the alacarte object assign to each set ID
	 * @param alacarteID
	 */
	public void addItem(AlaCarteItem alacarteID) {
		alaCarteMenuList.add(alacarteID);
	}

	/**
	 * Delete alacarte item from the alaCarteMenuList list
	 * @param alacarteID
	 */
	public void deleteItem(AlaCarteItem alacarteID) {
		alaCarteMenuList.remove(alacarteID);
		
	}
	/**
	 * Get the Promotion set name for each set
	 * @param name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the Promotion set name for each set
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Get the Promotion set price for each set
	 * @param price
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Set the promotion set price for each set
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * get the alacarte menu list for each set ID
	 * @param alaCarteMenuList
	 */
	public ArrayList<AlaCarteItem> getAlaCarteMenuList() {
		return this.alaCarteMenuList;
	}

	/**
	 * Set the alacarte menu list for each set ID
	 * @param alaCarteMenuList
	 */
	public void setAlaCarteMenuList(ArrayList<AlaCarteItem> alaCarteMenuList) {
		this.alaCarteMenuList = alaCarteMenuList;
	}
	/**
	 * get the SetID of the set item
	 * @param setID
	 */
	public int getSetID() {
		return this.setID;
	}

	/**
	 * set the SetID of the set item
	 * @param setID
	 */
	public void setSetID(int setID) {
		this.setID = setID;
	}
	/**
	 *  get description of the set created
	 * @param description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 *  set description of the set created
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * get availability to shows whether this setID is available in the menu
	 * @param availability
	 */

	public boolean getAvailability() {
		return this.availability;
	}

	/**
	 * set availability to shows whether this setID is available in the menu
	 * @param availability
	 */
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

}