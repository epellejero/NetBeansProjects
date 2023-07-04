package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO {
    
    public void guardarFabricante(Fabricante fabricante) throws Exception {
            try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }  
            
            String sql = "INSERT INTO fabricante (codigo, nombre)"
            + " VALUES ( '" + fabricante.getCodigo() + "','" + fabricante.getNombre() + "' );";
            
            instarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarFabricante(Fabricante fabricante) throws Exception {
        
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante a modificar");
            }  
            
            String sql = "UPDATE fabricante SET " // codigo, nombre
                    + "codigo = '" + fabricante.getCodigo() + "' WHERE nombre = '" 
                    + fabricante.getNombre() + "' );";
            
            instarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarFabricante(Fabricante fabricante) throws Exception {
        
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante existente");
            }  
            String sql = "DELETE FROM fabricante WHERE codigo = '" + fabricante.getCodigo() + "'";
            instarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Fabricante buscarFabricantePorCodigo(int codigo) throws Exception{
        try {
            String sql = "SELECT * FROM fabricante "
                        + "WHERE codigo = '" + codigo + "'";
            consultarBase(sql);
            Fabricante fabricante = null;
            
            while (resultado.next()) { 
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;
            
        } catch (Exception ex) {
            desconectarBase();
            throw ex;
            
        }
    }
    
    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception{
        try {
            String sql = "SELECT * FROM fabricante "
                        + "WHERE nombre = '" + nombre + "'";
            consultarBase(sql);
            Fabricante fabricante = null;
            
            while (resultado.next()) { 
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;
            
        } catch (Exception ex) {
            desconectarBase();
            throw ex;
            
        }
    }
    
    public Collection<Fabricante> listarFabricantes() throws Exception{
        try {
            String sql = "SELECT * FROM fabricante ";
            consultarBase(sql);
            Fabricante fabricante = null;
            Collection<Fabricante> fabricantes = new ArrayList<>();
            while (resultado.next()) { 
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                fabricantes.add(fabricante);
            }
            desconectarBase();
            return fabricantes;
            
        } catch (Exception ex) {
            desconectarBase();
            throw new Exception("Error de sistema");
            
        }
    }
}
