package com.robotica.CartoesAcesso.api.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CursoResponse {
    
    private Integer idCurso;
    private String nome;
}
