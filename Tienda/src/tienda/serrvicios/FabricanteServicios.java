package tienda.serrvicios;

import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteServicios {
    
    private final FabricanteDAO dao;
    
    public FabricanteServicios() {
        this.dao = new FabricanteDAO();
    }

    public void crearFabricante(String nombre) throws Exception {        
        try {
            //validamos
            if (nombre == null || nombre.trim().isEmpty()){
                throw new Exception("Debe ingresar un nombre de fabricante");
            }
            //Creamos fabricante
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            dao.guardarFabricante(fabricante);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    
    
    
}
