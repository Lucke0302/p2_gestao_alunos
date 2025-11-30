
package br.edu.fatecrl.p2_gestao_alunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecrl.p2_gestao_alunos.model.Curso;

/**
 *
 * @author gui
 */
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
