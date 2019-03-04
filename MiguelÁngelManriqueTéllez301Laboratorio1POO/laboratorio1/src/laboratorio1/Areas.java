/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Areas {
    
    private double base;
    private double altura;
    private double radio;
    private double areaCuadrado;
    private double areaCirculo;
    private final double pi = 3.1416;
    
    public void leerDatos(double base, double altura, double radio){
        
        this.base = base;
        this.altura = altura;
        this.radio = radio;
        
    }
    
    public void calcularAreaCuadrado(){
        
        areaCuadrado = base*altura;
        
    }
    
    public void calcularAreaCirculo(){
        
        areaCirculo = pi*radio*radio;
        
    }
    
    public void imprimirResultados(){
        
        JOptionPane.showMessageDialog(null, "El área del cuadrado es " + areaCuadrado);
        JOptionPane.showMessageDialog(null, "El área de la circunferencia es " + areaCirculo);
        
    }
    
    public static void main(String args[]){
        
        Areas areas1 = new Areas();
        
        areas1.leerDatos(Double.parseDouble(JOptionPane.showInputDialog("Digite la base del rectángulo")), Double.parseDouble(JOptionPane.showInputDialog("Digite la altura del rectángulo")), Double.parseDouble(JOptionPane.showInputDialog("Digite el radio del círculo")));
        areas1.calcularAreaCuadrado();
        areas1.calcularAreaCirculo();
        areas1.imprimirResultados();
        
    }
    
}
