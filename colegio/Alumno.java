/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author duoc
 */
public class Alumno {
    
   private String rut;
   private String nombre;
   private String apellidoPa;
   private int edad;

    public Alumno() {
        this.rut = null;
        this.nombre = null;
        this.apellidoPa = null;
        this.edad = 0;
    }

    public Alumno(String rut, String nombre, String apellidoPa, int edad) {
        setRut  (rut);
        setNombre  (nombre);
        setApellidoPa (apellidoPa);
        setEdad (edad);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if(getRut().trim().length()>10)
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre!=null)
        this.nombre = nombre;
        else
            System.out.println("Ingrese un nombre correcto");
    }

    public String getApellidoPa() {
        return apellidoPa;
    }

    public void setApellidoPa(String apellidoPa) {
          if(apellidoPa!=null)
        this.apellidoPa = apellidoPa;
          System.out.println("Ingrese un apellido correcto");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>=5 && edad<=25)
        this.edad = edad;
        else
            System.out.println("Ingres una edad correcta");
    }

    @Override  //sobreescribir metodo to string
    public String toString() {
        return "Alumno{" + "rut=" + rut 
                + ", nombre=" + nombre 
                + ", apellidoPa=" + apellidoPa
                + ", edad=" + edad + '}';
    }

    
   
}
