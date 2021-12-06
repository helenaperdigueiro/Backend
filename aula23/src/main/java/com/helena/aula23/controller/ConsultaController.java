package com.helena.aula23.controller;

import com.helena.aula23.dao.ConsultaDao;
import com.helena.aula23.model.Consulta;
import com.helena.aula23.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public ResponseEntity<Map<Integer, Consulta>> getConsultas() {
        return ResponseEntity.status(HttpStatus.OK).body(consultaService.buscarConsulta());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteConsulta(@PathVariable Integer id) {
        consultaService.deletarConsulta(id);
        return ResponseEntity.ok("Deletado com sucesso");
    }

    @PostMapping
    public ResponseEntity<Consulta> postConsulta(@RequestBody ConsultaDao consultaDao) {
        Consulta consulta = consultaService.criarConsulta(consultaDao);
        if(consulta == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(consulta);
    }

    @PutMapping
    public ResponseEntity<Consulta> putConsulta(@RequestBody ConsultaDao consultaDao) {
        return ResponseEntity.status(200).body(consultaService.editarConsulta(consultaDao));
    }
}
