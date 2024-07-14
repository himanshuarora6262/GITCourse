package HomeTesting;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		System.out.println("Enter any Number");
		Scanner myNumber = new Scanner(System.in);		

		System.out.println("Enter any String");
		Scanner myString = new Scanner(System.in);
		
		readData(myNumber, myString);
		readData(myNumber);
		
			
	}

	static void readData(Scanner myNumber, Scanner myString) {
		int a = myNumber.nextInt();
		String b = myString.nextLine();
		
		System.out.println("Your Number is- "+ a );
		System.out.printf("Formatted String is %s \n", b );
		System.out.println("Your String is- "+ b );

	}
	
	static void readData(Scanner myNumber) {
		System.out.println("Again Enter a Number pls");
		int a = myNumber.nextInt();		
		System.out.println("Overloading- "+ a);

	}

}
