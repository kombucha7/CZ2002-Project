import java.io.Serializable;
import java.util.ArrayList;

/**
 * 	Represents the list of tables in the restaurant
 * @author Ong Xin Rui Celestine
 * @version 1.0
 * @since 2021-11-12
 */

public class TableList implements ListPrinter, Serializable {

	/**
	 * Arraylist of tables in restaurant
	 */
	private ArrayList<Table> tableList;

	/**
	 * Creates a list of 15 tables
	 * We assume that the number of tables is fixed
	 */
	public TableList() {
		tableList = new ArrayList<>();
	}

	/**
	 * Prints out the list of occupied and unoccupied tables
	 */
	public void printList() {
		System.out.println("List of tables: ");
		for (int i=0; i<tableList.size(); i++) {
			if (tableList.get(i).isOccupied())
				System.out.println("Table " + (i+1) + " is occupied.");
			else
				System.out.println("Table " + (i+1) + " is not occupied.");
		}
	}

	/**
	 * gives us the total number of empty tables
	 * @return number of empty tables
	 */
	public int getEmpty() {
		int count=0;
		for (int i=0; i<tableList.size(); i++) {
			if (!tableList.get(i).isOccupied()) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Returns the tables that can accommodate the given pax that are not occupied at the current time instant
	 * If full or if there is no available table with the required seating, array is full of -1
	 * @param pax Number of people to be seated
	 * @return array of tables that are not occupied
	 */
	public int[] matchCurrentTable(int pax) {
		int[] availableTables = new int[tableList.size()];
		int numAvailable = 0;

		for (int i=0; i<tableList.size(); i++) {
			availableTables[i] = -1;
		}

		for (int i=0; i<tableList.size(); i++) {
			if (!tableList.get(i).isOccupied() && tableList.get(i).getNumSeat() >= pax) {
				availableTables[numAvailable] = i;
				numAvailable++;
			}
		}
		return availableTables;
	}

	/**
	 * Returns the tables that can accommodate the given pax that are not occupied at a future time instant
	 * Used for reservations in the future
	 * If full or if there is no available table with the required seating, array is full of -1
	 * @param pax Number of people to be seated
	 * @return array of tables that are not occupied
	 */
	public int[] matchUpcomingTable(int pax) {
		int[] availableTables = new int[tableList.size()];
		int numAvailable = 0;

		for (int i=0; i<tableList.size(); i++) {
			availableTables[i] = -1;
		}

		for (int i=0; i<tableList.size(); i++) {
			if (tableList.get(i).getNumSeat() >= pax) {
				availableTables[numAvailable] = i;
				numAvailable++;
			}
		}
		return availableTables;
	}

	/**
	 * Indicate that a table is now occupied by a group
	 * @param tableID of table to be marked as occupied
	 */
	public void occupyTable(int tableID) {
		tableList.get(tableID).occupy();
	}

	/**
	 * Indicate that a table is now unoccupied by a group
	 * @param tableID of table to be emptied
	 */
	public void emptyTable(int tableID) {
		tableList.get(tableID).empty();
	}

}