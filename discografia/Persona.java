/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Persona: nombre, edad (entre 5 y 90 años incluidos) y sexo (F ó M).
package discografia;

/**
 *
 * @author Negrod
 */
public class Persona {
    private String nombre;
    private int edad;
    private char sexo;

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>5 && edad<90){
        this.edad = edad;
    }else{
            System.out.println("la debe estar entre los 5 anios y los 90");

    }
    }



    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if(sexo=='f'||sexo=='F'||sexo=='m'||sexo=='M'){
        this.sexo = sexo;
        }else{
            System.out.println("El sexo debe ser M o F");
        }
    }
    
    
    
    
}
