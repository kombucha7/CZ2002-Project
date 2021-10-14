public class Reservation {

	private dateTime date;
	private int pax;
	private int reservationID;
	private boolean occupied;
	private int tableNum;

	public dateTime getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(dateTime date) {
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

	public boolean getOccupied() {
		return this.occupied;
	}

	/**
	 * 
	 * @param occupied
	 */
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	/**
	 * 
	 * @param arrival
	 */
	public boolean isExpired(dateTime arrival) {
		// TODO - implement Reservation.isExpired
		throw new UnsupportedOperationException();
	}

}