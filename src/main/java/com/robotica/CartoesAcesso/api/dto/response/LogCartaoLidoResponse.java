package com.robotica.CartoesAcesso.api.dto.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LogCartaoLidoResponse {
    
    private Integer idLogCartaoLido;
    private String codigo;
    private Boolean cadastrado;
    private AlunoResponse aluno;

    @JsonFormat(pattern="dd/MM/yyyy - HH:mm:ss")
    private LocalDateTime dataHoraLeitura;
}
