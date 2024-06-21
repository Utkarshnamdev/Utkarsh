package autoamtionDemo;

import java.util.Scanner;

public class OccurenceOfCharacter {

	public void countChar(String name, char ch) //amazing     a
	{
		int count = 0;
		char[] ch1 = name.toCharArray();  // [a,m,a,z,i,n,g]
		for(int i=0; i<ch1.length; i++)
		{
			if(ch==ch1[i])
			{
				count++;
			}
		}
		System.out.println(ch + " occurs " + count);
	}
	public static void main(String[] args) {
		OccurenceOfCharacter ob = new OccurenceOfCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the value");
		String val = sc.next();
		System.out.println("please enter the character for counting");
		char ch = sc.next().charAt(0);     //noida
		ob.countChar(val, ch);
		
	}
}
