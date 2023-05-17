package poocoleccionej06;

import java.util.HashMap;
import java.util.Scanner;
import poocoleccionej06.entidades.Producto;
import poocoleccionej06.servicios.ProductoServicios;

// Durante el mes de marzo, la UM organizó un evento a fin de presentar 
// los cuatro ejes más requeridos por los reclutadores a la hora de contratar 
// profesionales: Trayecto de comunicación efectiva; gestión de proyectos y 
// metodologías ágiles; liderazgo, inteligencia emocional, trabajo en equipo 
// y creatividad y tecnologías innovadoras, inteligencia artificial y ciencia de
// datos.

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
public class POOColeccionEj06 {

    public static void main(String[] args) {
        // 
        Scanner leer = new Scanner(System.in);
        int opcion, key;
        key = 10;
        boolean continuar;
        ProductoServicios productoServicios = new ProductoServicios();
        HashMap<String, Producto> mapaProductos = new HashMap<>();

        Producto p1 = new Producto("Azucar", 2.50);
        Producto p2 = new Producto("Harina", 5.00);
        Producto p3 = new Producto("Yerba", 4.00);
        Producto p4 = new Producto("Arroz", 3.40);
        Producto p5 = new Producto("Leche", 7.90);
        Producto p6 = new Producto("Fideos", 5.00);
        Producto p7 = new Producto("Sal", 1.00);

        mapaProductos.put("01", p1);
        mapaProductos.put("02", p2);
        mapaProductos.put("03", p3);
        mapaProductos.put("04", p4);
        mapaProductos.put("05", p5);
        mapaProductos.put("06", p6);
        mapaProductos.put("07", p7);

        do {
            System.out.println("- - - - Productos - - - - ");
            System.out.println(" 1 - Alta de productos ");
            System.out.println(" 2 - Listar productos ");
            System.out.println(" 3 - Ordena productos ");
            System.out.println(" 4 - Borrar un producto");
            System.out.println(" 5 - Modifica un producto");
            System.out.println(" 6 - Salir ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:     // Alta  de productos
                    continuar = true;
                    while (continuar) {
                        key = key++;
                        mapaProductos.put(String.valueOf(key), productoServicios.altaProducto());
                        System.out.print("Desea agregar otro producto? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                case 2:     // listar  los productos
                    productoServicios.mostrarProductos(mapaProductos);
                    break;
                case 3:     // ordena productos
                    // productosServicios.ordenaProductos(mapaProductos);
                    break;
                case 4:     // borrar productos
                    continuar = true;
                    while (continuar) {
                        productoServicios.borraProducto(mapaProductos);
                        System.out.print("Desea borrar otro producto? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                case 5:     // modificar productos
                    continuar = true;
                    while (continuar) {
                        productoServicios.modificaProducto(mapaProductos);
                        System.out.print("Desea modificar otro producto? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                default:
                    break;
            }
        } while (opcion != 6);

        System.out.println("* * * * * * * * Fin de proceso * * * * * * * ");
    }

}
