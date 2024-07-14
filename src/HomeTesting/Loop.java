package HomeTesting;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {

		System.out.println("Enter any Number");
		Scanner myNumber = new Scanner(System.in);	
		int myNum = myNumber.nextInt();

		for (int i=0;i<=myNum;i++)
		{
			//System.out.println("All Numbers"+ i);
			
			if(i%2==0)
			{
				System.out.println("Even Numbers"+ i);
			}
		}
		
		//Recursion to be added here..
		

		
			
	}

}
