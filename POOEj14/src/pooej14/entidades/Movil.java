
package pooej14.entidades;

import java.util.Scanner;

/**
 * Una tienda que vende teléfonos móviles quiere tener registro de cada producto
 * que posee en un sistema computacional. Para ello, crearemos un programa donde
 * se pueda almacenar cada producto con su información. Crear una entidad Movil
 * con los atributos marca, precio, modelo, memoriaRam, almacenamiento y codigo.
 * El atributo código será un arreglo numérico de dimensión 7 (siete) donde cada
 * subíndice alojará un número correspondiente al código. A continuación, se
 * implementarán los siguientes métodos: 
 *  Un constructor por defecto. 
 *  Un constructor con todos los atributos como parámetro. 
 *  Métodos getters y setters de cada atributo. 
 *  Método cargarCelular(): se solicita al usuario que ingrese los datos 
 *   necesarios para instanciar un objeto Celular y poder cargarlo en nuestro 
 *   programa. 
 *  Método ingresarCodigo(): este método permitirá ingresar el código completo 
 *   de siete números de un celular. Para ello, puede utilizarse un bucle 
 *   repetitivo
 */
public class Movil {
    
    private String marca;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private double precio;
    private int[] codigo;

    public Movil() {
    }
    public Movil(String marca, String modelo, int memoriaRam, int almacenamiento, double precio, int[] codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
        this.codigo = codigo;
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
    public int getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public int getAlmacenamiento() {
        return almacenamiento;
    }
    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int[] getCodigo() {
        return codigo;
    }
    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    
    public void cargarCelular(int longitud){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la marca del celular : ");
        setMarca(leer.next());
        System.out.println("Ingrese el modelo del celular: ");
        setModelo(leer.next());
        System.out.println("Ingrese la cantidad de memoria : ");
        setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese la cantidad de almacenamiento : ");
        setAlmacenamiento(leer.nextInt());
        System.out.println("Ingrese el precio : ");
        setPrecio(leer.nextDouble());
        cargarCodigo(longitud);
    }
    
    public void cargarCodigo(int longitud){
        Scanner leer = new Scanner(System.in);
        int vectorCodigo[] = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese digito N°" + (i+1) + " del código : ");
            vectorCodigo[i] = leer.nextInt();
        }
        setCodigo(vectorCodigo);        
    }
    
    
}
