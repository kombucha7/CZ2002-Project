import java.sql.Time;
import java.time.Instant;
import java.time.temporal.ChronoUnit;


public class Reservation {

	private Instant date;
	private int pax;
	private int phoneNum;
	private int tableNum;
	//parameter to count how long late and if need be can cancel their reservation
	//private Instant


	public Reservation(Instant date, int pax, int phoneNum) {
		this.date = date;
		this.pax = pax;
		this.phoneNum = phoneNum;
	}

	public int getTableNum() {
		return this.tableNum;
	}

	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}

	public int getPhoneNum() {
		return this.phoneNum;
	}

	public Instant getDate() {
		return this.date;
	}

	public int getPax() {
		return this.pax;
	}

	public boolean checkIfInAdvance(Instant time) {
		if (Math.abs(time.getEpochSecond() - date.getEpochSecond()) < 3600) {
			return false;
		}
		else{
			return true;
		}
	}

	public boolean isExpired(Instant time) {
		if (time.getEpochSecond() - date.getEpochSecond() > 900) {
			return true;
		}
		return false;
	}

}