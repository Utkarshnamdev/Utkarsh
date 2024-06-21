package autoamtionDemo;

import java.util.Scanner;

public class ValidateWeekdays {

	public void getWeekdays(String name)
	{
		if(name.equalsIgnoreCase("monday"))
		{
			System.out.println("this is first day of the week");
		}
		else if(name.equalsIgnoreCase("tuesday"))
		{
			System.out.println("this is second day of the week");
		}
		else if(name.equalsIgnoreCase("wednesday"))
		{
			System.out.println("this is third day of the week");
		}
		else if(name.equalsIgnoreCase("thursday"))
		{
			System.out.println("this is fourth day of the week");
		}
		else if(name.equalsIgnoreCase("friday"))
		{
			System.out.println("this is fifth day of the week");
		}
		else if(name.equalsIgnoreCase("saturday"))
		{
			System.out.println("this is sixth day of the week");
		}
		else if(name.equalsIgnoreCase("sunday"))
		{
			System.out.println("holiday");
		}
		else
		{
			System.out.println("invaid input");
		}
		
	}
	public static void main(String[] args) {
		ValidateWeekdays ob = new ValidateWeekdays();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any day name");
		String name = sc.next();
		ob.getWeekdays(name);
	}
}
