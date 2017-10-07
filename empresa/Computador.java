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
public abstract class Computador implements Descontable {
    protected int codigo,memoria,precioVenta,stock;
    protected boolean touch;
    protected Marca unaMarca;

    public Computador() {
    }

    public Computador(int codigo, int memoria, int precioVenta, int stock, boolean touch, Marca unaMarca) {
        setCodigo(codigo);
        setMemoria(memoria);
        setPrecioVenta(precioVenta);
        setStock(stock);
        setTouch(touch);
        setUnaMarca(unaMarca);
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        if(precioVenta>1000)
        this.precioVenta = precioVenta;
        else
            System.out.println("Ingrese un valor valido");
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock>0){
        this.stock = stock;
        }else{
            System.out.println("Error: Stock tiene que ser mayor a 0");
        }
    }

    public boolean isTouch() {
        return touch;
    }

    public void setTouch(boolean touch) {
        this.touch = touch;
    }

    public Marca getUnaMarca() {
        return unaMarca;
    }

    public void setUnaMarca(Marca unaMarca) {
        this.unaMarca = unaMarca;
    }

    @Override
    public String toString() {
        return "Computador{" + "codigo=" + codigo +
                ", memoria=" + memoria + 
                ", precioVenta=" + precioVenta 
                + ", stock=" + stock + 
                ", touch=" + touch + 
                ", unaMarca=" + unaMarca + '}';
    }
    //metodo que sera imprementado en las clases hijas
    public abstract int precioFinal(int cantidad);
    
}
