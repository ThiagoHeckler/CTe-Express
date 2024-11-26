package com.thiago.cteemisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cteemisor.entity.Financeiro;


@Repository
public interface FinanceiroRepository extends JpaRepository<Financeiro, Long>{


}
