package HomeTesting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayOperations {

	public static void main(String[] args) {

		int myNumbers[]= {1222,22,110,4};
		int sum = 0;
		int lowestValue = myNumbers[0];
		int highestValue = myNumbers[0];
		int temp=0;
		
		System.out.println("Length is - " + myNumbers.length);
		
		System.out.println("Original Order");
		for(int i=0;i<myNumbers.length;i++)
		{
			System.out.println(myNumbers[i]);
			sum = sum+myNumbers[i];
		}
		
		System.out.println("Sum is - "+ sum);
		float  avg = sum/myNumbers.length;
		System.out.println("Avg is - "+ avg);
		
		//Number in Reverse Order
		System.out.println("Reverse Order");
		for(int i=myNumbers.length-1;i>=0;i--)
		{
			System.out.println(myNumbers[i]);
		}
		
		//Lowest Value
		
		for(int i=0;i<myNumbers.length;i++)
		{
			if(lowestValue>myNumbers[i])
			{
				lowestValue = myNumbers[i];
			}
		}
		
		System.out.println("Lowest is - "+ lowestValue);
		
		//Highest Value
		
		for(int i=0;i<myNumbers.length;i++)
		{
			if(highestValue<myNumbers[i])
			{
				highestValue = myNumbers[i];
			}
		}
		
		System.out.println("highestValue is - "+ highestValue);
		
		//Asc Sorting
		
		Arrays.sort(myNumbers);
		System.out.println("Asc Sort- "+ Arrays.toString(myNumbers));
		
		//Desc Sorting
		
		System.out.println("Descending Sort");
		for(int i=0;i<myNumbers.length;i++)
		{
			for(int j=i+1;j<myNumbers.length;j++)
			{
				if(myNumbers[i]<myNumbers[j]) //Swap if previous number is small
				{
					temp = myNumbers[i];
					myNumbers[i]= myNumbers[j];
					myNumbers[j]=temp;
				}
			}
		}
		
		for(int i=0;i<myNumbers.length;i++)
		{
			System.out.println(myNumbers[i]);
		}
		

	}

}
