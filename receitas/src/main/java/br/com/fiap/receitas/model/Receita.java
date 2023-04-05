package br.com.fiap.receitas.model;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;

@Entity
@SequenceGenerator(name= "receita", sequenceName = "SQ_RECEITA", allocationSize = 1)
public class Receita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "receita")
	@Column(name="CD_ID")
	private int id;

	@NotBlank(message = "Título obrigatório!")
	@Column(name="DS_TITULO")
	private String titulo;
	
	@NotBlank(message = "Modo de Preparo obrigatório!")
	@Column(name="DS_MODO_PREPARO")
	private String modoPreparo;
	
	@NotBlank(message = "Data de cadastro obrigatória!")
	@Temporal(TemporalType.DATE)
	@Column(name="DT_CADASTRO")
	private Calendar dataCadastro;
	
	@NotBlank(message = "Quantidade de ingredientes obrigatório!")
	@Column(name="QT_INGREDIENTE")
	private int quantidadeIngrediente;
	
	@NotBlank(message = "Tempo de preparo obrigatório!")
	@Temporal(TemporalType.TIME)
	@Column(name="DT_TEMPO_PREPARO")
	private Calendar tempoPreparo;
	
	@NotBlank(message = "Quantidade de rendimento obrigatório!")
	@Column(name="QT_RENDIMENTO")
	private int quantidadeRendimento;
	
	@NotBlank(message = "Categoria obrigatória!")
	@Column(name="DS_CATEGORIA")
	private String categoria;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getmodoPreparo() {
		return modoPreparo;
	}

	public void setmodoPreparo(String modoPreparo) {
		this.modoPreparo = modoPreparo;
	}

	public Calendar getdataCadastro() {
		return dataCadastro;
	}

	public void setdataCadastro(Calendar dataFabricacao) {
		this.dataCadastro = dataFabricacao;
	}

	public int getQuantidadeIngrediente() {
		return quantidadeIngrediente;
	}

	public void setQuantidadeIngrediente(int quantidadeIngrediente) {
		this.quantidadeIngrediente = quantidadeIngrediente;
	}

	public Calendar getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(Calendar tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public int getQuantidadeRendimento() {
		return quantidadeRendimento;
	}

	public void setQuantidadeRendimento(int quantidadeRendimento) {
		this.quantidadeRendimento = quantidadeRendimento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
