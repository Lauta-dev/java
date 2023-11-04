package com.ejemplo.clase_2_trabajo;

import java.util.ArrayList;

public class words {
  public void WordsToUpperCase(ArrayList<String> words) {
    System.out.println(" ");

    words.forEach((data) -> {
      System.out.print(data.toUpperCase() + " ");
    });

  }
}
