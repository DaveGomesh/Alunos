package com.robotica.CartoesAcesso.api.dto.mapper;

import org.springframework.stereotype.Component;

import com.robotica.CartoesAcesso.api.dto.request.CartaoRequest;
import com.robotica.CartoesAcesso.api.dto.response.CartaoResponse;
import com.robotica.CartoesAcesso.domain.model.Cartao;

@Component
public class CartaoMapper {
    
    public Cartao toEntity(CartaoRequest cartao){
        
        return (Cartao.builder()
            .codigo(cartao.getCodigo())
            .descricao(cartao.getDescricao())
            .build()
        );
    }

    public CartaoResponse toResponse(Cartao cartao){

        return (CartaoResponse.builder()
            .idCartao(cartao.getIdCartao())
            .codigo(cartao.getCodigo())
            .descricao(cartao.getDescricao())
            .build()
        );
    }
}
