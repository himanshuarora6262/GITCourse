package HomeTesting;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Dates {

	public static void main(String[] args) {

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date  date = new Date();
		String formatttedDate = format.format(date);
		System.out.println("DATE1- "+date);
				
	}

}
