package HomeTesting;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		int x = 5;
		int y = x++;
		int z = ++y;
		int w = 50;

		System.out.println("X is- " + x);
		System.out.println("Y is- " + y);
		System.out.println("Z is- " + z);

		System.out.println("Hello\nMr. Himanshu Arora!");
		System.out.println("Sum is - " + (x + y));
		System.out.println("Divide is is - " + (w / y));

		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);
		System.out.println(20 + -(3 * 5) / 8);
		System.out.println(5 + (15 / 3) * 2 - (8 % 3));

		System.out.println("Enter 2 Numbers");
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(a * b);

		for (int i = 1; i <= 10; i++) {
			System.err.println(a * i);
		}

		double c = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(c);

		
		System.out.println("Before Swap - a is- "+ a);
		System.out.println("Before Swap - b is- "+ b); 
		int k;
		k = a;
		a = b;
		b = k;
		
		System.out.println("a is- "+ a);
		System.out.println("b is- "+ b);
		
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("java.version"));
		
		int a1=25;
		int b1=39;
		if(a1<b1) System.out.println(a1+"<"+b1);
		if(a1<=b1) System.out.println(a1+"<="+b1);
		if(a1!=b1) System.out.println(a1+"!="+b1);
		
		int a2=25;
		int sum=0;
		
		while(a2!=0)
		{
			sum = sum + a2%10;
			a2 = a2/10;
		}
		System.out.println("sum is- "+sum);
		
		System.out.println("Divide- "+ 16/3);
		System.out.println("Mod- "+16%3);
		
		String s = "Himanshu";
		
		for (int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
		String s1 = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		
		int letters=0; int space =0;
		int number =0; int other =0;
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isLetter(s1.charAt(i)))
			{
				letters++;
			}
			
			else if (Character.isDigit(s1.charAt(i)))
			{
				number++;
			}
			
			else if (Character.isSpace(s1.charAt(i)))
			{
				space++;
			}
			
			else
			{
				other++;
			}
		}
		
        System.out.println("letter: " + letters);
        System.out.println("number: " + number);
        System.out.println("space: " + space);
        System.out.println("other: " + other);
        
        int z1='a';
        System.out.println("ascii value of a is- "+z1);

	}

}
