package com.thiago.cteemisor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.cteemisor.entity.Motorista;
import com.thiago.cteemisor.repository.MotoristaRepository;

@Service
public class MotoristaService {

    private final MotoristaRepository motoristaRepository;

    @Autowired
    public MotoristaService(MotoristaRepository motoristaRepository) {
        this.motoristaRepository = motoristaRepository;
    }

    // Método para salvar um motorista
    public Motorista saveMotorista(Motorista motorista) {
        return motoristaRepository.save(motorista);
    }

    // Método para obter todos os motoristas
    public List<Motorista> getAllMotoristas() {
        return motoristaRepository.findAll();
    }

    // Método para obter um motorista pelo ID
    public Optional<Motorista> getMotoristaById(Long id) {
        return motoristaRepository.findById(id);
    }

    // Método para atualizar um motorista
    public Motorista updateMotorista(Long id, Motorista motoristaDetails) {
        if (motoristaRepository.existsById(id)) {
            motoristaDetails.setId(id);
            return motoristaRepository.save(motoristaDetails);
        }
        return null;
    }

    // Método para excluir um motorista
    public boolean deleteMotorista(Long id) {
        if (motoristaRepository.existsById(id)) {
            motoristaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
