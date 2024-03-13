package com.bhh.RegistroAlunos.services;

import com.bhh.RegistroAlunos.entities.Alunos;
import com.bhh.RegistroAlunos.repositories.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunosService {

    @Autowired private AlunosRepository repository;

    public List<Alunos> getAll() {
        return repository.findAll();
    }
}
