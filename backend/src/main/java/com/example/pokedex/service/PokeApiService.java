package com.example.pokedex.service;

import com.example.pokedex.model.Pokemon;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PokeApiService {

    private final RestTemplate restTemplate = new RestTemplate();

    public Pokemon getPokemonById(int id) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + id;
        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
        Map body = response.getBody();

        Pokemon pokemon = new Pokemon();
        pokemon.setName((String) body.get("name"));
        pokemon.setHeight((int) body.get("height"));
        pokemon.setWeight((int) body.get("weight"));

        Map<String, Object> sprites = (Map<String, Object>) body.get("sprites");
        pokemon.setImage((String) sprites.get("front_default"));

        List<Map<String, Object>> types = (List<Map<String, Object>>) body.get("types");
        List<String> typeNames = types.stream()
                .map(t -> ((Map<String, String>) t.get("type")).get("name"))
                .collect(Collectors.toList());
        pokemon.setTypes(typeNames);

        return pokemon;
    }

    public Pokemon getPokemonByName(String name) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + name;
        try {
            ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
            Map body = response.getBody();

            Pokemon pokemon = new Pokemon();
            pokemon.setName((String) body.get("name"));
            pokemon.setHeight((int) body.get("height"));
            pokemon.setWeight((int) body.get("weight"));

            Map<String, Object> sprites = (Map<String, Object>) body.get("sprites");
            pokemon.setImage((String) sprites.get("front_default"));

            List<Map<String, Object>> types = (List<Map<String, Object>>) body.get("types");
            List<String> typeNames = types.stream()
                    .map(t -> ((Map<String, String>) t.get("type")).get("name"))
                    .collect(Collectors.toList());
            pokemon.setTypes(typeNames);

            return pokemon;
        } catch (HttpClientErrorException e) {
            throw new PokemonNotFoundException("Pokémon no encontrado con nombre: " + name);
        }
    }
}
