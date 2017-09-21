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
public class Asignatura {
    private String sigla;
    private String nombre;
    private int hora;
    public Asignatura() {
         this.sigla = null;
        this.nombre = null;
        this.hora=0;
    }

    public Asignatura(String sigla, String nombre, int hora) {
        setSigla(sigla);
        setNombre(nombre);
        setHora(hora);
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora>0)
        this.hora = hora;
        else
            System.out.println("Horas semanales invalidas");
    }

    @Override
    public String toString() {
        return "Asignatura{" + "sigla=" + sigla 
                + ", nombre=" + nombre 
                + ", hora=" + hora + '}';
    }
    
          
    
}