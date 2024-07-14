package HomeTesting;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {

		System.out.println("Enter any Number");
		Scanner scan = new Scanner(System.in);
		String myString = scan.nextLine();
		String a = "Him";
		String b = "Arora";
		
		System.out.println("Length of Entered String is - " + myString.length());
		
		System.out.println("Lowered String is - " + myString.toLowerCase());
		
		System.out.println("Uppercase String is - " + myString.toUpperCase());
		
		System.out.println("Index of 'n' in String is - " + myString.indexOf('n'));
		
		System.out.println(a.concat(b));


	}

}
