package com.mycompany.poorelacionesej02.servicios;

import com.mycompany.poorelacionesej02.entidades.Juego;
import com.mycompany.poorelacionesej02.entidades.Jugador;
import com.mycompany.poorelacionesej02.entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el
 * juego se trata de un número de jugadores, que, con un revolver de agua, el
 * cual posee una sola carga de agua, se dispara y se moja. Las clases por hacer
 * del juego son las siguientes: 
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición 
 * actual (posición del tambor que se dispara, puede que esté el agua o no) y 
 * posición agua (la posición del tambor donde se encuentra el agua). Estas dos 
 * posiciones, se generarán aleatoriamente.
 * Métodos: 
 * • llenarRevolver(): le pone los valores de posición actual y de posición del 
 *  agua. Los valores deben ser aleatorios. 
 * • mojar(): devuelve true si la posición del agua coincide con la posición 
 *  actual 
 * • siguienteChorro(): cambia a la siguiente posición del tambor 
 * • toString(): muestra información del revolver (posición actual y donde está
 *  el agua) 
 * Clase Jugador: esta clase posee los siguientes atributos: id (representa el 
 * número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por 
 * ejemplo) y mojado (indica si está mojado o no el jugador). El número de 
 * jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está 
 * en este rango, por defecto será 6. 
 * Métodos:
 * • disparo(Revolver r): el método, recibe el revolver de agua y llama a los 
 *  métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta, 
 *  aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El 
 *  atributo mojado pasa a false y el método devuelve true, sino false.
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto
 * de Jugadores) y Revolver 
 * Métodos: 
 * • llenarJuego(ArrayList< Jugador >jugadores, Revolver r): este método recibe 
 *  los jugadores y el revolver para guardarlos en los atributos del juego. 
 * • ronda(): cada ronda consiste en un jugador que
 *  se apunta con el revolver de agua y aprieta el gatillo. Sí el revolver tira
 *  el agua el jugador se moja y se termina el juego, sino se moja, se pasa al
 *  siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar.
 *  Al final del juego, se debe mostrar que jugador se mojó. Pensar la lógica
 *  necesaria para realizar esto, usando los atributos de la clase Juego.
 *
 * @author Eduardo
 */

public class ServiciosRuletaRusa {
    Scanner leer = new Scanner(System.in);
    Juego juego = new Juego();
    Jugador jugador = new Jugador();
    RevolverDeAgua revolver;
    ArrayList<Jugador> listaJugadores = new ArrayList<>();
    
public void ronda(){
    boolean mojado;
    System.out.println(" - - - - - JUEGO RULETA RUSA - - - - - ");
    for (int i = 0; i < listaJugadores.size(); i++){
        jugador = listaJugadores.get(i);
        System.out.println((i+1) + "° Jugador: " + listaJugadores.get(i));  
        System.out.print("Disparo : " );
        if (disparo()){
            mojado = true;
            System.out.println("M O J A D O");
            jugador.setMojado(mojado);
            listaJugadores.set(i,jugador);
            System.out.println((i+1) + "° Jugador: " + listaJugadores.get(i)); 
            break;
        }else{ 
            System.out.println("S A L V A D O ");
        }
        
        System.out.println("-----------------------------------------");
    }
}    
    
public Jugador cargarJugador(){
    boolean mojado = false;
    System.out.println("Ingrese el nombre del jugador: ");
    String nombre = leer.next();
    int id = 1;
    jugador = new Jugador(id,nombre,mojado); 
    return jugador;
}   


// llenarJuego(ArrayList< Jugador >jugadores, Revolver r): este método recibe 
// los jugadores y el revolver para guardarlos en los atributos del juego. 
public Juego llenarJuego(){
//    for (int i = 0; i < 6; i++){
//        listaJugadores.add(cargarJugador());
//    }
    Jugador jugador1 = new Jugador(1,"Juan",false);
    Jugador jugador2 = new Jugador(2,"luis", false);
    Jugador jugador3 = new Jugador(3,"José",false);
    Jugador jugador4 = new Jugador(4,"Pedro",false);
    Jugador jugador5 = new Jugador(5,"Ivan",false);
    Jugador jugador6 = new Jugador(6,"Lucas",false);
    listaJugadores.add(jugador1);
    listaJugadores.add(jugador2);
    listaJugadores.add(jugador3);
    listaJugadores.add(jugador4);
    listaJugadores.add(jugador5);
    listaJugadores.add(jugador6);
    
    revolver = new RevolverDeAgua();
    juego = new Juego(listaJugadores,revolver);
    System.out.println("juego = " + juego);
    return juego;
}
         
         
// cada ronda consiste en un jugador que se apunta con el revolver de agua y 
// aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se 
// termina el juego, sino se moja, se pasa al siguiente jugador hasta que uno se
// moje. Si o si alguien se tiene que mojar.
// Al final del juego, se debe mostrar que jugador se mojó. Pensar la lógica
// necesaria para realizar esto, usando los atributos de la clase Juego.

//le pone los valores de posición actual y de posición del agua. 
//Los valores deben ser aleatorios. 
public RevolverDeAgua llenarRevolver(){
    int posicionActual = (int)(Math.random()*6+1);
    int posicionAgua = (int)(Math.random()*6+1);
    revolver.setPosicionActual(posicionActual);
    revolver.setPosicionAgua(posicionAgua);
    return revolver;
} 
         
//devuelve true si la posición del agua coincide con la posición actual. 
public boolean mojar(){
    boolean moja = false;
    if (revolver.getPosicionActual() == revolver.getPosicionAgua()){
        moja = true;
    }
    return moja;
} 
         
// cambia a la siguiente posición del tambor 
public void siguienteChorro(){
   revolver.setPosicionActual(revolver.getPosicionActual()+1);
}

// el método, recibe el revolver de agua y llama a los 
// métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta, 
// aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El 
// atributo mojado pasa a false y el método devuelve true, sino false.
public boolean disparo(){
    boolean mojado = false;
    System.out.print(revolver.getPosicionActual() + "/");
    System.out.print(revolver.getPosicionAgua() + " -  ");
    if (mojar()){
        mojado = true;
    } else {
        // siguienteChorro();
        llenarRevolver();
    }
    return mojado;
}    
}
