
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "productos", urlPatterns = {"/productos"})
public class productos extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
        Declaramos unos string para recibir los parametros del formulario
        */
        String producto = request.getParameter("producto");
        String categoria= request.getParameter("categoria");
        String existencia= request.getParameter("existencia");
        String precio= request.getParameter("precio");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Practica N° 3</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h3>Datos Recibidos Registro de Productos</h3>");
            out.println("<h3>Producto: " +producto+ "</h3>");
            out.println("<h3>Categoria: " +categoria+ "</h3>");
            out.println("<h3>Existencia: " +existencia+ "</h3>");
            out.println("<h3>Precio: " +precio+ "</h3>");
            out.println("<br>");            
            out.println("<a href='index.jsp'>Inicio</a>");
            out.println("</body>");
            out.println("</html>");;
        }
    }

}
