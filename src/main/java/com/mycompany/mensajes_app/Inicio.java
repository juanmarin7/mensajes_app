/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author SSSA
 */
public class Inicio {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("Aplicacion de Mensajes");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar Mensajes");
            System.out.println("3. Editar Mensaje");
            System.out.println("4. Eliminar Mensaje");
            System.out.println("5. Salir");
            
            //leer opcion de teclado
            opcion = sc.nextInt();
            //int i;
            switch (opcion) {
                case 1:
                    MensajesServices.crearMesanje();
                    break;
                case 2:
                    MensajesServices.listarMensajes();
                    break;
                case 3:
                    MensajesServices.editarMesanje();
                    break;
                case 4:
                    MensajesServices.borrarMensaje();
                    break;
                case 5:
                    System.out.println("Saliendo del proceso");
                    //System.exit(i);
                    
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (opcion != 5);
        
        /*
        Conexion conexion = new Conexion();
        
        try(Connection cnx = conexion.get_connection()) {
            
        } catch (Exception e) {
            System.out.println(e);
        }

*/
        
    }
}
