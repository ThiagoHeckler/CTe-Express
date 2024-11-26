package com.thiago.cteemisor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.cteemisor.entity.Tomador;
import com.thiago.cteemisor.repository.TomadorRepository;

@Service
public class TomadorService {

    private final TomadorRepository tomadorRepository;

    @Autowired
    public TomadorService(TomadorRepository tomadorRepository) {
        this.tomadorRepository = tomadorRepository;
    }

    // Método para salvar um tomador
    public Tomador saveTomador(Tomador tomador) {
        return tomadorRepository.save(tomador);
    }

    // Método para obter todos os tomadores
    public List<Tomador> getAllTomadores() {
        return tomadorRepository.findAll();
    }

    // Método para obter um tomador pelo ID
    public Optional<Tomador> getTomadorById(Long id) {
        return tomadorRepository.findById(id);
    }

    // Método para atualizar um tomador
    public Tomador updateTomador(Long id, Tomador tomadorDetails) {
        if (tomadorRepository.existsById(id)) {
            tomadorDetails.setId(id);
            return tomadorRepository.save(tomadorDetails);
        }
        return null;
    }

    // Método para excluir um tomador
    public boolean deleteTomador(Long id) {
        if (tomadorRepository.existsById(id)) {
            tomadorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
