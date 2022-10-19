package se.lexicon;

import java.util.Arrays;
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



    public static void ex11() {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want in the array? ");
        int n= sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers ('666' will end program): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 666) {
                break;
            } else if (arr[i] + 665 == n) {
                break;
            }
        }

        System.out.println("numbers in reverse: ");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.println(arr[i] + " ");

    }

}





