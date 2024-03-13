package com.bhh.RegistroAlunos.services;

import com.bhh.RegistroAlunos.entities.Cursos;
import com.bhh.RegistroAlunos.repositories.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursosService {

    @Autowired private CursosRepository repository;

    public List<Cursos> getAll() {
        return repository.findAll();
    }
}
