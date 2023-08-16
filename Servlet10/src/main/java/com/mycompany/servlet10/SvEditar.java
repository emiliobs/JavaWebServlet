
package com.mycompany.servlet10;

import com.mycompany.servlet10.Logica.Controladora;
import com.mycompany.servlet10.Logica.Usuarios;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditar", urlPatterns =
{
    "/SvEditar"
})
public class SvEditar extends HttpServlet
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
       int IdEditar = Integer.parseInt(request.getParameter("txtIdUsuarioEdit"));
        Usuarios usuarioEditar = controladora.TraerUsuarioPorId(IdEditar);
                  
       HttpSession miSesion = request.getSession();
       miSesion.setAttribute("usuarioEditar", usuarioEditar);
       
       response.sendRedirect("editar.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String dni = request.getParameter("txtDni");
         String nombre = request.getParameter("txtNombre");
         String apellido = request.getParameter("txtApellido");
         String telefono = request.getParameter("txtTelefono");
         
         Usuarios usuariosEditar = (Usuarios) request.getSession().getAttribute("usuarioEditar");
         usuariosEditar.setDni(dni);
         usuariosEditar.setNombre(nombre);
         usuariosEditar.setApellido(apellido);
         usuariosEditar.setTelefono(telefono);
        
         controladora.EditarUsuario(usuariosEditar);
         
         response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
