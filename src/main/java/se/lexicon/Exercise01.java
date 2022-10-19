package se.lexicon;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise01 {

  /**
   * 1. Write a program which will store elements in an array of type ‘int’ and
   * print it out.
   * Expected output: 11 23 39 etc.
   */

  public static void ex1() {
    int[] numbers = {11, 23, 39};
    printArraySideWay(numbers);
  }
  public static void printArraySideWay(int[] numbers) {

    for (int i = 0; i < numbers.length; i++) {
      int number = (int) Array.get(numbers, i);
      System.out.print(number + " ");

    }
  }

}
