import java.util.ArrayList;

public class TableList {

	private ArrayList<Table> tableList;
	private static int totalTables = 15;
	private int tableID;


	public TableList() {
		ArrayList<Table> tableList = new ArrayList<Table>();

		Table table1 = new Table(0, 2);
		tableList.add(table1);
		Table table2 = new Table(1, 2);
		tableList.add(table2);
		Table table3 = new Table(2, 2);
		tableList.add(table3);
		Table table4 = new Table(3, 4);
		tableList.add(table4);
		Table table5 = new Table(4, 4);
		tableList.add(table5);
		Table table6 = new Table(5, 4);
		tableList.add(table6);
		Table table7 = new Table(6, 6);
		tableList.add(table7);
		Table table8 = new Table(7, 6);
		tableList.add(table8);
		Table table9 = new Table(8, 6);
		tableList.add(table9);
		Table table10 = new Table(9, 8);
		tableList.add(table10);
		Table table11 = new Table(10, 8);
		tableList.add(table11);
		Table table12 = new Table(11, 8);
		tableList.add(table12);
		Table table13 = new Table(12, 10);
		tableList.add(table13);
		Table table14 = new Table(13, 10);
		tableList.add(table14);
		Table table15 = new Table(14, 10);
		tableList.add(table15);
	}

	// add 3 new methods
	// show number of empty tables
	public int getEmpty() {
		int count=0;
		for (int i=0; i<totalTables; i++) {
			if (!tableList.get(i).isOccupied()) {
				count++;
			}
		}
		return count;
	}

	public void occupyTable(int tableID) {
		tableList.get(tableID).occupy();
	}

	public void emptyTable(int tableID) {
		tableList.get(tableID).empty();
	}

	public void createTable() {
		// TODO - implement TableList.createTable

		//throw new UnsupportedOperationException();
	}

	public void removeTable() {
		// TODO - implement TableList.removeTable
		throw new UnsupportedOperationException();
	}

	public void printTable() {
		// TODO - implement TableList.printTable

		for (int i=0; i<totalTables; i++) {
			if (tableList.get(i).isOccupied())
				System.out.println("Table " + (i+1) + "is occupied.");
			else
				System.out.println("Table " + (i+1) + "is not occupied.");
		}

		//throw new UnsupportedOperationException();
	}

	// add new method
	public int matchTable(int pax) {
		/*
		int first_half, sec_half;
		if (pax > 10) {
			first_half = 10;
			sec_half = pax - 10;
		} */

		// restaurant is full
		if (getEmpty() == 0)
			return -1;

		for (int i=0; i<totalTables; i++) {
			if (!tableList.get(i).isOccupied() && tableList.get(i).getNumSeat() >= pax) {
				occupyTable(i);
				return tableList.get(i).getTableID();
			}
		}
		// have empty table but not big enough for current group size
		return -2;
	}

}