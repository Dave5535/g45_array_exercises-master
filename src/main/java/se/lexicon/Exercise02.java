package se.lexicon;

import java.util.Scanner;

public class Exercise02 {

    /**
     * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
     * If the element does not exist your method should return -1 as value.
     * Expected output: Index position of number 5 is: 2.
     */


    public static void ex2() {
        int[] Index = { 6, 4, 5, 1, 3, 2, 7, 8, 9 };

        // find the index of 5
        System.out.println("Index position of 5 is: "
                + findIndex(Index, 5));


    }
    public static int findIndex(int arr[], int t)
    {

        // if array is Null ( if you don't have a part of your Index with the number you searching for. like for ex 10 will return -1).
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }



}



