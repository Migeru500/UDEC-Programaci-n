/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadospoo;

/**
 *
 * @author acer
 */
public class Empleado {
    
    private String nombre;
    private byte edad;
    private String direccion;
    private long telefono;

    /**
     * @return the nombre
     */
    
    public Empleado(){
        
    }
    
    public Empleado(String nombre, byte edad, String direccion, long telefono){
        
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        
    }
    
    public String getNombre() {
        
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public byte getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(byte edad) {
        this.edad = edad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
}
