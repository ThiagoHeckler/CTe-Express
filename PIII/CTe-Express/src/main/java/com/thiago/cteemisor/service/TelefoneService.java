package com.thiago.cteemisor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.cteemisor.entity.Telefone;
import com.thiago.cteemisor.repository.TelefoneRepository;

@Service
public class TelefoneService {

    private final TelefoneRepository telefoneRepository;

    @Autowired
    public TelefoneService(TelefoneRepository telefoneRepository) {
        this.telefoneRepository = telefoneRepository;
    }

    // Método para salvar um telefone
    public Telefone saveTelefone(Telefone telefone) {
        return telefoneRepository.save(telefone);
    }

    // Método para obter todos os telefones
    public List<Telefone> getAllTelefones() {
        return telefoneRepository.findAll();
    }

    // Método para obter um telefone pelo ID
    public Optional<Telefone> getTelefoneById(Long id) {
        return telefoneRepository.findById(id);
    }

    // Método para atualizar um telefone
    public Telefone updateTelefone(Long id, Telefone telefoneDetails) {
        if (telefoneRepository.existsById(id)) {
            telefoneDetails.setId(id);
            return telefoneRepository.save(telefoneDetails);
        }
        return null;
    }

    // Método para excluir um telefone
    public boolean deleteTelefone(Long id) {
        if (telefoneRepository.existsById(id)) {
            telefoneRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
