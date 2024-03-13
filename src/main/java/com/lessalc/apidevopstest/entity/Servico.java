package com.lessalc.apidevopstest.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Servico")
@Getter
@Setter
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICO")
    private Long idServico;

    @JsonIgnoreProperties("servicos")
    @ManyToOne
    @JoinColumn(name = "ID_EXECUTANTE")
    private Executante idExecutante;

    @Column(name = "TIPO_SERVICO", nullable = false)
    private int tipoServico;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "SITUACAO")
    private String situacao;


}
