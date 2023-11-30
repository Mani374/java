package Oops2;

import java.util.Arrays;

class Time implements Comparable<Time> {
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds) throws InvalidHourException, InvalidMinsSecsException {
		if (hours >= 0 && hours <= 23) {
			this.hours = hours;
		} else {
			throw new InvalidHourException();
		}

		if (minutes >= 0 && minutes <= 59 && seconds >= 0 && seconds <= 59) {
			this.minutes = minutes;
			this.seconds = seconds;

		} else {
			throw new InvalidMinsSecsException();

		}
	}

	public int getTotalSeconds() {
		return this.hours * 3600 + this.minutes * 60 + this.seconds;
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

	public void increamentTime() {
		if (seconds == 59) {
			seconds = 0;
			if (minutes == 59) {
				minutes = 0;
				if (hours == 23) {
					hours = 0;
				} else {
					hours++;
				}
			} else {
				minutes++;
			}

		} else {
			seconds++;

		}

	}

	public void decreamentTime() {

		if (seconds == 0) {
			seconds = 59;
			if (minutes == 0) {
				minutes = 59;
				if (hours == 0) {
					hours = 23;
				} else {
					hours--;
				}
			} else {
				minutes--;
			}
		} else {
			seconds--;
		}
	}

	public int compareTo(Time t0) {
		return this.getTotalSeconds() - t0.getTotalSeconds();
	}

}

public class TestTime {

	public static void main(String[] args) throws InvalidHourException, InvalidMinsSecsException {
		try {
			Time t1 = new Time(22, 90, 59);
			System.out.println(t1.getTotalSeconds());

			t1.increamentTime();

			System.out.println(t1.toString());
			t1.increamentTime();

			t1.increamentTime();
			System.out.println(t1.toString());
			t1.decreamentTime();
			System.out.println(t1.toString());

		} catch (InvalidHourException | InvalidMinsSecsException i) {
			System.out.println(i.getMessage());
		}
		System.out.println();
		try {
			Time[] t = { new Time(2, 00, 00), new Time(1, 00, 00), new Time(34, 9, 22), new Time(23, 32, 45) };

			Arrays.sort(t);
			for (var t2 : t) {
				System.out.println(t2);

			}
		} catch (InvalidHourException | InvalidMinsSecsException i) {
			System.out.println(i.getMessage());

		}
	}

}

class InvalidMinsSecsException extends Exception {

	public InvalidMinsSecsException() {
		System.out.println("check minutes or seconds..!");
	}

}

class InvalidHourException extends Exception {

	public InvalidHourException() {
		System.out.println("Check your Entered hour...!");
	}

}