
package poocoleccionej05;

// import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
// import java.util.Set;
import poocoleccionej05.entidedes.Pais;
import poocoleccionej05.servicios.PaisServicios;

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
public class POOColeccionEj05 {

    public static void main(String[] args) {
        //
        Scanner leer = new Scanner(System.in);
        int opcion;
        boolean continuar;
        PaisServicios paisServicios = new PaisServicios();
        // HashSet<Pais> conjuntoPaices = new HashSet<>();
        TreeSet<Pais> conjuntoPaices = new TreeSet<>();
        // Set<Pais> conjuntoPaices = new HashSet<>();-> es lo mismo al anterior
        
        Pais p1 = new Pais("Argentina");
        Pais p2 = new Pais("Uruguay");
        Pais p3 = new Pais("Chile");
        Pais p4 = new Pais("Paraguay");
        Pais p5 = new Pais("Brasil");
        Pais p6 = new Pais("Bolivia");
        Pais p7 = new Pais("Peru");
        
        conjuntoPaices.add(p1);
        conjuntoPaices.add(p2);
        conjuntoPaices.add(p3);
        conjuntoPaices.add(p4);
        conjuntoPaices.add(p5);
        conjuntoPaices.add(p6);
        conjuntoPaices.add(p7);
        
        do {
            System.out.println("- - - - Paices - - - - ");
            System.out.println(" 1 - Alta de paices ");
            System.out.println(" 2 - Listar paices ");
            System.out.println(" 3 - Ordena paices ");
            System.out.println(" 4 - Borrar un pais");
            System.out.println(" 5 - Salir ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:     // Alta  de paices
                    continuar = true;
                    while (continuar){
                        conjuntoPaices.add(paisServicios.altaPais());
                        System.out.print("Desea agregar otro pais? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                case 2:     // listar  los paices
                    paisServicios.mostrarPaices(conjuntoPaices);
                    break;
                case 3:     // ordena paices
                    // paisServicios.ordenaPaices(conjuntoPaices);
                    break;
                case 4:     // borrar paices
                    continuar = true;
                    while (continuar){
                        paisServicios.borraPais(conjuntoPaices);
                        System.out.print("Desea borrar otro pais? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                default:
                    break;                            
            }
        } while (opcion != 5);
        
        System.out.println("* * * * * * * * Fin de proceso * * * * * * * ");
    }
}
