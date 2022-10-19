package se.lexicon;

public class Exercise12 {

    /**
     * 12.Write a program which will print the diagonal elements of two dimensional array.
     * Expected output: 1 4 9
     */
    public static void ex12() {
        int[][] threebord = new int[3][3];
        threebord[0][0] = 1;
        threebord[0][1] = 2;
        threebord[0][2] = 3;

        threebord[1][0] = 3;
        threebord[1][1] = 4;
        threebord[1][2] = 6;

        threebord[2][0] = 7;
        threebord[2][1] = 8;
        threebord[2][2] = 9;
twoDBord(threebord);

        }


    public static void twoDBord(int[][] number) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j] + "\t");
            }
            System.out.println("\n");

        }
    }

}