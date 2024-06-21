package autoamtionDemo;

import java.util.Scanner;

public class BillingInfo {

	
	
	public void generateBill()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your name");
		String name = sc.next();
		System.out.println("please provide your mobile number");
		long num = sc.nextLong();
		System.out.println("please enter the product name");
		String pname = sc.next();
		System.out.println("please enter product price");
		float price = sc.nextFloat();
		System.out.println("please enter your another product name");
		String pname2 = sc.next();
		System.out.println("please enter the price");
		float price2 = sc.nextFloat();
		
		float totalPrice = price + price2;
		float gst = (totalPrice*18)/100;
		float totalAmount = totalPrice + gst;
		
		System.out.println("Name of the user is : " + name);
		System.out.println("PhoneNumber of the user is : " + num);
		System.out.println("ProductName  is : " + pname);
		System.out.println("Price of the product is : " + price);
		System.out.println("ProductName  is : " + pname2);
		System.out.println("Price of the product is : " + price2);
		System.out.println("Total price of the product is : " + totalPrice);
		System.out.println("Gst calculated for the products : " + gst);
		System.out.println("totalAmount is : " + totalAmount);
	}
	public static void main(String[] args)
	{
		BillingInfo ob = new BillingInfo();
		
		ob.generateBill();
	}

}

