import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;
import static java.util.concurrent.TimeUnit.*;
import java.time.temporal.ChronoUnit;

public class ReservationList {

	int customerNum;
	Instant instantTest;

	private ArrayList<Reservation> reservationList;

	public ReservationList() {

	}

	public void createReservation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("###Creating a new reservation###");
		System.out.println("Enter Date in the format (DDMMYYYY):");	//truncate D/M/Y
		String day = sc.next().substring(0,1);
		String month = sc.next().substring(0,1);
		String year = sc.next().substring(0,3);

		System.out.println("Enter Time in the format (HHmm):");
		String hours = sc.next().substring(0,1);
		String minute = sc.next().substring(0,1);

		System.out.println("Enter no. pax");
		int pax = sc.nextInt();


		Instant inst1 = Instant.parse(day + "-" + month + "-" + year +"T" + hours +":" + minute + ":00.00Z");
		Reservation addNew = new Reservation(inst1, pax, customerNum);	//find a way to get the table based on the pax
		reservationList.add(addNew);

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

/* not necessary
	public void updateReservation() {
		// TODO - implement ReservationList.updateReservation
		throw new UnsupportedOperationException();
	}
*/

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