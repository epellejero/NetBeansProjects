package poocoleccionej03.servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import poocoleccionej03.entidades.Alumno;

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
public class AlumnoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alumno alumno = new Alumno();

    public Alumno altaAlumno() {
        ArrayList notas = new ArrayList();
        System.out.print("Ingrese el nombre del alumno: ");
        String nombreAlumno = leer.next();
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese la nota " + (i+1) + " : ");
                notas.add(leer.nextInt());
            }
        Alumno alumnoAlta = new Alumno(nombreAlumno, notas);    
        return alumnoAlta;
    }
    
    
    public boolean bajaAlumno(ArrayList<Alumno> listaAlumnos) {
        boolean encontrado = false;
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = leer.next();
        Iterator<Alumno> it = listaAlumnos.iterator();
        while (it.hasNext()) {
            Alumno aux = it.next();
            if (aux.getNombre().equals(nombre)){
                System.out.println("Se encontró al alumno " + nombre);
                it.remove();
                encontrado= true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró al alumno con nombre " + nombre);
        }
        return encontrado;
    }

    public void mostrarAlumnos(ArrayList<Alumno> listaAlumnos) {
        
    // recorrer ArrayList con FOR (por indice)
        //for (int i = 0; i < listaAlumnos.size(); i++) {
        //    System.out.println("Nombre: " + listaAlumnos.get(i).getNombre());
        //}
    // recorrer ArrayList con FOR EACH (por cada uno)
        //for (Alumno aux : listaAlumnos) {
        //    System.out.println("Nombre: " + aux.getNombre());
        //}
//    // recorre con Iterator y muestra con .totring(); 
//        Iterator<Alumno> iterador = listaAlumnos.iterator();
//        while (iterador.hasNext()) {
//            //System.out.println("Nombre: " + iterador);
//            System.out.println(iterador.toString());
//        }
        for (Alumno aux : listaAlumnos) {
            System.out.println(aux.toString());
        }
    }
    
    public void notaFinal(ArrayList<Alumno> listaAlumnos){
        ArrayList notas = new ArrayList();
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = leer.next();
        boolean encontrado = false;
        for (Alumno aux : listaAlumnos) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                double promedio = 0;
                notas = aux.getNotasAlumno();
                //for (int i = 0; i< notas.size(); i++){
                for (int nota : aux.getNotasAlumno()){
                    promedio = promedio + nota;
                }
                promedio /= notas.size();
                System.out.println("Nota final de " + nombre + " es " + promedio);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró al alumno " + nombre);
        }
        
        
        
    }

}
