package com.pdv.projetoAcademia.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pdv.projetoAcademia.model.Aluno;
import com.pdv.projetoAcademia.repository.AlunoRepository;
import com.pdv.projetoAcademia.service.AlunoService;

@Component

public class AlunoServiceImpl implements AlunoService{

	@Autowired
	AlunoRepository alunoRepository;
	
	public List<Aluno> obterAlunos() {
		return alunoRepository.findAll();
	}
	
	public Aluno cadastrarAluno (Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public Aluno atualizarAluno (Aluno aluno) {
		Optional<Aluno> resposta = alunoRepository.findById(aluno.getId());
		if (resposta.isPresent()) {
			alunoRepository.save(aluno);
		}
		return null;
	}
	
	public void deletarAluno (Long alunoId) {
		 alunoRepository.deleteById(alunoId);;
	}
}
