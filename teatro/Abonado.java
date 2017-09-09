package teatro;


public class Abonado {
    private String rut;
    private String nombreCom;
    private int celular;
    private String email;
    private char tipo;
    private boolean activo;
      public Abonado() {
        this.rut = " ";
        this.nombreCom = " ";
        this.celular = 0;
        this.email = " ";
        this.tipo = ' ';
        this.activo=true;
    }
    
    
    
    public Abonado(String rut, String nombreCom, int celular, String email, char tipo, boolean activo) {
        setRut(rut);
        setNombreCom  (nombreCom);
        setCelular  (celular);
        setEmail  (email);
        setTipo ( tipo);
        setActivo(activo);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if(rut.trim().length()>=10)
            
        this.rut = rut;
        else
            System.out.println("Error:Ingrese un rut correcto   ");
    }

    public String getNombreCom() {
        return nombreCom;
    }

    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getTipo() {
        return tipo;
    }
    
    
    public void setTipo(char tipo) {
        if(tipo=='p' || tipo=='P' || tipo=='e' || tipo=='E')
        this.tipo = tipo;
        else
            System.out.println("Error: Ingrese un tipo correcto");
        
        
    }
    public boolean isActivo(){
        return activo;
    }
    public void setActivo(boolean activo){
        
        this.activo=activo;
    }
    
    
    
    public void imprimirAbonado(){
        
        System.out.println("Rut:"+getRut());
        System.out.println("Nombre Completo:"+getNombreCom());
        System.out.println("Celular:"+getCelular());
        System.out.println("Email:"+getEmail());
        System.out.println("Es activo:"+isActivo());
        
        if(tipo=='p'||tipo=='P')
            System.out.println("Tipo:Preferente");
        else
            System.out.println("Tipo:Estandar");
        
    }
        
public float reservarPalco(int precioNormal, float desc)
{
    float precioReserva=0f;
    
    if(isActivo())
    {
        precioReserva=precioNormal-(precioNormal*desc/100);
        
    }
    else{
        precioReserva=precioNormal;
    }
    return precioReserva;
}
}
