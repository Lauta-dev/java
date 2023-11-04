package com.ejemplo.clase_2_trabajo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    words w = new words();

    ArrayList<String> words = new ArrayList<String>(
        Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"));
    w.WordsToUpperCase(words);

    String q = "curso de java";

    String v[] = q.split("|");

    ArrayList<String> c = new ArrayList<String>(Arrays.asList(v));

    w.WordsToUpperCase(c);

  }
}
