package com.thiago.cteemisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cteemisor.entity.Remetente;


@Repository
public interface RemetenteRepository extends JpaRepository<Remetente, Long>{


}
