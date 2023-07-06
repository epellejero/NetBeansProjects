package libreria.servicios;

import java.util.Collection;
import java.util.Date;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;

public class PrestamoServicios {
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    LibroServicios libroServicios = new LibroServicios();
    ClienteServicios clienteServicios = new ClienteServicios();
    Libro libro = new Libro();
    Cliente cliente = new Cliente();
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
            
            System.out.print("Ingrese el dia del alta DD   : ");
            int diaP = leer.nextInt();
            System.out.print("Ingrese el mes del alta MM   : ");
            int mesP = leer.nextInt();
            System.out.print("Ingrese el año del alta AAAA : ");
            int anioP = leer.nextInt();
            Date fechaPrestamo = new Date(anioP-1900, mesP-1, diaP);
            System.out.print("Ingrese día de devolución DD : ");
            int diaD = leer.nextInt();
            System.out.print("Ingrese mes de devolución MM : ");
            int mesD = leer.nextInt();
            System.out.print("Ingrese año de devolución AAAA : ");
            int anioD = leer.nextInt();
            Date fechaDevolucion = new Date(anioD-1900, mesD-1, diaD);
         
            System.out.print("ID del libro           : ");
            int idLibro = leer.nextInt();
            libro = libroServicios.buscarLibro(idLibro);
            
            System.out.print("ID del cliente         : ");
            int idCliente = leer.nextInt();
            cliente = clienteServicios.buscarCliente(idCliente);
            
            
            Prestamo prestamo = new Prestamo();
            
            prestamo.setFechaPrestamo(fechaPrestamo);
            prestamo.setFechaDevolucion(fechaDevolucion);
            prestamo.setLibro(libro);
            prestamo.setCliente(cliente);
            
            
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
        System.out.print("Ingrese el dia del alta DD   : ");
        int diaP = leer.nextInt();
        System.out.print("Ingrese el mes del alta MM   : ");
        int mesP = leer.nextInt();
        System.out.print("Ingrese el año del alta AAAA : ");
        int anioP = leer.nextInt();
        Date fechaPrestamo = new Date(anioP-1900, mesP-1, diaP);
        
        System.out.print("Fecha de devolución (" + prestamo.getFechaDevolucion() + ") : ");
        System.out.print("Ingrese día de devolución DD : ");
        int diaD = leer.nextInt();
        System.out.print("Ingrese mes de devolución MM : ");
        int mesD = leer.nextInt();
        System.out.print("Ingrese año de devolución AAAA : ");
        int anioD = leer.nextInt();
        Date fechaDevolucion = new Date(anioD-1900, mesD-1, diaD);
        
//        System.out.print("ID del libro (" + prestamo.getLibro() + ") : ");
//        int idLibro = leer.nextInt();
//        libro = libroServicios.buscarLibro(idLibro);
//        
//        System.out.print("ID del cliente (" + prestamo.getCliente() + ") : ");
//        int idCliente = leer.nextInt();
//        cliente = clienteServicios.buscarCliente(idCliente);
            
        prestamo.setFechaPrestamo(fechaPrestamo);
        prestamo.setFechaDevolucion(fechaDevolucion);
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
