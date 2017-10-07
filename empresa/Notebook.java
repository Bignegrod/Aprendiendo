
package empresa;

/**
 *
 * @author duoc
 */
public class Notebook  extends Computador{
    
    protected int usb;
    protected boolean lectorCD;

    public Notebook() {
        super();
    }

    public Notebook(int usb, boolean lectorCD, int codigo, int memoria, int precioVenta, int stock, boolean touch, Marca unaMarca) {
        super(codigo, memoria, precioVenta, stock, touch, unaMarca);
        
        setUsb(usb);
        setLectorCD(lectorCD);
    }

    public int getUsb() {
        return usb;
    }

    public void setUsb(int usb) {
        if(usb>=1 && usb<=6){
        this.usb = usb;
        }else{
            System.out.println("Error: ingrese una cantidad de usb entre 1 y 6");
        }
    }

    public boolean isLectorCD() {
        return lectorCD;
    }

    public void setLectorCD(boolean lectorCD) {
        this.lectorCD = lectorCD;
    }

    @Override
    public String toString() {
        return "Notebook{" + "usb=" + usb + 
                ", lectorCD=" + lectorCD + '}';
    }
    @Override
    public int precioFinal(int cantidad)
    {
        int precio_final=0; int total=0;
        
        precio_final=super.getPrecioVenta()*cantidad;
        total=precio_final-(int)(precio_final*DESCUENTO_NOTE);
        
        return total;
    }
    public final int rebajarStock(int cantidad)
    {
        int calcular=0;
        calcular=super.getStock()-cantidad;
        super.setStock(calcular);
        return super.getStock();
    }
    
}
