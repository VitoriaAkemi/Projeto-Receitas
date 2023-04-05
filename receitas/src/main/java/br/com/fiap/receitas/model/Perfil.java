package br.com.fiap.receitas.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	
	@OneToOne
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "perfil")
	private List<Tipo> tipos;

	public Perfil() {
		super();
	}

	public Perfil(int id, @NotBlank(message = "Nome obrigatório!") String nome, Usuario usuario, List<Tipo> tipos) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.tipos = tipos;
	}

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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Tipo> getTipos() {
		return tipos;
	}

	public void setTipos(List<Tipo> tipos) {
		this.tipos = tipos;
	}
	
	
}
