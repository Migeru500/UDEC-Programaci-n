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
public class Chat{
    
    private String nombre;

    /**
     * @return the nombre
     */
    
    public Chat(){
        
    }
    
    public Chat(String nombre){
        
        this.nombre = nombre;
        
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
    
    public String enviarMensaje(String mensaje){
        
        if(mensaje.toLowerCase().contains("hola"))
            return "¡Hola! ¡Mucho gusto!";
        else if(mensaje.toLowerCase().contains("nombre") || 
                mensaje.toLowerCase().contains("llama"))
            return "Me llamo " + nombre + ".";
        else if(mensaje.toLowerCase().contains("dedicas") || 
                mensaje.toLowerCase().contains("trabajas") || 
                mensaje.toLowerCase().contains("trabaja") || 
                mensaje.toLowerCase().contains("trabajo"))
            return "Me dedico a conversar con cierto tipo de personas para hacer que no se sientan solas.";
        else if(mensaje.toLowerCase().contains("gusta") && 
                mensaje.toLowerCase().contains("hacer") ||
                mensaje.toLowerCase().contains("te") && 
                mensaje.toLowerCase().contains("gusta") )
            return "Me gusta componer música en mis tiempos libres";
        else if(mensaje.toLowerCase().contains("chao") || 
                mensaje.toLowerCase().contains("adiós") || 
                mensaje.toLowerCase().contains("adios") || 
                mensaje.toLowerCase().contains("despido") ||
                mensaje.toLowerCase().contains("hasta luego"))
            return "Chao que estés bien.";
        else if(mensaje.toLowerCase().contains("amas") || 
                mensaje.toLowerCase().contains("me quieres") || 
                (mensaje.toLowerCase().contains("salir")  || mensaje.toLowerCase().contains("sal")) && mensaje.toLowerCase().contains("conmigo") || 
                mensaje.toLowerCase().contains("mi") && (mensaje.toLowerCase().contains("pareja") || mensaje.toLowerCase().contains("novia")) ||
                mensaje.toLowerCase().contains("cita"))
            return "Vas demasiado rápido. Lo siento";
            
        return "Lo siento pero no te entendí.";
       
    }
    
    
}
