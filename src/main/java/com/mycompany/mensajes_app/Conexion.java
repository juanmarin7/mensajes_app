/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;

/**
 *
 * @author SSSA
 */
public class Conexion {
    public Connection get_connection(){
        Connection conec = null;
        try {
            conec = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","3lp3p3");
          
        } catch (Exception e) {
            System.out.println(e);
        }
        return conec;
    }
}
