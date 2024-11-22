package com.cte.emissor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cte.emissor.entity.Adiministradores;

@Repository
public interface AdmRepository extends JpaRepository<Adiministradores, String>{

}
