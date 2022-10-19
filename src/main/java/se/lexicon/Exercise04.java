package se.lexicon;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise04 {

  /**
   * 4. Write a program which will copy the elements of one array into another array.
   * Expected output:
   *                Elements from first array: 1 15 20
   *                Elements from second array: 1 15 20
   */
  public static void ex4() {
    int[] array1 = {1, 15, 20};
    printArraySideWay(array1);
    System.out.println(" "); // I did not know If the first and the second should be on the same line but I made them on different so it would be easier to spot the similarity.
    int[] array2 = Arrays.copyOf(array1, 3);

    printArraySideWay(array2);

  }
  public static void printArraySideWay(int[] numbers) {

    for (int i = 0; i < numbers.length; i++) {
      int number = (int) Array.get(numbers, i);
      System.out.print(number + " ");
    }
  }


}
