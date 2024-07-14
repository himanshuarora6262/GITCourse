package HomeTesting;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

public class Practice4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		/*
		 * System.out.println("Twinkle, twinkle, little star,");
		 * System.out.println("	How I wonder what you are!");
		 * System.out.println("		Up above the world so high,");
		 * System.out.println("		Like a diamond in the sky.");
		 * System.out.println("Twinkle, twinkle, little star,");
		 */
		System.out.println(
				"Twinkle, twinkle, little star,\n\t\tHow I wonder what you are!\n\t\t\tUp above the world so high,\"");

		int val = 5;
		int mul = 1;

		for (int i = 1; i <= 3; i++) {
			if (i == 1) {
				mul = 1;
				System.out.println(val * mul);
			}

			else if (i == 2) {
				mul = 11;
				System.out.println(val * mul);
			}

			else {
				mul = 111;
				System.out.println(val * mul);
			}
		}
		
		File file = new File("C:\\Data\\Himanshu\\AutomationScreenshots\\abc.txt");
		System.out.println(file.length());
		
		System.out.println(Calendar.getInstance().getTime());
		
		for (int i=1;i<100;i++)
		{
			if(!(i%2==0))
			{
				System.out.println("Odd Number- "+i);
			}
		}
		
		String s = "25";
		int s1 = Integer.parseInt(s);
		
		System.out.println(s1);
		
		int a=5;
		int b=551;
		int c=152;
		
		int lastDigit1 = a%10;
		int lastDigit2 = b%10;
		int lastDigit3 = c%10;
				if((lastDigit1==lastDigit2) || (lastDigit2==lastDigit3) || (lastDigit1 ==lastDigit3))
				{
					System.out.println("true");
				}
				
				else
					System.out.println("false");
		String ss= "The quick brown fox jumps over the lazy dog.";
		
		//Second last word
		String[] ss1 = ss.split(" ");
		System.out.println(ss1[ss1.length-2]);
		
		//Upper case
		for(int i=0;i<ss1.length;i++)
		{
			System.out.println(ss1[i].toUpperCase());
		}
		
		//Is Prime? Should be only divisible by self		
		int isPrime = 5;
		int i1=0;
		
				for(int j=2;j<isPrime;j++)
				{
					if(isPrime%j==0)
					{
						i1++;
						break;
					}
				}
				
				if(i1==0)
				{
					System.out.println("It's prime");
				}
				
				else
					System.out.println("Not Prime");
				
				//First 5 Prime Numbers
				
				int i11=0;
				int maxPrime = 0;
				int sum=0;
				
				for(int isPrime1=2;isPrime1<=1000;isPrime1++)
				{
				for(int j=2;j<isPrime1;j++)
						{
							if(isPrime1%j==0)
							{
								i11++;
								break;
							}
						}
						
						if(i11==0)
						{
							System.out.println("Prime Numbers... - "+isPrime1);
							sum  = sum+isPrime1;
							i11=0;
							maxPrime++;
						}
						else if (maxPrime==100){
							break;
						}
						i11=0;
				}
				
				System.out.println("Sum of first 100 prime numbers are- "+ sum);
				
				//Replace middle string
				
				String sss = "Python 3.0";
				
				String[] sss1 = sss.split(" ");
				
				System.out.print(sss1[0]+" Tutorial "+sss1[1]);
				
				//Linked List
				
				LinkedList <String> ll = new LinkedList <String>();
				
				ll.add("Hey");
				ll.add("Hello");
				
				System.out.println("\n"+ll);
				System.out.println(ll.get(1));

					

				
				

	}

}
