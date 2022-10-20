package se.lexicon;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Exercise13 {


    /**
     * 13. Create two arrays with arbitrary size and fill one with random numbers.
     * Then copy over the numbers from the array with random numbers so
     * that the even numbers are located in the rear (the right side) part of the
     * array and the odd numbers are located in the front part (the left side).
     */
    public static void ex13() {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // creation of an empty array
        printArraySideWay(array1); // Prints the original array
        System.out.println(" ");

        printArrayOdd(array1); // prints the odd numbers of the array
        printArrayEven(array1); // prints the even number in revers
    }
    public static void printArraySideWay(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            int number = (int) Array.get(numbers, i);
            System.out.print(number + ", ");
        }
    }
    public static void printArrayOdd(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 != 0)
                System.out.print(numArray[i] + ", ");
            }
        }
    public static void printArrayEven(int[] numArray) {
        for (int i=numArray.length-1;i>=0;i--) {
            if (numArray[i] % 2 == 0)
                System.out.print(numArray[i] + ", ");
        }
    }
}
