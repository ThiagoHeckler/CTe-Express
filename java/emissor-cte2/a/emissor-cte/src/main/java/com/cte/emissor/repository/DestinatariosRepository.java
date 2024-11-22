package com.cte.emissor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cte.emissor.entity.Destinatario;

@Repository
public interface DestinatariosRepository extends JpaRepository<Destinatario, Long>{

}
