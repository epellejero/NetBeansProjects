
package pooej04.entidades;

import java.util.Scanner;

public class Rectangulo {
    
    private double base;
    private double altura;

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
    
    public void crearRectangulo(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectángulo : ");
        setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectángulo : ");
        setAltura(leer.nextInt());
    }
    
    public double calcularSuperficie(){
        double superficie;
        superficie = getBase() * getAltura();
        return superficie;
    }
    
    public double calcularPerimetro(){
        double perimetro;
        perimetro = (getBase() + getAltura()) * 2;
        return perimetro;
    }
 
    public void dibujarRectangulo(){
        for (int i=0; i<getAltura(); i++){
        for (int j=0; j<getBase();j++){
            if (i==0 || i==getAltura()-1 || j==0 || j==getBase()-1){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
        }
        
    }
}
