package com.bhh.RegistroAlunos.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.Timestamp;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Alunos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Nome do aluno não pode ser em branco")
    private String nome;
    private String matricula;
    private String curso;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNasc;
    @Timestamp
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime createdAt;
}
