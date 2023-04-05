package br.com.fiap.receitas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.receitas.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	// o CRUD JÁ É FEITO DE FORMA AUTOMATICA AQUI

	List<Usuario> findById(int id);
	List<Usuario> findByNome(String nome);
	List<Usuario> findBySobrenome(String sobrenome);
	List<Usuario> findByEmail(String email);

}
