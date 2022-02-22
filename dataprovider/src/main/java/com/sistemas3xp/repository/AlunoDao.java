package com.sistemas3xp.repository;

import com.sistemas3xp.repository.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoDao extends JpaRepository<AlunoEntity, Long> {
}
