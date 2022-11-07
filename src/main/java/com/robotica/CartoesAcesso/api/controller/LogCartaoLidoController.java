package com.robotica.CartoesAcesso.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robotica.CartoesAcesso.api.dto.mapper.LogCartaoLidoMapper;
import com.robotica.CartoesAcesso.api.dto.response.LogCartaoLidoResponse;
import com.robotica.CartoesAcesso.domain.model.LogCartaoLido;
import com.robotica.CartoesAcesso.domain.service.LogCartaoLidoService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("log-cartoes-lidos")
public class LogCartaoLidoController {

    private final LogCartaoLidoMapper logCartaoLidoMapper;
    private final LogCartaoLidoService logCartaoLidoService;
    
    @GetMapping("ultimos")
    public ResponseEntity<List<LogCartaoLidoResponse>> ultimosCartoes(){

        List<LogCartaoLido> cartoes = logCartaoLidoService.buscarUltimosCartoes();
        List<LogCartaoLidoResponse> cartoesResponse = logCartaoLidoMapper.toResponseList(cartoes);

        return new ResponseEntity<>(cartoesResponse, HttpStatus.OK);
    }
}
