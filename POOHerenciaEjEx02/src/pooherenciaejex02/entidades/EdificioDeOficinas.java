package pooherenciaejex02.entidades;

/**
 * • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
 * personas por oficina y número de pisos. Esta clase implementará los dos
 * métodos abstractos y los atributos del padre. De esta clase nos interesa
 * saber cuántas personas pueden trabajar en todo el edificio, el usuario dirá
 * cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
 * (suponiendo que en cada piso hay una oficina). Crear el método
 * cantPersonas(), que muestre cuantas personas entrarían en un piso y cuantas
 * en todo el edificio.
 * 
 * @author epellejero
 */
public class EdificioDeOficinas extends Edificio{

    private int numOficinas;
    private int numPersonas;
    private int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int numPersonas, int numPisos) {
        this.numOficinas = numOficinas;
        this.numPersonas = numPersonas;
        this.numPisos = numPisos;
    }

    public EdificioDeOficinas(int numOficinas, int numPersonas, int numPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.numPersonas = numPersonas;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numOficinas=" + numOficinas + ", numPersonas=" + numPersonas + ", numPisos=" + numPisos + '}';
    }

    @Override
    public void calcularSuperficie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void calcularVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
