package poocoleccionej06x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

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
public class POOColeccionEj06x {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;
        boolean continuar;
        // ProductoServicios productoServicios = new ProductoServicios();
        Map<String, Double> mapaProductos = new HashMap<>();
        List<Entry<String, Double>> lista;
        mapaProductos.put("Harina", 5.00);
        mapaProductos.put("Yerba", 4.00);
        mapaProductos.put("Arroz", 3.40);
        mapaProductos.put("Leche", 7.90);
        mapaProductos.put("Fideos", 5.00);
        mapaProductos.put("Sal", 1.00);
        mapaProductos.put("Aceite", 10.00);

        do {
            System.out.println("- - - - Productos - - - - ");
            System.out.println(" 1 - Alta de productos ");
            System.out.println(" 2 - Listar productos ");
            System.out.println(" 3 - Ordena por precio ");
            System.out.println(" 4 - Ordena por producto ");
            System.out.println(" 5 - Borrar un producto");
            System.out.println(" 6 - Modifica un producto");
            System.out.println(" 7 - Salir ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:     // Alta  de productos
                    continuar = true;
                    while (continuar) {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombreProducto = leer.next();
                        System.out.print("Ingrese el  precio del producto: ");
                        Double precioProducto = leer.nextDouble();
                        mapaProductos.put(nombreProducto, precioProducto);
                        System.out.print("Desea agregar otro producto? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                case 2:     // listar  los productos
                    for (Map.Entry<String, Double> aux : mapaProductos.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();
                        System.out.println("   " + key + " $ " + value);
                    }
                    System.out.println("");
                    break;
                case 3:     // ordena por precio
                    lista = new ArrayList<>(mapaProductos.entrySet());
                    lista.sort(Entry.comparingByValue());
                    for (Entry<String, Double> aux : lista) {
                        System.out.println("   " + aux.getKey() + " $ " + aux.getValue());
                    }
                    break;
                case 4:     // ordena por producto
                    lista = new ArrayList<>(mapaProductos.entrySet());
                    lista.sort(Entry.comparingByKey());
                    for (Entry<String, Double> aux : lista) {
                            
                        System.out.println("   " + aux.getKey() + " $ " + aux.getValue());
                    }
                    break;
                case 5:     // borrar productos
                    continuar = true;
                    while (continuar) {
                        System.out.print("Ingrese la clave del producto: ");
                        String keyProducto = leer.next();
                        if (mapaProductos.containsKey(keyProducto)) {
                            mapaProductos.remove(keyProducto);
                            System.out.println("Se eliminó el producto: " + keyProducto);
                        } else {
                            System.out.println("No se encontró el producto: " + keyProducto);
                        }
                        System.out.print("Desea borrar otro producto? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                case 6:     // modificar productos
                    continuar = true;
                    while (continuar) {
                        System.out.print("Ingrese la clave del producto: ");
                        String keyProducto = leer.next();
                        if (mapaProductos.containsKey(keyProducto)) {
                            System.out.print("Ingrese el nuevo preciodel producto: ");
                            Double precio = leer.nextDouble();
                            mapaProductos.put(keyProducto, precio);
                            System.out.println("Se modificó el producto: " + keyProducto);
                        } else {
                            System.out.println("No se encontró el producto: " + keyProducto);
                        }
                        System.out.print("Desea modificar otro producto? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                default:
                    break;
            }
        } while (opcion != 7);

        System.out.println("* * * * * * * * Fin de proceso * * * * * * * ");
    }

}
