package se.lexicon;

import java.util.Arrays;

public class Exercise09 {

  /**
   * 9. Write a method which will add elements in an array.
   * Remember that arrays are fixed in size so you need to come up with a
   * solution to “expand” the array
   */
  public static void ex9() {
    String[] names = new String[0]; // This is an empty Array
    addArrayExName(names, "Marcus"); // This create a new Array whit in this case a new name.
    addArrayExName(names, "Mikael");
    addArrayExName(names, "Mathias");
  }

  public static void addArrayExName(String[] source, String name) {

    String[] newArray = Arrays.copyOf(source, source.length + 1);
    newArray[newArray.length - 1] = name;
    for (String element : newArray) {
      System.out.println(element);
    }

  }

}
