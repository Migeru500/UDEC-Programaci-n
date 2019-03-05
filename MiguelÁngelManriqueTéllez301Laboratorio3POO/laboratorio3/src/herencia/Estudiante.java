/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Estudiante extends Persona{
    
    private String carnet;
    private double promedioNotas = 0;
    private int numeroMaterias;
    
    public Estudiante(){
        
    }
    
    public Estudiante(String nombre, String apellido, int edad, double peso, String carnet, int numeroMaterias){
        
        super(nombre, apellido, edad, peso);
        
        this.carnet = carnet;
        this.numeroMaterias = numeroMaterias;
        
    }

    /**
     * @return the carnet
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    /**
     * @return the promedioNotas
     */
    public double getPromedioNotas() {
        return promedioNotas;
    }

    /**
     * @param promedioNotas the promedioNotas to set
     */
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    /**
     * @return the numeroMaterias
     */
    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    /**
     * @param numeroMaterias the numeroMaterias to set
     */
    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    
    public void calcularPromedio(){
        
        promedioNotas /= numeroMaterias;
        
    }
    
    public void leerNotasEstudiante(){

        for(int nota=0; nota<numeroMaterias; nota++){
            
            promedioNotas += leerDatoTipoReal("Digite la nota " + (nota+1) + " del estudiante");
            
        }
        
    }
    
    public void ingresarDatosEstudiante(){
        
        nombre = leerDatoTipoCadena("Digite el nombre del estudiante");
        apellido = leerDatoTipoCadena("Digite el apellido del estudiante");
        edad = leerDatoTipoEntero("Digite la edad del estudiante");
        peso = leerDatoTipoReal("Digite el peso del estudiante");
        carnet = leerDatoTipoCadena("Digite el carnet del estudiante");
        
    }
    
    public void imprimirReporteNotasEstudiante(){
        
        imprimirDatosPersona();
        
        JOptionPane.showMessageDialog(null,
                "\nCarnet: " + carnet +
                "\nNúmero materias: " + numeroMaterias +
                "\nPromedio notas: " + promedioNotas);
        
    }
    
    
}
