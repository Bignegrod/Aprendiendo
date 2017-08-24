
package eje4;

/*
Autor:Gabriel salazar
fecha 23-08-17

*/
public class Medico {
    
    private String nombresApellidos;
    private String rut;
    private int telefono;
    private String direccion;
    private char genero;
    private boolean estaCasado ;
    private int sueldoBase;

    public Medico() {
        
        this.nombresApellidos="";
        this.rut="";
        this.telefono=0;
        this.direccion="";
        this.genero=' ' ;
        this.estaCasado=true;
        this.sueldoBase=0; 
        
    }

    public Medico(String nombresApellidos, String rut, int telefono, String direccion, char genero, boolean estaCasado, int sueldoBase) {
        setNombresApellidos(nombresApellidos);
        setRut(rut);
        setTelefono(telefono);
        setDireccion(direccion);
        setGenero(genero);
        setEstaCasado(estaCasado);
        setSueldoBase(sueldoBase);
    }

 

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if(rut.trim().length()>9)
        {
       
        this.rut = rut;
        }else{
            System.out.println("Error: El largo del rut debe ser mayor a 9");
        }
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        if(telefono>9999)
        {
        this.telefono = telefono;
        }else{
            System.out.println("Ingrese un Telefono correcto");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        if(genero=='M'|| genero=='m' || genero=='F' || genero=='f')
        {
        
        this.genero = genero;
        }else{
            System.out.println("Ingrese un genero correcto");
            
        }
    }

    public boolean isEstaCasado() {
        return estaCasado;
    }

    public void setEstaCasado(boolean estaCasado) {
        this.estaCasado = estaCasado;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        if(sueldoBase>=250000 && sueldoBase<=6000000)
        {
            
        this.sueldoBase = sueldoBase;
        
        }else{
            System.out.println("Ingrese un sueldo base correcto");
        }
        
    }
   
        
    public void imprimirMedio(){
        
        
        System.out.println("Nombre Medico:"+getNombresApellidos());
        System.out.println("rut:"+getRut());
        System.out.println("Telefono:"+getTelefono());
        System.out.println("Direccion:"+getDireccion());
        if(getGenero()=='F')
            System.out.println("Genero:Femenino");
    else
            System.out.println("Genero:Masculino");
        
        if (isEstaCasado())
            System.out.println("Estado civil:Casado");
        else
            
        System.out.println("Estado civil:Soltero");
        System.out.println("Sueldo base:"+getSueldoBase());
        
    }
    
    
    public String retornoDatos(){
        
        String datos = "";
        
        datos = getRut()+", "+getNombresApellidos()+", "+getTelefono()+", "+getSueldoBase();
        return datos;
        
        
    }
            
    
}
