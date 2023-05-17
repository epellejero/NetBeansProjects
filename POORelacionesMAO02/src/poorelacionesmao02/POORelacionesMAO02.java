
package poorelacionesmao02;

import java.util.ArrayList;
import java.util.List;
import poorelacionesmao02.entidades.Equipo;
import poorelacionesmao02.entidades.Jugador;

/**
 * Realiza un programa en donde exista una clase Jugador que contenga nombre,
 * apellido, posición y número. Luego otra clase Equipo que contenga una
 * colección de jugadores. Una vez hecho esto, desde el main recorreremos el
 * equipo mostrando la información de cada jugador.
 *
 * @author epellejero
 */
public class POORelacionesMAO02 {

    public static void main(String[] args) {
        
        Jugador j1 = new Jugador("Sergio", "Romero", "Arquero", 1);
        Jugador j2 = new Jugador("Dario", "Benedetto", "Delantero", 9);
        Jugador j3 = new Jugador("Valentín", "Barco", "Defensa", 18);
        Jugador j4 = new Jugador("Luca", "Langoni", "Delantero", 11);
        ArrayList <Jugador> jugadores = new ArrayList();
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);
        jugadores.add(j4);
        
        Equipo equipoAux = new Equipo();
        
        equipoAux.setNombreEquipo("Club Athletico Boca Juniors");
        equipoAux.setJugadores(jugadores);
        
        System.out.println(equipoAux);
        System.out.println("Equipo : " + equipoAux.getNombreEquipo());
        System.out.println("Jugador: " + jugadores.get(0));
        System.out.println("Jugador: " + jugadores.get(1));
        System.out.println("Jugador: " + jugadores.get(2));
        System.out.println("Jugador: " + jugadores.get(3));
        System.out.println(jugadores.toString());
    }

}
