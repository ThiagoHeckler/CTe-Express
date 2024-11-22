package com.cte.emissor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cte.emissor.entity.Empresa;
import com.cte.emissor.service.EmpresaService;

@RestController
@RequestMapping("/api/empresas") // Define o endpoint base
public class EmpresaController {
	 @Autowired
	    private EmpresaService empresaService;
	 	
	 
	    // CREATE - Criar nova empresa
	    @PostMapping
	    public ResponseEntity<Empresa> criarEmpresa(@RequestBody Empresa empresa) {
	        Empresa novaEmpresa = empresaService.criarEmpresa(empresa);
	        return new ResponseEntity<>(novaEmpresa, HttpStatus.CREATED);
	    }

	    // READ - Listar todas as empresas
	    @GetMapping
	    public ResponseEntity<List<Empresa>> listarEmpresas() {
	        List<Empresa> empresas = empresaService.listarEmpresas();
	        return new ResponseEntity<>(empresas, HttpStatus.OK);
	    }

	    // READ - Buscar empresa por ID
	    @GetMapping("/{id}")
	    public ResponseEntity<Empresa> buscarEmpresaPorId(@PathVariable Long id) {
	        Optional<Empresa> empresa = empresaService.buscarEmpresaPorId(id);
	        return empresa.map(ResponseEntity::ok)
	                      .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }

	    // UPDATE - Atualizar uma empresa existente
	    @PutMapping("/{id}")
	    public ResponseEntity<Empresa> atualizarEmpresa(@PathVariable Long id, @RequestBody Empresa empresa) {
	        Optional<Empresa> empresaExistente = empresaService.buscarEmpresaPorId(id);
	        if (empresaExistente.isPresent()) {
	            empresa.setId(id); // Garantir que o ID permanece o mesmo
	            Empresa empresaAtualizada = empresaService.atualizarEmpresa(empresa);
	            return new ResponseEntity<>(empresaAtualizada, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    // DELETE - Deletar uma empresa existente
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deletarEmpresa(@PathVariable Long id) {
	        Optional<Empresa> empresaExistente = empresaService.buscarEmpresaPorId(id);
	        if (empresaExistente.isPresent()) {
	            empresaService.deletarEmpresa(id);
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
}
