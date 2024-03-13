package com.lessalc.apidevopstest.controller;

import com.lessalc.apidevopstest.entity.Executante;
import com.lessalc.apidevopstest.service.ExecutanteUseCases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/executantes")
public class ExecutanteController {

    @Autowired
    ExecutanteUseCases service;

    @GetMapping("/listar")
    public ResponseEntity<List<Executante>> listarExecutantes(){
        return ResponseEntity.ok(service.listarTodos());
    }
}
