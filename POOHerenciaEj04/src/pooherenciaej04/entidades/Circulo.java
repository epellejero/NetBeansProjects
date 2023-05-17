/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class Circulo implements CalculosFormas{

    Scanner leer = new Scanner(System.in);
    
    public double PI = 3.1416;
    public double radio;
    
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void area() {
        System.out.println(" - - - - Circulo - - - - - - ");
        System.out.print("Ingrese radio    = ");
        double radio = leer.nextDouble();
        double areaCriculo = PI * (radio*radio);
        System.out.println("Area del Circulo      = " + areaCriculo);
    }

    @Override
    public void perimetro() {
        System.out.println(" - - - - Circulo - - - - - - ");
        System.out.print("Ingrese radio    = ");
        double radio = leer.nextDouble();
        double perimetroCriculo = PI * (radio + radio);
        System.out.println("Perimetro del Circulo = " + perimetroCriculo);
    }
    
}
