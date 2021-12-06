package com.helena.aula2930.services;

import com.helena.aula2930.model.Equipe;
import com.helena.aula2930.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipeService {
    @Autowired
    private EquipeRepository equipeRepository;

    public Equipe insert(Equipe equipe) {
        return equipeRepository.save(equipe);
    }
}
