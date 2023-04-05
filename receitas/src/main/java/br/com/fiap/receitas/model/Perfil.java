package br.com.fiap.receitas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotBlank;

@Entity
@SequenceGenerator(name= "perfil", sequenceName = "SQ_RECEITA", allocationSize = 1)
public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "perfil")
	@Column(name="CD_ID")
	private int id;

	@NotBlank(message = "Nome obrigatório!")
	@Column(name="NM_NOME")
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String titulo) {
		this.nome = titulo;
	}
	
	
}
