package com.perdigueiro.aula18.service;

import com.perdigueiro.aula18.domain.Professor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorServer implements IProfessor{

    @Override
    public List<Professor> listarProfessores() {
        List<Professor> listaProfessores = new ArrayList<>();

        listaProfessores.add(new Professor("Roberto", 32, "Matematica"));
        listaProfessores.add(new Professor("Julia", 28, "Historia"));
        listaProfessores.add(new Professor("Robson", 45, "Fisica"));

        return listaProfessores;
    }
}
