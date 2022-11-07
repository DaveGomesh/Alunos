package com.robotica.CartoesAcesso.api.dto.mapper;

import org.springframework.stereotype.Component;

import com.robotica.CartoesAcesso.api.dto.request.AlunoRequest;
import com.robotica.CartoesAcesso.api.dto.response.AlunoResponse;
import com.robotica.CartoesAcesso.api.dto.response.CartaoResponse;
import com.robotica.CartoesAcesso.api.dto.response.CursoResponse;
import com.robotica.CartoesAcesso.domain.model.Aluno;
import com.robotica.CartoesAcesso.domain.model.Cartao;
import com.robotica.CartoesAcesso.domain.model.Curso;
import com.robotica.CartoesAcesso.domain.service.CursoService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AlunoMapper {
    
    private final CursoMapper cursoMapper;
    private final CartaoMapper cartaoMapper;

    private final CursoService cursoService;

    public Aluno toEntity(AlunoRequest aluno){

        Curso curso = cursoService.buscarPorId(aluno.getIdCurso());
        Cartao cartao = cartaoMapper.toEntity(aluno.getCartao());

        return (Aluno.builder()
            .nome(aluno.getNome())
            .matricula(aluno.getMatricula())
            .curso(curso)
            .cartao(cartao)
            .build()
        );
    }

    public AlunoResponse toResponse(Aluno aluno){

        CursoResponse curso = cursoMapper.toResponse(aluno.getCurso());
        CartaoResponse cartao = cartaoMapper.toResponse(aluno.getCartao());

        return (AlunoResponse.builder()
            .idAluno(aluno.getIdAluno())
            .nome(aluno.getNome())
            .matricula(aluno.getMatricula())
            .curso(curso)
            .cartao(cartao)
            .build()
        );
    }
}
