package lesson1;

public class LeftDaysMain {
	public static void main(String[] args) {
	int days =397;
	int years = days/365;
	int months = (days%365)/31;
	int leftDaysFirst = days%365%31;
	int leftDaysSecond = days - years*365 - months*31;
	
	System.out.println("days: " + days);
	System.out.println("let: " + years);
	System.out.println("months: " + months);
	System.out.println("leftDaysFirst: " + leftDaysFirst);
	System.out.println("leftDaysSecond: " + leftDaysSecond);
	}

}
