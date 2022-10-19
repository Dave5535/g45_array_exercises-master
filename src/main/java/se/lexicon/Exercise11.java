package se.lexicon;

import java.util.Scanner;

public class Exercise11 {

  /**
   * 11.Write a program that ask the user for an integer and repeat that
   * question until user give you a specific value that user already has been
   * told about as a message in your program. Store these values in an array
   * and print that array. After that reverse the array elements so that the
   * first element becomes the last element, the second element becomes
   * the second to last element, etc. Do not just reverse the order in which
   * they are printed. You need to change the way they are stored in the
   * array.
   */
  public static void ex11() { int[] sorageValue = {1,2,3};
    //store that value  0,1,2
    Scanner scanner = new Scanner (System.in);
    System.out.println("__________________");
    System.out.println("    0,1,2 ");
    System.out.println(" ");
    System.out.println(" what do you want to switch the 1 whit 0/2?");
    int scan = scanner.nextByte();


    //  if ( 0 < scan ){
    //int scan = sorageValue[2]; }

// What do you want to do ? ( move the 1 to the left / move the 1 to the right )
    // print 0,1,2
    // move forward / backwards  .. move the original 0,1,2 to ( 1,0,2 / 0,2,1)

  }

}
