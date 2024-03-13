package com.lessalc.apidevopstest.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "Executante")
@Getter
@Setter
public class Executante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EXECUTANTE")
    private Long idExecutante;

    @Column(name = "TIPO_PESSOA", nullable = false)
    private int tipoPessoa;

    @Column(name = "CPF_CNPJ", nullable = false)
    private String cpfCnpj;

    @Column(name = "NOME")
    private String nome;

    @OneToMany(mappedBy = "idExecutante")
    private List<Servico> servicos;

    @Column(name = "CRIADO_EM")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant criadoEm;
    @Column(name = "ATUALIZADO_EM")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant atualizadoEm;
    @Column(name = "DELETADO_EM")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant deletadoEm;

}
