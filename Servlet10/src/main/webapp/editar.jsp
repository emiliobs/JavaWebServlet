<%@page import="com.mycompany.servlet10.Logica.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuarios</title>
    </head>
    <body>
        <% Usuarios usuario = (Usuarios) request.getSession().getAttribute("usuarioEditar"); %>
          <h1>Editar Usuarios</h1>
        <hr/>
        <form action="SvEditar" method="POST">
            <p><label>Dni      :</label><input type="text" name="txtDni" value="<%=usuario.getDni() %>"></p>
            <p><label>Nombre   :</label><input type="text" name="txtNombre" value="<%=usuario.getNombre() %>"></p>
            <p><label>Apellido :</label><input type="text" name="txtApellido" value="<%=usuario.getApellido()%>"></p>
            <p><label>Teleéfono:</label><input type="text" name="txtTelefono" value="<%=usuario.getTelefono() %>"></p>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
