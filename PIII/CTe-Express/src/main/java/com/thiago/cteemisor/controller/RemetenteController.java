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

import com.thiago.cteemisor.entity.Remetente;
import com.thiago.cteemisor.service.RemetenteService;

@RestController
@RequestMapping("/api/remetentes")
public class RemetenteController {

    private final RemetenteService remetenteService;

    @Autowired
    public RemetenteController(RemetenteService remetenteService) {
        this.remetenteService = remetenteService;
    }

    // Endpoint para salvar um remetente
    @PostMapping
    public ResponseEntity<Remetente> createRemetente(@RequestBody Remetente remetente) {
        Remetente savedRemetente = remetenteService.saveRemetente(remetente);
        return new ResponseEntity<>(savedRemetente, HttpStatus.CREATED);
    }

    // Endpoint para obter todos os remetentes
    @GetMapping
    public ResponseEntity<List<Remetente>> getAllRemetentes() {
        List<Remetente> remetentes = remetenteService.getAllRemetentes();
        return new ResponseEntity<>(remetentes, HttpStatus.OK);
    }

    // Endpoint para obter um remetente pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Remetente> getRemetenteById(@PathVariable Long id) {
        Optional<Remetente> remetente = remetenteService.getRemetenteById(id);
        return remetente.map(ResponseEntity::ok)
                        .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint para atualizar um remetente
    @PutMapping("/{id}")
    public ResponseEntity<Remetente> updateRemetente(@PathVariable Long id, @RequestBody Remetente remetenteDetails) {
        Remetente updatedRemetente = remetenteService.updateRemetente(id, remetenteDetails);
        return updatedRemetente != null ? new ResponseEntity<>(updatedRemetente, HttpStatus.OK)
                                       : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint para excluir um remetente
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRemetente(@PathVariable Long id) {
        return remetenteService.deleteRemetente(id) ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
                                                    : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
