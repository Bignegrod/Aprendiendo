 
package eje4;

import java.util.Scanner;


public class Eje4 {

    
    public static void main(String[] args) {
        
        Scanner a =new Scanner(System.in);
        System.out.println("Ingrese nombre y apellidos");
        String nom = a.nextLine();
        System.out.println("Ingrese su rut");
        String ru= a.nextLine();
        System.out.println("Ingrese su telefono");
        int tel=a.nextInt();
        System.out.println("Ingrese su direccion");
        String dir=a.nextLine();
        System.out.println("Ingrese su genero");
        char ger=a.next().charAt(0);
        System.out.println("Esta casado");
        boolean cas=a.nextBoolean();
        System.out.println("Ingrese sueldo base");
        int suel=a.nextInt();
        
        Medico mm1= new Medico(nom, ru, tel, dir, ger, cas, suel);
        
      mm1.imprimirMedio();
      String rr = mm1.retornoDatos();
      
        System.out.println("Datos:"+rr);
    }
    
}
