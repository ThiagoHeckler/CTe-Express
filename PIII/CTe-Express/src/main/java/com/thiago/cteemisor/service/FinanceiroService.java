package com.thiago.cteemisor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.cteemisor.entity.Financeiro;
import com.thiago.cteemisor.repository.FinanceiroRepository;

@Service
public class FinanceiroService {

    private final FinanceiroRepository financeiroRepository;

    @Autowired
    public FinanceiroService(FinanceiroRepository financeiroRepository) {
        this.financeiroRepository = financeiroRepository;
    }

    // Método para salvar um financeiro
    public Financeiro saveFinanceiro(Financeiro financeiro) {
        return financeiroRepository.save(financeiro);
    }

    // Método para obter todos os registros financeiros
    public List<Financeiro> getAllFinanceiro() {
        return financeiroRepository.findAll();
    }

    // Método para obter um registro financeiro pelo ID
    public Optional<Financeiro> getFinanceiroById(Long id) {
        return financeiroRepository.findById(id);
    }

    // Método para atualizar um registro financeiro
    public Financeiro updateFinanceiro(Long id, Financeiro financeiroDetails) {
        if (financeiroRepository.existsById(id)) {
            financeiroDetails.setId(id);
            return financeiroRepository.save(financeiroDetails);
        }
        return null;
    }

    // Método para excluir um registro financeiro
    public boolean deleteFinanceiro(Long id) {
        if (financeiroRepository.existsById(id)) {
            financeiroRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
