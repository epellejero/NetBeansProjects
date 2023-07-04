package tienda;

import java.util.Scanner;
import tienda.serrvicios.FabricanteServicios;
import tienda.serrvicios.ProductoServicios;

public class Tienda {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoServicios productoServicio = new ProductoServicios();
        FabricanteServicios fabricanteServicio = new FabricanteServicios();
        
        try {
            int opcion;
            boolean continuar;
            do {
                System.out.println("- - - - T I E N D A - - - - ");
                System.out.println(" 1 - Listar productos por nombre ");
                System.out.println(" 2 - Listar productos por nombre y precio ");
                System.out.println(" 3 - Listar productos por precio entre $120 y $202 ");
                System.out.println(" 4 - Listar portátiles ");
                System.out.println(" 5 - Listar producto más barato (nombre y precio)");
                System.out.println(" 6 - Alta de producto ");
                System.out.println(" 7 - Alta de fabricante ");
                System.out.println(" 8 - Editar un producto ");
                System.out.println(" 9 - Salir ");
                opcion = leer.nextInt();
            switch (opcion) {
                case 1:     // Listar productos por nombre
                    productoServicio.listaProductos();
                    break;
                case 2:     // listar  los productos por nombre y precio
                    productoServicio.listaProductosPorNombreyPrecio();
                    break;
                case 3:     // Listar productos por precio entre $120 y $202
                    productoServicio.listaProductosPorPrecio();
                    break;
                case 4:     // Listar portátiles
                    productoServicio.listaProductosPortatiles();
                    break;
                case 5:     // Listar producto más barato (nombre y precio)
                    productoServicio.listaProductoMasBarato();
                    break;
                case 6:     // Alta de producto
                    continuar = true;
                    while (continuar) {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombreProducto = leer.next();
                        System.out.print("Ingrese el precio del producto: ");
                        double precioProducto = leer.nextDouble();
                        System.out.print("Ingrese el codigo del fabricante: ");
                        int codigoFabricanteProducto = leer.nextInt();
                        productoServicio.crearProducto(nombreProducto,precioProducto,codigoFabricanteProducto);
                        System.out.print("Desea agregar otro producto? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;                    
                case 7:     // Alta de fabricante
                    continuar = true;
                    while (continuar) {
                        System.out.print("Ingrese el nombre del fabricante: ");
                        String nombreFabricante = leer.next();
                        fabricanteServicio.crearFabricante(nombreFabricante);
                        System.out.print("Desea agregar otro producto? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                case 8:     // Editar un producto
                    continuar = true;
                    while (continuar) {
                        System.out.print("Ingrese el codigo del producto: ");
                        int codigoProducto = leer.nextInt();
                        productoServicio.editarProducto(codigoProducto);
                        System.out.print("Desea editar otro producto? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                default:
                    break;
            }
            } while (opcion != 9);
            System.out.println("* * * * * * * * Fin de proceso * * * * * * * ");
        } catch (Exception ex) {
            throw ex;
            //Logger.getLogger(MainClass.class.getName()).log(level.SEVERE, null, ex);
        }
    }
    
}                    