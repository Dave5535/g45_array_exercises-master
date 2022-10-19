package se.lexicon;

public class Exercise10 {

  /**
   * 10.Write a program which will represent multiplication table stored in multidimensional array.
   * Hint: You have two-dimensional array with values
   * [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
   */
  public static void ex10() {
    int[][] bordNumbers = new int[10][10];
    infoMultibord(bordNumbers);
  }

  public static void infoMultibord(int[][] bordNumbers) {
    for (int i = 0; i < bordNumbers.length; i++) {
      for (int j = 0; j < bordNumbers.length; j++) {
        bordNumbers[i][j] = (i + 1) * (j + 1);  // this is the multiplier between the y and x axis.
      }
    }
    for (int i = 0; i < bordNumbers.length; i++) {
      for (int j = 0; j < bordNumbers.length; j++) {


        System.out.print(bordNumbers[i][j] + " ");
      }
      System.out.println("");
    }
  }


}
