package br.uepb.web.exercicio2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.uepb.web.exercicio2.model.Aluno;


@RepositoryRestResource(collectionResourceRel = "aluno", path = "aluno")
public interface AlunoRepository extends JpaRepository<Aluno,Long>{

}
