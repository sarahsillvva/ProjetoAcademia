package com.pdv.projetoAcademia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pdv.projetoAcademia.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository <Aluno,  Long>{

}
