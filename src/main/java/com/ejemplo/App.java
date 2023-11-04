package com.ejemplo;

public class App {
  public static void sum(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }

  /*
   * public static void main(String[] args) {
   * int numbers[] = new int[11];
   * 
   * for (int i = 0; i < numbers.length; i++) {
   * if (i % 2 == 0) {
   * numbers[i] = i;
   * // System.out.println(numbers[i]);
   * }
   * }
   * 
   * for (int i : numbers) {
   * if (numbers[i] > 0) {
   * System.out.println(numbers[i]);
   * }
   * }
   * 
   * }
   */

  public static void main(String[] args) {
    String saludo = "Hola, como estás";
    String[] sal = saludo.split(" ");

    sum(sal);
  }
}
