package autoamtionDemo;

import java.util.Scanner;

public class AdditionalDemo {

	public void addNum(int num1, int num2)
	{
		int out = num1 + num2 ;
		System.out.println(out);
	}
	
	public static void main(String[] args) {
		AdditionalDemo ob = new AdditionalDemo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please provide the numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		 ob.addNum(num1, num2);
		//System.out.println();
		
		
	}
}
