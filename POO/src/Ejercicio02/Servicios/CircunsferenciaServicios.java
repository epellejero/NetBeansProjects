
package Ejercicio02.Servicios;

import Ejercicio02.Entidades.Circunsferencia;
import java.util.Scanner;

public class CircunsferenciaServicios {
    
    Scanner leer = new Scanner(System.in);
        
    public Circunsferencia crearCircunsferencia() {
        Circunsferencia circulo = new Circunsferencia();
        System.out.println("Ingrese radio : ");
        circulo.setRadio(leer.nextInt());
        return (circulo);
    }
    
     public void crearArea(Circunsferencia cs) {
        //double area = (Math.PI * (circulo.getRadio()*circulo.getRadio()));
        double area = (Math.PI * Math.pow(cs.getRadio(),2));
        System.out.println("Area : "+ area);
    }
     
     public void crearPerimetro(Circunsferencia cs) {
        double perimetro = (2 * Math.PI * cs.getRadio());
        System.out.println("Perimetro : "+ perimetro);
    } 
    
}
