
package pooextraej02.entidades;

import java.util.Scanner;

/**
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos
 * números y los ingresa en los atributos del objeto. Después, a través de otro
 * método calcular y devolver la distancia que existe entre los dos puntos que
 * existen en la clase Puntos. Para conocer como calcular la distancia entre dos
 * puntos consulte el siguiente link:
 * http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 *
 * @author Eduardo
 */
public class Puntos {
    Scanner leer = new Scanner(System.in);
    private int x1,x2,y1,y2;

    public Puntos() {
    }
    public Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }
    public void setX1(int x1) {
        this.x1 = x1;
    }
    public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public int getY1() {
        return y1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
    public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        System.out.println("Ingrese la coordenada X del punto 1 : ");
        setX1(leer.nextInt());
        System.out.println("Ingrese la coordenada Y del punto 1 : ");
        setY1(leer.nextInt());
        System.out.println("Ingrese la coordenada X del punto 2 : ");
        setX2(leer.nextInt());
        System.out.println("Ingrese la coordenada Y del punto 2 : ");
        setY2(leer.nextInt());
    }
    
    public void calcularDistancia(){
        double resultado;
        resultado = Math.sqrt(Math.pow((getX2()-getX1()),2) + Math.pow((getY2()-getY1()),2));
        System.out.println("Resultado : " + resultado);
    }
    
}
