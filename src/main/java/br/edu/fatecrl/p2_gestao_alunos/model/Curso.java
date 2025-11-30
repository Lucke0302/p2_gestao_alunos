
package br.edu.fatecrl.p2_gestao_alunos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author gui
 */
@Entity
@Data
public class Curso {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @NotBlank(message = "O nome é obrigatório")
  private String nome;

  private String descricao;

  @NotNull(message = "A carga horária é obrigatória")
  @Min(value = 1, message = "A carga horária deve ser maior que zero")
  private int cargaHoraria;

}
