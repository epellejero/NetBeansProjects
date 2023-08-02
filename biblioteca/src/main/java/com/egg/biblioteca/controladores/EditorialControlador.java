package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.AutorServicio;
import com.egg.biblioteca.servicios.EditorialServicio;
import com.egg.biblioteca.servicios.LibroServicio;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Eduardo
 */

@Controller
@RequestMapping("/editorial")  //localhost:8080/editorial
public class EditorialControlador {
    
    @Autowired
    private LibroServicio libroServicio;
    @Autowired
    private AutorServicio autorservicio;
    @Autowired
    private EditorialServicio editorialServicio;
    
    @GetMapping("/registrar") //localhost:8080/editorial/registrar
    public String registrar() {
        return "editorial_form.html";
    }
    
    @PostMapping("/registro")  //localhost:8080/editorial/registro
    public String registro(@RequestParam String nombre, ModelMap modelo) throws MiException{    
        // System.out.println("Nombre: "+ nombre);
        try {
            editorialServicio.crearEditorial(nombre);
            modelo.put("exito", "La editorial fue cargada correctamente");
        } catch (MiException ex) {
            //Logger.getLogger(EditorialControlador.class.getName()).log(Level.SEVERE,null,ex);
            modelo.put("error", ex.getMessage());
            return "editorial_form.html";
        }
        return "index.html";
    }
    
    @GetMapping("/lista")
    public String listar(ModelMap modelo){
        List<Editorial> editoriales = editorialServicio.listarEditoriales();
        modelo.addAttribute("editoriales", editoriales);
        return "editorial_list.html";
    }
    
    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo){
        modelo.put("editorial", editorialServicio.getOne(id));
        return "editorial_modificar.html";
    }
    
    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String nombre, ModelMap modelo){
        try {
            editorialServicio.modificarEditorial(nombre, id);
            return "redirect:../lista";
        } catch (MiException ex) {
            modelo.put("editorial", editorialServicio.getOne(id));
            modelo.put("error", ex.getMessage());
            return "editorial_modificar.html";
        } 
    }
}
