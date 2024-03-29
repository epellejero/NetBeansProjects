package com.mycompany.poorelacionesejex01;

import com.mycompany.poorelacionesejex01.servicios.ServiciosMascotas;

/**
 * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro
 * programa va a tener que contar con muchas personas y muchos perros. El
 * programa deberá preguntarle a cada persona, que perro según su nombre, quiere
 * adoptar. Dos personas no pueden adoptar al mismo perro, si la persona eligió
 * un perro que ya estaba adoptado, se le debe informar a la persona. Una vez
 * que la Persona elige el Perro se le asigna, al final deberemos mostrar todas
 * las personas con sus respectivos perros.
 *
 * @author Eduardo
 */
public class POORelacionesEjEx01 {

    public static void main(String[] args) {
        
        ServiciosMascotas sm = new ServiciosMascotas();
        sm.crearPerros();
        sm.crearPersonas();        
        sm.adoptarPerros();
        sm.mostrarPersonas();
    }
}
