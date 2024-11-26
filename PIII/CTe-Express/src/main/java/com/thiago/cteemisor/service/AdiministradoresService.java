package com.thiago.cteemisor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.cteemisor.entity.Adiministradores;
import com.thiago.cteemisor.repository.AdmRepository;

@Service
public class AdiministradoresService {

    @Autowired
    private AdmRepository adiministradoresRepository;

    // Salva um novo administrador
    public Adiministradores salvarAdministrador(Adiministradores administrador) {
        return adiministradoresRepository.save(administrador);
    }

    // Busca todos os administradores
    public List<Adiministradores> buscarTodosAdministradores() {
        return adiministradoresRepository.findAll();
    }

    // Busca um administrador por ID
    public Optional<Adiministradores> buscarAdministradorPorId(Long id) {
        return adiministradoresRepository.findById(id);
    }

    // Atualiza um administrador existente
    public Adiministradores atualizarAdministrador(Long id, Adiministradores administradorAtualizado) {
        return adiministradoresRepository.findById(id)
            .map(admin -> {
                admin.setCpfAdmin(administradorAtualizado.getCpfAdmin());
                admin.setNome(administradorAtualizado.getNome());
                admin.setLogin(administradorAtualizado.getLogin());
                admin.setSenha(administradorAtualizado.getSenha());
                admin.setNascimento(administradorAtualizado.getNascimento());
                admin.setDataCadAdmin(administradorAtualizado.getDataCadAdmin());
                return adiministradoresRepository.save(admin);
            })
            .orElseThrow(() -> new RuntimeException("Administrador não encontrado com ID: " + id));
    }

    // Exclui um administrador por ID
    public void deletarAdministrador(Long id) {
        adiministradoresRepository.deleteById(id);
    }
}





