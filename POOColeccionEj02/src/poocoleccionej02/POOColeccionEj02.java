package poocoleccionej02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario
 * se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el
 * perro en la lista. Si el perro está en la lista, se eliminará el perro que
 * ingresó el usuario y se mostrará la lista ordenada. Si el perro no se
 * encuentra en la lista, se le informará al usuario y se mostrará la lista
 * ordenada.
 *
 * @author Eduardo
 */
public class POOColeccionEj02 {

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

        // Se crea un Iterator para recorrer la lista razasDePerros
//        Iterator <String> iterador = razasDePerros.iterator();
//        System.out.println("Elementos de la lista: ");
//        
//        while (iterador.hasNext()){
//            System.out.println(iterador.next() + " ");
//        }
//        System.out.println();
        int eliminados = 0;
        System.out.println("Ingrese la raza de perro a eliminar: ");
        op = leer.next();
        Iterator <String> iterador = razasDePerros.iterator();
        while (iterador.hasNext()){
            if (iterador.next().equals(op)){
                iterador.remove();
                eliminados++;  
            } 
        }
        
        if (eliminados == 0 ){
                System.out.println("No se encontro la raza en la lista ");
            } else {
                System.out.println("Las razas eliminadas son " + eliminados);
            }
        
        System.out.println("Elementos de la lista: ");
        for (String aux : razasDePerros){
            System.out.println("Raza: " + aux);
        }        
    }
}
