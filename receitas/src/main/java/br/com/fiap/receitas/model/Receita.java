package br.com.fiap.receitas.model;

import java.util.Calendar;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

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
	
	@NotNull(message = "Data de cadastro obrigatória!")
	@Temporal(TemporalType.DATE)
	@Column(name="DT_CADASTRO")
	private Calendar dataCadastro;
	
	@Min(1)
	@Column(name="QT_INGREDIENTE")
	private int quantidadeIngrediente;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name="DT_TEMPO_PREPARO")
	private Calendar tempoPreparo;
	
	@Min(1)
	@Column(name="QT_RENDIMENTO")
	private int quantidadeRendimento;
	
	@NotBlank(message = "Categoria obrigatória!")
	@Column(name="DS_CATEGORIA")
	private String categoria;
	
	@OneToMany(mappedBy = "receita")
	private List<Tipo> tipos;
	

	public Receita() {
		super();
	}

	public Receita(int id, @NotBlank(message = "Título obrigatório!") String titulo,
			@NotBlank(message = "Modo de Preparo obrigatório!") String modoPreparo,
			@NotBlank(message = "Data de cadastro obrigatória!") Calendar dataCadastro,
			@NotBlank(message = "Quantidade de ingredientes obrigatório!") int quantidadeIngrediente,
			@NotBlank(message = "Tempo de preparo obrigatório!") Calendar tempoPreparo,
			@NotBlank(message = "Quantidade de rendimento obrigatório!") int quantidadeRendimento,
			@NotBlank(message = "Categoria obrigatória!") String categoria, List<Tipo> tipos) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.modoPreparo = modoPreparo;
		this.dataCadastro = dataCadastro;
		this.quantidadeIngrediente = quantidadeIngrediente;
		this.tempoPreparo = tempoPreparo;
		this.quantidadeRendimento = quantidadeRendimento;
		this.categoria = categoria;
		this.tipos = tipos;
	}

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

	public void setdataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
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

	public List<Tipo> getTipos() {
		return tipos;
	}

	public void setTipos(List<Tipo> tipos) {
		this.tipos = tipos;
	}
	
	
}
