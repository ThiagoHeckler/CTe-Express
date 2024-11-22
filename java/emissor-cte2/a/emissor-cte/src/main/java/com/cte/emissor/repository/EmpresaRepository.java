package com.cte.emissor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cte.emissor.entity.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	// Consultas personalizadas, se necessário
}
