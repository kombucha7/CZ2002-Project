import java.io.Serializable;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Scanner;
import java.time.Duration;

public class TimeHandler implements Serializable {

	private Clock clock;
	private String init_time = "2021-11-14T09:00:00Z";

	public TimeHandler() {
		clock = Clock.fixed(Instant.parse(init_time), ZoneId.of("UTC"));
	}

	public void advanceTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter amount of time to advance in minutes: ");
		int adv_time = sc.nextInt();
		clock = Clock.offset(clock, Duration.ofMinutes(adv_time));
	}

	public void advanceTime(int mins)
	{
		clock = Clock.offset(clock, Duration.ofMinutes(mins));
	}

	public Instant getInstant() {
		return clock.instant();
	}

	public Clock getClock() {
		return this.clock;
	}

	/**
	 * 
	 * @param clock
	 */
	public void setClock(Clock clock) {
		this.clock = clock;
	}

}