<%@page import="com.mycompany.servlet10.Logica.Usuarios"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Usuarios</title>
    </head>
    <body>
        
        <h1>Lista de Usuarios Registrados!</h1>
        <hr/>
        <%
           List<Usuarios> listaUsuarios = (List)request.getSession().getAttribute("listaUsuarios");
           int contador = 1;
           
           for (Usuarios usuarios : listaUsuarios)
               {
                    
        %>
        
                     <p><b>Usuarios Número: <%= contador%></b></p>
                     <p>Dni     : <%= usuarios.getDni()%></p>
                     <p>Nombre  : <%= usuarios.getNombre()%></p>
                     <p>Apellido: <%= usuarios.getApellido()%></p>
                     <p>Teléfono: <%= usuarios.getTelefono()%></p>
                <p>--------------------------------------------------</p>
                <% contador +=1; %>
        <%
            }
           
        %>
        
    </body>
</html>
