package com.mycompany.poorelacionesejex01.servicios;

import com.mycompany.poorelacionesejex01.entidades.Perro;
import com.mycompany.poorelacionesejex01.entidades.Persona;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class ServiciosMascotas {
    
    Scanner leer = new Scanner(System.in);
    Perro perro = new Perro();
    ArrayList<Perro> listaPerros = new ArrayList<>();
    //HashSet<Perro> listaPerros = new HashSet<>();
    ArrayList<Persona> listaPersonas = new ArrayList<>();
    
    public void crearPerros(){
        Perro mascota1 = new Perro("Pinchito", "Mestizo", 3, "mediano");
        Perro mascota2 = new Perro("Rosita", "Mestizo", 10, "mediano");
        Perro mascota3 = new Perro("Negrita", "Mestizo", 12, "mediano");
        Perro mascota4 = new Perro("Morita", "Mestizo", 10, "mediano");
        Perro mascota5 = new Perro("Rocco", "Mestizo", 14, "mediano");
        
        listaPerros.add(mascota1);
        listaPerros.add(mascota2);
        listaPerros.add(mascota3);
        listaPerros.add(mascota4);
        listaPerros.add(mascota5);
    }
    
    public void crearPersonas(){
        Perro mascota = new Perro();
        Persona persona1 = new Persona("Eduardo", "Pellejero",55,18587571,mascota);
        Persona persona2 = new Persona("Giuliana", "Pellejero",27,39097463,mascota);
        Persona persona3 = new Persona("Gonzalo","Pellejero",21,43073478,mascota);
        Persona persona4 = new Persona("Luciana","Pellejero",20,44312447,mascota);
        Persona persona5 = new Persona("Silvia","Dorado",51,219058628,mascota);
        
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        
    }
    
    public void mostrarPersonas(){
        for (Persona aux : listaPersonas) {
            System.out.println(" " + aux);
        }
    }
    
    public void mostrarPerros(){
        System.out.println("      Perros en adopción     ");
        System.out.println("-----------------------------");
        for (Perro aux : listaPerros) {
            System.out.println(" " + aux);
        }
    }
    
    public void adoptarPerros(){
//        String nombrePerro;
//        Persona persona;
//        for (int i = 0; i < listaPersonas.size(); i++){
//            persona = listaPersonas.get(i);
//            if (listaPerros.isEmpty()){
//                System.out.println("No hay perros para adoptar");
//            } else {
//                mostrarPerros();
//                System.out.print(persona.getNombrePersona() + " elija un perro para adoptar por su nombre: ");
//                nombrePerro = (leer.next());
//                Iterator<Perro> it = listaPerros.iterator();
//                while (it.hasNext()) {
//                    if (it.next().getNombre().equalsIgnoreCase(nombrePerro)){
//                        perro = it.next();
//                        persona.setMascota(perro);    
//                        listaPersonas.set(i,persona);
//                        listaPerros.remove(perro);
//                        break;
//                    } else {
//                        System.out.println(" No se encuentra en la lista e adopción ");
//                    }
//                }
//            
//            }    
//        }
//    }
        int adoptarPerro;
        String nombrePerroAdoptar,nombrePerro;
        Persona persona;
        Perro perro;
        for (int i = 0; i < listaPersonas.size(); i++){
            persona = listaPersonas.get(i);
            if (listaPerros.isEmpty()){
                System.out.println("No hay perros para adoptar");
            } else {
                mostrarPerros();
                System.out.print(persona.getNombrePersona() + " elija un perro para adoptar: ");
                nombrePerroAdoptar = leer.next();
                for (int j = 0; j < listaPerros.size(); j++){
                    //adoptarPerro = (leer.nextInt()-1);
                    perro = listaPerros.get(j);
                    nombrePerro = perro.getNombre();
                    if (nombrePerro.equalsIgnoreCase(nombrePerroAdoptar)){
                        persona.setMascota(perro);
                        listaPersonas.set(i,persona);
                        listaPerros.remove(j);
                    }
                }
            }    
        }
    }
}