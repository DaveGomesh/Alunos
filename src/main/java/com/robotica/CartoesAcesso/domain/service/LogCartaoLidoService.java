package com.robotica.CartoesAcesso.domain.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.robotica.CartoesAcesso.domain.model.LogCartaoLido;
import com.robotica.CartoesAcesso.domain.repository.CartaoDesconhecidoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LogCartaoLidoService {

    private final CartaoDesconhecidoRepository cartaoDesconhecidoRepository;

    @Transactional
    public LogCartaoLido salvarLogCartaoLido(String codigo, Boolean cadastrado){

        LogCartaoLido cartao = (LogCartaoLido.builder()
            .codigo(codigo)
            .cadastrado(cadastrado)
            .dataHoraLeitura(LocalDateTime.now())
            .build()
        );
        
        return cartaoDesconhecidoRepository.save(cartao);
    }

    public List<LogCartaoLido> buscarUltimosCartoes(){
        return cartaoDesconhecidoRepository.findTop10ByOrderByDataHoraLeituraDesc();
    }
}
