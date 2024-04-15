package com.etecja.tccfeatures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etecja.tccfeatures.entities.Funcionario;
import com.etecja.tccfeatures.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	@Autowired
	private FuncionarioRepository cursoRepository;

	public List<Funcionario> findAll() {
		return cursoRepository.findAll();
	}

	public void save(Funcionario curso) {
		cursoRepository.save(curso);
	}

}
