package com.bhh.RegistroAlunos.entities;

import com.bhh.RegistroAlunos.dtos.AlunosDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
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

    public Alunos(AlunosDTO dto) {
        id = dto.id();
        nome = dto.nome();
        matricula = dto.matricula();
        curso = dto.curso();
        dataNasc = dto.dataNasc();
        createdAt = dto.createdAt();
    }
}
