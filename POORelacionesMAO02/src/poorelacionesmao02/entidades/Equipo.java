package poorelacionesmao02.entidades;

import java.util.List;

/**
 * Realiza un programa en donde exista una clase Jugador que contenga nombre,
 * apellido, posición y número. Luego otra clase Equipo que contenga una
 * colección de jugadores. Una vez hecho esto, desde el main recorreremos el
 * equipo mostrando la información de cada jugador.
 *
 * @author epellejero
 */
public class Equipo {

    private String nombreEquipo;
    private List<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, List<Jugador> jugadores) {
        this.nombreEquipo = nombreEquipo;
        this.jugadores = jugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", jugadores=" + jugadores + '}';
    }

}    
