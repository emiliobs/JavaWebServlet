
package com.mycompany.servlet10.Persistencia;

import com.mycompany.servlet10.Logica.Usuarios;
import java.util.List;

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
}
