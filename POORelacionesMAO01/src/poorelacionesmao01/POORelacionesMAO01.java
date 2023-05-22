package poorelacionesmao01;

import poorelacionesmao01.entidades.Dni;
import poorelacionesmao01.entidades.Persona;

/**
 * Realiza un programa en donde una clase Persona tenga como atributo nombre,
 * apellido y un objeto de clase Dni. La clase Dni tendrá como atributos la
 * serie (carácter) y número. Prueba acceder luego a los atributos del dni de la
 * persona creando objetos y jugando desde el main.
 *
 * @author epellejero
 */
public class POORelacionesMAO01 {

    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        Dni dni = new Dni();
        
        dni.setNumero(18587571);
        dni.setSerie('D');
        
        p1.setNombre("Eduardo David");
        p1.setApellido("Pellejero");
        p1.setDni(dni);
     
        System.out.println(p1);
        System.out.println("Nombre  : " + p1.getNombre());
        System.out.println("Apellido: " + p1.getApellido());
        System.out.println("DNI     : " + dni.getSerie() + " " + dni.getNumero());
        
        
        
    }

}
