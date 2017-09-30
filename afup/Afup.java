/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afup;

/**
 *
 * @author duoc
 */
public class Afup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Equipo equip = new Equipo("c-c", "Colo-Colo");
        Jugador jug1 = new Jugador(7, "Esteban Paredes", "Masculino", "Chileno", 35, true, equip);
        Jugador jug2 = new Jugador(10, "Jorge valdivia", "Masculino", "Chileno", 28, true, equip);
        Jugador jug3 = new Jugador(20, "Jaima Vaildes", "femenino", "Chileno", 20, false, equip);

        ListaJugador lista = new ListaJugador();
        boolean valida1 = lista.agregarJugador(jug1);
        System.out.println("Agrego jugador 1:" + valida1);
        boolean valida2 = lista.agregarJugador(jug2);
        System.out.println("Agrego jugador 2:" + valida2);
        boolean valida3 = lista.agregarJugador(jug3);
        System.out.println("Agrego jugador 3:" + valida3);
        System.out.println("------------------------------");
        lista.mostrarJugador();
        System.out.println("------------------------------");
        boolean encontrado = lista.buscarJugador(7);
        System.out.println("Jugador encontrado:" + encontrado);
        System.out.println("------------------------------");
        System.out.println("Cantidad de jugador en prestamo:"+lista.cantidadJugador());
         System.out.println("------------------------------");
        System.out.println("Cantidad de mujeres"+lista.cantidadMujeres());
    }
    
}
