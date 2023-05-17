
package poocoleccionej01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo 
 * String. El programa pedirá una raza de perro en un bucle, el mismo se 
 * guardará en la lista y después se le preguntará al usuario si quiere guardar 
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros 
 * guardados en el ArrayList.
 * @author Eduardo
 */
public class POOColeccionEj01 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String op = "";
        
        ArrayList<String> razasDePerros = new ArrayList<>();
        
        do {
        System.out.println("Ingrese una raza de perro : ");
        razasDePerros.add(leer.next());
        System.out.println("Desea cargar otra raza de perrro ? S/N : ");
        op = leer.next();
        } 
        while (op.equalsIgnoreCase("s"));
        
        for (String aux : razasDePerros){
            System.out.println("Raza: " + aux);
        }
    }
}
    
