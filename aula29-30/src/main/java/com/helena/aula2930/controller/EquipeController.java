package com.helena.aula2930.controller;

import com.helena.aula2930.model.Equipe;
import com.helena.aula2930.services.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("equipe")
public class EquipeController {
    @Autowired
    private EquipeService equipeService;

    @PostMapping
    public Equipe postEquipe(@RequestBody Equipe equipe) {
        return equipeService.insert(equipe);
    }
}
