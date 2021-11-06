import javax.swing.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;
import static java.util.concurrent.TimeUnit.*;
import java.time.temporal.ChronoUnit;

public class ReservationList {

	int customerNum;
	Instant instantTest;

	private ArrayList<Reservation> reservationList = new ArrayList<Reservation>();

	public ReservationList() {

	}

	public void createReservation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("###Creating a new reservation###");
		System.out.println("Enter Date in the format (DDMMYYYY):");	//truncate D/M/Y
		String dateInput = sc.next();
		String day = dateInput.substring(0,2);
		String month = dateInput.substring(0,2);
		String year = dateInput.substring(0,4);

		System.out.println("Enter Time in the format (HHmm):");
		String timeInput = sc.next();
		String hours = timeInput.substring(0,2);
		String minute = timeInput.substring(0,2);

		System.out.println("Enter no. pax");
		int pax = sc.nextInt();


		Instant inst1 = Instant.parse(year + "-" + month + "-" + day +"T" + hours +":" + minute + ":00.00Z");
		Reservation addNew = new Reservation(inst1, pax, customerNum);	//find a way to get the table based on the pax
		reservationList.add(addNew);
	}

	public void removeExpired() {		//if they miss their reservation
		for (int i = 0; i < reservationList.size(); i++) {
			if (reservationList.get(i).isExpired()){
				reservationList.remove(i);
			}
		}
	}

	public int checkUpcomingReserved(int[] tableArray) {
		for (int i = 0; i < tableArray.length; i++){
			for (int j = 0; j < reservationList.size(); j++) {
				if (reservationList.get(j).getTableNum() == tableArray[i]) {
					if (reservationList.get(j).getDate().toEpochMilli() - Instant.now().toEpochMilli() > 3600000){
						return tableArray[i];
					}
				}
			}
		}
		return -1;
	}

	public void removeReservation() {
		//need to implement in the main function?
		//https://docs.oracle.com/javase/6/docs/api/java/util/concurrent/ScheduledExecutorService.html
		/*
		for (int i = 0; i < reservationList.size(); i++) {
			if (current time >= reservationList.get(i).getDate().plus(1, ChronoUnit.HOURS){
				reservationList.remove(i);
			}
		}
		 */
	}

	public void checkReservation(int phoneNum) {
		for (int i = 0; i < reservationList.size(); i++) {
			if (reservationList.get(i).getReservationID() == phoneNum) {
				System.out.println("Reservation Found " + reservationList.get(i).getDate());
				return;
			}
		}

		System.out.println("Not found");
		return;
	}

	public void printReservation() {
		for (int i = 0; i < reservationList.size(); i++) {
			System.out.println(reservationList.get(i).getReservationID() + " " +
					reservationList.get(i).getDate() + " " +
					reservationList.get(i).getPax());
		}
	}

	public void arrivedForReservation() {
		// TODO - when customer shows up on time for reservation, remove booking from arraylist?
	}

}