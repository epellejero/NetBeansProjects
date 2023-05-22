package poorelacionesejex04.entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


/**
 * Desarrollar un simulador del sistema de votación de facilitadores en Egg El
 * sistema de votación de Egg tiene una clase llamada Alumno con los siguientes
 * atributos: nombre completo, DNI y cantidad de votos. Además, crearemos una
 * clase Simulador que va a tener los métodos para manejar los alumnos y sus
 * votaciones. Estos métodos serán llamados desde el main. 
 * 
 * • La clase Simulador debe tener un método que genere un listado de alumnos de 
 * manera aleatoria y lo retorne. Las combinaciones de nombre y apellido deben 
 * ser generadas de manera aleatoria. Nota: usar listas de tipo String para 
 * generar los nombres y los apellidos. 
 * 
 * • Ahora hacer un generador de combinaciones de DNI posibles, deben estar 
 * dentro de un rango real de números de documentos. Y agregar a los
 * alumnos su DNI. Este método debe retornar la lista de dnis. 
 * 
 * • Ahora tendremos un método que, usando las dos listas generadas, cree una 
 * cantidad de objetos Alumno, elegidos por el usuario, y le asigne los nombres 
 * y los dnis de las dos listas a cada objeto Alumno. No puede haber dos alumnos
 * con el mismo dni, pero si con el mismo nombre. 
 * 
 * • Se debe imprimir por pantalla el listado de alumnos. 
 * 
 * • Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como 
 * atributos, un objeto Alumno que será el alumno que vota y una lista de los 
 * alumnos a los que votó.
 * 
 * • Crearemos un método votación en la clase Simulador que, recibe el listado 
 * de alumnos y para cada alumno genera tres votos de manera aleatoria. En este 
 * método debemos guardar a el alumno que vota, a los alumnos a los que votó y 
 * sumarle uno a la cantidad de votos a cada alumno que reciba un voto, que es 
 * un atributo de la clase Alumno. Tener en cuenta que un alumno no puede 
 * votarse a sí mismo o votar más de una vez al mismo alumno. 
 * Utilizar un hashset para resolver esto. 
 * 
 * • Se debe crear un método que muestre a cada Alumno con su cantidad de votos 
 * y cuales fueron sus 3 votos.13
 * 
 * • Se debe crear un método que haga el recuento de votos, este recibe la lista
 * de Alumnos y comienza a hacer el recuento de votos. 
 * 
 * • Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se 
 * deben crear 5 facilitadores suplentes con los 5 segundos alumnos más votados.
 * A continuación, mostrar los 5 facilitadores y los 5 facilitadores suplentes.
 *
 * @author Eduardo
 */
public class Simulador {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alumno alumno;
    Voto voto;
    HashSet<Alumno> listaAlumnos = new HashSet<>();
    
    
    
    public void generaVotos(){
        int posicion1,posicion2,posicion3;
        Alumno voto1,voto2,voto3;
        for (Alumno iAlumno : listaAlumnos) {
            alumno = iAlumno;
            do{ 
                posicion1 = (int)((Math.random()*listaAlumnos.size()+1)-1);
                posicion2 = (int)((Math.random()*listaAlumnos.size()+1)-1);
                posicion3 = (int)((Math.random()*listaAlumnos.size()+1)-1);
                System.out.println("P1 "+posicion1+" P2 "+posicion2+" P3 "+posicion3);
            } while(posicion1!=posicion2 && posicion2!=posicion3 && posicion1!=posicion3);                
            
//            voto1 = listaAlumnos.get(posicion1);
//            voto2 = listaAlumnos.get(posicion2);
//            voto3 = listaAlumnos.get(posicion3);
//            voto = new Voto(alumno, voto1, voto2, voto3);
//            System.out.println(alumno);
//            System.out.println("1 voto: " + voto1);
//            System.out.println("2 voto: " + voto2);
//            System.out.println("3 voto: " + voto3);
        }        
    }
    
    public HashSet<Alumno> generaListadoAlumnos(){
        int cantidadAlumnos;
        String nombreCompleto;
        String documento;
        System.out.println("Ingrese la cantidad de alumnos: ");
        cantidadAlumnos = leer.nextInt();
        int cantidadVotos = 0;
        for(int i = 0; i < cantidadAlumnos; i++){
            nombreCompleto = generaNombre()+" "+generaApellido();
            documento = generaDocumento();
            System.out.println("(" + documento + ") - " + nombreCompleto);
            alumno = new Alumno(nombreCompleto,documento,cantidadVotos);
            listaAlumnos.add(alumno);
        }
        return listaAlumnos;
    }
    
    public String generaNombre(){
        String nombre;
        String[] nombres = new String[]{"David","Joe","Thomas","Oliver","Jake",
            "Noah","James","Jack","Connor","Liam","John","Harry","Robert",
            "Michael","Charlie","Kyle","William","Ethan","Richard","Charles",
            "Amelia","Margaret","Emma","Mary","Olivia","Samantha","Isla",
            "Bethany","Sophia","Jennifer","Emily","Elizabeth","Isabella",
            "Joanne","Ava","Linda","Megan","Sarah","Mia","Barbara"};
        int posicionN = (int)((Math.random()*nombres.length+1)-1);
        nombre = (nombres[posicionN]);
        return nombre;
    } 
    
    public String generaApellido(){
        String apellido;
        String[] apellidos = new String[]{"Smith","Jones","Taylor","Brown",
            "Williams","Wilson","Johnson","Davies","Robinson","Wright",
            "Thompson","Evans","Walker","White","Roberts","Green","Hall",
            "Thomas","Clark","Jackson"};
        int posicionA = (int)((Math.random()*apellidos.length+1)-1);
        apellido = (apellidos[posicionA]);
        return apellido;
    }
    
    public String generaDocumento(){
        String documento;
        String[] numDocumento = new String[]{"0","1","2","3","4","5","6","7","8","9"};
        int posicion = (int)(Math.random()*4+1);
        documento = numDocumento[posicion];
        for(int j = 0; j < 7; j++){
            documento = documento + numDocumento[(int)((Math.random()*10+1)-1)];
        }
        return documento;
    }
        
    
}
