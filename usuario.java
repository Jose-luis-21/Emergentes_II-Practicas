/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex
 */
@WebServlet(name = "usuario", urlPatterns = {"/usuario"})
public class usuario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        /*
        Declaramos unos string para recibir los parametros del formulario
        */
        String nombre = request.getParameter("nombre");
        String apellidos= request.getParameter("apellidos");
        String correo= request.getParameter("correo");
        String password= request.getParameter("password");
        try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Practica N° 3</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h2>Datos Recibidos Registro de Usuarios</h2>");
            out.println("<h3>Nombre: " +nombre+"</h3>");
            out.println("<h3>Apellidos: " +apellidos+"</h3>");
            out.println("<h3>Correo: " +correo+"</h3>");
            out.println("<h3>Contraseña: " +password+"</h3>");
            out.println("<br>");            
            out.println("<a href='index.jsp'>Inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
   
}
