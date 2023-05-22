
package pooej06.entidades;

import java.util.Scanner;


public class Cafetera {
    
    Scanner leer = new Scanner(System.in);
    
    private int capacidadMax = 2000;
    private int capacidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMax, int capacidadActual) {
        this.capacidadMax = capacidadMax;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    public void llenarCafetera (){
        setCapacidadActual(2000);
    }
    
    public void servirTaza() {
        int taza;
        int capacidad = getCapacidadActual();
        System.out.println("Capacidad actual : " + capacidad);
        System.out.println("Ingrese tamaño de la taza : ");
        taza = leer.nextInt();
        if (capacidad == 0){
            System.out.println("Cafetera vacia - llenar cafetera");
        } else if (taza > capacidad){
            System.out.println("No alanza ");
            System.out.println("Se llenó la taza con lo que queda " + capacidad);
            setCapacidadActual(0);
        }else {
            setCapacidadActual(capacidad - taza);
            System.out.println("Capacidad actual : " + getCapacidadActual());
        }
    }
    
    public void vaciarCafetera() {
        setCapacidadActual(0);
    }
    
    public void agregarCafe() {
        int taza;
        int capacidad = getCapacidadActual();
        System.out.println("Capacidad actual : " + capacidad);
        System.out.println("Agregar cafe : ");
        taza = leer.nextInt();
        if (capacidad+taza > 2000){
            System.out.println("Demaciado cafe ");
        }else {
            setCapacidadActual(capacidad + taza);
            System.out.println("Capacidad Actual : " + getCapacidadActual());
        }
        
    }
}
