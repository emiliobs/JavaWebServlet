
package com.mycompany.servlet10.Logica;



import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuarios implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)     
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;

    public Usuarios()
    {
    }

    public Usuarios(int Id, String dni, String nombre, String apellido, String telefono)
    {
        this.id = Id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int Id)
    {
        this.id = Id;
    }

    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    
    
       
   


   
    
    
}
