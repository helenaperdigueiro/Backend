package com.dh.Aula21.controller;

import com.dh.Aula21.dao.PokemonDAO;
import com.dh.Aula21.domain.Pokemon;
import com.dh.Aula21.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("pokemon")
public class PokemonController {

    @Autowired
    private PokemonService service;


    @GetMapping
    public Map<Integer, Pokemon> getPokemons(){
        return service.buscarPokemon();
    }

    @PostMapping
    public Pokemon postPokemon(@RequestBody PokemonDAO dao){
        return service.criarPokemon(dao);
    }

    @PutMapping
    public Pokemon putPokemon(@RequestBody PokemonDAO dao){
        return service.editarPokemon(dao);
    }

}
