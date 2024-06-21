package autoamtionDemo;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondHighest {

	public void findSecMax(int[] num) //{4,1,8,2,0}   
	{
		int temp;
		for(int i=0; i<5; i++)  //outer   i =0,1,2,3,4
		{
			for(int j=i+1; j<5; j++) //inner   j = 1,2,3,4
			{
				if(num[i]>num[j])
				{
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println(num[5-2]);
	}
	public static void main(String[] args) {
		FindSecondHighest ob = new FindSecondHighest();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the input");
		int [] num = new int[5];
		
		for(int i=0; i<num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		ob.findSecMax(num);
	}
}
