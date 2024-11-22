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

import com.thiago.cteemisor.entity.Telefone;
import com.thiago.cteemisor.service.TelefoneService;

@RestController
@RequestMapping("/api/telefones")
public class TelefoneController {

    private final TelefoneService telefoneService;

    @Autowired
    public TelefoneController(TelefoneService telefoneService) {
        this.telefoneService = telefoneService;
    }

    // Endpoint para salvar um telefone
    @PostMapping
    public ResponseEntity<Telefone> createTelefone(@RequestBody Telefone telefone) {
        Telefone savedTelefone = telefoneService.saveTelefone(telefone);
        return new ResponseEntity<>(savedTelefone, HttpStatus.CREATED);
    }

    // Endpoint para obter todos os telefones
    @GetMapping
    public ResponseEntity<List<Telefone>> getAllTelefones() {
        List<Telefone> telefones = telefoneService.getAllTelefones();
        return new ResponseEntity<>(telefones, HttpStatus.OK);
    }

    // Endpoint para obter um telefone pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Telefone> getTelefoneById(@PathVariable Long id) {
        Optional<Telefone> telefone = telefoneService.getTelefoneById(id);
        return telefone.map(ResponseEntity::ok)
                       .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint para atualizar um telefone
    @PutMapping("/{id}")
    public ResponseEntity<Telefone> updateTelefone(@PathVariable Long id, @RequestBody Telefone telefoneDetails) {
        Telefone updatedTelefone = telefoneService.updateTelefone(id, telefoneDetails);
        return updatedTelefone != null ? new ResponseEntity<>(updatedTelefone, HttpStatus.OK)
                                       : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint para excluir um telefone
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTelefone(@PathVariable Long id) {
        return telefoneService.deleteTelefone(id) ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
                                                   : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
