package com.bhh.RegistroAlunos.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record AlunosDTO (
        Long id,
        String nome,
        String matricula,
        String cursos,
        LocalDate dataNasc,
        LocalDateTime createdAt
){
}
