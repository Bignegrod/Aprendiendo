/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afup;

/**
 *
 * @author duoc
 */
public class Equipo {
    private String rolUnico;
    private String nombre;

    public Equipo() {
    }

    public Equipo(String rolUnico, String nombre) {
        this.rolUnico = rolUnico;
        this.nombre = nombre;
    }

    public String getRolUnico() {
        return rolUnico;
    }

    public void setRolUnico(String rolUnico) {
        if(rolUnico.trim().length()==5){
        this.rolUnico = rolUnico;
        }else{
            System.out.println("Error:Ingrese un rol de 5 caracter ");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Equipo{" + "rolUnico=" + rolUnico 
                + ", nombre=" + nombre + '}';
    }
    
}
