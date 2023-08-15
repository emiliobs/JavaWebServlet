
package com.mycompany.servlet10.Persistencia;

import com.mycompany.servlet10.Logica.Usuarios;
import com.mycompany.servlet10.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia
{
    UsuariosJpaController usuariosJpaController = new UsuariosJpaController();
    
     //Operacion Create
    public   void  CrearUSuario(Usuarios usuarios)
    {
        usuariosJpaController.create(usuarios);
    }
    
    //Operacion READ
    public  List<Usuarios> TraerUsuarios()
    {
        return  usuariosJpaController.findUsuariosEntities();
    }

    public void BorrarUsuario(int IdEliminar)
    {
        try
        {
            usuariosJpaController.destroy(IdEliminar);
        }
        catch (NonexistentEntityException ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
