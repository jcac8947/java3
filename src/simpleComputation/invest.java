package simpleComputation;

import java.text.DecimalFormat;
import java.util.Scanner;

public class invest {

	/*

	1. Write a program that takes input from the user for principal amount, interest rate, and time period. The program should then calculate and display the simple interest.

	 */
	
	float simpleInterest;
	
	public void userInput() {
		Scanner user = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".00");
		
		System.out.print("Enter Principal Amount: ");
		float principalAmmount = user.nextFloat();
		
		System.out.print("Enter Interest Rate: ");
		float interestRate = user.nextFloat();
		
		System.out.print("Enter Time Period per month: ");
		int timePeriod = user.nextInt();
				
		user.close();
		System.out.println("\nTo confirm, your input are as follows:");
		System.out.println("Principal Amount: " + df.format(principalAmmount) + " Php");
		System.out.println("Interest Rate: " + df.format(interestRate) + "%");
		System.out.println("Time Period: " + timePeriod + " month/s");
		
		System.out.println("\n===========================");
		

		simpleInterest = (principalAmmount*interestRate*timePeriod)/100;
		
		System.out.println("\nSample computation with Total Interest");
		
		float endBal = principalAmmount+simpleInterest;
		System.out.println("End Balance: " + df.format(endBal));
		
		System.out.println("Total Interest: " + df.format(endBal));
		
		float ammo = (endBal) / timePeriod;
		System.out.println("Monthly Payment: " + df.format(ammo));
		
		
	}	
	
	/*
	2. Develop a program that prompts the user to enter the simple interest, interest rate, and time period. The program should calculate and display the principal amount.
	
	3. Create a program where the user inputs the principal amount, interest rate, and simple interest. The program should compute and output the time period required for the investment to accrue the given simple interest.
	
	4. Build a program that takes input for principal amount, time period, and simple interest. The program should compute and display the rate of interest.
	
	5. Design a program where the user inputs the principal amount, interest rate, and time period. The program should calculate and display the maturity value, which is the sum of the principal and the simple interest.
	*/

	
}
