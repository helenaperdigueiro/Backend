package com.helena.checkpointII.service;

import com.helena.checkpointII.persistence.entity.DentistaEntity;
import com.helena.checkpointII.persistence.repository.DentistaRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DentistaService {
    @Autowired
    private DentistaRepository dentistaRepository;

    private static final Logger logger = Logger.getLogger(DentistaService.class);

    public DentistaEntity insert(DentistaEntity dentistaEntity) {
        logger.info("Um novo dentista foi inserido.");
        return dentistaRepository.save(dentistaEntity);
    }

    public List<DentistaEntity> selectAll() {
        return dentistaRepository.findAll();
    }

    public DentistaEntity update(Integer dentistaId, String email) {
        if(dentistaRepository.existsById(dentistaId)) {
            logger.info(String.format("O dentista com id %s foi editado.", dentistaId));
            Optional<DentistaEntity> dentistaEntity = dentistaRepository.findById(dentistaId);
            dentistaEntity.get().setEmail(email);
            return insert(dentistaEntity.get());
        }
        return null;
    }

    public String delete(Integer dentistaId) {
        if(dentistaRepository.existsById(dentistaId)) {
            logger.info(String.format("O dentista com id %s foi deletado.", dentistaId));
            dentistaRepository.deleteById(dentistaId);
            return String.format("O dentista com id %s foi deletado com sucesso!", dentistaId);
        }
        return null;
    }

}
