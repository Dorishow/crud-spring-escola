package com.sistemas3xp.aluno.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
public class Aluno {
    private final UUID registrationNumber;
    private final String name;

    public Aluno(String name) {
        this.registrationNumber = UUID.randomUUID();
        this.name = name;
    }
}
