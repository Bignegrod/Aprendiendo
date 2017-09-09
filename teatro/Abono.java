/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatro;

/**
 *
 * @author duoc
 */
public class Abono {
    private String codigo ;
    private int numeroButaca;
    private int valorAs;
    private int funciones;
    private String fechaVigencia;
    private Abonado abon;

    public Abono() {
        this.codigo = "";
        this.numeroButaca = 0;
        this.valorAs = 0;
        this.funciones = 0;
        this.fechaVigencia = "";
        this.abon = new Abonado();//new asegura la colaboracion
    }

    public Abono(String codigo, int numeroButaca, int valorAs, int funciones, String fechaVigencia, Abonado abon) {
        setCodigo (codigo);
        setNumeroButaca  (numeroButaca);
        setValorAs (valorAs);
        setFunciones   (funciones);
        setFechaVigencia  (fechaVigencia);
        setAbon (abon);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumeroButaca() {
        return numeroButaca;
    }

    public void setNumeroButaca(int numeroButaca) {
        if(numeroButaca>=1 && numeroButaca<=700)
        this.numeroButaca = numeroButaca;
        else
            System.out.println("Error:Ingres eun numero valido  ");
    }

    public int getValorAs() {
        return valorAs;
    }

    public void setValorAs(int valorAs) {
        if(valorAs>200000)
        this.valorAs = valorAs;
        else
            System.out.println("Error:Ingrese un Valor valido");
    }

    public int getFunciones() {
        return funciones;
    }

    public void setFunciones(int funciones) {
        if(funciones>5)
        this.funciones = funciones;
        else
            System.out.println("Error");
    }

    public String getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(String fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public Abonado getAbon() {
        return abon;
    }

    public void setAbon(Abonado abon) {
        this.abon = abon;
    }
    
    public void imprimirAbono(){
        
        System.out.println("Codigo:"+getCodigo());
        System.out.println("Numero butaca:"+getNumeroButaca());
        System.out.println("valorAs:"+getValorAs());
        System.out.println("Funciones:"+getFunciones());
        System.out.println("Fecha vigencia:"+getFechaVigencia());
        getAbon().imprimirAbonado();
        
    }
    
    
    public float descuentoAbonado(float desc){
        float pagoFinal=0;
        
        pagoFinal=getValorAs()-getValorAs()*desc/100;
        
        return pagoFinal;
        
        //casteo return (int)pagoFinal;
        //es forzar el float a int
    }
    
    public void verFicha()
    {
        System.out.println("**********************");
        System.out.println("    Aboado:"+getAbon().getNombreCom());
        System.out.println("**********************");
        System.out.println("Abono Semestral:"+getValorAs());
        System.out.println("**********************");
        System.out.println("Cantidad de funciones"+getFunciones()+"Funciones");
        System.out.println("**********************");
        
    }
    public int saldoFunciones(int cantAs)
    {
        int saldo=0;
        saldo=getFunciones()-cantAs;
        return saldo;
    }
}
