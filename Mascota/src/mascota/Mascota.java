/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

import java.util.Scanner;

public class Mascota {

   
    public static void main(String[] args) {
        
//    Animales masc1=new Animales ();
        Mascota printMascota= new Mascota();
     
   Scanner sc = new Scanner(System.in);
          String nom=" ";  
   
       System.out.println("Ingrese Nombre de la mascota");
      
       System.out.println("Ingrese Raza");
       System.out.println("Ingrese edad");
        System.out.println("Ingrese Sexo ");
        System.out.println("Inrgese peso");
       System.out.println("Ingrese tipo de mascota");
       System.out.println("¿Su mascota tiene chip?");
       
      printMascota.Animales(String nombre, String raza, float ed, String sexo, float peso, String tipo, boolean chip);
    }

   
  
}
