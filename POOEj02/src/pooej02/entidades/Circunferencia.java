
package pooej02.entidades;

import java.util.Scanner;

public class Circunferencia {
    
    Scanner leer = new Scanner(System.in);
    public double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Circunferencia circulo = new Circunferencia();
        System.out.print("Ingrese radio : ");
        setRadio(leer.nextDouble());
        //return (circulo.radio);
    }
    
    public void area() {
        //Circunferencia circulo = new Circunferencia();
        //double area = (Math.PI * (circulo.getRadio()*circulo.getRadio()));
        double area = (Math.PI * Math.pow(getRadio(),2));
        System.out.println("Area : "+ area);
    }
    
    public void perimetro(){
        //Circunferencia circulo = new Circunferencia();
        double perimetro = (2 * Math.PI * getRadio());
        System.out.println("Perimetro : "+ perimetro);
    }
}
