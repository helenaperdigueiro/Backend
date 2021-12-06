package com.helena.aula27.service;

import com.helena.aula27.persistence.entities.MovimentoEntity;
import com.helena.aula27.persistence.repository.MovimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimentoService {
    @Autowired
    private MovimentoRepository movimentoRepository;
    public List<MovimentoEntity> obterTodos() {
        return movimentoRepository.findAll();
    }
    public String save(MovimentoEntity movimento) {
        if(movimentoRepository.save(movimento) != null) {
            return "Salvo com sucesso";
        }
        return null;
    }
}
