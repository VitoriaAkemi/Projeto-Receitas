package br.com.fiap.receitas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotBlank;

@Entity
@SequenceGenerator(name= "tipo", sequenceName = "SQ_RECEITA", allocationSize = 1)
public class Tipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo")
	@Column(name="CD_ID")
	private int id;

	@NotBlank(message = "Categoria obrigatório!")
	@Column(name="DS_CATEGORIA")
	private String categoria;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
