package lektion1;

import java.util.Scanner;

/**
 * 
 * @author mikael
 * Main class
 */
public class Password {

	/**
	 * Main function that runs all the code.
	 */
	public static void main(String[] args) {
		// Declaration of variables
		final String password = "38Sjf35d";
		String userPass = "";
		Scanner reader = new Scanner(System.in);
		
		// Loop that checks if the provided string is equal to the password
		for (int i = 0; i < 3; i++) {
			System.out.println("Welcome, please enter your password! ");
			userPass = reader.nextLine();
			
			if(userPass.equals(password)) { 
				System.out.println("Congratulations you managed to log in!");
				i = 3;
			} else if(i == 2) {
				System.out.println("You typed the wrong password to many times!");
			} else {
				System.out.println("Incorrect password try again, you have " + (2 - i) + " more tries");
			}
		}
		
		// Closes the scanner.
		reader.close();
	}
}
