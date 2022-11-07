package com.robotica.CartoesAcesso.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robotica.CartoesAcesso.domain.model.LogCartaoLido;

public interface CartaoDesconhecidoRepository extends JpaRepository<LogCartaoLido, Integer> {
    
    List<LogCartaoLido> findTop10ByOrderByDataHoraLeituraDesc();
}
