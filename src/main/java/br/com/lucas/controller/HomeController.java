package br.com.lucas.controller;

import br.com.lucas.repositories.UsuarioRepository;
import br.com.lucas.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @Autowired
    UsuarioServices services;
    @GetMapping("/")
    public String home(HttpServletRequest request) {

        request.setAttribute("nome", "mundo");
        return "home";
    }
    }



