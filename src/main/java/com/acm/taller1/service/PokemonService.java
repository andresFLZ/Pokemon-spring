package com.acm.taller1.service;

import com.acm.taller1.dto.PokemonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PokemonService {
    private final RestTemplate restTemplate;
    private static final String POKEAPI_URL = "https://pokeapi.co/api/v2/pokemon/";

    @Autowired
    public PokemonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PokemonDTO getPokemonByName(String nombre) {
        String url = POKEAPI_URL + nombre.toLowerCase();
        return restTemplate.getForObject(url, PokemonDTO.class);
    }

}
