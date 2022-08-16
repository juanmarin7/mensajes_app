/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SSSA
 */
public class MensajesDAO {
    public static void crearMensajeDB(Mensajes mensaje){
    Conexion db_connect = new Conexion();
    
        try(Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String insertDatos = ("insert into mensajes(mensaje,autor_mensaje,numero_autor,fecha_mensaje) values (?,?,?,current_timestamp());");
                ps = conexion.prepareStatement(insertDatos);
                ps.setString(1,mensaje.getMensaje());
                ps.setString(2,mensaje.getAutorMensaje());
                ps.setInt(3,mensaje.getNumero_autor());
                ps.executeUpdate();
                System.out.println("\nMensaje Creado con exito");
                System.out.println("\n--------------------------");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void leerMensajesDB(){
        
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try(Connection conexion = db_connect.get_connection()) {
                  String MostrarDatos = ("select * from mensajes;");
                  ps = conexion.prepareStatement(MostrarDatos);
                  rs=ps.executeQuery();
                  
              while (rs.next()) {
                  System.out.println("ID:\n"+rs.getInt("id_mensaje"));
                  System.out.println("Mensaje:\n "+rs.getString("mensaje"));
                  System.out.println("Autor:\n "+rs.getString("autor_mensaje"));
                  System.out.println("Numero autor:\n "+rs.getInt("numero_autor"));
                  System.out.println("Fecha Mensaje:\n "+rs.getDate("fecha_mensaje"));
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void borrarMensajesDB(int idMensaje){
        Conexion db_connect = new Conexion();
        
        
        try(Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String BorrarDatos = ("delete from mensajes where id_mensaje =?");
                ps = conexion.prepareStatement(BorrarDatos);
                ps.setInt(1, idMensaje);
                ps.executeUpdate();
                System.out.println("Se elimino el mensaje");
            } catch (SQLException e) {
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }
    public static void actualizarMensajeDB(Mensajes mensaje){}
}
