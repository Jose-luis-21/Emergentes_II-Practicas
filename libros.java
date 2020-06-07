
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "libros", urlPatterns = {"/libros"})
public class libros extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        String titulo = request.getParameter("titulo");
        String autor= request.getParameter("autor");
        String resumen= request.getParameter("resumen");
        String medio= request.getParameter("medio");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Practica N° 3</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h2>Datos Recibidos Registro de Libros</h2>");
            out.println("<h3>Titulo: " +titulo+ "</h3>");
            out.println("<h3>Autor: " +autor+ "</h3>");
            out.println("<h3>Resumen: " +resumen+ "</h3>");
            out.println("<h3>Medio: " +medio+ "</h3>");
            out.println("<br>");            
            out.println("<a href='index.jsp'>Inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
