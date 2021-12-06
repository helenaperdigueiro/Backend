package com.helena.aula25.controller;

import com.helena.aula25.dao.PacienteDao;
import com.helena.aula25.model.Paciente;
import com.helena.aula25.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("paciente")
public class PacienteController implements IController<Paciente, PacienteDao>{
    @Autowired
    private PacienteService pacienteService;

    @Override
    public ResponseEntity<Map<Integer, Paciente>> getMethod() {
        return ResponseEntity.status(HttpStatus.OK).body(pacienteService.buscar());
    }

    @Override
    public ResponseEntity<String> deleteMethod(@PathVariable Integer id) {
        pacienteService.deletar(id);
        return ResponseEntity.ok("Deletado com sucesso");
    }

    @Override
    public ResponseEntity<Paciente> postMethod(@RequestBody PacienteDao dao) {
        Paciente paciente = pacienteService.criar(dao);
        if(paciente == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(paciente);
    }

    @Override
    public ResponseEntity<Paciente> putMethod(@RequestBody PacienteDao dao) {
        return ResponseEntity.status(200).body(pacienteService.editar(dao));
    }
}
