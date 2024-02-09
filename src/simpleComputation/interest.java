package simpleComputation;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
4. Build a program that takes input for principal amount, time period, and simple interest. The program should compute and display the rate of interest.
*/

public class interest {

	float interestRate, term;
	
	public void iRate() {
		Scanner scan = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat(".00");
		
			System.out.println("Enter Principal Ammount: "); // loaned ammount
				float principalAmmount = scan.nextFloat();
				
			System.out.println("Enter Time Period: ");
				float timePeriod = scan.nextFloat();
				
			System.out.println("Enter Simple Interest: "); // total due after interest
				float simpleInterest = scan.nextFloat();
		
		scan.close();
		
		interestRate = (simpleInterest/principalAmmount-1) / (timePeriod/12);
		term = (interestRate * 100) / 12;
		System.out.println(term);
		System.out.println("The rate of interest is: " + dec.format(term) + " per month/s");
	}
	
}
/*
5. Design a program where the user inputs the principal amount, interest rate, and time period. The program should calculate and display the maturity value, which is the sum of the principal and the simple interest.
 */