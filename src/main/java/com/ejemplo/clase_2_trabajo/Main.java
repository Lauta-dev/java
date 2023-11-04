package com.ejemplo.clase_2_trabajo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Creo la instacia de la clase
    WordsToMayus w = new WordsToMayus();

    // Uso de los arrays
    String list[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" };

    ArrayList<String> words = new ArrayList<String>(Arrays.asList(list));
    w.WordsToUpperCase(words);

    // Mensaje
    String message = "lorem ipsum lorem ipsum";

    // convierte el STRING en un ARRAY

    List<String> StringToArray = Arrays.asList(message.split("||"));

    // Devuelve un ArrayList
    ArrayList<String> ArrayList = new ArrayList<String>(StringToArray);
    w.WordsToUpperCase(ArrayList);

  }
}
