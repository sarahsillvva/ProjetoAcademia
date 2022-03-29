package com.pdv.projetoAcademia.service;

import org.springframework.stereotype.Service;

import com.pdv.projetoAcademia.model.Aluno;

@Service
public interface AlunoService {
	
	public Aluno obterAluno ();
	
	public Aluno cadastrarAluno (Aluno aluno);
	
	public Aluno atualizarAluno ();
	
	public Aluno deletarAluno();


}
