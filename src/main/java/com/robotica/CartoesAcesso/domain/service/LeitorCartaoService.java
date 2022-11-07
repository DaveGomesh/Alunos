package com.robotica.CartoesAcesso.domain.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.robotica.CartoesAcesso.domain.model.Cartao;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@Service
@AllArgsConstructor
public class LeitorCartaoService {

    private final CartaoService cartaoService;
    private final LogCartaoLidoService cartaoDesconhecidoService;

    public Boolean lerCartao(@NonNull String codigo){

        Boolean cadastrado = isCartaoCadastrado(codigo);
        salvarLogCartaoLido(codigo, cadastrado);
        return cadastrado;
    }

    private Boolean isCartaoCadastrado(String codigo){
        Optional<Cartao> optCartao = cartaoService.buscarPorCodigo(codigo);
        return optCartao.isPresent();
    }

    @Transactional
    private void salvarLogCartaoLido(String codigo, Boolean cadastrado){
        cartaoDesconhecidoService.salvarLogCartaoLido(codigo, cadastrado);
    }
}
