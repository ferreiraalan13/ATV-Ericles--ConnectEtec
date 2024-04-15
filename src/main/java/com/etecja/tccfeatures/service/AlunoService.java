package com.etecja.tccfeatures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etecja.tccfeatures.entities.Aluno;
import com.etecja.tccfeatures.entities.Funcionario;
import com.etecja.tccfeatures.repositories.AlunoRepository;
import com.etecja.tccfeatures.repositories.FuncionarioRepository;

@Service
public class AlunoService {
	@Autowired
	private AlunoRepository alunoRepository;

	public List<Aluno> findAll() {
		return alunoRepository.findAll();
	}

	public void save(Aluno aluno) {
		alunoRepository.save(aluno);
	}

}
