package br.uepb.web.exercicio2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.uepb.web.exercicio2.model.Professor;

@RepositoryRestResource(collectionResourceRel = "professor", path = "professor")
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
