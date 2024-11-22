package com.cte.emissor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cte.emissor.entity.Cte;

@Repository
public interface CteRepository  extends JpaRepository<Cte, Long>{

}
