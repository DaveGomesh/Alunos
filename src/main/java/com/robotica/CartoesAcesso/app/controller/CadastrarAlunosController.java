package com.robotica.CartoesAcesso.app.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.robotica.CartoesAcesso.api.dto.mapper.CursoMapper;
import com.robotica.CartoesAcesso.api.dto.response.CursoResponse;
import com.robotica.CartoesAcesso.domain.model.Curso;
import com.robotica.CartoesAcesso.domain.service.AlunoService;
import com.robotica.CartoesAcesso.domain.service.CursoService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("app/alunos")
public class CadastrarAlunosController {

    private final CursoMapper cursoMapper;
    private final CursoService cursoService;

    @GetMapping
    public ModelAndView cadastrar(@RequestParam(name = "codigo", required = false) String codigo){

        List<Curso> cursos = cursoService.buscarTodos();
        List<CursoResponse> cursosResponseList = cursoMapper.toResponseList(cursos);

        ModelAndView modelAndView = new ModelAndView("cadastrar-aluno");
        modelAndView.addObject("codigo", codigo);
        modelAndView.addObject("cursos", cursosResponseList);

        return modelAndView;
    }
}
