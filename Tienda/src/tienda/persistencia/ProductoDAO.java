package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    public void guardarProducto(Producto producto) throws Exception {
        
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }  
            
            String sql = "INSERT INTO Producto (codigo, nombre, precio, codigo_fabricante)"
                    + " VALUES ( '" + producto.getCodigo() + "','" + producto.getNombre()
                    + "','" + producto.getPrecio() + "','" + producto.getCodigoFabricante()
                    + "' );";
            
            instarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarProducto(Producto producto) throws Exception {
        
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto a modificar");
            }  
            
            String sql = "UPDATE Producto SET " // codigo, nombre, precio, codigo_fabricante)"
                    + "codigo = '" + producto.getCodigo() + "' WHERE nombre = '" 
                    + producto.getNombre() + "' );";
            
            instarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarProducto(Producto producto) throws Exception {
        
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto existente");
            }  
            String sql = "DELETE FROM Producto WHERE codigo = '" + producto.getCodigo() + "'";
            instarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Producto buscarProductoPorCodigo(int codigo) throws Exception{
        try {
            String sql = "SELECT * FROM producto "
                        + "WHERE codigo = '" + codigo + "'";
            consultarBase(sql);
            Producto producto = null;
            
            while (resultado.next()) { 
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
            
        }
    }
    
    public Producto buscarProductoPorNombre(String nombre) throws Exception{
        try {
            String sql = "SELECT * FROM producto "
                        + "WHERE nombre = '" + nombre + "'";
            consultarBase(sql);
            Producto producto = null;
            
            while (resultado.next()) { 
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
            
        }
    }
    
    public Collection<Producto> listarProductos() throws Exception{
        try {
            String sql = "SELECT * FROM producto ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) { 
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");            
        }
    }
    
    public Collection<Producto> listarProductosPorPrecio() throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE precio >= 120 AND precio <= 202";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) { 
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");            
        }
    }
    
    public Collection<Producto> listarProductosPortatiles() throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portatil%'";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) { 
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");            
        }
    }
    
    public Collection<Producto> listarProductosMasBarato() throws Exception{
        try {
            String sql = "SELECT nombre,MIN(precio) FROM producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) { 
                producto = new Producto();
                //producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                //producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");            
        }
    }
    
}
