package simpleComputation;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
	2. Develop a program that prompts the user to enter the simple interest, interest rate, and time period. The program should calculate and display the principal amount.
*/

public class principalAmm {

//	float interestRate,
//		  simpleInterest,
//		  timePeriod;
	
	float pr;
	public void principal() {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat(".00");
		
			System.out.println("Enter Simple Interest: ");
				float simpleInterest = scan.nextFloat();
			System.out.println("Enter Interest Rate: ");
				float interestRate = scan.nextFloat();
			System.out.println("Enter Time Period in month: ");
				float timePeriod = scan.nextFloat();
		
		scan.close();
		
		System.out.println("\n===========================");
		
			System.out.println("\nTo confirm, your input are as follows:");
			System.out.println("Simple Interest: " + dec.format(simpleInterest) + " Php");
				float ir = interestRate/100;
			System.out.println("Interest Rate: " + dec.format(interestRate) + "% or " + ir + " Php");
			System.out.println("Time Period: " + timePeriod + " month/s");
		
		System.out.println("\n===========================");
			
		pr = simpleInterest / (1 + ir * timePeriod);
			
		System.out.println("Principal Ammount is: " + pr);
		
	}

}
