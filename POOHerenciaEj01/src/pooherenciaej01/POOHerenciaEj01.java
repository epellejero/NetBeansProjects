package pooherenciaej01;

import java.util.ArrayList;
import java.util.List;
import pooherenciaej01.entidades.Animal;
import pooherenciaej01.entidades.Caballo;
import pooherenciaej01.entidades.Gato;
import pooherenciaej01.entidades.Perro;

/**
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato,
 * Caballo. La clase Animal tendrá como atributos el nombre, alimento, edad y
 * raza del Animal. Crear un método en la clase Animal a través del cual cada
 * clase hija deberá mostrar luego un mensaje por pantalla informando de que se
 * alimenta.
 *
 * @author Eduardo
 */
public class POOHerenciaEj01 {

    public static void main(String[] args) {
        
        List<Animal> listaAnimales = new ArrayList<>();
        // Declaración del objeto Perro
        Animal perro1 = new Perro("Stich","Carnivoro",15,"Doberman");
        perro1.alimentarse();        
        listaAnimales.add(perro1);
        
        // Declaración otro objeto Perro
        Animal perro2 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro2.alimentarse();
        listaAnimales.add(perro2);
        
        // Declaración del objeto Gato
        Animal gato1 = new Gato("Pelusa","Galletas",15,"Siamés");
        gato1.alimentarse();
        listaAnimales.add(gato1);
        
        // Declaración del objeto Caballo
        Animal caballo1 = new Caballo("Spark","Pasto",25,"Fino");
        caballo1.alimentarse();
        listaAnimales.add(caballo1);
        
        
        for (Animal auxAnimal : listaAnimales) {
            System.out.println("" + auxAnimal);
            
        }
        
//        System.out.println("" + perro1);
//        System.out.println("" + perro2);
//        System.out.println("" + gato1);
//        System.out.println("" + caballo1);  
    }

}
