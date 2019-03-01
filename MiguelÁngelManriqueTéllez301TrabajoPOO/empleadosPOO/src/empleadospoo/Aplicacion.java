/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadospoo;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        constructorSimple();
        //constructorSobrecargado();
        
    }
    
    public static void constructorSimple(){
        
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();
        Empleado empleado4 = new Empleado();
        Empleado empleado5 = new Empleado();
        
        //Empleado 1//
        empleado1.setNombre(JOptionPane.showInputDialog("Digite el nombre del primer empleado"));
        empleado1.setEdad(Byte.parseByte(JOptionPane.showInputDialog("Digite la edad del primer empleado")));
        empleado1.setDireccion(JOptionPane.showInputDialog("Digite la dirección del primer empleado"));
        empleado1.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Digite el teléfono del primer empleado")));
        
        //Empleado 2//
        empleado2.setNombre(JOptionPane.showInputDialog("Digite el nombre del segundo empleado"));
        empleado2.setEdad(Byte.parseByte(JOptionPane.showInputDialog("Digite la edad del segundo empleado")));
        empleado2.setDireccion(JOptionPane.showInputDialog("Digite la dirección del segundo empleado"));
        empleado2.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Digite el teléfono del segundo empleado")));
        
        //Empleado 3//
        empleado3.setNombre(JOptionPane.showInputDialog("Digite el nombre del tercer empleado"));
        empleado3.setEdad(Byte.parseByte(JOptionPane.showInputDialog("Digite la edad del tercer empleado")));
        empleado3.setDireccion(JOptionPane.showInputDialog("Digite la dirección del tercer empleado"));
        empleado3.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Digite el teléfono del tercer empleado")));
        
        //Empleado 4//
        empleado4.setNombre(JOptionPane.showInputDialog("Digite el nombre del cuarto empleado"));
        empleado4.setEdad(Byte.parseByte(JOptionPane.showInputDialog("Digite la edad del cuarto empleado")));
        empleado4.setDireccion(JOptionPane.showInputDialog("Digite la dirección del cuarto empleado"));
        empleado4.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Digite el teléfono del cuarto empleado")));
        
        //Empleado 5//
        empleado5.setNombre(JOptionPane.showInputDialog("Digite el nombre del quinto empleado"));
        empleado5.setEdad(Byte.parseByte(JOptionPane.showInputDialog("Digite la edad del quinto empleado")));
        empleado5.setDireccion(JOptionPane.showInputDialog("Digite la dirección del quinto empleado"));
        empleado5.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Digite el teléfono del quinto empleado")));
        
        byte numEmpleado = Byte.parseByte(JOptionPane.showInputDialog("Digite el número del empleado del cual desea conocer la información"));
        
        switch(numEmpleado){
            
            case 1:
                
                JOptionPane.showMessageDialog(null, "Empleado 1\n\nNombre: " + empleado1.getNombre() + 
                        "\nEdad: " + empleado1.getEdad() + 
                        "\nDirección: " + empleado1.getDireccion() +
                        "\nTeléfono: " + empleado1.getTelefono());
                
                break;
                
            case 2:
                
                JOptionPane.showMessageDialog(null, "Empleado 2\n\nNombre: " + empleado2.getNombre() + 
                        "\nEdad: " + empleado2.getEdad() + 
                        "\nDirección: " + empleado2.getDireccion() +
                        "\nTeléfono: " + empleado2.getTelefono());
                
                break;
                
            case 3:
                
                JOptionPane.showMessageDialog(null, "Empleado 3\n\nNombre: " + empleado3.getNombre() + 
                        "\nEdad: " + empleado3.getEdad() + 
                        "\nDirección: " + empleado3.getDireccion() +
                        "\nTeléfono: " + empleado3.getTelefono());
                
                break;
            
            case 4:
                
                JOptionPane.showMessageDialog(null, "Empleado 4\n\nNombre: " + empleado4.getNombre() + 
                        "\nEdad: " + empleado4.getEdad() + 
                        "\nDirección: " + empleado4.getDireccion() +
                        "\nTeléfono: " + empleado4.getTelefono());
                
                break;
                
            case 5:
                
                JOptionPane.showMessageDialog(null, "Empleado 5\n\nNombre: " + empleado5.getNombre() + 
                        "\nEdad: " + empleado5.getEdad() + 
                        "\nDirección: " + empleado5.getDireccion() +
                        "\nTeléfono: " + empleado5.getTelefono());
                
                break;
                
            default:
                
                JOptionPane.showMessageDialog(null, "La opción digitada es inválida");
            
        }
        
    }
    
    public static void constructorSobrecargado(){
        
        Empleado empleado1 = new Empleado(JOptionPane.showInputDialog("Digite el nombre del primer empleado"), Byte.parseByte(JOptionPane.showInputDialog("Digite la edad del primer empleado")), JOptionPane.showInputDialog("Digite la dirección del primer empleado"), Long.parseLong(JOptionPane.showInputDialog("Digite el teléfono del primer empleado")));
        Empleado empleado2 = new Empleado(JOptionPane.showInputDialog("Digite el nombre del segundo empleado"), Byte.parseByte(JOptionPane.showInputDialog("Digite la edad del segundo empleado")), JOptionPane.showInputDialog("Digite la dirección del segundo empleado"), Long.parseLong(JOptionPane.showInputDialog("Digite el teléfono del segundo empleado")));
        Empleado empleado3 = new Empleado(JOptionPane.showInputDialog("Digite el nombre del tercer empleado"), Byte.parseByte(JOptionPane.showInputDialog("Digite la edad del tercer empleado")), JOptionPane.showInputDialog("Digite la dirección del tercer empleado"), Long.parseLong(JOptionPane.showInputDialog("Digite el teléfono del tercer empleado")));
        Empleado empleado4 = new Empleado(JOptionPane.showInputDialog("Digite el nombre del cuarto empleado"), Byte.parseByte(JOptionPane.showInputDialog("Digite la edad del cuarto empleado")), JOptionPane.showInputDialog("Digite la dirección del cuarto empleado"), Long.parseLong(JOptionPane.showInputDialog("Digite el teléfono del cuarto empleado")));
        Empleado empleado5 = new Empleado(JOptionPane.showInputDialog("Digite el nombre del quinto empleado"), Byte.parseByte(JOptionPane.showInputDialog("Digite la edad del quinto empleado")), JOptionPane.showInputDialog("Digite la dirección del quinto empleado"), Long.parseLong(JOptionPane.showInputDialog("Digite el teléfono del quinto empleado")));
       
        byte numEmpleado = Byte.parseByte(JOptionPane.showInputDialog("Digite el número del empleado del cual desea conocer la información"));
        
        switch(numEmpleado){
            
            case 1:
                
                JOptionPane.showMessageDialog(null, "Empleado 1\n\nNombre: " + empleado1.getNombre() + 
                        "\nEdad: " + empleado1.getEdad() + 
                        "\nDirección: " + empleado1.getDireccion() +
                        "\nTeléfono: " + empleado1.getTelefono());
                
                break;
                
            case 2:
                
                JOptionPane.showMessageDialog(null, "Empleado 2\n\nNombre: " + empleado2.getNombre() + 
                        "\nEdad: " + empleado2.getEdad() + 
                        "\nDirección: " + empleado2.getDireccion() +
                        "\nTeléfono: " + empleado2.getTelefono());
                
                break;
                
            case 3:
                
                JOptionPane.showMessageDialog(null, "Empleado 3\n\nNombre: " + empleado3.getNombre() + 
                        "\nEdad: " + empleado3.getEdad() + 
                        "\nDirección: " + empleado3.getDireccion() +
                        "\nTeléfono: " + empleado3.getTelefono());
                
                break;
            
            case 4:
                
                JOptionPane.showMessageDialog(null, "Empleado 4\n\nNombre: " + empleado4.getNombre() + 
                        "\nEdad: " + empleado4.getEdad() + 
                        "\nDirección: " + empleado4.getDireccion() +
                        "\nTeléfono: " + empleado4.getTelefono());
                
                break;
                
            case 5:
                
                JOptionPane.showMessageDialog(null, "Empleado 5\n\nNombre: " + empleado5.getNombre() + 
                        "\nEdad: " + empleado5.getEdad() + 
                        "\nDirección: " + empleado5.getDireccion() +
                        "\nTeléfono: " + empleado5.getTelefono());
                
                break;
                
            default:
                
                JOptionPane.showMessageDialog(null, "La opción digitada es inválida");
            
        }
        
        
    }
}
