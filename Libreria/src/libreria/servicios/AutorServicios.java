package libreria.servicios;

import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;

public class AutorServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    Autor autor = new Autor();
    String id;
    boolean continuar;
    
    public void crearAutor(){
        continuar = true;
        while (continuar){
            System.out.print("Ingrese el nombre del autor : ");
            String nombreAutor = leer.next().toUpperCase();
            boolean altaAutor = true;
            autor.setNombre(nombreAutor);
            autor.setAlta(altaAutor);
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
            System.out.print("Desea agregar otro autor? S/N ");
            String respuesta = leer.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }       
        
    }
    
    public void consultarAutores() {
        
        Collection<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        System.out.println("_____________________________________________");
        System.out.println("                                             ");
        System.out.println("ID     AUTOR                                 ");
        System.out.println("_____________________________________________");
        for (Autor aux : autores) {
            if (aux.getAlta()){
                System.out.println(aux.getId() + " - " + aux.getNombre());
            }
        }
    }
    
    public void consultarAutoresNombre() {
        
        Collection<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        System.out.print("Ingrese el nombre del autor : ");
        String nombre = leer.next().toUpperCase();
        System.out.println("ID   AUTOR                                   ");
        for (Autor aux : autores) {
            if (aux.getAlta() && aux.getNombre().contains(nombre)){
                System.out.println(aux.getId() + " - " + aux.getNombre());
            }
        }
    }
    
    public Autor buscarAutor(Integer id) {
        Autor autor = em.find(Autor.class, id);
        return autor;
    }
    
    public void buscarAutorNombre() {
        System.out.print("Ingrese el nombre del autor   :   ");
        String nombre = leer.next().toUpperCase();
        Autor autor = em.find(Autor.class, nombre);
        System.out.println("ID     AUTOR                                 ");
        System.out.println(autor.getId()+" "+autor.getNombre());
    }
    
    public void modificarAutor() {
        consultarAutores();
        System.out.print("Ingrese el ID del autor : ");
        int id = leer.nextInt();
        Autor autor = em.find(Autor.class, id);
        System.err.println(" ");
        System.out.print("Modifique el nombre (" + autor.getNombre() + ") : ");
        String nombreAutor = leer.next().toUpperCase();
        autor.setNombre(nombreAutor);
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
    }
    
    public void bajaAutor() {
        
        consultarAutores();
        continuar = true;
        while (continuar){
            System.out.print("Ingrese el ID del autor : ");
            int id = leer.nextInt();
            Autor autor = em.find(Autor.class, id);        
            System.out.println("                                      ");
            System.out.println("ID    AUTOR                           ");
            System.out.println("______________________________________");
            System.out.println(autor.getId() + " - " + autor.getNombre()); 
            System.out.println("                                      ");
            
            autor.setAlta(false);
            em.getTransaction().begin();
            em.merge(autor);
            em.getTransaction().commit();
            
//            System.out.print("Desea eliminarlo de forma definitiva? S/N ");
//            String definitiva = leer.next().toUpperCase();
//            autor.setAlta(false);
            
//           em.getTransaction().begin();
//            if (definitiva.equalsIgnoreCase("S")){
//               em.remove(autor);            
//            }else{
//               em.merge(autor);
//            }
//            em.getTransaction().commit();
            
            System.out.print("Desea eliminar otro autor? S/N ");
            String respuesta = leer.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }
    }    
    
}
