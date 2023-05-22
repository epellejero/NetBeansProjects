
package pooextraej01.entidades;

import java.util.Scanner;

/**
 * Desarrollar una clase Cancion con los siguientes atributos: titulo y autor.
 * Se deberá́ definir además dos constructores: uno vacío que inicializa el
 * titulo y el autor a cadenas vacías y otro que reciba como parámetros el
 * titulo y el autor de la canción. Se deberán además definir los métodos
 * getters y setters correspondientes.
 */
public class Cancion {
    
    private String titulo;
    private String autor;

    public Cancion() {
    }
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void cargarCancion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la canción : ");
        setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor de la canción");
        setAutor(leer.nextLine());
    }
    public void mostrarCancion(){
        System.out.println("Titulo de la canción : " + getTitulo());
        System.out.println("Autor de la canción  : " + getAutor());
        
    }
}
