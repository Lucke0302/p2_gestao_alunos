
package br.edu.fatecrl.p2_gestao_alunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecrl.p2_gestao_alunos.model.Aluno;

/**
 *
 * @author gui
 */
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
