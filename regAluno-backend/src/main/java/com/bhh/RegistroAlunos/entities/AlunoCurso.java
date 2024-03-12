package com.bhh.RegistroAlunos.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "aluno_curso")
public class AlunoCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Alunos aluno;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Cursos curso;
}
