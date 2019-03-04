/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author acer
 */
public class ProgramaInterfaz {
    
    public static void main(String arg[]) {
        
        Persona pavaroti = new Persona();
        hacerCantar(pavaroti);
        Canario piolin = new Canario();
        hacerCantar(piolin);
        //El burro de Shrek se llama Burro
        Burro burro = new Burro();
        hacerCantar(burro);
        
    }
    
    public static void hacerCantar(PuedeCantar cantor) {
        
        cantor.cantar();
            
    }
    
}
