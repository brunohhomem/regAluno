package com.bhh.RegistroAlunos.repositories;

import com.bhh.RegistroAlunos.entities.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosRepository extends JpaRepository<Long, Cursos> {
}
