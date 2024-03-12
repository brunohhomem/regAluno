package com.bhh.RegistroAlunos.entities;

import com.bhh.RegistroAlunos.dtos.CursosDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome do curso não pode ser em branco")
    private String nome;

    private Boolean inativo;
    @Timestamp
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime createdAt;

    public Cursos (CursosDTO dto) {
        id = dto.id();
        nome = dto.nome();
        inativo = dto.inativo();
        createdAt = dto.createdAt();
    }
}
