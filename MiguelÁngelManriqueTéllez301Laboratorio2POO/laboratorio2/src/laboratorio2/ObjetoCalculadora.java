/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class ObjetoCalculadora{
    //Atributos
    private int numero1;
    private int numero2;
    
    //Constructor
    public ObjetoCalculadora(){
        super();
    }
    //Getters y setters
    public void setNumero1(int numero1){
        if(numero1<=0){
            
            JOptionPane.showMessageDialog(null, "El número debe ser mayor a cero");
            setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Digite nuevamente el número")));
            
        }
        else this.numero1 = numero1;
    }
    
    public int getNumero1(){
        return numero1;
    }
    
    public void setNumero2(int numero2){
        if(numero2<=0){
            
            JOptionPane.showMessageDialog(null, "El número debe ser mayor a cero");
            setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Digite nuevamente el número")));
            
        }
        else this.numero2 = numero2;
    }
    
    public int getNumero2(){
        return numero2;
    }
    
    //Métodos para calcular cada operación
    public int calcularSuma (){
        return numero1 + numero2;
    }
    
    public int calcularResta (){
        return numero1 - numero2;
    }
    
    public int calcularMultiplicacion (){
        return numero1 * numero2;
    }
    
    public int calcularDivision (){
        return numero1 / numero2;
    }
}
