package poorelacionesejex02.entidades;

import java.util.ArrayList;

/**
 * Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto
 * de asientos (8 filas por 6 columnas). De Cine nos interesa conocer la
 * película que se está reproduciendo, la sala con los espectadores y el precio
 * de la entrada. 
 */
public class Cine {

    private Pelicula pelicula;
    private ArrayList<Espectador> espectador;
    private double precioEntrada;

    public Cine() {
    }

    public Cine(Pelicula pelicula, ArrayList<Espectador> espectador, double precioEntrada) {
        this.pelicula = pelicula;
        this.espectador = espectador;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Espectador> getEspectador() {
        return espectador;
    }

    public void setEspectador(ArrayList<Espectador> espectador) {
        this.espectador = espectador;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", espectador=" + espectador + ", precioEntrada=" + precioEntrada + '}';
    }
    
}
