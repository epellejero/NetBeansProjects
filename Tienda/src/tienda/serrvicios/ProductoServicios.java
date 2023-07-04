package tienda.serrvicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoServicios {

    private final ProductoDAO dao;
//    private final FabricanteDAO daoFabricante;
    
    public ProductoServicios() {
        this.dao = new ProductoDAO();
    }
    
    public void crearProducto(String nombre, double precio, int codigoFabricante) throws Exception {        
        try {
            //validamos
            if (nombre == null || nombre.trim().isEmpty()){
                throw new Exception("Debe ingresar un nombre de producto");
            }
            if (precio <= 0){
                throw new Exception("Debe ingresar un precio válido");
            }
//            if (nombre.equalsIgnoreCase(dao.buscarProductoPorNombre(nombre).getNombre())){
//                throw new Exception("Nombre de producto repetido");
//            }
//            if (daoFabricante.buscarFabricantePorCodigo(codigoFabricante) == null){
//                throw new Exception("El codigo de fabricante no existe ");
//            }

            //Creamos producto
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);
            dao.guardarProducto(producto);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public void listaProductos() throws Exception{        
        Collection<Producto> productos = new ArrayList<>();
        productos = dao.listarProductos();
        for (Producto aux : productos) {
            System.out.println(aux.getCodigo() + " - " + aux.getNombre()
                + " - " + aux.getPrecio() + " - " + aux.getCodigoFabricante());
        }
        productos.clear();
    }
    
    public void listaProductosPorNombreyPrecio() throws Exception{        
        Collection<Producto> productos = new ArrayList<>();
        productos = dao.listarProductos();
        for (Producto aux : productos) {
            System.out.println(aux.getNombre() + " " + aux.getPrecio());
        }
        productos.clear();
    }
    
    public void listaProductosPorPrecio() throws Exception{        
        Collection<Producto> productos = new ArrayList<>();
        productos = dao.listarProductosPorPrecio();
        for (Producto aux : productos) {
            System.out.println(aux.getNombre() + " " + aux.getPrecio());
        }
        productos.clear();
    }
        
    public void listaProductosPortatiles() throws Exception{        
        Collection<Producto> productos = new ArrayList<>();
        productos = dao.listarProductosPortatiles();
        for (Producto aux : productos) {
            System.out.println(aux.getNombre() + " " + aux.getPrecio());
        }
        productos.clear();
    }
    
    public void listaProductoMasBarato() throws Exception{        
        Collection<Producto> productos = new ArrayList<>();
        productos = dao.listarProductosMasBarato();
        for (Producto aux : productos) {
            System.out.println(aux.getNombre() + " " + aux.getPrecio());
        }
        productos.clear();    
    }  
     
    public void editarProducto(int codigo) throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Producto producto = new Producto();
        producto = dao.buscarProductoPorCodigo(codigo);
        System.out.println("Nombre     : " + producto.getNombre());
        System.out.println("Precio     : " + producto.getPrecio());
        System.out.println("Fabricante : " + producto.getCodigoFabricante());
        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = leer.next();
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = leer.nextDouble();
        System.out.print("Ingrese el codigo del fabricante: ");
        int codigoFabricanteProducto = leer.nextInt();
        producto.setNombre(nombreProducto);
        producto.setPrecio(precioProducto);
        producto.setCodigoFabricante(codigoFabricanteProducto);
        dao.modificarProducto(producto);
         
     }
     
}
