package com.mycompany.servlet10;

import com.mycompany.servlet10.Logica.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvUsuarios", urlPatterns =
{
    "/SvUsuarios"
})
public class SvUsuarios extends HttpServlet
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        List<Usuarios> listUsuarios = new ArrayList<>();
//        listUsuarios.add(new Usuarios("11111", "Canelo", "Sexto", "1234111"));
//        listUsuarios.add(new Usuarios("22222", "Lina", "Linda", "09875"));
//        listUsuarios.add(new Usuarios("33333", "Gabriela", "Minovia", "39456"));
//        listUsuarios.add(new Usuarios("44444", "Oscar", "Renta", "95463"));
//        listUsuarios.add(new Usuarios("55555", "Emilio", "Barrera", "12345"));
  
        HttpSession miSession  = request.getSession();
        miSession.setAttribute("listaUsuarios", listUsuarios);
        
        response.sendRedirect("mostrarUsuarios.jsp");
        
    
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String dni = request.getParameter("txtDni");
        String nombre = request.getParameter("txtNombre");
        String apellido = request.getParameter("txtApellido");
        String telefono = request.getParameter("txtTelefono");

        System.out.println("Dni: " + dni + " Nombre: " + nombre + " Apellido: " + apellido + " Teléfono" + telefono);
    }

    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
