package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.AutorServicio;
import com.egg.biblioteca.servicios.EditorialServicio;
import com.egg.biblioteca.servicios.LibroServicio;
import java.util.List;
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
@RequestMapping("/libro")
public class LibroControlador {
    
    @Autowired
    private LibroServicio libroServicio;
    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private EditorialServicio editorialServicio;
    
    @GetMapping("/registrar") //localhost:8080/libro/registrar
    public String registrar(ModelMap modelo) {
        List<Autor> autores = autorServicio.listarAutores();
        List<Editorial> editoriales = editorialServicio.listarEditoriales();
        
        modelo.addAttribute("autores",autores);
        modelo.addAttribute("editoriales", editoriales);
        
        return "libro_form.html";
    }
    
    @PostMapping("/registro") 
    public String reistro(@RequestParam(required = false) Long isbn, @RequestParam String titulo,
            @RequestParam(required = false) Integer ejemplares, @RequestParam String idAutor,
            @RequestParam String idEditorial, ModelMap modelo){
        try {
            libroServicio.crearLibro(isbn, titulo, ejemplares, idAutor, idEditorial);  // si todo sale bien retornamos al inicio
            
            modelo.put("exito","El libro fue cargado correctamente");
            
        } catch (MiException ex) {
            //Logger.getLogger(LibroControlador.class.getName()).log(Level.SEVERE,null,ex); 
            List<Autor> autores = autorServicio.listarAutores();
            List<Editorial> editoriales = editorialServicio.listarEditoriales();
            modelo.addAttribute("autores",autores);
            modelo.addAttribute("editoriales", editoriales);
            
            modelo.put("error",ex.getMessage());
            
            return "libro_form.html"; //volvemos a cargar el formulario
        }
        return "index.html";
    }
    
    @GetMapping("/lista")
    public String listar(ModelMap modelo){
        List<Libro> libros = libroServicio.listarLibros();
        modelo.addAttribute("libros", libros);
        return "libro_list.html";
    }
    
    @GetMapping("/modificar/{isbn}")
    public String modificar(@PathVariable Long isbn, ModelMap modelo){
        List<Autor> autores = autorServicio.listarAutores();
            List<Editorial> editoriales = editorialServicio.listarEditoriales();
            modelo.addAttribute("autores",autores);
            modelo.addAttribute("editoriales", editoriales);
        modelo.put("libro", libroServicio.getOne(isbn));
        return "libro_modificar.html";
    }
    
    @PostMapping("/modificar/{isbn}")
    public String modificar(@PathVariable Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial, ModelMap modelo){
        try {
            libroServicio.modificarLibro(isbn, titulo, idAutor, idEditorial, ejemplares);
            return "redirect:../lista";
        } catch (MiException ex) {
            List<Autor> autores = autorServicio.listarAutores();
            List<Editorial> editoriales = editorialServicio.listarEditoriales();
            modelo.addAttribute("autores",autores);
            modelo.addAttribute("editoriales", editoriales);
            modelo.put("error", ex.getMessage());
            return "libro_modificar.html";
        }    
    }
    
}