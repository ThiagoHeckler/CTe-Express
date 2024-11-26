package com.thiago.cteemisor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.cteemisor.entity.Remetente;
import com.thiago.cteemisor.repository.RemetenteRepository;

@Service
public class RemetenteService {

    private final RemetenteRepository remetenteRepository;

    @Autowired
    public RemetenteService(RemetenteRepository remetenteRepository) {
        this.remetenteRepository = remetenteRepository;
    }

    // Método para salvar um remetente
    public Remetente saveRemetente(Remetente remetente) {
        return remetenteRepository.save(remetente);
    }

    // Método para obter todos os remetentes
    public List<Remetente> getAllRemetentes() {
        return remetenteRepository.findAll();
    }

    // Método para obter um remetente pelo ID
    public Optional<Remetente> getRemetenteById(Long id) {
        return remetenteRepository.findById(id);
    }

    // Método para atualizar um remetente
    public Remetente updateRemetente(Long id, Remetente remetenteDetails) {
        if (remetenteRepository.existsById(id)) {
            remetenteDetails.setId(id);
            return remetenteRepository.save(remetenteDetails);
        }
        return null;
    }

    // Método para excluir um remetente
    public boolean deleteRemetente(Long id) {
        if (remetenteRepository.existsById(id)) {
            remetenteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
