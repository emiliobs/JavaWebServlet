package com.mycompany.servlet10;

import com.mycompany.servlet10.Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

@WebServlet(name = "SvEliminar", urlPatterns =
{
    "/SvEliminar"
})
public class SvEliminar extends HttpServlet
{

    Controladora controladora = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        int IdEliminar = Integer.parseInt(request.getParameter("txtIdUsuario"));

     
        
        try
        {
           
                controladora.BorrarUsuario(IdEliminar);
                response.sendRedirect("index.jsp");
           

        }
        catch (Exception e)
        {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
