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

import com.thiago.cteemisor.entity.Destinatario;
import com.thiago.cteemisor.service.DestinatarioService;

@RestController
@RequestMapping("/api/destinatarios")
public class DestinatarioController {

    private final DestinatarioService destinatarioService;

    @Autowired
    public DestinatarioController(DestinatarioService destinatarioService) {
        this.destinatarioService = destinatarioService;
    }

    // Endpoint para salvar um destinatário
    @PostMapping
    public ResponseEntity<Destinatario> createDestinatario(@RequestBody Destinatario destinatario) {
        Destinatario savedDestinatario = destinatarioService.saveDestinatario(destinatario);
        return new ResponseEntity<>(savedDestinatario, HttpStatus.CREATED);
    }

    // Endpoint para obter todos os destinatários
    @GetMapping
    public ResponseEntity<List<Destinatario>> getAllDestinatarios() {
        List<Destinatario> destinatarios = destinatarioService.getAllDestinatarios();
        return new ResponseEntity<>(destinatarios, HttpStatus.OK);
    }

    // Endpoint para obter um destinatário por ID
    @GetMapping("/{id}")
    public ResponseEntity<Destinatario> getDestinatarioById(@PathVariable Long id) {
        Optional<Destinatario> destinatario = destinatarioService.getDestinatarioById(id);
        return destinatario.map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint para atualizar um destinatário
    @PutMapping("/{id}")
    public ResponseEntity<Destinatario> updateDestinatario(@PathVariable Long id, @RequestBody Destinatario destinatarioDetails) {
        Destinatario updatedDestinatario = destinatarioService.updateDestinatario(id, destinatarioDetails);
        return updatedDestinatario != null ? new ResponseEntity<>(updatedDestinatario, HttpStatus.OK)
                                           : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint para excluir um destinatário
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDestinatario(@PathVariable Long id) {
        return destinatarioService.deleteDestinatario(id) ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
                                                           : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
