
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
    </head>
    <body>
        <h1>Datos del Cliente</h1>
        <hr/>
        <form action="SvUsuarios" method="POST">
            <p><label>Dni:</label><input type="text" name="txtDni"></p>
            <p><label>Nombre:</label><input type="text" name="txtNombre"></p>
            <p><label>Apellido:</label><input type="text" name="txtApellido"></p>
            <p><label>Teleéfono:</label><input type="text" name="txtTelefono"></p>
            <button type="submit">Enviar</button>
        </form>
        
        <h1>Ver lsita de Usuarios</h1>
         <hr/>
        <p>Para ver los datos de los Usuarios cargado haga click en el Botón</p>
        <form action="SvUsuarios" method="get">
            <button type="submit">Mostrar Usuarios</button>      

        </form>
        
        <h1>Eliminar Usuarios</h1>
         <hr/>
        <p>Ingrese el ID del Usuario a Eliminar!</p>
        <form action="SvEliminar" method="post">
            <p><label>Id: </label><input type="text" name="txtIdUsuario"/></p>
            <button type="submit">Eliminar Usuario</button>      

        </form>
        
        <h1>Editar Usuarios</h1>
         <hr/>
        <p>Ingrese el ID del Usuario a Editar!</p>
        <form action="SvEditar" method="get">
            <p><label>Id: </label><input type="text" name="txtIdUsuarioEdit"/></p>
            <button type="submit">Editar Usuario</button>      

        </form>
        
    </body>
</html>
