package pooej06;

import java.util.Scanner;
import pooej06.entidades.Cafetera;

public class POOEj06 {
//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
//cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
//métodos:
// Constructor predeterminado o vacío
// Constructor con la capacidad máxima y la cantidad actual Métodos getters y setters.
// Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//máxima.
// Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
// Método vaciarCafetera(): pone la cantidad de café actual en cero.
// Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.

    public static void main(String[] args) {
        int op = 1;
        Scanner leer = new Scanner(System.in);
        Cafetera cafe = new Cafetera();
        while (op < 5){
        System.out.println(" - - Ingrese opcion  ");
        System.out.println(" 1 - Llenar cafetera ");
        System.out.println(" 2 - Servir taza     ");
        System.out.println(" 3 - Vaciar cafetera ");
        System.out.println(" 4 - Agregar cafe    ");
        System.out.println(" 5 - Salir           ");
        op = leer.nextInt();
        switch (op) {
            case 1:
                cafe.llenarCafetera();
                break;
            case 2:
                cafe.servirTaza();
                break;
            case 3:
                cafe.vaciarCafetera();
                break;
            case 4:
                cafe.agregarCafe();
                break;
            case 5:
                break;
            default:
                break;
        }}
    }
}
