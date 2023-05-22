/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Libro {

    Scanner leer = new Scanner(System.in);
    int isbn, paginas;
    String titulo, autor;

    public Libro() {
    }

    public Libro(int isbn, int paginas, String titulo, String autor) {
        this.isbn = isbn;
        this.paginas = paginas;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
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

    public void cargarLibro() {

        System.out.println("Ingrese ISBN : ");
        isbn = leer.nextInt();
        System.out.println("Ingrese titulo : ");
        titulo = leer.next();
        System.out.println("Autor : ");
        autor = leer.next();
        System.out.println("cantidad de páginas ");
        paginas = leer.nextInt();
    }
    
    public void listarLibro(){
        System.out.println("");
        System.out.println("ISBN : "+ isbn);
        System.out.println("Titulo : "+titulo);
        System.out.println("Autor : "+autor);
        System.out.println("Páginas : "+paginas);
    }
}
