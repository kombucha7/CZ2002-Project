import java.io.Serializable;

public class Table implements Serializable {

	private int tableID;
	private int numSeat;
	private boolean tableOccupied;

	/**
	 *
	 * @param tableID
	 * @param numSeat
	 */
	public Table(int tableID, int numSeat) {
		this.tableID = tableID;
		this.numSeat = numSeat;
		this.tableOccupied = false;
	}

	public int getNumSeat() {
		return this.numSeat;
	}

	public int getTableID() {
		return this.tableID;
	}

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


}