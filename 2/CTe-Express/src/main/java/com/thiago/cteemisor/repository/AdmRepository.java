package com.thiago.cteemisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cteemisor.entity.Adiministradores;

@Repository
public interface AdmRepository extends JpaRepository<Adiministradores, Long>{

}
