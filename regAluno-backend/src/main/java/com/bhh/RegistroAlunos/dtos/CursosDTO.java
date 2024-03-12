package com.bhh.RegistroAlunos.dtos;

import java.time.LocalDateTime;

public record CursosDTO(Long id, String nome, Boolean inativo, LocalDateTime createdAt) {
}
