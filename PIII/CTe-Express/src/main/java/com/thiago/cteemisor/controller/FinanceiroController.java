package com.thiago.cteemisor.controller;

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

import com.thiago.cteemisor.entity.Financeiro;
import com.thiago.cteemisor.service.FinanceiroService;

@RestController
@RequestMapping("/api/financeiros")
public class FinanceiroController {

    private final FinanceiroService financeiroService;

    @Autowired
    public FinanceiroController(FinanceiroService financeiroService) {
        this.financeiroService = financeiroService;
    }

    // Endpoint para salvar um financeiro
    @PostMapping
    public ResponseEntity<Financeiro> createFinanceiro(@RequestBody Financeiro financeiro) {
        Financeiro savedFinanceiro = financeiroService.saveFinanceiro(financeiro);
        return new ResponseEntity<>(savedFinanceiro, HttpStatus.CREATED);
    }

    // Endpoint para obter todos os registros financeiros
    @GetMapping
    public ResponseEntity<List<Financeiro>> getAllFinanceiro() {
        List<Financeiro> financeiros = financeiroService.getAllFinanceiro();
        return new ResponseEntity<>(financeiros, HttpStatus.OK);
    }

    // Endpoint para obter um registro financeiro por ID
    @GetMapping("/{id}")
    public ResponseEntity<Financeiro> getFinanceiroById(@PathVariable Long id) {
        Optional<Financeiro> financeiro = financeiroService.getFinanceiroById(id);
        return financeiro.map(ResponseEntity::ok)
                         .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint para atualizar um registro financeiro
    @PutMapping("/{id}")
    public ResponseEntity<Financeiro> updateFinanceiro(@PathVariable Long id, @RequestBody Financeiro financeiroDetails) {
        Financeiro updatedFinanceiro = financeiroService.updateFinanceiro(id, financeiroDetails);
        return updatedFinanceiro != null ? new ResponseEntity<>(updatedFinanceiro, HttpStatus.OK)
                                        : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint para excluir um registro financeiro
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFinanceiro(@PathVariable Long id) {
        return financeiroService.deleteFinanceiro(id) ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
                                                       : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
