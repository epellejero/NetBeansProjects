package pooherenciaej04.entidades;

import java.util.Scanner;
import pooherenciaej04.interfaces.CalculosFormas;

/**
 * Se plantea desarrollar un programa que nos permita calcular el área y el
 * perímetro de formas geométricas, en este caso un círculo y un rectángulo. Ya
 * que este cálculo se va a repetir en las dos formas geométricas, vamos a crear
 * una Interfaz, llamada calculosFormas que tendrá, los dos métodos para
 * calcular el área, el perímetro y el valor de PI como constante. Desarrollar
 * el ejercicio para que las formas implementen los métodos de la interfaz y se
 * calcule el área y el perímetro de los dos. En el main se crearán las formas y
 * se mostrará el resultado final. 
 * Área circulo: PI * radio ^ 2 
 * Perímetro circulo: PI * diámetro  
 * Área rectángulo: base * altura 
 * Perímetro rectángulo: (base + altura) * 2
 *
 * @author Eduardo
 */
public class Rectangulo implements CalculosFormas{
    Scanner leer = new Scanner(System.in);
    public double base;
    public double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void area() {
        System.out.println(" - - - - Rectángulo - - - - - - ");
        System.out.print("Ingrese base   = ");
        double base = leer.nextDouble();
        System.out.print("Ingrese altura = ");
        double altura = leer.nextDouble();
        double areaRectangulo = base * altura;
        System.out.println("Area del Rectágulo    = " + areaRectangulo);
        
    }

    @Override
    public void perimetro() {
        System.out.println(" - - - - Rectángulo - - - - - - ");
        System.out.print("Ingrese base   = ");
        double base = leer.nextDouble();
        System.out.print("Ingrese altura = ");
        double altura = leer.nextDouble();
        double perimetroRectangulo = (base + altura) * 2;
        System.out.println("Area del Rectángulo    = " + perimetroRectangulo);
    }
   
}
