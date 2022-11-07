package com.robotica.CartoesAcesso.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class Run implements CommandLineRunner {

    // private final AlunoMapper alunoMapper;

    // private final CursoService cursoService;
    // private final AlunoService alunoService;

    @Override
    public void run(String... args) throws Exception {

        // List<Curso> cursos = Arrays.asList(
        //     Curso.builder().nome("Libras").build(),
        //     Curso.builder().nome("Robótica").build(),
        //     Curso.builder().nome("Sistemas de Informação").build(),
        //     Curso.builder().nome("Informática").build(),
        //     Curso.builder().nome("Edificações").build(),
        //     Curso.builder().nome("Eletrônica").build(),
        //     Curso.builder().nome("Eletromecânica").build(),
        //     Curso.builder().nome("Eletrotécnica").build()
        // );
        // cursos.forEach(cursoService::salvar);

        // AlunoRequest alunoRequest = (AlunoRequest.builder()
        //     .nome("David Gomesh")
        //     .matricula("123")
        //     .idCurso(3)
        //     .cartao(CartaoRequest.builder()
        //         .codigo("89b2d331")
        //         .descricao("Meu Vale Transporte")
        //         .build()
        //     ).build()
        // );

        // Aluno aluno = alunoMapper.toEntity(alunoRequest);
        // alunoService.salvar(aluno);
    }
    
}
