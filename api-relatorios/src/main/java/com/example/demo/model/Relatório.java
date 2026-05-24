package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Relatório {
	private Long id;
	private LocalDate dataGeracao;
	private int totalTarefas;
	private int concluidas;
	private int pendentes;
public Relatório() {
	super();
}

public Relatório(Long id, LocalDate dataGeracao, int totalTarefas, int concluidas, int pendentes) {
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

public LocalDate getDataGeracao() {
	return dataGeracao;
}

public void setDataGeracao(LocalDate dataGeracao) {
	this.dataGeracao = dataGeracao;
}

public int getTotalTarefas() {
	return totalTarefas;
}

public void setTotalTarefas(int totalTarefas) {
	this.totalTarefas = totalTarefas;
}

public int getConcluidas() {
	return concluidas;
}

public void setConcluidas(int concluidas) {
	this.concluidas = concluidas;
}

public int getPendentes() {
	return pendentes;
}

public void setPendentes(int pendentes) {
	this.pendentes = pendentes;
}


}
