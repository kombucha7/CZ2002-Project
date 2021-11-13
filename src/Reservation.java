import java.io.Serializable;
import java.time.Instant;

/**
 * 	Represents an individual table in the restaurant
 * @author Ong Xin Rui Celestine
 * @version 1.0
 * @since 2021-11-12
 */

public class Reservation implements Serializable {
	/**
	 * Contains the date & time of reservation
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
	 */
	public Reservation(Instant date, int pax, int phoneNum) {
		this.date = date;
		this.pax = pax;
		this.phoneNum = phoneNum;
	}
	/**
	 * Returns the table number tagged to reservation
	 */
	public int getTableNum() {
		return this.tableNum;
	}
	/**
	 * Sets the table number for the reservation
	 */
	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}
	/**
	 * Returns the phone number tagged to this reservation
	 */
	public int getPhoneNum() {
		return this.phoneNum;
	}
	/**
	 * Returns the date tagged to this reservation
	 */
	public Instant getDate() {
		return this.date;
	}
	/**
	 * Returns the number of people dining in for this reservation
	 */
	public int getPax() {
		return this.pax;
	}

	/**
	 * Checks if reservation has been made in advance
	 * We only allow people who call at least 1 hour in advance to book
	 * @param time
	 * @return
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
	 * Checks whether or not reservation has been expired
	 * Once reservation is 15 minutes older from reservation date
	 * remove from the reservation list
	 * @param time
	 * @return
	 */
	public boolean isExpired(Instant time) {
		if (time.getEpochSecond() - date.getEpochSecond() > 900) {
			return true;
		}
		return false;
	}

}