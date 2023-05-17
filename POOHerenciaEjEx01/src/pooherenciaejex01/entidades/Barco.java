package pooherenciaejex01.entidades;

import java.util.Scanner;

/**
 * Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
 * fabricación. 
 * 
 * Un alquiler se calcula multiplicando el número de días de ocupación
 * (calculado con la fecha de alquiler y devolución), por un valor módulo de
 * cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
 * En los barcos de tipo especial el módulo de cada barco se calcula sacando el
 * módulo normal y sumándole el atributo particular de cada barco. En los
 * veleros se suma el número de mástiles, en los barcos a motor se le suma la
 * potencia en CV y en los yates se suma la potencia en CV y el número de
 * camarotes. Utilizando la herencia de forma apropiada, deberemos programar en
 * Java, las clases y los métodos necesarios que permitan al usuario elegir el
 * barco que quiera alquilar y mostrarle el precio final de su alquiler.
 *
 * @author Eduardo
 */
public class Barco {
    Scanner leer = new Scanner(System.in);
    protected String matricula;
    protected double eslora;
    protected int fabricacion;

    public Barco() {
    }

    public Barco(String matricula, double eslora, int fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", fabricacion=" + fabricacion + '}';
    }
    
    public Barco crearBarco(){
        matricula="";
        eslora=0;
        fabricacion=0;
        Barco barco; 
        System.out.print("Ingrese la matrícula del barco ........: ");
        matricula = leer.next();
        System.out.print("Ingrese los metros de eslora...........: ");
        eslora = leer.nextDouble();
        System.out.print("Ingrese el año de fabricación..........: ");
        fabricacion = leer.nextInt();
        return barco = new Barco(matricula, eslora, fabricacion);
    }
    
}
