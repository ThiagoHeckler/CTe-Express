package com.thiago.cteemisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cteemisor.entity.Destinatario;

@Repository

public interface DestinatariosRepository extends JpaRepository<Destinatario, Long>{

}
