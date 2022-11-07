package com.robotica.CartoesAcesso.domain.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.robotica.CartoesAcesso.domain.model.Cartao;
import com.robotica.CartoesAcesso.domain.repository.CartaoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CartaoService {

    private final CartaoRepository cartaoRepository;

    @Transactional
    public Cartao salvar(Cartao cartao){
        return cartaoRepository.save(cartao);
    }
    
    public Optional<Cartao> buscarPorCodigo(String codigo){
        return cartaoRepository.findByCodigo(codigo);
    }
}
