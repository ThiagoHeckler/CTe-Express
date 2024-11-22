package com.thiago.cteemisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cteemisor.entity.Veiculo;


@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

}
