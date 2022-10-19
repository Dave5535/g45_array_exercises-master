package se.lexicon;

public class Exercise06 {

  /**
   * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
   * Expected output: Average is: 17.3
   */
  public static void ex6() {
    double[] numArray = {43, 5, 23, 17, 2, 14};

    printNumbersAverage(numArray);

  }
  public static void printNumbersAverage(double[] numbers) {
    double sum = 0.0;

    for (double num : numbers) {
      sum += num;
    }
    double average = sum / numbers.length;
    System.out.format("The average is: %.2f", average);

  }

}
