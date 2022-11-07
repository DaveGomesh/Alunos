package com.robotica.CartoesAcesso.api.dto.request;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class CartaoRequest {

    @NotBlank
    private String codigo;
    private String descricao;
}
