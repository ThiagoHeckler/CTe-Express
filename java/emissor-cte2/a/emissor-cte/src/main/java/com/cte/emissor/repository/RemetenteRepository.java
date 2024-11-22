package com.cte.emissor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cte.emissor.entity.Remetente;

@Repository
public interface RemetenteRepository extends JpaRepository<Remetente, Long>{

}
