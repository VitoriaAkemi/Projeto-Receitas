package br.com.fiap.receitas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.receitas.model.Receita;
import br.com.fiap.receitas.repository.ReceitaRepository;

@RestController
@RequestMapping("receita") //camiho da url (localhost:8080/receita)
public class ReceitaResource {
	
	@Autowired
	private ReceitaRepository receitaRepository ;
	
	@GetMapping
	public List<Receita> listar() {return receitaRepository.findAll();}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = "/novaReceita")
	public Receita cadastrar (@RequestBody Receita receita ) {
		return receitaRepository.save(receita);
	}
	
    @DeleteMapping("{id}") 
    public void remover(@PathVariable int id) { 
    	receitaRepository.deleteById(id); 
    } 
}
