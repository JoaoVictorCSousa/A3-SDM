package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Relatório;

@Repository
public interface RelatorioRepository extends JpaRepository<Relatório, Long> {

}
