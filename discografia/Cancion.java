 ;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Cancion: nombre (largo mínimo 2 caracteres), duración en segundos (mayor a 1 minuto), en Vivo (true si es en vivo, false en caso contrario) e intérprete (una  Persona).
package discografia;

/**
 *
 * @author Negrod
 */
public class Cancion {
    private String nombre;
    private int duracion;
    private boolean vivo;
    private Persona interprete;

    public Cancion(String nombre, int duracion, boolean vivo, Persona interprete) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.vivo = vivo;
        this.interprete = interprete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.trim().length()>=2){
        this.nombre = nombre;
        }else{
            System.out.println("Tiene que tener minimo dos caracteres para el nombre");
        }
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if(duracion>60){
        this.duracion = duracion;
        }else{
            System.out.println("La cancion debe tener una duracion minima de 60 segundos");
        }
        
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public Persona getInterprete() {
        return interprete;
    }

    public void setInterprete(Persona interprete) {
        this.interprete = interprete;
    }
    
    
    
}
