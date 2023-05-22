
package pooextraej03.entidades;

import java.util.Scanner;

/**
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores
 * de una ecuación de 2o grado. Tendremos los 3 coeficientes como atributos,
 * llamémosles a, b y c. Hay que insertar estos 3 valores para construir el
 * objeto a través de un método constructor. Luego, las operaciones que se
 * podrán realizar son las siguientes: 
 *  Método getDiscriminante(): devuelve el valor del discriminante (double). 
 *   El discriminante tiene la siguiente formula: (b^2)-4*a*c 
 *  Método tieneRaices(): devuelve un booleano indicando si tiene dos 
 *   soluciones, para que esto ocurra, el discriminante debe ser mayor o igual 
 *   que 0. 
 *  Método tieneRaiz(): devuelve un booleano indicando si tiene una única 
 *   solución, para que esto ocurra, el discriminante debe ser igual que 0.  
 *  Método obtenerRaices(): llama a tieneRaíces() y si devolvió true, imprime 
 *   las 2 posibles soluciones. 
 *  Método obtenerRaiz(): llama a tieneRaiz() y si devolvió true imprime una 
 *   única raíz.  Es en el caso en que se tenga una única solución posible. 
 *  Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y 
 *   mostrará por pantalla las posibles soluciones que tiene nuestra ecuación 
 *   con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan 
 *   nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
 * Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el 
 * signo delante de -b
 */
public class Raices {
    Scanner leer = new Scanner(System.in);
    private double coeficienteA,coeficienteB,coeficienteC;

    public Raices(double coeficienteA, double coeficienteB, double coeficienteC) {
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    }
    public Raices() {
    }

    public double getCoeficienteA() {
        return coeficienteA;
    }
    public void setCoeficienteA(double coeficienteA) {
        this.coeficienteA = coeficienteA;
    }
    public double getCoeficienteB() {
        return coeficienteB;
    }
    public void setCoeficienteB(double coeficienteB) {
        this.coeficienteB = coeficienteB;
    }
    public double getCoeficienteC() {
        return coeficienteC;
    }
    public void setCoeficienteC(double coeficienteC) {
        this.coeficienteC = coeficienteC;
    }

    public double discriminante(double a,double b,double c) {
        return (Math.pow(b,2))-(4*a*c);
    }
    
    public boolean tieneRaiz(){
        return (discriminante(getCoeficienteA(),getCoeficienteB(),getCoeficienteC()) == 0);
    }
    
    public boolean tieneRaices(){
        return (discriminante(getCoeficienteA(),getCoeficienteB(),getCoeficienteC()) > 0);
    }
    
    public void obtenerRaices(){
        if (tieneRaices()){
            System.out.println("Tiene dos raices ");
            System.out.println("Resultado 1 : " + calcular(getCoeficienteA(),getCoeficienteB(),getCoeficienteC()));
            System.out.println("Resultado 2 : " + (calcular(getCoeficienteA(),getCoeficienteB(),getCoeficienteC()) * -1));
        }
    }
    
    public void obtenerRaiz(){
        if (tieneRaiz()){
            System.out.println("Tiene una unica raiz ");
            System.out.println("Resultado: " + calcular(getCoeficienteA(),getCoeficienteB(),getCoeficienteC()));
        }
    }
    
    public double calcular(double a,double b,double c){   
        return (b*-1) + (Math.sqrt(discriminante(a, b, c)))/(2*a);
    }
    
}
