
package poocoleccionej06.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import poocoleccionej06.entidades.Producto;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas. Estas las
 * realizaremos en el servicio. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su
 * precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto
 * y de valor el precio. Realizar un menú para lograr todas las acciones
 * previamente mencionadas.
 *
 * @author Eduardo
 */
 
public class ProductoServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Producto producto = new Producto();
    
    public Producto altaProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = leer.next();
        System.out.print("Ingrese el  precio del producto: ");
        Double precioProducto = leer.nextDouble();
        return new Producto(nombreProducto, precioProducto);
    }
    
    public void mostrarProductos(HashMap<String,Producto> mapaProductos) {
        for (Map.Entry<String, Producto> aux : mapaProductos.entrySet()) {
            String key = aux.getKey();
            Producto value = aux.getValue();
            System.out.println("Hash Key: " + key + " - " + value);
        }
        System.out.println("");
    }

    public boolean borraProducto(HashMap<String,Producto> mapaProductos) {
        boolean encontrado = false;
        System.out.print("Ingrese la clave del producto: ");
        String keyProducto = leer.next();
        if (mapaProductos.containsKey(keyProducto)){
            System.out.println("Se eliminó el producto: " + keyProducto);
            mapaProductos.remove(keyProducto);
            encontrado= true;
        } else {    
            System.out.println("No se encontró el producto: " + keyProducto);
        }    
        return encontrado;
    }

    public boolean modificaProducto(HashMap<String,Producto> mapaProductos) {
        boolean encontrado = false;
        System.out.print("Ingrese la clave del producto: ");
        String keyProducto = leer.next();
        if (mapaProductos.containsKey(keyProducto)){
            mapaProductos.remove(keyProducto);
            mapaProductos.put(String.valueOf(keyProducto), altaProducto());
            System.out.println("Se modificó el producto: " + keyProducto);
            encontrado= true;
        } else {    
            System.out.println("No se encontró el producto: " + keyProducto);
        }    
        return encontrado;
    }
}
