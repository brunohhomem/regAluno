package com.bhh.RegistroAlunos.controllers;

import com.bhh.RegistroAlunos.entities.Cursos;
import com.bhh.RegistroAlunos.services.CursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursosControllers {

    @Autowired private CursosService service;

    @GetMapping
    public ResponseEntity<List<Cursos>> listarCursos(){
        List<Cursos> cursos = service.getAll();
        return ResponseEntity.ok().body(cursos);
    }
}
