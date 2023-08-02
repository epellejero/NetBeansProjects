package libreria.servicios;

import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Prestamo;

public class PrestamoServicios {
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    boolean continuar;
    long documento;
    
    public void crearPrestamo(){
        
        continuar = true;
        while (continuar){
            System.out.println("____________________________________________");
            System.out.println("                                            ");
            System.out.println(" Ingrese los siguientes datos para el alta  ");
            System.out.println("____________________________________________");
            System.out.println("                                            ");
            System.out.print("Fecha de alta          : ");
            String fechaPrestamo = leer.next();
            System.out.print("Fecha de devolución    : ");
            String fechaDevolucion = leer.next();
            System.out.print("ID del libro           : ");
            int idLibro = leer.nextInt();
            System.out.print("ID del cliente         : ");
            int idCliente = leer.nextInt();
                
            Prestamo prestamo = new Prestamo();
            
//            prestamo.setFechaPrestamo(fechaPrestamo);
//            prestamo.setFechaDevolucion(fechaDevolucion);
//            prestamo.setLibro(libro);
//            prestamo.setCliente(cliente);
            
            
            em.getTransaction().begin();
            em.persist(prestamo);
            em.getTransaction().commit();
            
            System.out.print("Desea agregar otro prestamo ? S/N ");
            String respuesta = leer.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }
    }
    
    public void consultarPrestamos() {
        
        Collection<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamos p").getResultList();
        System.out.println("______________________________________");
        System.out.println("                                      ");
        System.out.println("ID  ALTA   DEVOLUCIÓN   LIBRO   CLIENTE");
        System.out.println("______________________________________");
        for (Prestamo aux : prestamos) {
            System.out.println(aux.getId() + " - " + aux.getFechaPrestamo() + " - " 
                    + aux.getFechaDevolucion() + " - " + aux.getCliente() + " - " + aux.getLibro()); 
            
        }        
    }
    
    
    public Prestamo buscarPrestamo(Integer id) {
        Prestamo prestamo = em.find(Prestamo.class, id);
        return prestamo;
    }
    
     public void modificarPrestamo() {
        consultarPrestamos();
        System.out.print("Ingrese el id del prestamos : ");
        int idPrestamo = leer.nextInt();
        Prestamo prestamo = em.find(Prestamo.class, idPrestamo);
        System.out.print("Fecha de alta (" + prestamo.getFechaPrestamo() + ") : ");
        String fechaPrestamo = leer.next();
        System.out.print("Fecha de devolución (" + prestamo.getFechaDevolucion() + ") : ");
        String fechaDevolucion = leer.next();
        System.out.print("ID del libro (" + prestamo.getLibro() + ") : ");
        int idLibro = leer.nextInt();
        System.out.print("ID del cliente (" + prestamo.getCliente() + ") : ");
        int idCliente = leer.nextInt();
            
//        prestamo.setFechaPrestamo(fechaPrestamo);
//        prestamo.setFechaDevolucion(fechaDevolucion);
//        prestamo.setLibro(libro);
//        prestamo.setCliente(cliente);
        
        em.getTransaction().begin();
        em.merge(prestamo);
        em.getTransaction().commit();
    }

    public void bajaPrestamo() {
        
        consultarPrestamos();
        continuar = true;
        while (continuar){
            System.out.print("Ingrese ID del prestamo : ");
            int idPrestamo = leer.nextInt();
            Prestamo prestamo = em.find(Prestamo.class, idPrestamo);        
            System.out.println("______________________________________");
            System.out.println("                                      ");
            System.out.println("ID  ALTA   DEVOLUCIÓN   LIBRO   CLIENTE");
            System.out.println("______________________________________");
            System.out.println("                                      ");
            System.out.println(prestamo.getId() + " - " + prestamo.getFechaPrestamo() 
                    + " - " + prestamo.getFechaDevolucion() 
                    + " - " + prestamo.getCliente() 
                    + " - " + prestamo.getLibro());
            
            em.getTransaction().begin();
            em.remove(prestamo);
            em.getTransaction().commit();
            
            System.out.print("Desea eliminar otro prestamo ? S/N ");
            String respuesta = leer.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }
    } 

    
    
    
    
}
