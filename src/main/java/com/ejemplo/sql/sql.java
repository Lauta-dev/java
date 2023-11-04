package com.ejemplo.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sql {
  public static ResultSet Resultado(String jdbcUrl, String usuario, String contraseña, String consulta) {
    try {
      Connection co = DriverManager.getConnection(jdbcUrl, usuario, contraseña);
      PreparedStatement statement = co.prepareStatement(consulta);
      ResultSet result = statement.executeQuery();

      return result;
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return null;
  }
}
