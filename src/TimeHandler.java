import java.io.Serializable;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Scanner;
import java.time.Duration;

/**
 * Class to simulate the flow of time within our Restaurant App
 */
public class TimeHandler implements Serializable {

	/**
	 * Clock object that holds the current time and date
	 */
	private Clock clock;

	/**
	 * Defined final initial time attribute to initialise the clock
	 */
	private final String init_time = "2021-11-14T09:00:00Z";

	/**
	 * Constructor for TimeHandler object Creates a clock at initial time of
	 * 14-11-2021 09:00 Uses a string in the time format which converts it to an
	 * Instant to initlise the clock
	 */
	public TimeHandler() {
		clock = Clock.fixed(Instant.parse(init_time), ZoneId.of("UTC"));
	}

	/**
	 * Function to advance time with scanner to take in input of how much time to
	 * advance
	 */
	public void advanceTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter amount of time to advance in minutes: ");
		int adv_time = sc.nextInt();
		clock = Clock.offset(clock, Duration.ofMinutes(adv_time));
	}

	/**
	 * Advance time based on parameter for how many minutes to advance by
	 * 
	 * @param mins to advance time by
	 */
	public void advanceTime(int mins) {
		clock = Clock.offset(clock, Duration.ofMinutes(mins));
	}

	/**
	 * returns an Instant object of the current time
	 * 
	 * @return the Instant generated from clock
	 */
	public Instant getInstant() {
		return clock.instant();
	}

	/**
	 * gets the clock object
	 * 
	 * @return clock object in TimeHandler class
	 */
	public Clock getClock() {
		return this.clock;
	}

	/**
	 * Overrides the current clock object in timehandler class Not to be used unless
	 * for debugging purposes
	 * 
	 * @param clock
	 */
	public void setClock(Clock clock) {
		this.clock = clock;
	}

}