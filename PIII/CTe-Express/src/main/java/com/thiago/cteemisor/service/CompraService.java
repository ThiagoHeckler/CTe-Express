package com.thiago.cteemisor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.cteemisor.entity.Compras;
import com.thiago.cteemisor.repository.ComprasRepository;

@Service
public class CompraService {

    @Autowired
    private ComprasRepository comprasRepository;

    // Método para listar todas as compras
    public List<Compras> listarCompras() {
        return comprasRepository.findAll();
    }

    // Método para encontrar uma compra pelo ID
    public Optional<Compras> buscarCompraPorId(Long id) {
        return comprasRepository.findById(id);
    }

    // Método para criar uma nova compra
    public Compras salvarCompra(Compras compra) {
        return comprasRepository.save(compra);
    }

    // Método para atualizar uma compra existente
    public Compras atualizarCompra(Long id, Compras compra) {
        if (comprasRepository.existsById(id)) {
            compra.setId(id);
            return comprasRepository.save(compra);
        }
        return null;
    }

    // Método para deletar uma compra
    public boolean deletarCompra(Long id) {
        if (comprasRepository.existsById(id)) {
            comprasRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
