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

import com.thiago.cteemisor.entity.Tomador;
import com.thiago.cteemisor.service.TomadorService;

@RestController
@RequestMapping("/api/tomadores")
public class TomadorController {

    private final TomadorService tomadorService;

    @Autowired
    public TomadorController(TomadorService tomadorService) {
        this.tomadorService = tomadorService;
    }

    // Endpoint para salvar um tomador
    @PostMapping
    public ResponseEntity<Tomador> createTomador(@RequestBody Tomador tomador) {
        Tomador savedTomador = tomadorService.saveTomador(tomador);
        return new ResponseEntity<>(savedTomador, HttpStatus.CREATED);
    }

    // Endpoint para obter todos os tomadores
    @GetMapping
    public ResponseEntity<List<Tomador>> getAllTomadores() {
        List<Tomador> tomadores = tomadorService.getAllTomadores();
        return new ResponseEntity<>(tomadores, HttpStatus.OK);
    }

    // Endpoint para obter um tomador pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Tomador> getTomadorById(@PathVariable Long id) {
        Optional<Tomador> tomador = tomadorService.getTomadorById(id);
        return tomador.map(ResponseEntity::ok)
                      .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint para atualizar um tomador
    @PutMapping("/{id}")
    public ResponseEntity<Tomador> updateTomador(@PathVariable Long id, @RequestBody Tomador tomadorDetails) {
        Tomador updatedTomador = tomadorService.updateTomador(id, tomadorDetails);
        return updatedTomador != null ? new ResponseEntity<>(updatedTomador, HttpStatus.OK)
                                      : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint para excluir um tomador
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTomador(@PathVariable Long id) {
        return tomadorService.deleteTomador(id) ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
                                                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
