import java.text.DecimalFormat;

/**
 * Salary class
 * This class contains tasks about calculating salaries.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Salary {

	// Task 1
  	 public int salaryIncrease(int sal) {
  		 return sal + 200;
	}

	// Task 2
	 public double salaryIncrease(double sal2) {
		return sal2 + 200.50;
	}

	// Task 3:
	 public double salaryIncrease(double sal3, double percent) {
		return sal3 * ((percent / 100) + 1);
	}

	// Task 4
	 public double calculatePay(double sal4) {
		return (sal4 * 0.72) / 12;
	}

	// Task 5 - this one is more of a challenge - you can come back to it later
	 public String formatCurrency(double sal5) {
		 return "£" + String.format("%,.2f", sal5);

 	   }
}
