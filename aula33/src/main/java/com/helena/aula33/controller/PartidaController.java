package com.helena.aula33.controller;

import com.helena.aula33.dao.PartidaDAO;
import com.helena.aula33.model.Partida;
import com.helena.aula33.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("partida")
public class PartidaController {
    @Autowired
    private PartidaService partidaService;

    @PostMapping
    private Partida postPartida(@RequestBody PartidaDAO partidaDAO) {
        return partidaService.createPartida(partidaDAO);
    }
}
