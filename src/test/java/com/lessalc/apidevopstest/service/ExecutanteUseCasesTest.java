package com.lessalc.apidevopstest.service;

import jakarta.validation.constraints.AssertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ExecutanteUseCasesTest {

    @Test
    @DisplayName("Teste vazio!")
    void testar(){
        Assertions.assertEquals(1,1);
    }

}