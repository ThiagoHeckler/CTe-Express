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

import com.thiago.cteemisor.entity.Compras;
import com.thiago.cteemisor.service.CompraService;

@RestController
@RequestMapping("/api/compras")
public class CompraController {
	@Autowired
    private CompraService compraService;

    // Endpoint para listar todas as compras
    @GetMapping
    public List<Compras> listarCompras() {
        return compraService.listarCompras();
    }

    // Endpoint para buscar uma compra pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Compras> buscarCompra(@PathVariable Long id) {
        Optional<Compras> compra = compraService.buscarCompraPorId(id);
        return compra.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    // Endpoint para criar uma nova compra
    @PostMapping
    public ResponseEntity<Compras> criarCompra(@RequestBody Compras compra) {
        Compras novaCompra = compraService.salvarCompra(compra);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaCompra);
    }

    // Endpoint para atualizar uma compra existente
    @PutMapping("/{id}")
    public ResponseEntity<Compras> atualizarCompra(@PathVariable Long id, @RequestBody Compras compra) {
        Compras compraAtualizada = compraService.atualizarCompra(id, compra);
        if (compraAtualizada != null) {
            return ResponseEntity.ok(compraAtualizada);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    // Endpoint para deletar uma compra
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCompra(@PathVariable Long id) {
        if (compraService.deletarCompra(id)) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
