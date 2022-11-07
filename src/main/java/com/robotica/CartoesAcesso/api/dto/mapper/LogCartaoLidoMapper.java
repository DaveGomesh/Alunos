package com.robotica.CartoesAcesso.api.dto.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.robotica.CartoesAcesso.api.dto.response.AlunoResponse;
import com.robotica.CartoesAcesso.api.dto.response.LogCartaoLidoResponse;
import com.robotica.CartoesAcesso.domain.model.Aluno;
import com.robotica.CartoesAcesso.domain.model.LogCartaoLido;
import com.robotica.CartoesAcesso.domain.service.AlunoService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class LogCartaoLidoMapper {

    private final AlunoMapper alunoMapper;
    private final AlunoService alunoService;
    
    public LogCartaoLidoResponse toResponse(LogCartaoLido cartao){

        AlunoResponse alunoResponse = null;
        if(cartao.getCadastrado()){
            Aluno aluno = alunoService.buscarPorCodigoCartao(cartao.getCodigo());
            alunoResponse = alunoMapper.toResponse(aluno);
        }

        return (LogCartaoLidoResponse.builder()
            .idLogCartaoLido(cartao.getIdLogCartaoLido())
            .codigo(cartao.getCodigo())
            .cadastrado(cartao.getCadastrado())
            .aluno(alunoResponse)
            .dataHoraLeitura(cartao.getDataHoraLeitura())
            .build()
        );
    }

    public List<LogCartaoLidoResponse> toResponseList(List<LogCartaoLido> cartoes){
        return (cartoes.stream()
            .map(this::toResponse)
            .collect(Collectors.toList())
        );
    }
}
