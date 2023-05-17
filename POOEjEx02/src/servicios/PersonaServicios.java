package servicios;

import entidades.Persona;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 * Haz una clase llamada Persona que siga las siguientes condiciones:
 *
 * Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y
 * altura. No queremos que se accedan directamente a ellos. Piensa que
 * modificador de acceso es el más adecuado, también su tipo. Si quieres añadir
 * algún atributo puedes hacerlo. Por defecto, todos los atributos menos el DNI
 * serán valores por defecto según su tipo (0 números, cadena vacía para String,
 * etc.). Sexo sera hombre por defecto, usa una constante para ello. Se
 * implantaran varios constructores: Un constructor por defecto. Un constructor
 * con el nombre, edad y sexo, el resto por defecto. Un constructor con todos
 * los atributos como parámetro. Los métodos que se implementaran son:
 * calcularIMC(): calculara si la persona esta en su peso ideal (peso en
 * kg/(altura^2 en m)), si esta fórmula devuelve un valor menor que 20, la
 * función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos),
 * significa que esta por debajo de su peso ideal la función devuelve un 0 y si
 * devuelve un valor mayor que 25 significa que tiene sobrepeso, la función
 * devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
 * esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
 * comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si
 * no es correcto, sera H. No sera visible al exterior. toString(): devuelve
 * toda la información del objeto. generaDNI(): genera un número aleatorio de 8
 * cifras, genera a partir de este su número su letra correspondiente. Este
 * método sera invocado cuando se construya el objeto. Puedes dividir el método
 * para que te sea más fácil. No será visible al exterior. Métodos set de cada
 * parámetro, excepto de DNI. Ahora, crea una clase ejecutable que haga lo
 * siguiente:
 *
 * Pide por teclado el nombre, la edad, sexo, peso y altura. Crea 3 objetos de
 * la clase anterior, el primer objeto obtendrá las anteriores variables pedidas
 * por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y
 * la altura y el último por defecto, para este último utiliza los métodos set
 * para darle a los atributos un valor. Para cada objeto, deberá comprobar si
 * esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un
 * mensaje. Indicar para cada objeto si es mayor de edad. Por último, mostrar la
 * información de cada objeto. Puedes usar métodos en la clase ejecutable.
 *
 * @author Eduardo
 */

public class PersonaServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona altaPersona(){
        Persona persona1 = new Persona();
        System.out.println("Ingrese el nombre   : ");
        persona1.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad     : ");
        persona1.setEdad(leer.nextInt());
        System.out.println("Ingrese el D.N.I.   : ");
        persona1.setDni(leer.nextInt());
        System.out.println("Ingrese el sexo H/M : ");
        String sexo = leer.next();
        
        if (sexo != "H" && sexo != "M"){
            sexo = "H";
        } else {
        persona1.setSexo(sexo);
        }
        
        System.out.println("Ingrese el peso     : ");
        persona1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura   : ");
        persona1.setAltura(leer.nextDouble());
        return persona1;
    }
    
    public int calcularIMC(Persona persona1){
        double aux = persona1.getPeso()/pow(persona1.getAltura(),2);
        int imc;
        if (aux < 20){
            imc = -1;
        } else if (aux > 25){
            imc = 1;
        } else 
            imc = 0;
        return imc;
    }
    
    public boolean esMayorDeEdad(Persona persona1){
        if (persona1.getEdad() >= 21){
            return true;
        } else {
            return false;
        }
    }
}
