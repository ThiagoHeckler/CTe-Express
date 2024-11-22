package com.cte.emissor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cte.emissor.entity.Compras;

@Repository
public interface ComprasRepository extends JpaRepository<Compras, Long>{

}
