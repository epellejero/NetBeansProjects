
package poocoleccionej05.servicios;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import poocoleccionej05.entidedes.Pais;
//import poocoleccionej05.utilidades.Comparadores;

/**
 * Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se
 * mostrará todos los países guardados en el conjunto. (Recordemos hacer los
 * servicios en la clase correspondiente) Después deberemos mostrar el conjunto
 * ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto. Por
 * último, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se
 * eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el
 * país no se encuentra en el conjunto se le informará al usuario.
 *
 * @author Eduardo
 */
public class PaisServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Pais pais = new Pais();
    
    public Pais altaPais() {
        System.out.print("Ingrese el nombre del paí: ");
        String nombrePais = leer.next();
        return new Pais(nombrePais);
    }
    
    public void mostrarPaices(TreeSet<Pais> conjuntoPaices) {

        for (Pais aux : conjuntoPaices) {
            System.out.println(aux.toString());
        }
    }

     public boolean borraPais(TreeSet<Pais> conjuntoPaises) {
        boolean encontrado = false;
        System.out.print("Ingrese el nombre del país: ");
        String nombrePais = leer.next();
        Iterator<Pais> it = conjuntoPaises.iterator();
        while (it.hasNext()) {
            Pais aux = it.next();
            if (aux.getPais().equals(nombrePais)){
                System.out.println("Se eliminó al país: " + nombrePais);
                it.remove();
                encontrado= true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró al país: " + nombrePais);
        }
        return encontrado;
    }
    
}