
package pooej07;

/*
* Realizar una clase llamada Persona que tenga los siguientes atributos: nombre,
* edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno 
* desea añadir algún otro atributo, puede hacerlo. 
* Los métodos que se implementarán son:
*  Un constructor por defecto.
*  Un constructor con todos los atributos como parámetro.
*  Métodos getters y setters de cada atributo.
*  Metodo crearPersona(): el método crear persona, le pide los valores de los 
*   atributos al usuario y después se le asignan a sus respectivos atributos 
*   para llenar el objeto Persona. Además, comprueba que el sexo introducido sea
*   correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
*  Método calcularIMC(): calculara si la persona está en su peso ideal (peso 
*   en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor 
*   que 20, significa que la persona está por debajo de su peso ideal y la 
*   función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 
*   25 (incluidos), significa que la persona está en su peso ideal y la función 
*   devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor 
*   que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
*  Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
*   devuelve un booleano.
* A continuación, en la clase main hacer lo siguiente:
* Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
* llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
* está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e 
* indicar para cada objeto si la persona es mayor de edad.
* Luego, guardamos los resultados de los métodos calcularIMC y esMayorDeEdad en
* distintas variables, para después en el main, calcular un porcentaje de esas 4
* personas cuantas están por debajo de su peso, cuantas en su peso ideal y 
* cuantos, por encima, y también calcularemos un porcentaje de cuantos son 
* mayores de edad y cuantos menores.
 */
import pooej07.entidades.Persona;
import servicios.PersonaServicios;

public class POOEj07 {

    public static void main(String[] args) throws Exception {
        int pesoIdeal=0,pesoBajo=0,sobrePeso=0;
        int mayores=0,menores=0;
        PersonaServicios ps = new PersonaServicios();
        Persona p1 = ps.altaPersona();
        Persona p2 = ps.altaPersona();
        Persona p3 = ps.altaPersona();
        Persona p4 = ps.altaPersona();
        
        Persona [] vectorPersonas = new Persona [4]; 
        vectorPersonas[0] = p1;
        vectorPersonas[1] = p2;
        vectorPersonas[2] = p3;
        vectorPersonas[3] = p4;
        
        for (int i = 0; i < 4; i++){
             // calculo ICM 
            switch (ps.calcularIMC(vectorPersonas[i])){
                case 0:
                    pesoIdeal++;
                    break;
                case 1:
                    sobrePeso++;
                    break;
                case -1:
                    pesoBajo++;
                    break;
            }
            // calculo mayores de edad 
            try {
                if (ps.esMayorDeEdad(vectorPersonas[i])){
                    mayores++;
                }
                else {
                    menores++;
                }    
            } catch (NullPointerException psException) {
                System.out.println("Error: edad -> null ");
            }
                 
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.print("Mayores de edad: " + mayores + "   ");
        System.out.println((mayores*.25)*100 + " %");
        System.out.print("Menores de edad: " + menores + "   ");
        System.out.println((menores*.25)*100 + " %");
        System.out.print("Peso ideal: " + pesoIdeal + "   ");
        System.out.println((pesoIdeal*.25)*100 + " %");
        System.out.print("Sobrepeso : " + sobrePeso + "   ");
        System.out.println((sobrePeso*.25)*100 + " %");
        System.out.print("Peso Bajo : " + pesoBajo + "   ");
        System.out.println((pesoBajo*.25)*100 + " %");

    }
}
