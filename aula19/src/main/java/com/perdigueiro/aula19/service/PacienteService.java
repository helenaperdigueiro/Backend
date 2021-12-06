package com.perdigueiro.aula19.service;

import com.perdigueiro.aula19.domain.Endereco;
import com.perdigueiro.aula19.domain.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PacienteService implements IPaciente{

    @Override
    public List<Paciente> listarPacientes() {
        List<Paciente> listaPacientes = new ArrayList<>();
        listaPacientes.add(new Paciente(002, "Joao", "Silva", "joao@gmail.com", "123456", new Date(),
                new Endereco("Verao", "1", "Campinas", "Sao Paulo")));
        listaPacientes.add(new Paciente(003, "Pedro", "Silva", "pedro@gmail.com", "123456", new Date(),
                new Endereco("Outono", "1", "Campinas", "Sao Paulo")));
        listaPacientes.add(new Paciente(004, "Isabela", "Silva", "isabela@gmail.com", "123456", new Date(),
                new Endereco("Inverno", "1", "Campinas", "Sao Paulo")));
        return listaPacientes;
    }

    @Override
    public Paciente pacientePorEmail(String email) {
        return new Paciente(001, "Maria", "Silva", email, "123456", new Date(),
                new Endereco("Primavera", "1", "Campinas", "Sao Paulo"));
    }
}
