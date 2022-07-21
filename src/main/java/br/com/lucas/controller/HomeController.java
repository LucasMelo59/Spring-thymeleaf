package br.com.lucas.controller;

import br.com.lucas.repositories.UsuarioRepository;
import br.com.lucas.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    UsuarioRepository repository;
    @Autowired
    UsuarioServices services;
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("Clientes", services.lista());
        return "home";
    }
    }



