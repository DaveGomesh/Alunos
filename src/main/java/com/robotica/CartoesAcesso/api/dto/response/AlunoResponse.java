package com.robotica.CartoesAcesso.api.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AlunoResponse {

    private Integer idAluno;
    private String nome;
    private String matricula;
    private CursoResponse curso;
    private CartaoResponse cartao;
}
