package se.lexicon;

public class Exercise05 {

  /**
   * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
   * Expected output:
   *              France Paris
   *              Sweden Stockholm
   */
  public static void ex5() {String[][] cityToCountry = new String[2][2];
    cityToCountry[0][0] = "France";
    cityToCountry[0][1] = "Paris";
    cityToCountry[1][0] = "Sweden";
    cityToCountry[1][1] = "Stockholm";
    for (int i = 0; i < cityToCountry.length; i++) {
      for (int j = 0; j < cityToCountry[i].length; j++) {
        System.out.println(cityToCountry[i][j] + "\t");
/*      This code is if you want the text to be like   France Paris
//                                                     Sweden Stockholm
        System.out.println(cityToCountry[0][0] + " " + cityToCountry[0][1] );
        System.out.println(cityToCountry[1][0] + " " + cityToCountry[1][1] );
        */
      }
      System.out.println("\n");
    }

  }



}
