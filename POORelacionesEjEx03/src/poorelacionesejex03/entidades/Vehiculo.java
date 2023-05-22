package poorelacionesejex03.entidades;

/**
 *   Gestión de vehículos. Se registra la información de cada vehículo 
 *   asegurado. Marca, modelo, año, número de motor, chasis, color, tipo 
 *   (camioneta, sedán, etc.). 
 * @author Eduardo
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private String anio;
    private String numMotor;
    private String numChasis;
    private String color;
    private String tipo;

    public Vehiculo() {
    }
    public Vehiculo(String marca, String modelo, String anio, String numMotor, String numChasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numMotor = numMotor;
        this.numChasis = numChasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    public String getNumMotor() {
        return numMotor;
    }
    public void setNumMotor(String numMotor) {
        this.numMotor = numMotor;
    }
    public String getNumChasis() {
        return numChasis;
    }
    public void setNumChasis(String numChasis) {
        this.numChasis = numChasis;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numMotor=" + numMotor + ", numChasis=" + numChasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    
    
}
