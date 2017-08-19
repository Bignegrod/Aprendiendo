
package eje3;

import java.util.Scanner;

public class Eje3 {

    
    public static void main(String[] args) {
        
        Scanner li = new Scanner(System.in);
        System.out.println("Ingrese Numero ISBN");
        String num_Isbn=li.next();
       System.out.println("Ingrese Titulo del libro");
       String tit=li.next();
        System.out.println("Ingrese Nombre completo del autor");
        String comp=li.next();
        System.out.println("Ingrese  nombre editorial");
        String edi =li.next();
        System.out.println("Ingrese año");
        int an=li.nextInt();
        System.out.println("¿El libro esta escrito en español?");
        boolean es = li.nextBoolean();
        System.out.println("Ingrese precio del libro");
        int pr =li.nextInt();
        System.out.println("Ingrese cantidad de hojas del libro");
        int ca= li.nextInt();
        System.out.println("¿Es de coleecion¿");
        char col=li.next().charAt(0);
        System.out.println("Ingrese cantidad de copias disponibles");
        int cop=li.nextInt();
        
        Libro ca =new Libro(num_Isbn, tit, comp, edi, an, es, pr, ca, col, cop);
       ca.printlibro();
    }
    
    
    
    
}
