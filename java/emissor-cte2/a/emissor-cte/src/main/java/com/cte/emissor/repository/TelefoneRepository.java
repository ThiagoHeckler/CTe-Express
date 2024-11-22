package com.cte.emissor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cte.emissor.entity.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long>{

}
