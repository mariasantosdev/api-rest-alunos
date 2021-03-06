package br.com.maria.eduarda.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.maria.eduarda.api.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
