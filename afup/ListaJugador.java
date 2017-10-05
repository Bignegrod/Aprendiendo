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
     public int cantidadExtranjeros(String nombreEquipo)
    {
        int cantidad=0;
        for(Jugador extra: futbolista)
        {
            if(!(extra.getNacionalidad().equalsIgnoreCase("Chileno"))
                    && extra.getGenero().equalsIgnoreCase("masculino")
                    && extra.getEqui().getNombre().equalsIgnoreCase(nombreEquipo)){
                cantidad++;
            }
                    
        } return cantidad;
    }
    public void eliminarJugador(int numeroJug)
    {
        boolean encontrado=false;
        for(Jugador eliminar:futbolista)
        {
            if(eliminar.getNumUnico()==numeroJug)
            {
                futbolista.remove(eliminar);
                encontrado=true;
                System.out.println("Jugador Eliminado");
            }
        }
        //opcion 2
        /*
        for(int i=0; i <futbolista.size();i++)
        {
            if(futbolista.get(i).getNumUnico()==numeroJug)
            {
                futbolista.remove(i);
                encontrado=true;
                System.out.println("Jugador Eliminado");
            }
        }
        if(encontrado==false)
        {
            System.out.println("Jugador no encontrado");
        }
    }
*/
    }
}
}
