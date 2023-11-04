package com.ejemplo.clase_2_trabajo;

import java.util.ArrayList;

public class WordsToMayus {
  public void WordsToUpperCase(ArrayList<String> words) {
    words.forEach((data) -> {
      System.out.print(data.toUpperCase());
    });
  }
}
