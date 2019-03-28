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
public class Producto {
    
    private String nombre;
    
    private int cantidad;
    
    private double iva;
    
    private double precio;
    
    private int contadorVentas = 0;
    
    public Producto(){
        
    }
    
    public Producto(String nombre, int cantidad, double iva, double precio){
        
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.iva = iva;
        this.precio = precio;
        
    }

    /**
     * @return the nombre
     */
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
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getContadorVentas(){
        return contadorVentas;
    }
    
    public void setContadorVentas(int contadorVentas){
        
        this.contadorVentas = contadorVentas;
        
    }
    
    
    
}
