package autoamtionDemo;

public class NestedForloop {

	public void nestedLoopDemo()
	{
		for(int i =1; i<=5; i++)  
		{
			for(int j=1; j<=3; j++)   
			{
				System.out.println(i + " " + j);  
			}
		}
	}
	public static void main(String[] args) {
		NestedForloop ob = new NestedForloop();
		ob.nestedLoopDemo();
	}
}
