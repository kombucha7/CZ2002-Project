import java.time.Clock;

public class Restaurant {

	private int restaurantID;
	private String location;
	private int currentPax;
	private Clock timehandler; 


	public int getRestaurantID() {
		return this.restaurantID;
	}

	/**
	 * 
	 * @param restaurantID
	 */
	public void setRestaurantID(int restaurantID) {
		this.restaurantID = restaurantID;
	}

	public String getLocation() {
		return this.location;
	}

	/**
	 * 
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * 
	 * @param order
	 */
	public void getInvoice(Order order) {
		// TODO - implement Restaurant.getInvoice
		throw new UnsupportedOperationException();
	}

	public boolean isMax() {
		// TODO - implement Restaurant.isMax
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param currentPax
	 */
	public int remainingCap(int currentPax) {
		// TODO - implement Restaurant.remainingCap
		throw new UnsupportedOperationException();
	}

}