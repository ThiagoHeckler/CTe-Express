package com.cte.emissor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cte.emissor.entity.Empresa;
import com.cte.emissor.repository.EmpresaRepository;

@Service
public class EmpresaService {

	   @Autowired
	    private EmpresaRepository empresaRepository;

	    // CREATE
	    public Empresa criarEmpresa(Empresa empresa) {
	        return empresaRepository.save(empresa);
	    }

	    // READ - Buscar todas as empresas
	    public List<Empresa> listarEmpresas() {
	        return empresaRepository.findAll();
	    }

	    // READ - Buscar empresa por ID
	    public Optional<Empresa> buscarEmpresaPorId(Long id) {
	        return empresaRepository.findById(id);
	    }

	    // UPDATE
	    public Empresa atualizarEmpresa(Empresa empresa) {
	        return empresaRepository.save(empresa);
	    }

	    // DELETE
	    public void deletarEmpresa(Long id) {
	        empresaRepository.deleteById(id);
	    }
}
