package com.robotica.CartoesAcesso.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.robotica.CartoesAcesso.domain.model.Curso;
import com.robotica.CartoesAcesso.domain.repository.CursoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CursoService {

    private final CursoRepository cursoRepository;
    
    @Transactional
    public Curso salvar(Curso curso){
        return cursoRepository.save(curso);
    }

    public List<Curso> buscarTodos(){
        return cursoRepository.findAll();
    }

    public Curso buscarPorId(Integer idCurso){
        return cursoRepository.findById(idCurso).orElseThrow();
    }
}
