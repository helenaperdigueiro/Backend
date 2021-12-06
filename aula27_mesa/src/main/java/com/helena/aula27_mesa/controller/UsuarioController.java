package com.helena.aula27_mesa.controller;

import com.helena.aula27_mesa.persistence.entities.UsuarioEntity;
import com.helena.aula27_mesa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioEntity>> buscarTodos() {
        return ResponseEntity.ok(usuarioService.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<String> salvar(@RequestBody UsuarioEntity usuarioEntity) {
        if(usuarioService.salvar(usuarioEntity) != null) {
            return ResponseEntity.ok("Salvo com sucesso");
        }
        return ResponseEntity.badRequest().body("Nao foi possivel salvar");
    }
}
