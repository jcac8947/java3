package simpleComputation;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
	3. Create a program where the user inputs the principal amount, interest rate, and simple interest. The program should compute and output the time period required for the investment to accrue the given simple interest.
*/

public class timePeriod {

	float term, rate;
	
	public void tP(){
		Scanner scan = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat(".00");
		
			System.out.println("Enter Principal Ammount: "); // loaned ammount
				float principalAmmount = scan.nextFloat();
				
			System.out.println("Enter Interest Rate: ");
				float interestRate = scan.nextFloat();
				
			System.out.println("Enter Simple Interest: "); // total due after interest
				float simpleInterest = scan.nextFloat();
		
		scan.close();
		
		float ir = interestRate/100;
		term = ((simpleInterest/principalAmmount-1) / (ir*12));
		rate = term*12;
		System.out.println("Time Period to pay the Simple interest is: " + dec.format(rate) + " month/s");
	}
	
}


