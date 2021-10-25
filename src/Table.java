public class Table {

	private int tableID;
	private int numSeat;
	private boolean tableOccupied;
	private boolean reservationOccupied;

	/**
	 * 
	 * @param tableID
	 * @param numSeat
	 //		* @param tableOccupied		//
	 //		* @param reservationOccupied		//
	 */
	// change constructor -- remove tableOccupied and reservationOccupied
	public Table(int tableID, int numSeat) {
		// TODO - implement Table.Table
		this.tableID = tableID;
		this.numSeat = numSeat;
		this.tableOccupied = false;

		//throw new UnsupportedOperationException();
	}

	// add 3 new methods
	// for new customers to occupy table
	public void occupy() {
		tableOccupied = true;
	}

	// when customers are leaving
	public void empty() {
		tableOccupied = false;
	}

	// to see if the table is occupied
	public boolean isOccupied() {
		return tableOccupied;
	}

	public int getTableID() {
		return this.tableID;
	}

	/**
	 * 
	 * @param tableID
	 */
	public void setTableID(int tableID) {
		this.tableID = tableID;
	}

	public int getNumSeat() {
		return this.numSeat;
	}

	/**
	 * 
	 * @param numSeat
	 */
	public void setNumSeat(int numSeat) {
		this.numSeat = numSeat;
	}

	public boolean getTableOccupied() {
		return this.tableOccupied;
	}

	/**
	 * 
	 * @param tableOccupied
	 */
	public void setTableOccupied(boolean tableOccupied) {
		this.tableOccupied = tableOccupied;
	}

	public boolean getReservationOccupied() {
		return this.reservationOccupied;
	}

	/**
	 * 
	 * @param reservationOccupied
	 */
	public void setReservationOccupied(boolean reservationOccupied) {
		this.reservationOccupied = reservationOccupied;
	}

}