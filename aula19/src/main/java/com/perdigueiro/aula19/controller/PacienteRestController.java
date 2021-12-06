package com.perdigueiro.aula19.controller;

import com.perdigueiro.aula19.domain.Paciente;
import com.perdigueiro.aula19.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("paciente")
public class PacienteRestController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping("listar")
    public List<Paciente> listarPacientes() {
        return pacienteService.listarPacientes();
    }

    @GetMapping("email/{email}")
    public Paciente pacientePorEmail(@PathVariable String email) {
        return pacienteService.pacientePorEmail(email);
    }
}
