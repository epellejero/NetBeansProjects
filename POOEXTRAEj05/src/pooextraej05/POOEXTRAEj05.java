package pooextraej05;

import java.util.Scanner;
import pooextraej05.entidades.Meses;
import pooextraej05.servicios.MesesServicios;

/**
 * Crea una clase en Java donde declares una variable de tipo array de Strings
 * que contenga los doce meses del año, en minúsculas. A continuación, declara
 * una variable mesSecreto de tipo String, y hazla igual a un elemento del array
 * (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que
 * adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo
 * hace, pedir que vuelva a intentar adivinar el mes secreto. Un ejemplo de
 * ejecución del programa podría ser este: Adivine el mes secreto. Introduzca el
 * nombre del mes en minúsculas: febrero No ha acertado. Intente adivinarlo
 * introduciendo otro mes: agosto ¡Ha acertado!
 */
public class POOEXTRAEj05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String mes;
        Meses m1 = new Meses();
        MesesServicios ms = new MesesServicios();
        
        ms.cargar();

        System.out.println("Adivine el mes secreto ");
        do {
            System.out.print("Introduzca el nombre del mes en minúsculas: ");
            mes = leer.nextLine();
        } while (ms.buscarMes(mes) != true);
    }

}
