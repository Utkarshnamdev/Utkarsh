package autoamtionDemo;

import java.util.Scanner;

public class ArrayDemo {

	public void findOddEven(int[] num) //{3,6,5,7,5}
	{
		
		for(int i=0; i<=4; i++)
		{
			int reminder = num[i]%2;
			if(reminder==0)
			{
				System.out.println("given element : " + num[i] + " is even");
			}
			else
			{
				System.out.println("given element : " + num[i] + " is odd");
			}
			
		}
		
	}
	public static void main(String[] args) {
		ArrayDemo ob = new ArrayDemo();
		int[] num = new int[5];  // index = 0,1,2,3,4
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter 5 valid input");
		
		for(int i=0; i<=4 ; i++)
		{
			num[i]=sc.nextInt();
		}
		ob.findOddEven(num);
	}
}
