package libreria.servicios;

import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Cliente;

public class ClienteServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    boolean continuar;
    long documento;
    
    public void crearCliente(){
        
        continuar = true;
        while (continuar){
            System.out.println("____________________________________________");
            System.out.println("                                            ");
            System.out.println(" Ingrese los siguientes datos para el alta  ");
            System.out.println("____________________________________________");
            System.out.println("                                            ");
            System.out.print("Documento              : ");
            long documento = leer.nextLong();
            System.out.print("Nombre                 : ");
            String nombre = leer.next();
            System.out.print("Apellido               : ");
            String apellido = leer.next();
            System.out.print("Teléfono               : ");
            String telefono = leer.next();
                
            Cliente cliente = new Cliente();
            
            cliente.setDocumento(documento);
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setTelefono(telefono);
            
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            
            System.out.print("Desea agregar otro cliente ? S/N ");
            String respuesta = leer.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }
    }
    
    public void consultarClientes() {
        
        Collection<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c").getResultList();
        System.out.println("______________________________________");
        System.out.println("                                      ");
        System.out.println("ID   DOCUMENTO   NOMBRE   APELLIDO    ");
        System.out.println("______________________________________");
        for (Cliente aux : clientes) {
            System.out.println(aux.getId() + " - " + aux.getDocumento() 
                    + " - " + aux.getNombre() 
                    + " - " + aux.getApellido()); 
            
        }        
    }
    
    public void consultarClienteDocumento() {
        
        Collection<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c").getResultList();
        System.out.print("Ingrese el documento del cliente : ");
        long documento = leer.nextLong();
        System.out.println("                                           ");
        System.out.println("ID   DOCUMENTO   NOMBRE     APELLIDO       ");
        System.out.println("                                           ");
        for (Cliente aux : clientes) {
            if (aux.getDocumento() == documento){
                System.out.println(aux.getId() + " - " + aux.getDocumento() 
                        + " - " + aux.getNombre() 
                        + " - " + aux.getApellido());
            }
        }        
    }
    
    public Cliente buscarCliente(Integer id) {
        Cliente cliente = em.find(Cliente.class, id);
        return cliente;
    }
    
     public void modificarCliente() {
        consultarClientes();
        System.out.print("Ingrese el id cliente : ");
        int id = leer.nextInt();
        Cliente cliente = em.find(Cliente.class, id);
        System.out.print("Documento (" + cliente.getDocumento() + ") : ");
        documento = leer.nextLong();
        System.out.print("Nombre (" + cliente.getNombre() + ") : ");
        String nombre = leer.next().toUpperCase();
        System.out.print("Apellido (" + cliente.getApellido() + ") : ");
        String apellido = leer.next().toUpperCase();
        System.out.print("Teléfono (" + cliente.getTelefono() + ") : ");
        String telefono = leer.next().toUpperCase();
            
        cliente.setDocumento(documento);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);
        
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
    }

    public void bajaCliente() {
        
        consultarClientes();
        continuar = true;
        while (continuar){
            System.out.print("Ingrese ID del cliente : ");
            int id = leer.nextInt();
            Cliente cliente = em.find(Cliente.class, id);        
            System.out.println("                                      ");
            System.out.println("DOCUMENTO   NOMBRE     APELLIDO       ");
            System.out.println("______________________________________");
            System.out.println(cliente.getDocumento() + " - " + cliente.getNombre() + " - " + cliente.getApellido()); 
            System.out.println("                                      ");
           
            em.getTransaction().begin();
            em.remove(cliente);
            em.getTransaction().commit();
            
            System.out.print("Desea eliminar otro cliente? S/N ");
            String respuesta = leer.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }
    } 
    
    
    
    
}
