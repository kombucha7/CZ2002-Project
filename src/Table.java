public class Table {

	private int tableID;
	private int numSeat;
	private boolean tableOccupied;
	private boolean reservationOccupied;

	/**
	 * 
	 * @param tableID
	 * @param numSeat
	 * @param tableOccupied
	 * @param reservationOccupied
	 */
	public Table(int tableID, int numSeat, boolean tableOccupied, boolean reservationOccupied) {
		// TODO - implement Table.Table
		throw new UnsupportedOperationException();
	}

	// test
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