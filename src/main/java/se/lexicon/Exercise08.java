package se.lexicon;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise08 {

  /**
   * 8. Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
   * Expected output:
   *                Array: 20 20 40 20 30 40 50 60 50
   *                Array without duplicate values: 20 40 30 50 60
   */
  public static void ex8() {int[] numArray = {20, 20, 40, 20, 30, 40, 50, 60, 50};
    printArraySideWay(numArray);
    System.out.println(" ");

    // This is the copy and I modified and changed the value on each "box"
    int[] numArray2 = Arrays.copyOf(numArray, numArray.length - 4);
    numArray2[0] = 20;
    numArray2[1] = 40;
    numArray2[2] = 30;
    numArray2[3] = 50;
    numArray2[4] = 60;
    printArraySideWay(numArray2);

  }
  public static void printArraySideWay(int[] numbers) {

    for (int i = 0; i < numbers.length; i++) {
      int number = (int) Array.get(numbers, i);
      System.out.print(number + " ");
    }
  }
}
