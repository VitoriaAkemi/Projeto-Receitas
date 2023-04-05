package br.com.fiap.receitas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.receitas.model.Tipo;

public interface TipoRepository extends JpaRepository<Tipo, Integer>{
	
	// o CRUD JÁ É FEITO DE FORMA AUTOMATICA AQUI

	List<Tipo> findById(int id);
	List<Tipo> findByCategoria(String categoria);

}
