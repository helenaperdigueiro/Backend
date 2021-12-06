package com.dh.Aula21.service;


import com.dh.Aula21.dao.PokemonDAO;
import com.dh.Aula21.domain.Pokemon;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PokemonService {

    private static Map<Integer, Pokemon> flyweight = new HashMap<>();

    public Map<Integer, Pokemon> buscarPokemon(){
        return flyweight;
    }

    public Pokemon criarPokemon(PokemonDAO dao){

        Integer id = flyweight.size() + 1;

        Pokemon pokemon = new Pokemon(dao.getNome(), dao.getTipo(), dao.getPokedex(), dao.getHabilidades());

        flyweight.put(id, pokemon);

        return flyweight.get(id);
    }

    public Pokemon editarPokemon(PokemonDAO dao){

        Pokemon pokemon = flyweight.get(dao.getId());

        pokemon.setTipo(dao.getTipo());
        pokemon.setHabilidades(dao.getHabilidades());

        return pokemon;
    }

}
