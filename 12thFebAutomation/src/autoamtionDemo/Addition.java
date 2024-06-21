package autoamtionDemo;

import java.util.Scanner;

public class Addition {

	public void add(int val1, int val2)
	{
		int out = val1 + val2;
		System.out.println(out);
	}
	
	public void addNum(int val1, int val2, int val3)
	{
		int out = val1 + val2 + val3;
		System.out.println(out);
	}
	
	public static void main(String[] args) {
		Addition ob = new Addition();
		Scanner sc = new Scanner(System.in);
		System.out.println("please provide first value");
		int val1 = sc.nextInt();
		System.out.println("please provide second value");
		int val2 = sc.nextInt();
		
		System.out.println("please provide third value");
		int val3 = sc.nextInt();
		ob.addNum(val1, val2, val3);
		
	}
}
