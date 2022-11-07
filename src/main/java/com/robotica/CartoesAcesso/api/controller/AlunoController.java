package com.robotica.CartoesAcesso.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robotica.CartoesAcesso.api.dto.mapper.AlunoMapper;
import com.robotica.CartoesAcesso.api.dto.request.AlunoRequest;
import com.robotica.CartoesAcesso.api.dto.response.AlunoResponse;
import com.robotica.CartoesAcesso.domain.model.Aluno;
import com.robotica.CartoesAcesso.domain.service.AlunoService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("alunos")
public class AlunoController {

    private final AlunoMapper alunoMapper;
    private final AlunoService alunoService;

    @PostMapping
    public ResponseEntity<AlunoResponse> salvar(@RequestBody AlunoRequest alunoRequest){

        Aluno aluno = alunoMapper.toEntity(alunoRequest);
        aluno = alunoService.salvar(aluno);

        AlunoResponse alunoResponse = alunoMapper.toResponse(aluno);
        return new ResponseEntity<>(alunoResponse, HttpStatus.OK);
    }

}
