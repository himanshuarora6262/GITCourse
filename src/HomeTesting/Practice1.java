package HomeTesting;

import java.io.Console;

public class Practice1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		char[] password;		
		Console cons = null;//System.console();
		
		if ((cons = System.console()) != null) {
			password = cons.readPassword("Input your password");
			
			for (int i=0;i<password.length;i++)
			{
				System.out.print(password[i]);
			}
		}
		
		//System.out.println("Please enter your password");
		
				

		
		

	}

}
