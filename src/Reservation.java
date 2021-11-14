import java.io.Serializable;
import java.time.Instant;

/**
 * Represents each individual reservation
 * @author Ang Ray Sean
 * @version 1.0
 * @since 2021-11-12
 */
public class Reservation implements Serializable {

	/**
	 * Contains the date and time of reservation
	 */
	private Instant date;

	/**
	 * Contains num of people dining in
	 */
	private int pax;

	/**
	 * Phone number of person making reservation (for identification)
	 */
	private int phoneNum;

	/**
	 * Assigned table to the reservation
	 */
	private int tableNum;
	//parameter to count how long late and if need be can cancel their reservation
	//private Instant

	/**
	 * Creates new reservation using date, num people(pax), phone number
	 * 
	 * @param date and time of for reservation
	 * @param pax number of pax in reservation
	 * @param phoneNum to verify the reservation
	 */
	public Reservation(Instant date, int pax, int phoneNum) {
		this.date = date;
		this.pax = pax;
		this.phoneNum = phoneNum;
	}
	/**
	 * Returns the table number tagged to reservation
	 * @return tableNum tied to this reservation
	 */
	public int getTableNum() {
		return this.tableNum;
	}

	/**
	 * Sets the table number for the reservation
	 * @param tableNum to override tableNum created during construction
	 */
	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}
	/**
	 * Returns the phone number tagged to this reservation
	 * @return phone number for this order
	 */
	public int getPhoneNum() {
		return this.phoneNum;
	}
	/**
	 * Returns the date tagged to this reservation
	 * @return date of this order
	 */
	public Instant getDate() {
		return this.date;
	}
	/**
	 * Returns the number of people dining in for this reservation
	 * @return number of pax in this reservation
	 */
	public int getPax() {
		return this.pax;
	}

	/**
	 * Checks if reservation has been made in advance.
	 * We only allow people who call at least 1 hour in advance to book.
	 * Uses the time Instant passed in as well as the object's date
	 * to find difference
	 * @param time current instant of time
	 * @return false if not in advance, true if in advance
	 */
	public boolean checkIfInAdvance(Instant time) {
		if (Math.abs(time.getEpochSecond() - date.getEpochSecond()) < 3600) {
			return false;
		}
		else{
			return true;
		}
	}

	/**
	 * Checks whether or not reservation has been expired.
	 * Once reservation is 15 minutes older from reservation date
	 * remove from the reservation list.
	 * Uses difference in time Instant passed in and object's date
	 * @param time to compare against reservation
	 * @return true if reservation is expired, false if not
	 */
	public boolean isExpired(Instant time) {
		if (time.getEpochSecond() - date.getEpochSecond() > 900) {
			return true;
		}
		return false;
	}

}