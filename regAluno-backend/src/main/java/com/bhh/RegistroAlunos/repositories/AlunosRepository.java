package com.bhh.RegistroAlunos.repositories;

import com.bhh.RegistroAlunos.entities.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunosRepository extends JpaRepository<Long, Alunos> {
}
