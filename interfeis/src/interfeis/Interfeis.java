/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfeis;

/**
 *
 * @author LC1300XXXX
 */
public class Interfeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal  x = new Leon();
        
       x.avanzar();
       x.comer("carne");
       ((Leon)x).salir();
        // TODO code application logic here
    }
    
}
