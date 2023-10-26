package com.tienda_v2.controller;

import com.tienda_v2.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria") //Mapeo de consultas
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String listado (Model model) {
        var categorias = categoriaService.getCategorias(false); //Que devuelva el listado de solo las categorias activas o de todas, si es true solo las activas, si es un falso entonces todas
        
        model.addAttribute("categorias", categorias);
        
        model.addAttribute("totalCategorias", categorias.size());
        return "/categoria/listado"; //esto se refiere a la carpeta categoria y al archivo listado
    }
    
}
