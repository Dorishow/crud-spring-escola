package com.sistemas3xp.aluno.usecase;

import com.sistemas3xp.aluno.contract.AlunoRepository;
import com.sistemas3xp.aluno.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroAluno {

    @Autowired
    AlunoRepository alunoRepository;

    public void save(Aluno aluno){
        alunoRepository.save(aluno);
    }

}
