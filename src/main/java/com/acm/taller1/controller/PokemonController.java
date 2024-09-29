package com.acm.taller1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PokemonController {

    @GetMapping({"/", "/index"})
    public String mostrarPaginaInicial() {
        return "inicio";
    }

}
