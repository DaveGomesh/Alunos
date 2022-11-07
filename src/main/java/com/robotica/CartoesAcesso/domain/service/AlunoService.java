package com.robotica.CartoesAcesso.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.robotica.CartoesAcesso.domain.model.Aluno;
import com.robotica.CartoesAcesso.domain.model.Cartao;
import com.robotica.CartoesAcesso.domain.repository.AlunoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AlunoService {
    
    private final CartaoService cartaoService;
    private final AlunoRepository alunoRepository;

    @Transactional
    public Aluno salvar(Aluno aluno){

        salvarCartao(aluno.getCartao());
        return alunoRepository.save(aluno);
    }

    public Aluno buscarPorCodigoCartao(String codigoCartao){
        return alunoRepository.findByCartaoCodigo(codigoCartao).orElseThrow();
    }
    
    private void salvarCartao(Cartao cartao){
        cartaoService.salvar(cartao);
    }
}
