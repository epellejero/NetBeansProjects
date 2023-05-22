
package pooej01.entidades;

import java.util.Scanner;

public class Libro {
    Scanner leer = new Scanner(System.in);
    // creo los atributos del objeto libro
    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;

    // genero el constructor vacio
    public Libro() {
    }

    // genero un constructor con todos los atributos pasados por parámetro
    public Libro(int isbc, String titulo, String autor, int paginas) {
        this.isbn = isbc;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public void cargarLibro() {
        System.out.println(" - - - - Cargo Libro - - - - - ");
        System.out.print("Ingrese ISBS....: ");
        isbn = leer.nextInt();
        System.out.print("Ingrese titulo..: ");
        titulo = leer.next();
        System.out.print("Ingrese autor...: ");
        autor = leer.next();
        System.out.print("Ingrese páginas.: ");
        paginas = leer.nextInt();
    }
    
    public void mostrarLibro() {
        System.out.println(" - - - -  Muestro Libro - - - - ");
        System.out.println("ISBN    : "+isbn);
        System.out.println("Titulo  : "+titulo);
        System.out.println("Autor   : "+autor);
        System.out.println("Páginas : "+paginas);
        
    }
}
