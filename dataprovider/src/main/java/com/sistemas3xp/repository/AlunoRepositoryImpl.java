package com.sistemas3xp.repository;

import com.sistemas3xp.aluno.contract.AlunoRepository;
import com.sistemas3xp.aluno.entity.Aluno;
import com.sistemas3xp.repository.entity.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlunoRepositoryImpl implements AlunoRepository {

    @Autowired
    AlunoDao alunoDao;

    @Override
    public void save(Aluno aluno) {
        alunoDao.save(AlunoEntity.from(aluno));
    }
}
