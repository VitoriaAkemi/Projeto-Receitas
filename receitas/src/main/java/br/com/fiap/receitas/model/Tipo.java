package br.com.fiap.receitas.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "ID_PERFIL")
	private Perfil perfil;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="ID_RECEITA")
	private Receita receita;

	
	public Tipo() {
		super();
	}

	public Tipo(int id, @NotBlank(message = "Categoria obrigatório!") String categoria, Perfil perfil,
			Receita receita) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.perfil = perfil;
		this.receita = receita;
	}

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

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Receita getReceita() {
		return receita;
	}

	public void setReceita(Receita receita) {
		this.receita = receita;
	}
}
