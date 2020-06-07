
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "curso", urlPatterns = {"/curso"})
public class curso extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        /*
        Declaramos unos string para recibir los parametros del formulario
        */
        String nombre = request.getParameter("nombre");
        String apellidos= request.getParameter("apellidos");
        String curso= request.getParameter("curso");
        try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HolaMundo</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h3>Datos Recibidos Inscripcion en curso</h2>");
            out.println("<h3>Nombre: " +nombre+ "</h3>");
            out.println("<h3>Apellidos: " +apellidos+ "</h3>");
            out.println("<h3>Curso: " +curso+ "</h3>");
            out.println("<br>");
            out.println("<a href='index.jsp'>Inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
   
}
