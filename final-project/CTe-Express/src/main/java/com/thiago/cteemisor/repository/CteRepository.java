package com.thiago.cteemisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cteemisor.entity.Cte;


@Repository
public interface CteRepository extends JpaRepository<Cte, Long>{


}
