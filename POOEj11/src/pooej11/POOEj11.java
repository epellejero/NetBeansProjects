package pooej11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo
 * con la clase Date. En este ejercicio deberemos instanciar en el main, una
 * fecha usando la clase Date, para esto vamos a tener que crear 3 variables,
 * dia, mes y anio que se le pedirán al usuario para poner el constructor del
 * objeto Date. Una vez creada la fecha de tipo Date, deberemos mostrarla y
 * mostrar cuantos años hay entre esa fecha y la fecha actual, que se puede
 * conseguir instanciando un objeto Date con constructor vacío. Ejemplo fecha:
 * Date fecha = new Date(anio, mes, dia); Ejemplo fecha actual: Date fechaActual
 * = new Date();
 */
public class POOEj11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dia, mes, anio;
        
        Calendar c = new GregorianCalendar();
        dia = c.get(Calendar.DATE);
        mes = c.get(Calendar.MONTH)+1;
        anio = c.get(Calendar.YEAR);
        System.out.println("Fecha actual : " + dia + "/" + mes + "/" + anio);
                
        System.out.print("Ingrese el día   [DD]: ");
        dia = leer.nextInt();
        System.out.print("Ingrese el mes   [MM]: ");
        mes = (leer.nextInt()-1);
        System.out.print("Ingrese el año [AAAA]: ");
        anio = (leer.nextInt()-1900);

        Date fechaNacimiento = new Date(anio, mes, dia);
        Date fechaActual = new Date();
                
        System.out.println("Fecha actual    : " + fechaActual);
        System.out.println("Fecha ingresada : " + fechaNacimiento);
        
    }

}
