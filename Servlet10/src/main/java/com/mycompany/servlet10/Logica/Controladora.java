
package com.mycompany.servlet10.Logica;

import com.mycompany.servlet10.Persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora
{
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
  public  void CrearUsuario(Usuarios usuarios )
  {
      controladoraPersistencia.CrearUSuario(usuarios);
  }
  
  public List<Usuarios> TraerUsuarios()
  {
      return controladoraPersistencia.TraerUsuarios();
  }
}
