package libreria;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.servicios.AutorServicios;
import libreria.servicios.ClienteServicios;
import libreria.servicios.EditorialSericios;
import libreria.servicios.LibroServicios;
import libreria.servicios.PrestamoServicios;

public class Libreria {

    public static void main(String[] args) {
        
        // EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AutorServicios autorServicios = new AutorServicios();
        EditorialSericios editorialServicios = new EditorialSericios();
        LibroServicios libroServicios = new LibroServicios();
        ClienteServicios clienteServicios = new ClienteServicios();
        PrestamoServicios prestamoServicios = new PrestamoServicios();
        
        
        try {
            int opcion;
            boolean continuar;
            do {
                System.out.println("_____________________________________________");
                System.out.println("                                             ");
                System.out.println("               L I B R E R I A               ");
                System.out.println("_____________________________________________");
                System.out.println("                                             ");
                System.out.println("            1 - Autor                        ");
                System.out.println("            2 - Editorial                    ");
                System.out.println("            3 - Libros                       ");
                System.out.println("            4 - Clientes                     ");
                System.out.println("            5 - Prestamos                    ");
                System.out.println("                                             ");
                System.out.println("            99 - Salir                       ");
                System.out.println("                                             ");
                opcion = leer.nextInt();
                        
            switch (opcion) {
                case 1:     // Autor 
                    do {
                        System.out.println("_____________________________________________");
                        System.out.println("                                             ");
                        System.out.println("                   A U T O R                 ");
                        System.out.println("_____________________________________________");
                        System.out.println("                                             ");
                        System.out.println("            1 - Consulta autores             ");
                        System.out.println("            2 - Consulta x nombre            ");
                        System.out.println("            3 - Alta                         ");
                        System.out.println("            4 - Modificación                 ");
                        System.out.println("            5 - Baja                         ");
                        System.out.println("            9 - Salir                        ");
                        System.out.println("                                             ");
                        opcion = leer.nextInt();
                        switch (opcion) {
                            case 1:     // Consulta Autor 
                                autorServicios.consultarAutores();
                                break;
                            case 2:     // Consulta Autor x nombre
                                autorServicios.consultarAutoresNombre();
                                break;    
                            case 3:     // Alta de Autor 
                                autorServicios.crearAutor();
                                break;
                            case 4:     // Modificación de Autor
                                autorServicios.modificarAutor();
                                break;
                            case 5:     // Baja de Autor
                                autorServicios.bajaAutor();
                                break;    
                            default:   
                                break;
                        }
                        } while (opcion != 9);
                            System.out.println(" ");
                        break;
                case 2:     // Editorial
                    do {
                        System.out.println("_____________________________________________");
                        System.out.println("                                             ");
                        System.out.println("               E D I T O R I A L             ");
                        System.out.println("_____________________________________________");
                        System.out.println("                                             ");
                        System.out.println("            1 - Consulta                     ");
                        System.out.println("            2 - Consulta x nombre            ");
                        System.out.println("            3 - Alta                         ");
                        System.out.println("            4 - Modificación                 ");
                        System.out.println("            5 - Baja                         ");
                        System.out.println("            9 - Salir                        ");
                        System.out.println("                                             ");
                        opcion = leer.nextInt();
                        switch (opcion) {
                            case 1:     // Consulta Editorial 
                                editorialServicios.consultarEditoriales();
                                break;
                            case 2:     // Consulta Editorial x nombre 
                                editorialServicios.consultarEditorialNombre();
                                break;   
                            case 3:     // Alta de Editorial 
                                editorialServicios.crearEditorial();
                                break;
                            case 4:     // Modificación de Editorial
                                editorialServicios.modificarEditorial();
                                break;
                            case 5:     // Baja de Editorial
                                editorialServicios.bajaEditorial();
                                break;    
                            default:
                                break;
                        }
                        } while (opcion != 9);
                            System.out.println(" ");
                    break;
                case 3:     // Libros
                    do {
                        System.out.println("_____________________________________________");
                        System.out.println("                                             ");
                        System.out.println("                L I B R O S                  ");
                        System.out.println("_____________________________________________");
                        System.out.println("                                             ");
                        System.out.println("            1 - Consulta                     ");
                        System.out.println("            2 - Consulta x ISBN              ");
                        System.out.println("            3 - Consulta x título            ");
                        System.out.println("            4 - Consulta x autor             ");
                        System.out.println("            5 - Consulta x editorial         ");
                        System.out.println("            6 - Alta                         ");
                        System.out.println("            7 - Modificación                 ");
                        System.out.println("            8 - Baja                         ");
                        System.out.println("            9 - Salir                        ");
                        System.out.println("                                             ");
                        opcion = leer.nextInt();
                        switch (opcion) {
                            case 1:     // Consulta Libros 
                                libroServicios.consultarLibros();
                                break;
                            case 2:     // Consulta Libros x ISBN 
                                libroServicios.consultarLibrosIsbn();
                                break;
                            case 3:     // Consulta Libros x título
                                libroServicios.consultarLibrosTitulo();
                                break;
                            case 4:     // Consulta Libros x autor
                                libroServicios.consultarLibrosAutor();
                                break;
                            case 5:     // Consulta Libros x editorial
                                libroServicios.consultarLibrosEditorial();
                                break;    
                            case 6:     // Alta de Libros 
                                libroServicios.crearLibro();
                                break;
                            case 7:     // Modificación de Libros
                                libroServicios.modificarLibro();
                                break;
                            case 8:     // Baja de Libros
                                libroServicios.bajaLibro();
                                        
                                break;    
                            default:
                                break;
                        }
                        } while (opcion != 9);
                            System.out.println(" ");
                    break;
                case 4:     //  Cliente
                    do {
                        System.out.println("_____________________________________________");
                        System.out.println("                                             ");
                        System.out.println("               C L I E N T E S               ");
                        System.out.println("_____________________________________________");
                        System.out.println("                                             ");
                        System.out.println("            1 - Consulta clientes            ");
                        System.out.println("            2 - Consulta x documento         ");
                        System.out.println("            3 - Alta                         ");
                        System.out.println("            4 - Modificación                 ");
                        System.out.println("            5 - Baja                         ");
                        System.out.println("            9 - Salir                        ");
                        System.out.println("                                             ");
                        opcion = leer.nextInt();
                        switch (opcion) {
                            case 1:     // Consulta Cliente 
                                clienteServicios.consultarClientes();
                                break;
                            case 2:     // Consulta Cliente x documento
                                clienteServicios.consultarClienteDocumento();
                                break;    
                            case 3:     // Alta de Cliente 
                                clienteServicios.crearCliente();
                                break;
                            case 4:     // Modificación de Cliente
                                clienteServicios.modificarCliente();
                                break;
                            case 5:     // Baja de Cliente
                                clienteServicios.bajaCliente();
                                break;    
                            default:   
                                break;
                        }
                        } while (opcion != 9);
                            System.out.println(" ");
                        break;
                case 5:     //  Prestamos
                        do {
                        System.out.println("_____________________________________________");
                        System.out.println("                                             ");
                        System.out.println("              P R E S T A M O S              ");
                        System.out.println("_____________________________________________");
                        System.out.println("                                             ");
                        System.out.println("            1 - Consulta préstamos           ");
                        System.out.println("            2 - Consulta x cliente           ");
                        System.out.println("            3 - Alta                         ");
                        System.out.println("            4 - Modificación                 ");
                        System.out.println("            5 - Baja                         ");
                        System.out.println("            9 - Salir                        ");
                        System.out.println("                                             ");
                        opcion = leer.nextInt();
                        switch (opcion) {
                            case 1:     // Consulta Préstamos
                                //prestamoServicios.consultarPrestamos();
                                break;
                            case 2:     // Consulta préstamo x cliente
                                //prestamoServicios.consultarprestamoCliente();
                                break;    
                            case 3:     // Alta de préstamo 
                                //prestamoServicios.crearPrestamo();
                                break;
                            case 4:     // Modificación de préstamo
                                //prestamoServicios.modificarPrestamo();
                                break;
                            case 5:     // Baja de préstamo
                                //prestamoServicios.bajaPrestamo();
                                break;    
                            default:   
                                break;
                        }
                        } while (opcion != 9);
                            System.out.println(" ");
                        break;
                default:
                    break;
            }
            } while (opcion != 99);
            System.out.println("                                             ");
            System.out.println("                                             ");
            System.out.println("* * * * * * * * Fin de proceso * * * * * * * ");
            System.out.println("                                             ");
            System.out.println("                                             ");
                    
        } catch (Exception ex) {
            throw ex;
            //Logger.getLogger(MainClass.class.getName()).log(level.SEVERE, null, ex);
        }
    }
}
