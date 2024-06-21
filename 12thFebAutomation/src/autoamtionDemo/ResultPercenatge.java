package autoamtionDemo;

import java.util.Scanner;

public class ResultPercenatge {

	public void getResult(int mMark, int hMark, int sMark, int eMark, int ssmark)
	{
		if(mMark<33||hMark<33||sMark<33||eMark<33||ssmark<33)
		{
			System.out.println("student is failed");
		}
		
		else
		{
			int total = mMark + hMark + sMark + eMark +ssmark;  //278/500
			float perc = (total*100)/500;
			
			//System.out.println("Total mark of the student is : " + total);
			//System.out.println("Total percantage obtained by the student is : " + perc);
			if(perc>=33 && perc < 45)
			{
				System.out.println("student is passed with third grade with total marks :" +total + "and the percenatge :" + perc);
			}
			else if (perc>=45 && perc < 60) {
				System.out.println("student is passed with second grade with total marks :" +total + "and the percenatge :" + perc);
			}
			else
			{
				System.out.println("student is passed with first grade with total marks :" +total + "and the percenatge :" + perc);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		ResultPercenatge ob = new ResultPercenatge();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter mark of math");
		int mMark = sc.nextInt();
		System.out.println("please enter mark of HIndi");
		int hMark = sc.nextInt();
		System.out.println("please enter mark of Science");
		int sMark = sc.nextInt();
		System.out.println("please enter mark of English");
		int eMark = sc.nextInt();
		System.out.println("please enter mark of Sst");
		int sstMark = sc.nextInt();
		ob.getResult(mMark, hMark, sMark, eMark, sMark);
		
	}
}
