package com.sercan.ay.course1;

public class Types {

  public static void main(String[] args) {
    byte b = 1; // no commonly used
    short s = 1; // no commonly used

    long aBigNumber = 1_000_000;
    float smallDouble = 3.14f;

    char character = 'a';
    int age = 25;
    double pi = 3.14;

    int[] numbers = {1, 2, 3, 4};
    double[] doubles = new double[5];
    doubles[0] = 3.14;

    // printing array elements
    for (int i = 0; i < doubles.length; i++) {
      System.out.println(doubles[i]);
    }

    String name = "Sercan";

    System.out.println(name);
  }
}
