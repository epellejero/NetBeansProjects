package pooherenciaej02.entidades;

/** 
 * Se debe crear también una subclase llamada Televisor con los siguientes 
 * atributos:
 * resolución (en pulgadas) y sintonizador TDT (booleano), además de los
 * atributos heredados. 
 * Los constructores que se implementarán serán: 
 * • Un constructor vacío. 
 * • Un constructor con la resolución, sintonizador TDT y el resto de los 
 * atributos heredados. Recuerda que debes llamar al constructor de la clase 
 * padre. 
 * Los métodos que se implementara serán: 
 * • Método get y set de los atributos resolución y sintonizador TDT. 
 * • Método crearTelevisor(): este método llama a crearElectrodomestico() de la 
 * clase padre, lo utilizamos para llenar los atributos heredados del padre y 
 * después llenamos los atributos del televisor. 
 * • Método precioFinal(): este método será heredado y se le sumará la siguiente
 * funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se 
 * incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, 
 * aumentará $500. 
 * Recuerda que las condiciones que hemos visto en la clase Electrodomestico 
 * también deben afectar al precio.
 * Finalmente, en el main debemos realizar lo siguiente: 
 * Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios 
 * para mostrar el precio final de los dos electrodomésticos.
 *
 * @author Eduardo
 */
public class Televisor extends Electrodomesticos{
   
    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
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

    
    
    @Override
    public String toString() {
        return super.toString() + "Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
    

    
    
}
