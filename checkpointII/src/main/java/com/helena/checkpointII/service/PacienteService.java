package com.helena.checkpointII.service;

import com.helena.checkpointII.persistence.entity.PacienteEntity;
import com.helena.checkpointII.persistence.repository.PacienteRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    private static final Logger logger = Logger.getLogger(PacienteService.class);

    public PacienteEntity insert(PacienteEntity pacienteEntity) {
        logger.info("Um novo paciente foi inserido.");
        return pacienteRepository.save(pacienteEntity);
    }

    public List<PacienteEntity> selectAll() {
        return pacienteRepository.findAll();
    }

    public PacienteEntity update(Integer pacienteId, String email) {
        if(pacienteRepository.existsById(pacienteId)) {
            logger.info(String.format("O paciente com id %s foi editado.", pacienteId));
            Optional<PacienteEntity> pacienteEntity = pacienteRepository.findById(pacienteId);
            pacienteEntity.get().setEmail(email);
            return insert(pacienteEntity.get());
        }
        return null;
    }

    public String delete(Integer pacienteId) {
        if(pacienteRepository.existsById(pacienteId)) {
            logger.info(String.format("O paciente com id %s foi deletado.", pacienteId));
            pacienteRepository.deleteById(pacienteId);
            return String.format("O paciente com o id %s foi deletado com sucesso!", pacienteId);
        }
        return null;
    }
}
