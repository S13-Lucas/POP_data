/**
 * MyArrays class
 * This class contains tasks about using arrays.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
import java.util.Random;
public class MyArrays {

// Task 1

    /**
     * adds all the numbers given as input
     * @param a first number
     * @param b second number
     * @param c third number
     * @param d fourth number
     * @param e fifth number
     * @return returns the sum
     */
    public int addUpNumbers(int a,int b,int c,int d,int e) {
        return(a+b+c+d+e);
    }

    // Task 2

    /**
     * adds all the numbers from an array
     * @param numbersA variable that holds array of the numbers that need to be added
     * @return returns sum
     */
    public int addUpNumbers(int[] numbersA) {
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum = sum + numbersA[i];
        }
        return sum;
    }

    // Task 3

    /**
     * adds all the numbers in an array then divides by number of items to return the average
     * @param numbersB array of numbers
     * @return returns the sum divided by number of numbers that were summed (average)
     */
    public double averageOfNumbers(int[] numbersB) {
        double sum = 0;
        for(int i = 0; i < 5; i++) {
            sum = sum + numbersB[i];
        }
        return sum/5;
    }

    // Task 4

    /**
     * item by item converts them to celsius (from fahrenheit)
     * @param numbersC contains array of numbers to be converted
     * @return returns converted array
     */
    public int[] convertToCelsius(int[] numbersC) {

        for(int i = 0; i < 5; i++) {
            numbersC[i] = ((numbersC[i]-32)*5)/9;
        }
        return numbersC;
    }

// Task 5

    /**
     * assigns the unit mark to the unit and finds the average for all units
     * @param numbersD contains the marks for each unit that were given
     * @return returns assigned array + average
     */

    public String[] unitMarks(int[] numbersD) {
    String[] units = {"APP:", "BSAD:", "CF:", "DAD:", "N&CS:", "POP:", "AVERAGE:" };
     for (int i = 0; i <= 5; i++){
         units[i] = units[i] + numbersD[i];
     }

     float sum = 0;
     for(int i = 0; i<= 5; i++) {
         sum += numbersD[i];
     }

     units[6] = "Average:" + sum/6;
     return units;
    }



    // Task 6

    /**
     * creates a random object and decides a winner from that number
     * @param numbersE array containing names of players
     * @return returns winner
     */
    public String andTheWinnerIs(String[] numbersE) {
        Random rNumber =new Random();
        int newRNumber = rNumber.nextInt(numbersE.length);
        return numbersE[newRNumber];

	}
}
