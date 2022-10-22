/**
 * MyArrays class
 * This class contains tasks about using arrays.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
import java.util.Random;
public class MyArrays {

// Task 1

    public int addUpNumbers(int a,int b,int c,int d,int e) {
        return(a+b+c+d+e);
    }

    // Task 2
    public int addUpNumbers(int[] numbersA) {
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum = sum + numbersA[i];
        }
        return sum;
    }

    // Task 3
    public double averageOfNumbers(int[] numbersB) {
        double sum = 0;
        for(int i = 0; i < 5; i++) {
            sum = sum + numbersB[i];
        }
        return sum/5;
    }

    // Task 4
    public int[] convertToCelsius(int[] numbersC) {

        for(int i = 0; i < 5; i++) {
            numbersC[i] = ((numbersC[i]-32)*5)/9;
        }
        return numbersC;
    }

// Task 5

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
    public String andTheWinnerIs(String[] numbersE) {
        Random rNumber =new Random();
        int newRNumber = rNumber.nextInt(numbersE.length);
        return numbersE[newRNumber];

	}
}
