package br.uepb.web.exercicio2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.uepb.web.exercicio2.model.Turma;

@RepositoryRestResource(collectionResourceRel = "turma", path = "turma")
public interface TurmaRepository extends JpaRepository<Turma, Long>{

}
