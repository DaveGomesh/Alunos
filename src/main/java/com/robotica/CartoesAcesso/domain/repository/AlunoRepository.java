package com.robotica.CartoesAcesso.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robotica.CartoesAcesso.domain.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    
    Optional<Aluno> findByCartaoCodigo(String codigo);
}
