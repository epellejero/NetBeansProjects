
package pooej01;

import java.util.Scanner;
import pooej01.entidades.Libro;

public class POOEj01 {
// Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    // creo la variable libro1 del tipo Libro
    // Ej.: Libro libro1; aqui solamente lo declaro
    // Ej.: Libro libro1 = new Libro(); aqui lo estoy instanciando (creando al objeto)
    // se creacon new Libro() y se asigna a la variable libro1 del tipo Libro
        Libro libro1 = new Libro();
        libro1.cargarLibro();
        libro1.mostrarLibro();
    }
    
}
