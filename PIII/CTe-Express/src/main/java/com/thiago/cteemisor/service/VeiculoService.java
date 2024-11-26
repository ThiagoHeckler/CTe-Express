package com.thiago.cteemisor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.cteemisor.entity.Veiculo;
import com.thiago.cteemisor.repository.VeiculoRepository;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;

    @Autowired
    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    // Método para salvar um veículo
    public Veiculo saveVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    // Método para obter todos os veículos
    public List<Veiculo> getAllVeiculos() {
        return veiculoRepository.findAll();
    }

    // Método para obter um veículo pelo ID
    public Optional<Veiculo> getVeiculoById(Long id) {
        return veiculoRepository.findById(id);
    }

    // Método para atualizar um veículo
    public Veiculo updateVeiculo(Long id, Veiculo veiculoDetails) {
        if (veiculoRepository.existsById(id)) {
            veiculoDetails.setId(id);
            return veiculoRepository.save(veiculoDetails);
        }
        return null;
    }

    // Método para excluir um veículo
    public boolean deleteVeiculo(Long id) {
        if (veiculoRepository.existsById(id)) {
            veiculoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
