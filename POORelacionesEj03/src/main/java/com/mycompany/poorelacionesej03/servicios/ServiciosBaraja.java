package com.mycompany.poorelacionesej03.servicios;

import com.mycompany.poorelacionesej03.entidades.Carta;
import java.util.ArrayList;
import static java.util.Collections.shuffle;
import java.util.Scanner;

/**
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene
 * un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas,
 * bastos, oros y copas). Esta clase debe contener un método toString() que
 * retorne el número de carta y el palo. La baraja estará compuesta por un
 * conjunto de cartas, 40 exactamente. Las operaciones que podrá realizar la
 * baraja son: 
 * • barajar(): cambia de posición todas las cartas aleatoriamente.
 * • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando
 *  no haya más o se haya llegado al final, se indica al usuario que no hay más
 *  cartas. 
 * • cartasDisponibles(): indica el número de cartas que aún se puede repartir. 
 * • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese 
 *  número de cartas. En caso de que haya menos cartas que las pedidas, no 
 *  devolveremos nada, pero debemos indicárselo al usuario. 
 * • cartasMonton(): mostramos aquellas cartas que ya han salido,si no ha salido
 *  ninguna indicárselo al usuario 
 * • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se 
 *  saca una carta y luego se llama al método, este no mostrara esa primera 
 *  carta.
 *
 * @author epellejero
 */
public class ServiciosBaraja {
    Scanner leer = new Scanner(System.in);
    Carta carta;
    ArrayList<Carta> barajaCartas = new ArrayList<>();
    ArrayList<Carta> barajaMonton = new ArrayList<>();
    
    // Crea una baraja de cartas españolas sin 8 y 9 de los 4 palos
    public void crearBaraja(){
        
        String[] palos = new String[]{"Espada","Copa","Oro","Basto"}; 
        int [] numeros = new int[] {1,2,3,4,5,6,7,10,11,12}; 
        for (int j = 0; j < 4; j++){
            String palo = palos[j];
            for (int i = 0 ; i < 10 ; i++){
                int numero = numeros[i];
                carta = new Carta(numero, palo);
                barajaCartas.add(carta);
            }
        }
    }
    
    
    // Cambia de posición todas las cartas aleatoriamente.
    public void barajar(){
        shuffle(barajaCartas);
    }
    
    // devuelve la siguiente carta que está en la baraja, cuando no haya más o 
    // se haya llegado al final, se indica al usuario que no hay más cartas.
    public Carta siguienteCarta(){
        if (barajaCartas.isEmpty()){
            System.out.println("No hay más cartas en la baraja");
        }else{
            carta = barajaCartas.get(0);
            System.out.println("Siguiente carta : " + carta);
        }
        return carta;
    }
    
    // indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles(){
        int cantidadCartas = barajaCartas.size();
        System.out.println(cantidadCartas);
    }
 
    
    // Dado un número de cartas que nos pidan, le devolveremos ese número de 
    // cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
    // nada, pero debemos indicárselo al usuario. 
    public void darCartas(){
        int entregarCartas;
        System.out.println("Cuantas cartas solicita ? ");
        entregarCartas = leer.nextInt();
        if (entregarCartas > barajaCartas.size()){
            System.out.println("No hay suficientes cartas en la baraja");
        } else {
            for (int i = 0; i < entregarCartas; i++){
                carta = barajaCartas.get(0);
                barajaMonton.add(carta);
                barajaCartas.remove(0);
            }
        }
            
    }    
    
    // Mostramos aquellas cartas que ya han salido,si no han salido ninguna 
    // indicárselo al usuario 
    public void cartasMonton(){
        if (barajaMonton.isEmpty()){
            System.out.println("No hay cartas en el pozo");
        } else {
            System.out.println("Cantidad de cartas en el pozo " + barajaMonton.size());
            for (Carta aux : barajaMonton){
                System.out.println(" " + aux);
            }
        }
    }
       
    // muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    // luego se llama al método, este no mostrara esa primera carta.     
    public void mostrarBaraja(){
        for (Carta aux : barajaCartas) {
            System.out.println(" " + aux);
        }
    }     
}
