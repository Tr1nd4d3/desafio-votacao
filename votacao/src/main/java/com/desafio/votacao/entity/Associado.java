package com.desafio.votacao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_ASSOCIADO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "TB_ASSOCIADO_SEQ", sequenceName = "TB_ASSOCIADO_SEQ", allocationSize = 1)
public class Associado implements Serializable {

	private static final long serialVersionUID = 707706540374678172L;

	@Id
	@Column(name = "ID_ASSOCIADO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_ASSOCIADO_SEQ")
	private Long id;

	@Column(name = "DS_NOME", nullable = false)
	private String nome;

	@Column(name = "NU_CPF", nullable = false, unique = true)
	private String cpf;

	@Column(name = "FL_EXCLUIDO", nullable = false)
    private boolean flExcluido;
    
}
