package com.robotica.CartoesAcesso.api.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AlunoRequest {
    
    @NotBlank
    private String nome;

    @NotBlank
    private String matricula;
    
    @NotNull
    private Integer idCurso;
    
    @NotNull
    private CartaoRequest cartao;
}
