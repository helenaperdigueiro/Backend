package com.helena.aula2930.services;

import com.helena.aula2930.model.Treinador;
import com.helena.aula2930.repository.TreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreinadorService {
    @Autowired
    private TreinadorRepository treinadorRepository;

    public Treinador insert(Treinador treinador) {
        return treinadorRepository.save(treinador);
    }
}
