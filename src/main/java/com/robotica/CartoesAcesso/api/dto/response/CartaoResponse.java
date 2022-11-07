package com.robotica.CartoesAcesso.api.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartaoResponse {

    private Integer idCartao;
    private String codigo;
    private String descricao;
}
