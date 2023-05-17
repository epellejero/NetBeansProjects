package pooherenciaej02.entidades;

/**
 *
 * @author Eduardo
 */
public class Heladera extends Electrodomesticos{

    int capacidad;
    char freezer;

    public Heladera() {
    }

    public Heladera(int capacidad, char freezer) {
        this.capacidad = capacidad;
        this.freezer = freezer;
    }

    public Heladera(int capacidad, char freezer, double precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.capacidad = capacidad;
        this.freezer = freezer;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public char getFreezer() {
        return freezer;
    }

    public void setFreezer(char freezer) {
        this.freezer = freezer;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Heladera{");
//        sb.append("capacidad=").append(capacidad);
//        sb.append(", freezer=").append(freezer);
//        sb.append('}');
//        return sb.toString();
//    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Heladera{");
        sb.append("capacidad=").append(capacidad);
        sb.append(", freezer=").append(freezer);
        sb.append('}');
        return sb.toString();
    }   
}
