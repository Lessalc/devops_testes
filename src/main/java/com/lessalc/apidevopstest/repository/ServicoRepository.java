package com.lessalc.apidevopstest.repository;

import com.lessalc.apidevopstest.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
