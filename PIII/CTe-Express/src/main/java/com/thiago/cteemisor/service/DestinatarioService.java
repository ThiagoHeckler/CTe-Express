package com.thiago.cteemisor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.cteemisor.entity.Destinatario;
import com.thiago.cteemisor.repository.DestinatariosRepository;

@Service
public class DestinatarioService {

    private final DestinatariosRepository destinatarioRepository;

    @Autowired
    public DestinatarioService(DestinatariosRepository destinatarioRepository) {
        this.destinatarioRepository = destinatarioRepository;
    }

    // Método para salvar um destinatário
    public Destinatario saveDestinatario(Destinatario destinatario) {
        return destinatarioRepository.save(destinatario);
    }

    // Método para obter todos os destinatários
    public List<Destinatario> getAllDestinatarios() {
        return destinatarioRepository.findAll();
    }

    // Método para obter um destinatário pelo ID
    public Optional<Destinatario> getDestinatarioById(Long id) {
        return destinatarioRepository.findById(id);
    }

    // Método para atualizar um destinatário
    public Destinatario updateDestinatario(Long id, Destinatario destinatarioDetails) {
        if(destinatarioRepository.existsById(id)) {
            destinatarioDetails.setId(id);
            return destinatarioRepository.save(destinatarioDetails);
        }
        return null;
    }

    // Método para excluir um destinatário
    public boolean deleteDestinatario(Long id) {
        if (destinatarioRepository.existsById(id)) {
            destinatarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
