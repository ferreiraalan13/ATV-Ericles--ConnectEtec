package com.etecja.tccfeatures.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etecja.tccfeatures.entities.Aluno;


public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
