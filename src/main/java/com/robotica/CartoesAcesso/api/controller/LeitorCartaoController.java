package com.robotica.CartoesAcesso.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.robotica.CartoesAcesso.domain.service.LeitorCartaoService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("leitor-cartao")
public class LeitorCartaoController {

    private final LeitorCartaoService leitorCartaoService;
    
    @GetMapping
    public ResponseEntity<Boolean> lerCartao(@RequestParam("codigo") String codigo){

        Boolean response = leitorCartaoService.lerCartao(codigo);
        HttpStatus status = response ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(response, status);
    }
}
