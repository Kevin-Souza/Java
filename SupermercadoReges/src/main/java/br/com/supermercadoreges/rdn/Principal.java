package br.com.supermercadoreges.rdn;

import java.sql.Connection;
import java.sql.SQLException;

public class Principal {
    public static void main(String[]args) throws SQLException {
        Connection conn = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta");
        conn.close();
    }
}
