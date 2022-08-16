/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author SSSA
 */
public class MensajesServices {
    public static void crearMesanje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("tu nombre");
        String nombre = sc.nextLine();
        
        System.out.println("Escribe tu numero de contacto");
        int numero = sc.nextInt();
        
        Mensajes Registro = new Mensajes();
        Registro.setMensaje(mensaje);
        Registro.setAutorMensaje(nombre);
        Registro.setNumero_autor(numero);
        MensajesDAO.crearMensajeDB(Registro);
    }
    public static void listarMensajes(){
        MensajesDAO.leerMensajesDB();
    }
    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("id del mensaje para eliminarlo");
        
        int idMensaje = sc.nextInt();
        MensajesDAO.borrarMensajesDB(idMensaje);
        
    
    }
    public static void editarMesanje(){}
    
}
