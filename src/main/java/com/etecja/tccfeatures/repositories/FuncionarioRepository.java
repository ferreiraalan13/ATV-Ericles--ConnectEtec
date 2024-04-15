package com.etecja.tccfeatures.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etecja.tccfeatures.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}
