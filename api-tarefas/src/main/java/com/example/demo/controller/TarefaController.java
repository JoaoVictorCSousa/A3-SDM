package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Tarefa;
import com.example.demo.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

	@Autowired
	private TarefaService service;

	@PostMapping
	public Tarefa criar(@RequestBody Tarefa tarefa) {
		return service.salvar(tarefa);

	}

	@GetMapping
	public List<Tarefa> listar() {
		return service.listar();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Tarefa> buscarPorId(@PathVariable Long id) {
		Tarefa tarefa = service.buscarPorId(id);
		return ResponseEntity.ok(tarefa);
	}

	@PutMapping("/{id}")
	public Tarefa atualizar(@PathVariable Long id, @RequestBody Tarefa tarefa) {

	    Tarefa tarefaExistente = service.buscarPorId(id);
	    if (tarefaExistente == null) {
	        return null;
	    }

	    tarefa.setId(id);
	    return service.salvar(tarefa);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		service.deletar(id);
	}
}