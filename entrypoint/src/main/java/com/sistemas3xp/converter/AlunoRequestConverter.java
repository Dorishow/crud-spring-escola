package com.sistemas3xp.converter;

import com.sistemas3xp.aluno.entity.Aluno;
import com.sistemas3xp.request.AlunoRequest;
import org.springframework.stereotype.Component;

@Component
public class AlunoRequestConverter {

    public Aluno toAluno(AlunoRequest request){
        return new Aluno(request.getName());
    }
}
