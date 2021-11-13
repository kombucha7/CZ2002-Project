import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;

/**
 * List class that stores reservation objects and provides functions to manage
 * said objects
 */
public class ReservationList implements Serializable {

	/**
	 * Reservation ArrayList to store reservation objects
	 */
	private ArrayList<Reservation> reservationList = new ArrayList<Reservation>();

	/**
	 * Constructor for ReservationList object
	 */
	public ReservationList() {
	}

	/**
	 * Function to add a reservation object to the arraylist reservation object is
	 * created externally and passed in
	 * 
	 * @param reservation object to be added
	 */
	public void createReservation(Reservation reservation) {
		reservationList.add(reservation);
	} // creation of reservation

	/**
	 * remove reservation from reservationlist if the current time is a specified
	 * period of time later than the time in the reservation object the current time
	 * is passed in via an Instant object created in the restaurant class via the
	 * TimeHandler Object the arraylist is parsed and isExpired function is called
	 * for each object with the Instant of the current time passed into it
	 * 
	 * @param time Instant of the current time
	 */
	public void removeExpired(Instant time) { // if they miss their reservation for more than a specified
												// duration(currently set to 1 hour)
		for (int i = 0; i < reservationList.size(); i++) {
			if (reservationList.get(i).isExpired(time)) {
				reservationList.remove(i);
				i--;
			}
		}
	}

	/**
	 * function to check if the currently available tables have to be reserved for
	 * reservations where the guests have not been seated this will parse through
	 * the reservation list to check which reservations are currently "active" even
	 * if the guests are late/not arrived if all tables are currently occupied by
	 * actual guests and/or guest who have reservation but have yet to arrive,
	 * walk-in customers will not be able to be seated
	 * 
	 * @param tableArray array of tableIDs of available tables
	 * @param time       instant of current time
	 * @return returns the first table which is available for walk in seating
	 */
	public int checkCurrentReserved(int[] tableArray, Instant time) {
		// For people who are walking in and want to find a seat. Have to check if
		// current tables are reserved.
		int i = 0, counter = 0, foundTable = -1;
		if (reservationList.size() == 0) {
			foundTable = tableArray[0];
		} else {
			while (tableArray[i] != -1) {
				for (int j = 0; j < reservationList.size(); j++) {
					if (tableArray[i] == reservationList.get(j).getTableNum()) {
						if (reservationList.get(j).getDate().getEpochSecond() - time.now().getEpochSecond() > 3600) {
							counter = 1;
						}
					}
				}
				if (counter == 1) {
					counter = 0;
				} else {
					foundTable = tableArray[i];
					break;
				}
				i++;
			}
		}
		if (foundTable > -1) {
			return foundTable;
		} else {
			return -1;
		}
	}

	// For people who want to reserve, need to check if it clashes
	public void checkUpcomingReserved(int[] tableArray, Reservation newReserve) {
		int i = 0, counter = 0, foundTable = -1;
		if (reservationList.size() == 0) {
			foundTable = tableArray[0];
		} else {
			while (i < tableArray.length) {
				for (int j = 0; j < reservationList.size(); j++) {
					if (tableArray[i] == reservationList.get(j).getTableNum()) {
						if (Math.abs(reservationList.get(j).getDate().getEpochSecond()
								- newReserve.getDate().getEpochSecond()) < 3600) {
							counter = 1;
						}
					}
				}
				if (counter == 1) {
					counter = 0;
				} else {
					foundTable = tableArray[i];
					break;
				}
				i++;
			}
		}
		if (foundTable > -1) {
			newReserve.setTableNum(foundTable);
			createReservation(newReserve);
			return;
		} else {
			System.out.println("Reservation list is full");
		}
	}

	public void removeReservation(int phoneNum) {
		for (int i = 0; i < reservationList.size(); i++) {
			if (reservationList.get(i).getPhoneNum() == phoneNum) {
				reservationList.remove(i);
				System.out.println("Reservation removed");
				return;
			}
		}

		System.out.println("Reservation not found");
	}

	public void checkReservation(int phoneNum) {
		for (int i = 0; i < reservationList.size(); i++) {
			if (reservationList.get(i).getPhoneNum() == phoneNum) {
				System.out.println("Reservation Found: " + reservationList.get(i).getDate());
				return;
			}
		}

		System.out.println("Not found");
		return;
	}

	public void printReservation() {
		System.out.println("###################################################");
		System.out.println("Phone Number\t\t   Date\t\t\t   Pax\t  Table");
		for (int i = 0; i < reservationList.size(); i++) {
			System.out.printf("%10d%25s%6d%8d", reservationList.get(i).getPhoneNum(), reservationList.get(i).getDate(),
					reservationList.get(i).getPax(), reservationList.get(i).getTableNum());
			System.out.println("");
		}
		System.out.println("###################################################");
	}
}