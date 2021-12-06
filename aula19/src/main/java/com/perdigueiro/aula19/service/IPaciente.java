package com.perdigueiro.aula19.service;

import com.perdigueiro.aula19.domain.Paciente;

import java.util.List;

public interface IPaciente {
    List<Paciente> listarPacientes();
    Paciente pacientePorEmail(String email);
}
