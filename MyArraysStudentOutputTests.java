/**
 * myArraysStudentOutputTest class
 * YOU SHOULD EDIT THIS CLASS to run the methods of the myArrays class and produce output.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class MyArraysStudentOutputTests {

    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();

        // Task1 test
        System.out.println(myArrays.addUpNumbers(10,20,30,40,50));

        // Task 2 test
        int[] numbersA = {10,20,30,40,50};
        System.out.println(myArrays.addUpNumbers(numbersA));

        // Task 3 test
        int[] numbersB = {10,20,30,40,50};
        System.out.println(myArrays.averageOfNumbers(numbersB));

        // Task 4 test
        int[] numbersC = {10,20,30,40,50};
        System.out.println(myArrays.convertToCelsius(numbersC));

        // Task 5 test
        int[] numbersD = {64,55,45,67,65,88};
        System.out.println(myArrays.unitMarks(numbersD));

        // Task 6 test
        String[] numbersE = {"lucas","adam","zack","ewan","luca","toby","harrison"};
        System.out.println(myArrays.andTheWinnerIs(numbersE));

    }
}