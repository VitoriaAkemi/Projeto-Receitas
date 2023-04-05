package br.com.fiap.receitas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.receitas.model.Receita;

public interface ReceitaRepository extends JpaRepository<Receita, Integer>{
	
	// o CRUD JÁ É FEITO DE FORMA AUTOMATICA AQUI

	List<Receita> findById(int id);
	List<Receita> findByTitulo(String titulo);
	//List<Receita> findByDataCadastro(Calendar dataCadastro);
	List<Receita> findByQuantidadeIngrediente(int quantidadeIngrediente);
	//List<Receita> findByTempoPrepado(Calendar tempoPreparo);
	List<Receita> findByQuantidadeRendimento(int quantidadeRendimento);
	List<Receita> findByCategoria(String categoria);
	
}
