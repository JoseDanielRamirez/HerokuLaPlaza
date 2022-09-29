package misiontic2022.com.agrolabranza.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import misiontic2022.com.agrolabranza.interfaceService.IproductoService;
import misiontic2022.com.agrolabranza.modelo.Producto;

@Controller
public class Controlador {
    private IproductoService service;
    @GetMapping("/listar")
    public String listar (Model model){
       List<Producto> productos = service.listar();
       model.addAttribute("productos", productos);
        return "";
    }
 
        
    
}