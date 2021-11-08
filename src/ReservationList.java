import javax.swing.*;
import java.time.Instant;
import java.util.ArrayList;


public class ReservationList {

	private ArrayList<Reservation> reservationList = new ArrayList<Reservation>();

	public ReservationList() {

	}

	public void createReservation(Reservation reservation) {
		reservationList.add(reservation);
	}

	public void removeExpired(Instant time) {		//if they miss their reservation for more than 1 hr
		for (int i = 0; i < reservationList.size(); i++) {
			if (reservationList.get(i).isExpired(time)){
				reservationList.remove(i);
				i--;
			}
		}
	}

	public int checkCurrentReserved(int[] tableArray, Instant time) {
		int i = 0, counter = 0, foundTable = -1;
		//debug for (i = 0; i < tableArray.length; i++) {System.out.println(tableArray[i]);}
		if (reservationList.isEmpty()) {
			foundTable = tableArray[0];
		}
		while (tableArray[i] != -1) {		// only returns if there is a reservation found at that table
			for (int j = 0; j < reservationList.size(); j++) {
				if (tableArray[i] == reservationList.get(j).getTableNum()){
					if(reservationList.get(j).getDate().getEpochSecond() - time.getEpochSecond() < 3600){	//if less than an hour
						counter = 1;
					}
				}
			}
			if (counter == 1) {counter = 0;}
			else{foundTable = tableArray[i];break;}
			i++;
		}
		if (foundTable >-1) {
			return foundTable;
		}
		else{
			System.out.println("No available table at the moment");
			return foundTable;
		}
	}

	public void checkUpcomingReserved(int[] tableArray, Reservation newReserve) {
		int i = 0, counter = 0, foundTable = -1;
		if (reservationList.size() == 0) {
			foundTable = tableArray[0];
		}
		else {
			while (i < tableArray.length) {
				for (int j = 0; j < reservationList.size(); j++) {
					if (tableArray[i] == reservationList.get(j).getTableNum()) {
						if (Math.abs(reservationList.get(j).getDate().getEpochSecond() - newReserve.getDate().getEpochSecond()) < 3600) {
							counter = 1;
						}
					}
				}
				if (counter == 1) {counter = 0;}
				else {foundTable = tableArray[i];break;}
				i++;
			}
		}
		if (foundTable > -1) {
			newReserve.setTableNum(foundTable);
			createReservation(newReserve);return;
		}
		else{
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
			System.out.printf("%10d%25s%6d%8d",reservationList.get(i).getPhoneNum(),reservationList.get(i).getDate(),reservationList.get(i).getPax(),reservationList.get(i).getTableNum());
			System.out.println("");
		}
		System.out.println("###################################################");
	}
}