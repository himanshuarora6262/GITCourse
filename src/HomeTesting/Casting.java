package HomeTesting;

import java.util.Scanner;

public class Casting {

	public static void main(String[] args) {

		System.out.println("Enter any Number");
		Scanner myNumber = new Scanner(System.in);
		int myNum = myNumber.nextInt();

		double myDouble = myNum;

		System.out.println("Auto Casting - " + myDouble);

		// Not Possible- int explicitCasting = myDouble;

		int explicitCasting = (int) myDouble;
		
		System.out.println("Explicit Casting - " + explicitCasting);

	}

}
