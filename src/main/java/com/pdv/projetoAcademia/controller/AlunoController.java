package com.pdv.projetoAcademia.controller;

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

@RequestMapping("/aluno")
@RestController
public class AlunoController {

	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	public String getAluno () {
		return null;
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public Aluno postAluno (@RequestBody Aluno aluno) {
		return null;
	}
	
	@PutMapping
	@ResponseStatus(value = HttpStatus.OK)
	public Aluno putAluno () {
		return null;
	}
	
	@DeleteMapping
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public Aluno deleteAluno () {
		return null;
	}

}
