package com.sistemas3xp.repository.entity;

import com.sistemas3xp.aluno.entity.Aluno;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "ALUNO")
public class AlunoEntity {
    private Long id;
    private UUID registrationNumber;
    private String name;

    public AlunoEntity(Long id, UUID registrationNumber, String name) {
        this(registrationNumber, name);
        this.id = id;
    }

    public AlunoEntity(UUID registrationNumber, String name){
        this.registrationNumber = registrationNumber;
        this.name = name;
    }

    public static AlunoEntity from(Aluno aluno){
        return new AlunoEntity(aluno.getRegistrationNumber(), aluno.getName());
    }
}
