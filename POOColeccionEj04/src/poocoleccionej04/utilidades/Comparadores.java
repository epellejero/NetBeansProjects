package poocoleccionej04.utilidades;

import java.util.Comparator;
import poocoleccionej04.entidades.Pelicula;

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
public class Comparadores {
    
    public static Comparator<Pelicula> ordenxTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenxDuracionPeliculaDes = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenxDuracionPeliculaAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return Double.compare(t.getDuracion(),t1.getDuracion());
            //return (Double)(t.getDuracion()).compareTo((Double)(t1.getDuracion()));
        }
    };
    
     public static Comparator<Pelicula> ordenxDirectorAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return Double.compare(t1.getDuracion(),t.getDuracion());
            //return t.getDirector().compareTo(t1.getDirector());
        }
    };
    
    
}
