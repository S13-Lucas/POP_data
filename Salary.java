import java.text.DecimalFormat;

/**
 * Salary class
 * This class contains tasks about calculating salaries.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Salary {

	// Task 1

	/**
	 * increases the salary by 200
	 * @param sal holds original salary
	 * @return returns increased salary
	 */
  	 public int salaryIncrease(int sal) {
  		 return sal + 200;
	}

	// Task 2

	/**
	 * increases salary by 200.50
	 * @param sal2 holds salary
	 * @return returns increased salary
	 */
	 public double salaryIncrease(double sal2) {
		return sal2 + 200.50;
	}

	// Task 3

	/**
	 * increases salary by a percentage
	 * @param sal3 holds salary
	 * @param percent holds percentage modifier
	 * @return returns increased salary
	 */
	 public double salaryIncrease(double sal3, double percent) {
		return sal3 * ((percent / 100) + 1);
	}

	// Task 4

	/**
	 * finds the take home pay each month
	 * @param sal4 holds the salary
	 * @return returns corrected monthly pay
	 */
	 public double calculatePay(double sal4) {
		return (sal4 * 0.72) / 12;
	}

	// Task 5 - this one is more of a challenge - you can come back to it later

	/**
	 * puts the salary in decimal format
	 * @param sal5 holds salary
	 * @return returns formatted salary
	 */
	 public String formatCurrency(double sal5) {
		 return "£" + String.format("%,.2f", sal5);

 	   }
}
