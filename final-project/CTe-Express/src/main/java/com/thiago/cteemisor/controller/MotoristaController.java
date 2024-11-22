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

import com.thiago.cteemisor.entity.Motorista;
import com.thiago.cteemisor.service.MotoristaService;

@RestController
@RequestMapping("/api/motoristas")
public class MotoristaController {

    private final MotoristaService motoristaService;

    @Autowired
    public MotoristaController(MotoristaService motoristaService) {
        this.motoristaService = motoristaService;
    }

    // Endpoint para salvar um motorista
    @PostMapping
    public ResponseEntity<Motorista> createMotorista(@RequestBody Motorista motorista) {
        Motorista savedMotorista = motoristaService.saveMotorista(motorista);
        return new ResponseEntity<>(savedMotorista, HttpStatus.CREATED);
    }

    // Endpoint para obter todos os motoristas
    @GetMapping
    public ResponseEntity<List<Motorista>> getAllMotoristas() {
        List<Motorista> motoristas = motoristaService.getAllMotoristas();
        return new ResponseEntity<>(motoristas, HttpStatus.OK);
    }

    // Endpoint para obter um motorista pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Motorista> getMotoristaById(@PathVariable Long id) {
        Optional<Motorista> motorista = motoristaService.getMotoristaById(id);
        return motorista.map(ResponseEntity::ok)
                         .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint para atualizar um motorista
    @PutMapping("/{id}")
    public ResponseEntity<Motorista> updateMotorista(@PathVariable Long id, @RequestBody Motorista motoristaDetails) {
        Motorista updatedMotorista = motoristaService.updateMotorista(id, motoristaDetails);
        return updatedMotorista != null ? new ResponseEntity<>(updatedMotorista, HttpStatus.OK)
                                        : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint para excluir um motorista
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMotorista(@PathVariable Long id) {
        return motoristaService.deleteMotorista(id) ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
                                                     : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
