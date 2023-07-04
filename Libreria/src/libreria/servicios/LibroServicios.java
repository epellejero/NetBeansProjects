package libreria.servicios;

import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

public class LibroServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    AutorServicios autorServicios = new AutorServicios();
    EditorialSericios editorialSericios = new EditorialSericios();
    boolean continuar;
    
    public void crearLibro(){
        
        continuar = true;
        while (continuar){
            System.out.println("____________________________________________");
            System.out.println("                                            ");
            System.out.println(" Ingrese los siguientes datos para el alta  ");
            System.out.println("____________________________________________");
            System.out.println("                                            ");
            System.out.print("ISBN                   : ");
            long isbn = leer.nextLong();
            System.out.print("Titulo                 : ");
            String titulo = leer.next().toUpperCase();
            System.out.print("Año de publicación     : ");
            int anio = leer.nextInt();
            System.out.print("Cantidad de ejemplares : ");
            int ejemplares = leer.nextInt();
            System.out.print("Cantidad prestados     : ");
            int ejemplaresPrestados = leer.nextInt();
            System.out.print("Cantidad restantes     : ");
            int ejemplaresRestantes = leer.nextInt();
        
            autorServicios.consultarAutores();
            System.out.print("Autor del libro (ID)   : ");
            String idAutor = leer.next();
            Autor autor = new Autor();
            autor = autorServicios.buscarAutor(idAutor);
        
            editorialSericios.consultarEditoriales();
            System.out.print("Editorial       (ID)   : ");
            String idEditorial = leer.next();
            Editorial editorial = new Editorial();
            editorial = editorialSericios.buscarEditorial(idEditorial);
        
            //Libro libro = new Libro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, true, autor, editorial);
        
            Libro libro = new Libro();
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAlta(true);
            libro.setAutor(autor);
            libro.setEditorial(editorial);    
            
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
            System.out.print("Desea agregar otro libro? S/N ");
            String respuesta = leer.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }
    }
    
    public void consultarLibros() {
        
        Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        System.out.println("______________________________________");
        System.out.println("                                      ");
        System.out.println("ID   LIBRO                            ");
        System.out.println("______________________________________");
        for (Libro aux : libros) {
            if (aux.getAlta()){
                System.out.println(aux.getId() + " - " + aux.getTitulo() + " - " + aux.getAnio() 
                        + " - " + aux.getEjemplares() + " - " + aux.getEjemplaresRestantes()); 
            }
        }        
    }
    
    public void consultarLibrosIsbn() {
        
        Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        System.out.print("Ingrese el ISBN del libro : ");
        long isbn = leer.nextLong();
        System.out.println("ID     LIBRO                          ");
        System.out.println("______________________________________");
        for (Libro aux : libros) {
            if (aux.getAlta() && aux.getIsbn() == isbn){
                System.out.println(aux.getId() + " - " + aux.getTitulo() + " - " + aux.getAnio()
                + " - " + aux.getEjemplares() + " - " + aux.getEjemplaresRestantes()); 
            }
        }        
    }
    
    public void consultarLibrosTitulo() {
        
        Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        System.out.print("Ingrese el titulo del libro : ");
        String titulo = leer.next().toUpperCase();
        System.out.println("ID     LIBRO                          ");
        System.out.println("______________________________________");
        for (Libro aux : libros) {
            if (aux.getAlta() && aux.getTitulo().contains(titulo)){
                System.out.println(aux.getId() + " - " + aux.getTitulo()); 
            }
        }        
    }
    
    public void consultarLibrosAutor(Autor autor) {
        
        Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        autorServicios.consultarAutores();
        System.out.print("Autor del libro (ID)   : ");
        String idAutor = leer.next();
        autor = autorServicios.buscarAutor(idAutor); 
        System.out.println("ID    LIBRO                           ");
        System.out.println("______________________________________");
        for (Libro aux : libros) {
            if (aux.getAlta() && aux.getAutor().equals(autor)){
                System.out.println(aux.getId() + " - " + aux.getTitulo()); 
            }
        }        
    }
    
    public void consultarLibrosEditorial() {
        
        Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        editorialSericios.consultarEditoriales();
        System.out.print("Editorial       (ID)   : ");
        String idEditorial = leer.next();
        Editorial editorial = editorialSericios.buscarEditorial(idEditorial);
        System.out.println("ID     LIBRO                          ");
        System.out.println("______________________________________");
        for (Libro aux : libros) {
            if (aux.getAlta() && aux.getEditorial().equals(editorial)){
                System.out.println(aux.getId() + " - " + aux.getTitulo()); 
            }
        }        
    }
    
    public Libro buscarLibro(String id) {
        Libro libro = em.find(Libro.class, id);
        return libro;
    }
    
    public void modificarLibro() {
        consultarLibros();
        System.out.print("Ingrese el ID del libro : ");
        String id = leer.next().toUpperCase();
        Libro libro = em.find(Libro.class, id);
        System.out.print("ISBN (" + libro.getIsbn() + ") : ");
        long isbn = leer.nextLong();
        System.out.print("Titulo (" + libro.getTitulo() + ") : ");
        String titulo = leer.next().toUpperCase();
        System.out.print("Año de publicación (" + libro.getAnio() + ") : ");
        int anio = leer.nextInt();
        System.out.print("Cantidad de ejemplares (" + libro.getEjemplares() + ") : ");
        int ejemplares = leer.nextInt();
        System.out.print("Cantidad prestados (" + libro.getEjemplaresPrestados() + ") : ");
        int ejemplaresPrestados = leer.nextInt();
        System.out.print("Cantidad restantes (" + libro.getEjemplaresRestantes() + ") : ");
        int ejemplaresRestantes = leer.nextInt();
        
        autorServicios.consultarAutores();
        System.out.print("Autor del libro (ID)   : ");
        String idAutor = leer.next();
        Autor autor = new Autor();
        autor = autorServicios.buscarAutor(idAutor);
        
        editorialSericios.consultarEditoriales();
        System.out.print("Editorial       (ID)   : ");
        String idEditorial = leer.next();
        Editorial editorial = new Editorial();
        editorial = editorialSericios.buscarEditorial(idEditorial);
        
        
        libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        libro.setAlta(true);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
                
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
    }

    public void bajaLibro() {
        
        consultarLibros();
        continuar = true;
        while (continuar){
            System.out.print("Ingrese el ID del libro : ");
            String id = leer.next();
            Libro libro = em.find(Libro.class, id);        
            System.out.println("                                      ");
            System.out.println("ID    LIBRO                           ");
            System.out.println("______________________________________");
            System.out.println(libro.getId() + " - " + libro.getTitulo()); 
            System.out.println("                                      ");
            
            System.out.print("Desea eliminarlo de forma definitiva? S/N ");
            String definitiva = leer.next().toUpperCase();
            em.getTransaction().begin();
            if (definitiva.equalsIgnoreCase("S")){
               em.remove(libro);
            }else{
                libro.setAlta(false);
                em.merge(libro);    
            }
            em.getTransaction().commit();
            
            System.out.print("Desea eliminar otro libro? S/N ");
            String respuesta = leer.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }
    }    
        
}
