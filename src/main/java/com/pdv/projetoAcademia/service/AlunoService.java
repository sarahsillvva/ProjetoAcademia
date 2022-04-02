package com.pdv.projetoAcademia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pdv.projetoAcademia.model.Aluno;

@Service
public interface AlunoService {
	
	public List<Aluno> obterAlunos ();
	
	public Aluno cadastrarAluno (Aluno aluno);
	
	public Aluno atualizarAluno (Aluno aluno);
	
	public void deletarAluno(Long alunoId);


}
