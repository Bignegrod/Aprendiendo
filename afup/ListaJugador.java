/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afup;

import java.util.ArrayList;

/**
 *
 * @author duoc
 */
public class ListaJugador {
    private static ArrayList<Jugador> futbolista = new ArrayList();

    public ListaJugador() {
    }
    public boolean agregarJugador(Jugador jug)
    {
        boolean encontrado = false;
        for(Jugador rr:futbolista)
        {
            if(rr.getNumUnico()== jug.getNumUnico())
            {
                encontrado=true;
               break;
            }
        }   
        if(encontrado==false)
        {
            if(jug instanceof Jugador)
            {
                futbolista.add(jug);
                return true;
            }
        }
      return false;  
    } 
    public boolean buscarJugador(int numeroJug)
    {
        boolean encontrado=false;
        for(Jugador jj:futbolista)
            
        {
            if(jj.getNumUnico()==numeroJug)
            {
                encontrado=true;
                System.out.println(jj);
                break;
            }
        }
        if(encontrado==false)
        {
            System.out.println("El jugador numero "+numeroJug+" no existe");
        }
        return encontrado;
    }        
    
    public void mostrarJugador(){
        for(Jugador gg: futbolista)
        {
            System.out.println(gg);
        }
    }
    
    public int cantidadJugador()
    {
        int cantidad=0;
        for(Jugador hh:futbolista)
        {
            if(hh.isPrestamo())
            {
                cantidad++;
            }
        }
        return cantidad;
    }
    
    
    public int cantidadMujeres()
    {
        int cantidad=0;
        
        for (Jugador mm: futbolista)
        {
            if(mm.getEdad()>=15 && mm.getEdad()<=25 && mm.getGenero().equalsIgnoreCase("femenino"))
            {
                cantidad++;
            }
        }
        return cantidad;
    }
}
