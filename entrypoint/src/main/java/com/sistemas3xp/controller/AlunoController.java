package com.sistemas3xp.controller;

import com.sistemas3xp.aluno.usecase.RegistroAluno;
import com.sistemas3xp.converter.AlunoRequestConverter;
import com.sistemas3xp.request.AlunoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private RegistroAluno registroAluno;
    @Autowired
    private AlunoRequestConverter requestConverter;

    @GetMapping
    public String doYouHearMe(){
        return "I hear you <3";
    }

    @PostMapping
    public void save(@RequestBody AlunoRequest request){
        var aluno = requestConverter.toAluno(request);
        this.registroAluno.save(aluno);
    }
}
