package poocoleccionej03;

import java.util.ArrayList;
import java.util.Scanner;
import poocoleccionej03.entidades.Alumno;
import poocoleccionej03.servicios.AlumnoServicios;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas. En el servicio de Alumno deberemos
 * tener un bucle que crea un objeto Alumno. Se pide toda la información al
 * usuario y ese Alumno se guarda en una lista de tipo Alumno y se le pregunta
 * al usuario si quiere crear otro Alumno o no. Después de ese bucle tendremos
 * el siguiente método en el servicio de Alumno: Método notaFinal(): El usuario
 * ingresa el nombre del alumno que quiere calcular su nota final y se lo busca
 * en la lista de Alumnos. Si está en la lista, se llama al método. Dentro del
 * método se usará la lista notas para calcular el promedio final de alumno.
 * Siendo este promedio final, devuelto por el método y mostrado en el main.
 *
 * @author Eduardo
 */
public class POOColeccionEj03 {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int op;
        boolean continuar;

        Alumno alumno = new Alumno();
        AlumnoServicios alumnoServicios = new AlumnoServicios();
        ArrayList<Alumno> listaAlumnos = new ArrayList();

        do {
            System.out.println("- - - - Alumnos - - - - ");
            System.out.println(" 1 - Alta de alumnos ");
            System.out.println(" 2 - Baja de alumnos ");
            System.out.println(" 3 - Listar  alumnos ");
            System.out.println(" 4 - Nota final por alumno");
            System.out.println(" 5 - Salir ");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    continuar = true;
                    while (continuar){
                        listaAlumnos.add(alumnoServicios.altaAlumno());
                        System.out.print("Desea agregar otro alumno? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                case 2:
                    continuar = true;
                    while (continuar){
                        alumnoServicios.bajaAlumno(listaAlumnos);
                        System.out.print("Desea eliminar a otro alumno? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                case 3:
                    alumnoServicios.mostrarAlumnos(listaAlumnos);
                    break;
                case 4:
                    alumnoServicios.notaFinal(listaAlumnos);
                    break;
                case 5:
                    break;
                default:
                    break;
                            
            }
        } while (op != 5);
        
        System.out.println("* * * * * * * * Fin de proceso * * * * * * * ");
    }
    
}

