package com.example.pokedex.controller;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.service.PokeApiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

    private final PokeApiService pokeApiService;

    public PokemonController(PokeApiService pokeApiService) {
        this.pokeApiService = pokeApiService;
    }

    @GetMapping("/{id}")
    public Pokemon getPokemon(@PathVariable int id) {
        return pokeApiService.getPokemonById(id);
    }

    @GetMapping("/name/{name}")
    public Pokemon getPokemonByName(@PathVariable String name) {
        return pokeApiService.getPokemonByName(name.toLowerCase());
    }
}
