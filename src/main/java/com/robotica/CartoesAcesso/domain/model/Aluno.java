package com.robotica.CartoesAcesso.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAluno;
    
    @NotBlank
    private String nome;
    
    @NotBlank
    private String matricula;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_curso")
    private Curso curso;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_cartao")
    private Cartao cartao;
}
