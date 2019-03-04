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
public class Calculadora {
    
    public static void main(String[] args){
        //Se instancia la clase creando un objeto
        ObjetoCalculadora calculadora = new ObjetoCalculadora();
        //Se asignan valores a los atributos de la clase
        calculadora.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 1")));
        calculadora.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 2")));
        //Se ejecutan las operaciones
        //Suma
        JOptionPane.showMessageDialog(null,"Suma: " + calculadora.calcularSuma());
        //Resta
        JOptionPane.showMessageDialog(null,"Resta: " + calculadora.calcularResta());
        //Multiplicacion
        JOptionPane.showMessageDialog(null,"Multiplicación: " + calculadora.calcularMultiplicacion());
        //División
        JOptionPane.showMessageDialog(null,"División: " + calculadora.calcularDivision());
    }
    
}
