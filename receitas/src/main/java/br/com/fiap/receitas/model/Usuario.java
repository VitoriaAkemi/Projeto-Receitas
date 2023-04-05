package br.com.fiap.receitas.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotBlank;

@Entity
@SequenceGenerator(name= "usuario", sequenceName = "SQ_USUARIO", allocationSize = 1)
public class Usuario {

		
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
		@Column(name="CD_ID")
		private int id;

		@NotBlank(message = "Nome obrigatório!")
		@Column(name="NM_NOME")
		private String nome;
		
		@NotBlank(message = "Sobrenome obrigatório!")
		@Column(name="NM_SOBRENOME")
		private String sobrenome;
		
		@NotBlank(message = "Email obrigatório!")
		@Column(name="DS_EMAIL")
		private String email;
		
		@NotBlank(message = "Senha obrigatória!")
		@Column(name="DS_SENHA")
		private String senha;
		
		@OneToOne(mappedBy = "usuario", cascade = CascadeType.PERSIST)
		private Perfil perfil;
	

		public Usuario() {
			super();
		}

		public Usuario(int id, @NotBlank(message = "Nome obrigatório!") String nome,
				@NotBlank(message = "Sobrenome obrigatório!") String sobrenome,
				@NotBlank(message = "Email obrigatório!") String email,
				@NotBlank(message = "Senha obrigatória!") String senha) {
			super();
			this.id = id;
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.email = email;
			this.senha = senha;
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

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		

}
