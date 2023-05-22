package com.mycompany.poorelacionesej01;

import com.mycompany.poorelacionesej01.entidades.Perro;
import com.mycompany.poorelacionesej01.entidades.Persona;

/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
 * contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y
 * tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y
 * Perro. Ahora deberemos en el main crear dos Personas y dos Perros. Después,
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona.
 *
 * @author Eduardo
 */
public class POORelacionesEj01 {

    public static void main(String[] args) {
        
        Perro mascota1 = new Perro("Pinchito", "Mestizo", 3, "mediano");
        Perro mascota2 = new Perro("Rosita", "Mestizo", 10, "mediano");
        Perro mascota3 = new Perro("Negrita", "Mestizo", 12, "mediano");
        Perro mascota4 = new Perro("Morita", "Mestizo", 10, "mediano");
        Perro mascota5 = new Perro("Rocco", "Mestizo", 14, "mediano");
        
        Persona persona1 = new Persona("Eduardo", "Pellejero",55,18587571,mascota1);
        Persona persona2 = new Persona("Giuliana", "pellejero",27,39097463,mascota2);
        Persona persona3 = new Persona("Gonzalo","Pellejero",21,43073478,mascota3);
        Persona persona4 = new Persona("Luciana","Pellejero",20,44312447,mascota4);
        Persona persona5 = new Persona("Silvia","Dorado",51,219058628,mascota5);
        
//        List<Perro> listaMascotas = new ArrayList();
//        listaMascotas.add(mascota1);
//        listaMascotas.add(mascota2);
//        listaMascotas.add(mascota3);
//        listaMascotas.add(mascota4);
//        listaMascotas.add(mascota5);
        
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println(persona4);
        System.out.println(persona5);
        
        
    }
}
