package com.ejemplo;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON_read {
  public static void main(String[] args) {
    ObjectMapper objectMapper = new ObjectMapper();

    System.out.println("asds");

    try {
      File archivo = new File("./.env.json");
      Object persona = objectMapper.readValue(archivo, User.class);

    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
