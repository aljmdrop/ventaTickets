package com.almacenPro.Inventario.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.almacenPro.Inventario.Model.Inventario;
import com.almacenPro.Inventario.Service.InventarioService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    private InventarioService service;

    @PostMapping("/movimiento")
    public ResponseEntity<Inventario> registrarMovimiento(@Valid @RequestBody Inventario movimiento) {
        return new ResponseEntity<>(service.registrarMovimiento(movimiento), HttpStatus.CREATED);
    }

    @GetMapping("/stock/{sku}")
    public ResponseEntity<Integer> getStockActual(@PathVariable String sku) {
        return ResponseEntity.ok(service.StockActual(sku));
    }

    @GetMapping("/rack/{rackId}")
    public ResponseEntity<List<Inventario>> getMovimientosByRack(@PathVariable String rackId) {
        return ResponseEntity.ok(service.getMovimientosByRack(rackId));
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Inventario>> findByNombreProducto(@RequestParam String nombre) {
        return ResponseEntity.ok(service.findByNombreProducto(nombre));
    }
    
}
