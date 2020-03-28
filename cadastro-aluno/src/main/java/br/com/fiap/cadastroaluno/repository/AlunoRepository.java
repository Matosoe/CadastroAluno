package br.com.fiap.cadastroaluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.cadastroaluno.domain.Aluno;

/**
 * AlunoRepository
 */
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    
}