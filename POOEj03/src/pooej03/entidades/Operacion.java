package pooej03.entidades;

import java.util.Scanner;

public class Operacion {
    
    Scanner leer = new Scanner(System.in);
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        System.out.println("Ingrese el valor del primer número : ");
        setNumero1 (leer.nextInt());
        System.out.println("Ingrese el valor del segundo número: ");
        setNumero2(leer.nextInt());
    }
    
    public double sumar(){
        double suma = numero1 + numero2;
        //System.out.println("Suma   : " + suma);
        return suma;
    } 
    
    public double restar(){
        double resta = numero1 - numero2;
        //System.out.println("Resta   : " + resta);  
        return resta;
    } 
    
    public double multiplicar(){
        double multiplica = 0 ;
        if (numero1 == 0 || numero2 == 0){
            System.out.println("Error - Multipicación * 0 ");
        } else {
            multiplica = numero1 * numero2;
            //System.out.println("Multiplicación : " + multiplica);
        }
        return multiplica;
    } 
    
    public double dividir(){
        double divide = 0;
        if (numero1 == 0 || numero2 == 0){
            System.out.println("Error - División x 0 ");
        } else {
            divide = numero1 / numero2;
            //System.out.println("División : " + divide);
        }
        return divide;
    }
    
}
