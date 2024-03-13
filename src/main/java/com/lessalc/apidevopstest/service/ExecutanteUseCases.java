package com.lessalc.apidevopstest.service;

import com.lessalc.apidevopstest.entity.Executante;
import com.lessalc.apidevopstest.repository.ExecutanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecutanteUseCases {

    @Autowired
    ExecutanteRepository repository;

    public List<Executante> listarTodos(){
        return repository.findAll();
    }
}
