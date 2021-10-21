import java.time.Instant;

public class Reservation {

	private Instant date;
	private int pax;
	private int reservationID;
	private int tableNum;

	/**
	 * 
	 * @param date
	 * @param pax
	 * @param occupied
	 * @param tableNum
	 */
	public Reservation(Instant date, int pax, boolean occupied, int tableNum) {
		// TODO - implement Reservation.Reservation
		throw new UnsupportedOperationException();
	}

	public Instant getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Instant date) {
		this.date = date;
	}

	public int getPax() {
		return this.pax;
	}

	/**
	 * 
	 * @param pax
	 */
	public void setPax(int pax) {
		this.pax = pax;
	}

	public int getReservationID() {
		return this.reservationID;
	}

	/**
	 * 
	 * @param reservationID
	 */
	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}

	/**
	 * 
	 * @param arrival
	 */
	public boolean isExpired(Instant arrival) {
		// TODO - implement Reservation.isExpired
		throw new UnsupportedOperationException();
	}

}