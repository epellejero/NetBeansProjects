package poocoleccionej04.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import poocoleccionej04.entidades.Pelicula;
import poocoleccionej04.utilidades.Comparadores;

/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el título, director y duración de
 * la película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación: En el servicio
 * deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula. Después, esa Pelicula
 * se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear
 * otra Pelicula o no. Después de ese bucle realizaremos las siguientes
 * acciones: 
 * • Mostrar en pantalla todas las películas. 
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora. 
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y 
 *   mostrarlo en pantalla. 
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y 
 *   mostrarlo en pantalla. 
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla. 
 * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 *
 * @author Eduardo
 */
public class PeliculaServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Pelicula pelicula = new Pelicula();
    
    public Pelicula altaPelicula() {
        
        System.out.print("Ingrese el nombre de la película: ");
        String nombrePelicula = leer.next();
        System.out.print("Ingrese el director de la película: ");
        String nombreDirector = leer.next();
        System.out.print("Ingrese la duración de la película: ");
        double duracionPelicula = leer.nextDouble();
        return new Pelicula(nombrePelicula, nombreDirector, duracionPelicula);
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> listaPeliculas) {

        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux.toString());
        }
    }
    
    public void mostrarPeliculasMUH(ArrayList<Pelicula> listaPeliculas) {
        // muestra las películas con más de una hora de duración
        for (Pelicula aux : listaPeliculas) {
            if (aux.getDuracion()> 1){
                System.out.println(aux.toString());
            }
        }
    }
    
    public void ordenaxDuracionDes(ArrayList<Pelicula> listaPeliculas) {
        Collections.sort(listaPeliculas, Comparadores.ordenxDuracionPeliculaDes);
        mostrarPeliculas(listaPeliculas);
    }
    
     public void ordenaxDuracionAsc(ArrayList<Pelicula> listaPeliculas) {
        Collections.sort(listaPeliculas, Comparadores.ordenxDuracionPeliculaAsc);
        mostrarPeliculas(listaPeliculas);
    }
    
     public void ordenaxTitulo(ArrayList<Pelicula> listaPeliculas) {
        Collections.sort(listaPeliculas, Comparadores.ordenxTitulo);
        mostrarPeliculas(listaPeliculas
        );
    }
    
     public void ordenaxDirector(ArrayList<Pelicula> listaPeliculas) {
        Collections.sort(listaPeliculas, Comparadores.ordenxDirectorAsc);
        mostrarPeliculas(listaPeliculas);
    }
}
