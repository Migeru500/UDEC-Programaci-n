/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author acer
 */
//clase que define las caracteríscticas del producto
public class Producto implements Comparable<Producto>{ 
    
    private String nombre; 
    private int cantidad; 
    //constructor de la clase producto
    
    public Producto(String s, int i) { 
        nombre = s; 
        cantidad = i;
    }   
    //método de la clase object
    public String toString(){ 
        return ("Nombre: "+nombre+" Cantidad: "+cantidad); 
    }    
    //métodos de encapsulamiento
    public String getNombre() { 
        return this.nombre;
    }

    @Override
    public int compareTo(Producto o) {
      
        return nombre.compareTo(o.getNombre());
        
    }
  
    
}
