package br.com.fiap.receitas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.receitas.model.Perfil;

public interface PerfilRepository  extends JpaRepository<Perfil, Integer>{
	
	// o CRUD JÁ É FEITO DE FORMA AUTOMATICA AQUI

	List<Perfil> findById(int id);
	List<Perfil> findByNome(String nome);

}
