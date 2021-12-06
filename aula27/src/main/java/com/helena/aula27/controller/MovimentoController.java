package com.helena.aula27.controller;

import com.helena.aula27.persistence.entities.MovimentoEntity;
import com.helena.aula27.service.MovimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovimentoController {
    @Autowired
    private MovimentoService movimentoService;
    @GetMapping
    public ResponseEntity<List<MovimentoEntity>> buscarTodos() {
        return ResponseEntity.ok(movimentoService.obterTodos());
    }
    @PostMapping
    public ResponseEntity<String> salvar(@RequestBody MovimentoEntity movimentoEntity) {
        if(movimentoService.save(movimentoEntity) != null) {
            return ResponseEntity.ok("Salvo com sucesso");
        }
        return ResponseEntity.badRequest().body("Nao foi possivel salvar");
    }
}
