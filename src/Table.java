public class Table {

	private int tableID;
	private int numSeat;
	private booelean tableOccupied;
	private boolean reservationOccupied;

	/**
	 * 
	 * @param tableID
	 * @param numSeat
	 */
	public Table(int tableID, int numSeat) {
		// TODO - implement Table.Table
		throw new UnsupportedOperationException();
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

	public void occupy() {
		// TODO - implement Table.occupy
		throw new UnsupportedOperationException();
	}

	public void empty() {
		// TODO - implement Table.empty
		throw new UnsupportedOperationException();
	}

	public boolean isOccupied() {
		// TODO - implement Table.isOccupied
		throw new UnsupportedOperationException();
	}

}