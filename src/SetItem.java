import java.io.Serializable;
import java.util.ArrayList;
/**
 * 	Represents the promotion set item to be added into menu
 * 	A promotion set contains many alacarte item.
 * @author arron tay
 * @version 1.0
 * @since 2021-11-12
 */
public class SetItem implements Serializable {

	/** 
	 * promotion Set Name assign to each set item created
	 */
	private String name;
	/** 
	 * Promotion set price assign to each set item created
	 */
	private double price;
	/** 
	 * promotion set price assign to each set item created
	 */
	private ArrayList<AlaCarteItem> alaCarteMenuList  ;
	/**
	 * promotion Set ID unique to each set item created
	 */
	private int setID;
	/** 
	 * Promotion set description stored for each set item
	 */
	private String description;
	/** 
	 * Promotion set availability for each set item
	 */
	private boolean availability;
	
	/**
	 * constructor for setItem which takes in parameters 
	 * @param setID  promotion Set ID unique to each set item created
	 * 
	 * @param name promotion Set Name assign to each set item created
	 * 
	 * @param price promotion set price assign to each set item created
	 * 
	 * @param description Promotion set description stored for each set item
	 * 
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
	 * @param alacarteID Alacarte object added into the Alacarte menulist for each set
	 */
	public void addItem(AlaCarteItem alacarteID) {
		alaCarteMenuList.add(alacarteID);
	}

	/**
	 * Delete alacarte item from the alaCarteMenuList list
	 * @param alacarteID Alacarte object deleted from the Alacarte menulist for each set
	 */
	public void deleteItem(AlaCarteItem alacarteID) {
		alaCarteMenuList.remove(alacarteID);
		
	}
	/**
	 * Get the Promotion set name for each set
	 * @param name gets the set name for the set
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the Promotion set name for each set
	 * @param name set name to be set item
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Get the Promotion set price for each set
	 * @param price set price return by the getprice function
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Set the promotion set price for each set
	 * @param price set price for the set item
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * get the alacarte menu list for each set ID
	 * @param alaCarteMenuList get alacarte object list
	 */
	public ArrayList<AlaCarteItem> getAlaCarteMenuList() {
		return this.alaCarteMenuList;
	}

	/**
	 * Set the alacarte menu list for each set ID
	 * @param alaCarteMenuList set alacarte object list
	 */
	public void setAlaCarteMenuList(ArrayList<AlaCarteItem> alaCarteMenuList) {
		this.alaCarteMenuList = alaCarteMenuList;
	}
	/**
	 * get the SetID of the set item
	 * @param setID get setID 
	 */
	public int getSetID() {
		return this.setID;
	}

	/**
	 * set the SetID of the set item
	 * @param setID setID to be set
	 */
	public void setSetID(int setID) {
		this.setID = setID;
	}
	/**
	 *  get description of the set created
	 * @param description get set description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 *  set description of the set created
	 * @param description set description to be set 
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * get availability to shows whether this setID is available in the menu
	 * @param availability get availability boolean for set item
	 */

	public boolean getAvailability() {
		return this.availability;
	}

	/**
	 * set availability to shows whether this setID is available in the menu
	 * @param availability set availability boolean for set item
	 */
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

}