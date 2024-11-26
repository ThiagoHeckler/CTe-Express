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

import com.thiago.cteemisor.entity.Adiministradores;
import com.thiago.cteemisor.service.AdiministradoresService;

@RestController
@RequestMapping("/api/adiministradores")
public class AdiministradoresController {

    @Autowired
    private AdiministradoresService adiministradoresService;

    // Cria um novo administrador
    @PostMapping
    public ResponseEntity<Adiministradores> criarAdministrador(@RequestBody Adiministradores administrador) {
        Adiministradores novoAdministrador = adiministradoresService.salvarAdministrador(administrador);
        return new ResponseEntity<>(novoAdministrador, HttpStatus.CREATED);
    }

    // Retorna todos os administradores
    @GetMapping
    public ResponseEntity<List<Adiministradores>> listarTodosAdministradores() {
        List<Adiministradores> administradores = adiministradoresService.buscarTodosAdministradores();
        return new ResponseEntity<>(administradores, HttpStatus.OK);
    }

    // Retorna um administrador pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Adiministradores> buscarAdministradorPorId(@PathVariable Long id) {
        Optional<Adiministradores> administrador = adiministradoresService.buscarAdministradorPorId(id);
        return administrador
            .map(admin -> new ResponseEntity<>(admin, HttpStatus.OK))
            .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Atualiza um administrador pelo ID
    @PutMapping("/{id}")
    public ResponseEntity<Adiministradores> atualizarAdministrador(
            @PathVariable Long id, 
            @RequestBody Adiministradores administradorAtualizado) {
        try {
            Adiministradores administrador = adiministradoresService.atualizarAdministrador(id, administradorAtualizado);
            return new ResponseEntity<>(administrador, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Exclui um administrador pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAdministrador(@PathVariable Long id) {
        adiministradoresService.deletarAdministrador(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
