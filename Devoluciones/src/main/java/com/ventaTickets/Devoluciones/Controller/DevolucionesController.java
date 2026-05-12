package com.ventaTickets.Devoluciones.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ventaTickets.Devoluciones.Model.Devoluciones;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/devoluciones")
public class DevolucionesController {
    private final Devoluciones service = new Devoluciones();

    @PostMapping
    public ResponseEntity<Devoluciones> guardar(@Valid @RequestBody Devoluciones devolucion){
        Devoluciones nuevaDevolucion = service.guardar(devolucion);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.procesarDevolucion(devolucion));
    }
    
}
