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

import br.com.fiap.receitas.model.Perfil;
import br.com.fiap.receitas.repository.PerfilRepository;

@RestController
@RequestMapping("perfil")
public class PerfilResource {
	@Autowired
	private PerfilRepository perfilRepository ;
	
	// mostra todos os usuarios cadastrados ao entrar na url localhost:8080/usuario
	@GetMapping
	public List<Perfil> listar() {return perfilRepository.findAll();}
	
	// permite inserção pelo metodo post no postman
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Perfil cadastrar (@RequestBody Perfil perfil ) {
		return perfilRepository.save(perfil);
	}
	
	// permite a exclusão de usuarios pelo metodo DELETE no postman
    @DeleteMapping("{id}") 
    public void remover(@PathVariable int id) { 
    	perfilRepository.deleteById(id); 
    } 
}
