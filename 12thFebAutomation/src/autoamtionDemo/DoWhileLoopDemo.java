package autoamtionDemo;

public class DoWhileLoopDemo {

	
	
	int j = 4;
	
	
	public void doWhileloopDemo()
	{
		int i=1;
		do {
			System.out.println(i);
			i++;
		} 
		while (i>=10);
	}
	public static void main(String[] args) {
		DoWhileLoopDemo ob = new DoWhileLoopDemo();
		ob.doWhileloopDemo();
		
	}
}
