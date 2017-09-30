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
public class Jugador {
    private int numUnico;
    private String nombre;
    private String genero;
    private String nacionalidad;
    private int edad;
    private boolean prestamo;
    private Equipo equi;

    public Jugador() {
    }

    public Jugador(int numUnico, String nombre, String genero, String nacionalidad, int edad, boolean prestamo, Equipo equi) {
        setNumUnico(numUnico);
        setNombre(nombre);
        setGenero(genero);
        setNacionalidad(nacionalidad);
        setEdad(edad);
        setPrestamo(prestamo);
        setEqui(equi);
    }

    public int getNumUnico() {
        return numUnico;
    }

    public void setNumUnico(int numUnico) {
      if(numUnico>0){
        this.numUnico = numUnico;
      }else{
          System.out.println("Ingrese un numero positivo");
      
      }
          
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if(genero.equalsIgnoreCase("femenino") || genero.equalsIgnoreCase("masculino")) {
        this.genero = genero;
        }else{
            System.out.println("Ingrese un genero correcto");
            }
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>=5 && edad<=42){
        this.edad = edad;
        }else{
            System.out.println("Error: ingrese una edad entre 5 y 42 años");
        }
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }

    public Equipo getEqui() {
        return equi;
    }

    public void setEqui(Equipo equi) {
        this.equi = equi;
    }

    @Override
    public String toString() {
        return "Jugador{" + "numUnico=" + numUnico 
                + ", nombre=" + nombre 
                + ", genero=" + genero 
                + ", nacionalidad=" + nacionalidad 
                + ", edad=" + edad 
                + ", prestamo=" + prestamo 
                + ", equi=" + equi + '}';
    }
    
    
}
