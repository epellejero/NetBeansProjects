package com.mycompany.poorelacionesej02.entidades;

import java.util.ArrayList;

/**
  * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto
 * de Jugadores) y Revolver 
 * Métodos: 
 * • llenarJuego(ArrayList < Jugador > jugadores, Revolver r):este método recibe 
 *  los jugadores y el revolver para guardarlos en los atributos del juego. 
 * • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de
 *  agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y 
 *  se termina el juego, si no se moja, se pasa al siguiente jugador hasta que 
 *  uno se moje. Si o si alguien se tiene que mojar.
 * 
 *  Al final del juego, se debe mostrar que jugador se mojó. Pensar la lógica
 *  necesaria para realizar esto, usando los atributos de la clase Juego.
 *
 * @author Eduardo
 */

public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public Juego() {
    }
    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores(int i) {
        return jugadores;
    }
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public RevolverDeAgua getRevolver() {
        return revolver;
    }
    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
        
}
