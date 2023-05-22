package poocoleccionej04;

import java.util.ArrayList;
import java.util.Scanner;
import poocoleccionej04.entidades.Pelicula;
import poocoleccionej04.servicios.PeliculaServicios;

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
public class POOColeccionEj04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        boolean continuar;

        Pelicula pelicula = new Pelicula();
        Pelicula pelicula1 = new Pelicula("Misión Imposible","Brian De Palma",1.30);
        Pelicula pelicula2 = new Pelicula("Misión Imposible II","John Woo",0.30);
        Pelicula pelicula3 = new Pelicula("Misión Imposible III","J. J. Abrams",2.10);
        Pelicula pelicula4 = new Pelicula("Misión Imposible Ghost Protocol","Brad Bird",1.50);
        Pelicula pelicula5 = new Pelicula("Misión Imposible Rogue Nation","C. McQuarrie",1.40);
        Pelicula pelicula6 = new Pelicula("Misión Imposible Fallout","C. McQuarrie",1.20);
        
        
        PeliculaServicios peliculaServicios = new PeliculaServicios();
        ArrayList<Pelicula> listaPeliculas = new ArrayList();
        
        listaPeliculas.add(pelicula1);
        listaPeliculas.add(pelicula2);
        listaPeliculas.add(pelicula3);
        listaPeliculas.add(pelicula4);
        listaPeliculas.add(pelicula5);
        listaPeliculas.add(pelicula6);
        
        do {
            System.out.println("- - - - Películas - - - - ");
            System.out.println(" 1 - Alta de películas ");
            System.out.println(" 2 - Listar todas las películas ");
            System.out.println(" 3 - Listar películas mayor a 1 Hora");
            System.out.println(" 4 - Ordenar películas por duración mayor a menor");
            System.out.println(" 5 - Ordenar películas por duración menor a mayor");
            System.out.println(" 6 - Ordenar películas por título (alfabéticamente)");
            System.out.println(" 7 - Ordenar películas por director (alfabéticamente)");
            System.out.println(" 8 - Salir ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    continuar = true;
                    while (continuar){
                        listaPeliculas.add(peliculaServicios.altaPelicula());
                        System.out.print("Desea agregar otra película? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                case 2:
                    peliculaServicios.mostrarPeliculas(listaPeliculas);
                    break;
                case 3:
                    peliculaServicios.mostrarPeliculasMUH(listaPeliculas);
                    break;
                case 4:
                    peliculaServicios.ordenaxDuracionDes(listaPeliculas);
                    break;
                case 5:
                    peliculaServicios.ordenaxDuracionAsc(listaPeliculas);
                    break;
                case 6: 
                    peliculaServicios.ordenaxTitulo(listaPeliculas);
                    break;
                case 7:
                    peliculaServicios.ordenaxDirector(listaPeliculas);
                    break;    
                default:
                    break;
                            
            }
        } while (opcion != 8);
        
        System.out.println("* * * * * * * * Fin de proceso * * * * * * * ");
    }
        
}


