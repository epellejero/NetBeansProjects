
package pooejex01.servicios;

import java.util.Scanner;
import pooejex01.entidades.Cuenta;

/**Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y 
 * cantidad (puede tener decimales). El titular será obligatorio y la cantidad 
 * es opcional. Crea dos constructores que cumpla lo anterior.
 * Crea sus métodos get, set y toString.
 * Tendrá dos métodos especiales: 
 * ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la 
 * cantidad introducida es negativa, no se hará nada.
 * retirar(double cantidad): se retira una cantidad a la cuenta, si restando la 
 * cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa
 * a ser 0.
 * 
 * @author Eduardo
 */

public class CuentaServicio {
    Scanner leer = new Scanner(System.in);
    
    public Cuenta altaCuenta(){
        // instanciar un objeto del tipo Cuenta 
        Cuenta cta1 = new Cuenta();
        
        // lleno atributos 
        System.out.print("Ingrese el nombre del titular de la cuenta : ");
        cta1.setTitular(leer.nextLine());
        System.out.print("Ingrese la cantidad : ");
        cta1.setCantidad(leer.nextDouble());
        return cta1;
    }
    
    public void ingresar(Cuenta cta1){
        System.out.print("Ingrese una cantidad a ingresar : ");
        double ingreso = leer.nextDouble();
        if (ingreso <= 0){
            ingreso = 0;
        }
        ingreso = cta1.getCantidad()+ingreso;
        cta1.setCantidad(ingreso);
    }
    
    public void retirar(Cuenta cta1){
        System.out.print("Ingrese una cantidad a retirar : ");
        double retiro = leer.nextDouble();
        if (retiro >= cta1.getCantidad()){
            retiro=0;
        } else {
            retiro = cta1.getCantidad()-retiro;
        }
        cta1.setCantidad(retiro);
    }
}
