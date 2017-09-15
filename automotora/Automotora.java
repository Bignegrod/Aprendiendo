package automotora;

import java.util.Scanner;

public class Automotora {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Ingrese nombre de la distribuidora");
        String asa=sc.nextLine();
        System.out.println("Ingrese numero");
        int num=sc.nextInt();
        
        Distribuidor mm1=new Distribuidor(asa, num);
                
        
        
        
        
        
        System.out.println("Ingrese tipo de vehiculo");
      String tip=sc.next();
        System.out.println("Ingrese patente");
       String pat=sc.next();
        System.out.println("¿El vehiculo es usado?");
       boolean usa=sc.nextBoolean();
       System.out.println("Ingrese el precio del vehiculo");
       int pre=sc.nextInt();
        System.out.println("Que transmision es el vehiculo");
        char trans=sc.next().charAt(0);
        System.out.println("Ingrese kilometraje del vehiculo");
        int kil=sc.nextInt();
       
       Vehiculo imprimir=new Vehiculo(tip, pat, usa, pre, trans, kil,mm1); 
       
       imprimir.imprimirVehiculo(); //aqui mandai a imprimir los datos del vehiculo
       
    System.out.println("-----------------------------");     
    String rr=imprimir.detalle(); // aqui es string pq la clase donde estan los detalles es string y estay guardando los datos en la variable rr
        
        System.out.println(rr);
     System.out.println("-----------------------------");
     
        
        

        System.out.println("Ingrese % del iva");//aqui estoy preguntando por el iva
        float iv=sc.nextFloat(); // y aqui lo guardo
        
        imprimir.precioVenta( iv);
        
        float nn=imprimir.precioVenta( iv); //aqui iniciai con float pq la clase precio venta es con float po wm y estay guardando los daots en la variable nn
          System.out.println("-----------------------------");
        System.out.println(nn);
        /*
        Mira pq me dio paja y no sabia que era el precio de utilidad aplique solo el descuento apra ver si el codigo compilaba bien 
        en la otra clase vei po que le elimine utilkidad y todo para ver si corria bien
        
        
        */
          System.out.println("-----------------------------");
          
          int mm=imprimir.cantidadKilometraje();
          
          System.out.println(mm);
           System.out.println("-----------------------------");
    
    }
    
}
