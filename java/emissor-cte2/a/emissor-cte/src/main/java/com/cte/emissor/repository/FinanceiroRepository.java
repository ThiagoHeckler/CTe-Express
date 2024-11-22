package com.cte.emissor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cte.emissor.entity.Financeiro;

@Repository
public interface FinanceiroRepository extends JpaRepository<Financeiro, Long>{

}
