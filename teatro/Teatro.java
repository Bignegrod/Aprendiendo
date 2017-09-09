
package teatro;
import java.util.Scanner;
/**
 *Autor:Gabriel Salazar.
 *Fecha Inicio:06/07/16.
 *Fecha Termino:Sin definir.
 */

public class Teatro {

    
    public static void main(String[] args) {
     
        Scanner mm1 = new Scanner(System.in);
        
        
        System.out.println("Ingrese rut");
        String ru=mm1.nextLine();
        System.out.println("Ingrese Nombre Completo");
        String nomc=mm1.nextLine();
        System.out.println("Ingrese Email");
        String em=mm1.nextLine();
        System.out.println("Ingrese tipo");
        char tip= mm1.next().charAt(0);
        System.out.println("Ingrese Celular ");
        int cel=mm1.nextInt();
        System.out.println("¿Esta Activo?");
        boolean act=mm1.nextBoolean();
        
       Abonado aa = new Abonado(ru,nomc,cel,em,tip,act);
        
       
        String rr=mm1.nextLine();
        System.out.println("Codigo");
        String cod=mm1.nextLine();
        System.out.println("Fecha Vigencia");
        String fec=mm1.nextLine();
        System.out.println("Numero de la butaca");
        int bu=mm1.nextInt();
        System.out.println("Cantidad de funciones");
        int fun=mm1.nextInt();
        System.out.println("Valor de abono");
        int ab=mm1.nextInt();
        
        Abono bb = new Abono(cod,bu,ab,fun,fec,aa);
        
        
        bb.imprimirAbono();
        System.out.println("-------------------------------------");
        System.out.println("Ingrese  monto de descuento en porcentaje");
        float porc=mm1.nextFloat();
         System.out.println("-------------------------------------");
        
        float desc=bb.descuentoAbonado(porc);
        System.out.println("El descuento es:"+desc);
        System.out.println("-------------------------------------");
                
        bb.verFicha();
        /* los metodos que no retornar valor se llaman
        de forma directa
        */
        System.out.println("-------------------------------------");        
        System.out.println("Ingrese cantidad de funciones por pantalla");
        int catfun =mm1.nextInt();
        int saldo=bb.saldoFunciones(catfun);
        System.out.println("-------------------------------------");
        System.out.println("Ingrese precio palco");
        int palco=mm1.nextInt();
        System.out.println("Ingrese descuento del palco");
        float descPalco=mm1.nextInt();
        float valorPalco=bb.getAbon().reservarPalco(palco, descPalco);
        System.out.println("Valor1:"+valorPalco);
        float valorPalco2=aa.reservarPalco(palco, descPalco);
        System.out.println("valo2:"+valorPalco2);
    }
    
}
