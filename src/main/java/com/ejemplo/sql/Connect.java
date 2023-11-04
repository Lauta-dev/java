package com.ejemplo.sql;

// String jdbcUrl, String usuario, String contraseña, String 

public class Connect {
  private static class ConnectionParams {
    private String jdbcUrl;
    private String usuario;
    private String contraseña;
    private String consulta;

    public ConnectionParams(String jdbcUrl, String usuario, String contraseña, String consulta) {
      this.jdbcUrl = jdbcUrl;
      this.usuario = usuario;
      this.contraseña = contraseña;
      this.consulta = consulta;
    }
  }

}
