package libreria.servicios;

import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Editorial;

public class EditorialSericios {
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    Editorial editorial = new Editorial();
    String id;
    boolean continuar;
     
    public void crearEditorial(){
        continuar = true;
        while (continuar){
            System.out.print("Ingrese el nombre de la editorial : ");
            String nombreEditorial = leer.next().toUpperCase();
            editorial.setNombre(nombreEditorial);
            editorial.setAlta(true);
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
            System.out.print("Desea agregar otra editorial? S/N ");
            String respuesta = leer.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }
    }
    
    public void consultarEditoriales() {
        
        Collection<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e").getResultList();
        System.out.println("______________________________________");
        System.out.println("                                      ");
        System.out.println("ID     EDITORIAL                      ");
        System.out.println("______________________________________");
        for (Editorial aux : editoriales) {
            if (aux.getAlta()){
                System.out.println(aux.getId() + " - " + aux.getNombre());
            }
        }    
    }
    
    public void consultarEditorialNombre() {
        
        Collection<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e").getResultList();
        System.out.print("Ingrese el nombre de la editorial : ");
        String nombre = leer.next().toUpperCase();
        System.out.println("ID     EDITORIAL                             ");
        for (Editorial aux : editoriales) {
            if (aux.getAlta() && aux.getNombre().contains(nombre)){
                System.out.println(aux.getId() + " - " + aux.getNombre());
            }
        }
    }
    
        
    public Editorial buscarEditorial(Integer id) {
        Editorial editorial  = em.find(Editorial.class, id);
        return editorial;
    }
    
    public void modificarEditorial() {
        consultarEditoriales();
        System.out.print("Ingrese el ID de la editorial : ");
        int id = leer.nextInt();
        Editorial editorial = em.find(Editorial.class, id);
        System.out.println(" ");
        System.out.print("Modifique el nombre (" + editorial.getNombre() + "): ");
        String nombreEditorial = leer.next().toUpperCase();
        editorial.setNombre(nombreEditorial);
        editorial.setAlta(true);
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
    }

//    public void bajaEditorial() {
//        consultarEditoriales();
//        System.out.print("Ingrese el ID de la editorial : ");
//        String id = leer.next().toUpperCase();
//        Editorial editorial = em.find(Editorial.class, id);
//        System.out.println(" ");
//        editorial.setAlta(false);
//        em.getTransaction().begin();
//        em.merge(editorial);
//        em.getTransaction().commit();
//    }
    
    public void bajaEditorial() {
        
        consultarEditoriales();
        continuar = true;
        while (continuar){
            System.out.print("Ingrese el ID de la editorial : ");
            int id = leer.nextInt();
            Editorial editorial = em.find(Editorial.class, id);        
            System.out.println("                                      ");
            System.out.println("ID    EDITORIAL                       ");
            System.out.println("______________________________________");
            System.out.println(editorial.getId() + " - " + editorial.getNombre()); 
            System.out.println("                                      ");
            
//            System.out.print("Desea eliminarlo de forma definitiva? S/N ");
//            String definitiva = leer.next().toUpperCase();
//            em.getTransaction().begin();
//            if (definitiva.equalsIgnoreCase("S")){
//               em.remove(editorial);
//            }else{
//               editorial.setAlta(false);
//               em.merge(editorial);    
//            }
//            em.getTransaction().commit();

            editorial.setAlta(false);
            em.getTransaction().begin();
            em.merge(editorial);    
            em.getTransaction().commit();
            
            System.out.print("Desea eliminar otro libro? S/N ");
            String respuesta = leer.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }
    }    
    
}
