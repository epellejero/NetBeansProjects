package com.egg.biblioteca.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Eduardo
 */

@Controller
@RequestMapping("/")
public class PortalControlador {  //localhost:8080/
    
    @GetMapping("/index")
    public String index(){  //localhost:8080/
        return "index.html"; 
    }
    
    
}
