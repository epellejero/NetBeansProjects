package pooejex01;

import pooejex01.entidades.Cuenta;
import pooejex01.servicios.CuentaServicio;

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
public class POOEjEx01 {

    public static void main(String[] args) {
        
        CuentaServicio cta_serv = new CuentaServicio();
        Cuenta cta = cta_serv.altaCuenta();
        
        cta_serv.ingresar(cta);
        cta_serv.retirar(cta);
        
        System.out.println("Titular Cuenta 1 : " + cta.getTitular());
        System.out.println("Saldo   Cuenta 1 : " + cta.getCantidad());
        
    }
    
}
