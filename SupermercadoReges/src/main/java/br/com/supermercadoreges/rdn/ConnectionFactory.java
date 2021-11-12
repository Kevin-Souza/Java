/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.supermercadoreges.rdn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private String URL = "jdbc:mysql://localhost:3306/db_supermercado_reges";
    private String USER = "root";
    private String PASSWORD = "654321";

    public Connection getConnection() {
        
        try {
            //return DriverManager.getConnection(URL, USER, PASSWORD);
            return DriverManager.getConnection(this.URL,this.USER,this.PASSWORD);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
