package com.robotica.CartoesAcesso.api.dto.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.robotica.CartoesAcesso.api.dto.response.CursoResponse;
import com.robotica.CartoesAcesso.domain.model.Curso;

@Component
public class CursoMapper {
    
    public CursoResponse toResponse(Curso curso){
        
        return (CursoResponse.builder()
            .idCurso(curso.getIdCurso())
            .nome(curso.getNome())
            .build()
        );
    }

    public List<CursoResponse> toResponseList(List<Curso> cursos) {
        
        return (cursos.stream()
            .map(this::toResponse)
            .collect(Collectors.toList())
        );
    }
}
