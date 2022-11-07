package com.robotica.CartoesAcesso.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robotica.CartoesAcesso.domain.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
    
}
