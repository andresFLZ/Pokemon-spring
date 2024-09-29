package com.acm.taller1.controller;

import com.acm.taller1.dto.PokemonDTO;
import com.acm.taller1.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping({"/", "/index"})
    public String mostrarPaginaInicial() {
        return "inicio";
    }

    @GetMapping("/buscar")
    public String recuperarPokemonByName(String nombre, Model model) {
        System.out.println(nombre);
        PokemonDTO pokemon = pokemonService.getPokemonByName(nombre);
        model.addAttribute("pokemon", pokemon);
        return "inicio";
    }

}
