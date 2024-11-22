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

import com.thiago.cteemisor.entity.Cte;
import com.thiago.cteemisor.service.CteService;

@RestController
@RequestMapping("/api/cte")
public class CteController {

    @Autowired
    private CteService cteService;

    // Endpoint para salvar um novo Cte
    @PostMapping
    public ResponseEntity<Cte> createCte(@RequestBody Cte cte) {
        Cte savedCte = cteService.saveCte(cte);
        return new ResponseEntity<>(savedCte, HttpStatus.CREATED);
    }

    // Endpoint para buscar todos os Ctes
    @GetMapping
    public List<Cte> getAllCtes() {
        return cteService.getAllCtes();
    }

    // Endpoint para buscar um Cte por ID
    @GetMapping("/{id}")
    public ResponseEntity<Cte> getCteById(@PathVariable Long id) {
        Optional<Cte> cte = cteService.getCteById(id);
        if (cte.isPresent()) {
            return new ResponseEntity<>(cte.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para atualizar um Cte
    @PutMapping("/{id}")
    public ResponseEntity<Cte> updateCte(@PathVariable Long id, @RequestBody Cte cteDetails) {
        Cte updatedCte = cteService.updateCte(id, cteDetails);
        if (updatedCte != null) {
            return new ResponseEntity<>(updatedCte, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para excluir um Cte por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCte(@PathVariable Long id) {
        cteService.deleteCte(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
