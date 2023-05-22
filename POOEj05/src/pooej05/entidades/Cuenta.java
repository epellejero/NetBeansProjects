
package pooej05.entidades;

import java.util.Scanner;

public class Cuenta {
    
    Scanner leer = new Scanner(System.in);
    
    private int cuenta;
    private int dni;
    private double saldo;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(int cuenta, int dni, double saldo, double interes) {
        this.cuenta = cuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public void crearCuenta(){
        System.out.println("Ingrese el número de cuenta : ");
        setCuenta(leer.nextInt());
        System.out.println("Ingrese el número de DNI    : ");
        setDni(leer.nextInt());
        System.out.println("Ingrese el monto del saldo  : ");
        setSaldo(leer.nextDouble());
        System.out.println("Ingrese el monto de interés : ");
        setInteres(leer.nextDouble());
    }
            
    public void ingresar(){
        System.out.println("Ingrese el monto a depositar : ");
        double deposito = leer.nextDouble();
        double saldoCta = getSaldo();
        setSaldo(saldoCta =+ deposito);
    }
    
    public void retirar(){
        double extraccion;
        double saldoCta = getSaldo();
        System.out.println("Saldo cuenta : " + saldoCta);
        System.out.println("Ingrese el monto a extraer : ");
        extraccion = leer.nextDouble();
        if (extraccion > saldoCta){
            System.out.println("Monto superior al saldo " + saldoCta);
        }else {
            //saldoCta = saldoCta - extraccion;
            setSaldo(saldoCta - extraccion);
            System.out.println("Saldo cuenta : " + getSaldo());
        }
    }
    
    public void extraccionRapida(){
        double extraccion;
        double saldoCta = getSaldo();
        System.out.println("Ingrese el monto a extraer : ");
        extraccion = leer.nextDouble();
        if (extraccion > (saldoCta * 0.20)){
            System.out.println("Monto superior al 20% del saldo " + saldoCta);
        }else {
            setSaldo(saldoCta - extraccion);
        }
    }
    
    public void consultaSaldo(){
        System.out.println("El saldo disponible es : " + getSaldo());
    }
    
    public void consultaDatos(){
        System.out.println("Cuenta número " + getCuenta() + " DNI " + getDni());
        System.out.print("Saldo disponible : " + getSaldo());
        System.out.println(" Interes : " + getInteres());
    }
}
