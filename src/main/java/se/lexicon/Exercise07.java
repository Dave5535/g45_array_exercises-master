package se.lexicon;

import java.util.Arrays;

public class Exercise07 {

  /**
   * 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
   * Expected output: Array: 1 2 4 7 9 12
   * Odd Array: 1 7 9
   */
  public static void ex7() {int[] numArray = {43, 5, 23, 17, 2, 14, 1, 7, 3, 4};

    Arrays.sort(numArray);
//even Array 2 4 14
    printArrayEven(numArray);

    System.out.println("   ");
//odd Array 1 3 5 7 17 23 43
    printArrayOdd(numArray);

  }

  public static void printArrayEven(int[] numArray) {
    for (int i = 0; i < numArray.length; i++) {
      if (numArray[i] % 2 == 0)
        System.out.println(numArray[i] + " ");
    }
  }

  public static void printArrayOdd(int[] numArray) {
    for (int i = 0; i < numArray.length; i++) {
      if (numArray[i] % 2 != 0)
        System.out.println(numArray[i] + " ");
    }
  }

}
