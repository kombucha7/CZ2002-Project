import java.io.Serializable;

/**
 * 	Represents an individual table in the restaurant
 * @author Ong Xin Rui Celestine
 * @version 1.0
 * @since 2021-11-12
 */

public class Table implements Serializable {

	/**
	 * Index of a table
	 */
	private int tableID;

	/**
	 * Number of seats of the table
	 */
	private int numSeat;

	/**
	 * Indicate if a table is occupied or not
	 */
	private boolean tableOccupied;

	/**
	 * Creates a new table with the given index and number of seats
	 * @param tableID of table to be constructed
	 * @param numSeat of table to be constructed
	 */
	public Table(int tableID, int numSeat) {
		this.tableID = tableID;
		this.numSeat = numSeat;
		this.tableOccupied = false;
	}

	/**
	 * Gets the number of seats of the table
	 * @return this Table's number of seats
	 */
	public int getNumSeat() {
		return this.numSeat;
	}

	/**
	 * Gets the index of the table
	 * @return this Table's index
	 */
	public int getTableID() {
		return this.tableID;
	}

	/**
	 * Indicate that a table is now occupied
	 */
	public void occupy() {
		tableOccupied = true;
	}

	/**
	 * Indicate that a table is now empty
	 */
	public void empty() {
		tableOccupied = false;
	}

	/**
	 * To check if a table is occupied
	 * @return this Table's occupancy 
	 */
	public boolean isOccupied() {
		return tableOccupied;
	}


}