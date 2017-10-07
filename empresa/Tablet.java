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
//clase final quiere decir que no hereda
public final class Tablet extends Computador {
   private String modeloLapiz;

    public Tablet() {
        super();
    }

    public Tablet(String modeloLapiz, int codigo, int memoria, int precioVenta, int stock, boolean touch, Marca unaMarca) {
        super(codigo, memoria, precioVenta, stock, touch, unaMarca);
        
        this.modeloLapiz = modeloLapiz;
        setModeloLapiz(modeloLapiz);
    }

    public String getModeloLapiz() {
        return modeloLapiz;
    }

    public void setModeloLapiz(String modeloLapiz) {
        if(modeloLapiz !=null){
        this.modeloLapiz = modeloLapiz;
        }else{
            System.out.println("Error ingrese algo valido");
        }
    }

    @Override
    public String toString() {
        return "Tablet{" + "modeloLapiz=" + modeloLapiz + '}';
    }
   
   
     @Override
     
    public int precioFinal(int cantidad)
    {
        int precio_total=0; int total=0;
        precio_total= super.getPrecioVenta()*cantidad;
        total=precio_total-(int)(precio_total* DESCUENTO_TABLET);
        return total;
    }
}
