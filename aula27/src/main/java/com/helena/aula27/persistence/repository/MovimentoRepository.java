package com.helena.aula27.persistence.repository;

import com.helena.aula27.persistence.entities.MovimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentoRepository extends JpaRepository<MovimentoEntity, Integer> {
}
