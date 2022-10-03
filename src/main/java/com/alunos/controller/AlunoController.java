package com.alunos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alunos")
public class AlunoController {
    
    @GetMapping("{id-aluno}")
    public ResponseEntity<?> pesquisarAluno(@PathVariable("id-aluno") Integer idAluno){
        Boolean resposta = idAluno == 1;
        return ResponseEntity.ok().body(resposta);
    }
}
