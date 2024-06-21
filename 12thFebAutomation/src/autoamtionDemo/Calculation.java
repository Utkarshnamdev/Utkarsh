package autoamtionDemo;

public class Calculation {

	int h =10;
	public void add()
	{
		int a = 10;
		int b=6;
		int c = a+b;
		System.out.println(c+h);
	}
	public void substract()
	{
		int d = 10;
		int e=6;
		int f = d-e;
		System.out.println(f+h);
	}
	
	public static void main(String[] args)  //entry point
	{
		Calculation ob = new Calculation();
		ob.add();
		ob.substract();
	}
	
}

