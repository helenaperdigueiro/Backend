package com.helena.checkpointII.persistence.repository;

import com.helena.checkpointII.persistence.entity.DentistaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistaRepository extends JpaRepository<DentistaEntity, Integer> {
}
