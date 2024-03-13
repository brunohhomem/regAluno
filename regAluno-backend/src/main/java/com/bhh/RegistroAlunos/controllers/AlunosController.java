package com.bhh.RegistroAlunos.controllers;

import com.bhh.RegistroAlunos.entities.Alunos;
import com.bhh.RegistroAlunos.services.AlunosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

    @Autowired private AlunosService service;

    @GetMapping
    public ResponseEntity<List<Alunos>> listarAlunos (){
        List<Alunos> alunos = service.getAll();
        return ResponseEntity.ok().body(alunos);
    }
;}
