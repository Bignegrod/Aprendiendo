/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author duoc
 */
public class Marca {
    private String nombre;
    private int identidicador;

    public Marca() {
    }

    public Marca(String nombre, int identidicador) {
        setNombre(nombre);
        setIdentidicador(identidicador);
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentidicador() {
        return identidicador;
    }

    public void setIdentidicador(int identidicador) {
        this.identidicador = identidicador;
    }

    @Override
    public String toString() {
        return "Marca{" + "nombre=" + nombre + ", identidicador=" + identidicador + '}';
    }
    
    
    
}
