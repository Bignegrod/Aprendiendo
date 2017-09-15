
package automotora;

 class Vehiculo {
    private String tipo;
    private String patente;
    private boolean usado;
    private int precio;
    private char transmision;
    private int kilometraje;
    private Distribuidor proveedor;

    public Vehiculo() {
        this.tipo=null;
        this.patente=null;
        this.usado=false;
        this.precio=0;
        this.transmision=' ';
        this.kilometraje=0;
        
        
        
        
        
        
    }

    public Vehiculo(String tipo, String patente, boolean usado, int precio, char transmision,  int kilometraje, Distribuidor proveedor) {
        setTipo  (tipo);
        setPatente  (patente);
        setUsado ( usado);
        setPrecio (precio);
        setTransmision (transmision);
        setKilometraje(kilometraje);
        setProveedor (proveedor);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo.equals("camioneta")||tipo.equals("automovil"))
        this.tipo = tipo;
        
        else
            System.out.println("Error:Ingrese un tipo de Vehiculo correcto");
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if(patente.trim().length()==6)
        this.patente = patente;
        else    
            System.out.println("Error:La petente debe tener largo 6");
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio>=450000 && precio<=18000000)
        this.precio = precio;
        else
            System.out.println("Error:Precio de costo fuera de rango ");
    }

    public char getTransmision() {
        return transmision;
    }

    public void setTransmision(char transmision) {
        if(transmision=='M'|| transmision=='A' )
        this.transmision = transmision;
        else
            System.out.println("La Transmision debe ser M o A");
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
    public Distribuidor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Distribuidor proveedor) {
        this.proveedor = proveedor;
    }
    
    
    
    public void imprimirVehiculo(){
        
        System.out.println("Tipo:"+getTipo());
        System.out.println("Patente:"+getPatente());
        System.out.println("Usado:"+isUsado());
        System.out.println("Precio:"+getPrecio());
        System.out.println("Transimision:"+getTransmision());
        System.out.println("Kilometraje:"+getKilometraje());
        System.out.println("--------------------Proveedor--------------------");
        getProveedor().imprimirDistribuidor();
        
        
        
    }
    
    
//   public String detalle(){//no resive parametros pq tiene todos los datos como aributo
//      
//       return getPatente()+"-"+getTipo()+"-"+getProveedor().getNombre();
//   }
   public String detalle(){//no resive parametros pq tiene todos los datos como aributo
      String retornar=null;
     retornar=getPatente()+"-"+getTipo()+"-"+getProveedor().getNombre();
      return retornar;
      }
   
  public float precioVenta( float iva){
      float precio_venta=0f;
    
      float monto_iva=0f;
      
      
      monto_iva=getPrecio()+(getPrecio()*iva/100);
      precio_venta=monto_iva;
      return precio_venta;
  }
  public float consumoBencina(float bencina, float kilometros){
      return bencina*kilometros;
  }
  public float descuento(String marca){
     float desc=0f;
     if (isUsado()){
        if(!(marca.equals("citroen")))
        {
         desc=getPrecio()*10/100;
        }
     }
         return desc;
     }
  
  
  
 public int cantidadKilometraje(){
     int cant=0;
     
     //isUsado retorna verdadero es un auto usado si retorna falso es un auto nuevo
     if(!isUsado()){
         if(getTipo().equals("automovil"))
         {
             cant=100000-getKilometraje();
         }
         else
         {
             cant=150000-getKilometraje();
         }
         
     }
     
     if(cant<0)
     {
         cant=0;
     }
     return cant;
     
   }
 
 
 
 public String convenio(boolean revisionTec)
 {
     String mensaje=null;
     if(revisionTec && getKilometraje()<55000){
         mensaje="Usted tiene descuento por el 40%";
                 }
     return mensaje;
     
 }
        
  }
