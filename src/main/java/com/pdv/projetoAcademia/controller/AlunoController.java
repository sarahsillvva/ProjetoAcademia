package com.pdv.projetoAcademia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pdv.projetoAcademia.model.Aluno;
import com.pdv.projetoAcademia.service.AlunoService;

@RequestMapping("/aluno")
@RestController
public class AlunoController {

	@Autowired
	AlunoService alunoService;
	
	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	public Aluno obterAluno () {
		return alunoService.obterAluno();
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public Aluno cadastrarAluno (@RequestBody Aluno aluno) {
		return alunoService.cadastrarAluno(aluno);
	}
	
	@PutMapping
	@ResponseStatus(value = HttpStatus.OK)
	public Aluno atualizarAluno () {
		return alunoService.atualizarAluno();
	}
	
	@DeleteMapping
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public Aluno deletarAluno () {
		return alunoService.deletarAluno();
	}

}
