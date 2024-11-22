package com.thiago.cteemisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cteemisor.entity.Compras;


@Repository
public interface ComprasRepository extends JpaRepository<Compras, Long> {

}
