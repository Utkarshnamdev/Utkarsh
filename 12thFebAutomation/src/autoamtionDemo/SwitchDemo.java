package autoamtionDemo;

import java.util.Scanner;

public class SwitchDemo {

	public void getWeekdays(String name)
	{
		switch (name) 
		{
		case "monday":
		{
			System.out.println("this is the first day of the wekek");
			break;
		}
		case "tuesday":
		{
			System.out.println("this is the second day of the wekek");
			break;
		}
		case "wdnesday":
		{
			System.out.println("this is the third day of the wekek");
			break;
		}
		case "thursday":
		{
			System.out.println("this is the fourth day of the wekek");
			break;
		}
		case "friday":
		{
			System.out.println("this is the fifth day of the wekek");
			break;
		}
		case "saturday":
		{
			System.out.println("this is the sixth aday of the wekek");
			break;
		}
		case "sunday":
		{
			System.out.println("holiday");
			break;
		}
		default:
		{
			System.out.println("please enter valid day");
		}
		}
	}
	public static void main(String[] args) {
		SwitchDemo ob = new SwitchDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any day name");
		String name = sc.next();
		ob.getWeekdays(name);
	}
}
