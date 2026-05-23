package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Relatorio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDateTime dataGeracao;
	private Integer totalTarefas;
	private boolean concluidas;
	private boolean pendentes;
	
	
	//id, dataGeracao, totalTarefas, concluidas, pendentes	
	
	public Relatorio() {
		super();
	}


	public Relatorio(Long id, LocalDateTime dataGeracao, Integer totalTarefas, boolean concluidas, boolean pendentes) {
		super();
		this.id = id;
		this.dataGeracao = dataGeracao;
		this.totalTarefas = totalTarefas;
		this.concluidas = concluidas;
		this.pendentes = pendentes;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public LocalDateTime getDataGeracao() {
		return dataGeracao;
	}


	public void setDataGeracao(LocalDateTime dataGeracao) {
		this.dataGeracao = dataGeracao;
	}


	public Integer getTotalTarefas() {
		return totalTarefas;
	}


	public void setTotalTarefas(Integer totalTarefas) {
		this.totalTarefas = totalTarefas;
	}


	public boolean isConcluidas() {
		return concluidas;
	}


	public void setConcluidas(boolean concluidas) {
		this.concluidas = concluidas;
	}


	public boolean isPendentes() {
		return pendentes;
	}


	public void setPendentes(boolean pendentes) {
		this.pendentes = pendentes;
	}

}
