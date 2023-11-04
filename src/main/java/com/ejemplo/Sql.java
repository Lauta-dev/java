package com.ejemplo;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ejemplo.sql.sql;

public class Sql {
  public static void main(String[] args) throws SQLException {
    String consulta = "SELECT * FROM users";

    ResultSet result = sql.Resultado(jdbcUrl, usuario, contraseña, consulta);

    while (result.next()) {
      String user_handle = result.getString("user_handle");
      String mail = result.getString("email_address");

      System.out.println("User Handle: " + user_handle + "          Mail: " + mail);
    }

  }
}
