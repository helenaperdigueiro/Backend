package com.helena.aula2930.controller;

import com.helena.aula2930.model.Treinador;
import com.helena.aula2930.services.TreinadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("treinador")
public class TreinadorController {
    @Autowired
    private TreinadorService treinadorService;

    @PostMapping
    public Treinador postTreinador(@RequestBody Treinador treinador) {
        return treinadorService.insert(treinador);
    }
}
