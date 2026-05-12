package com.ventaTickets.Artistas.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ventaTickets.Artistas.Model.Artistas;
import com.ventaTickets.Artistas.Services.ArtistasService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/artistas")
public class ArtistasController {
    private final ArtistasService service;
    
    public ArtistasController(ArtistasService service) {
        this.service = service;
    }
    
    @GetMapping
    public List<Artistas> listarTodos(){
        return service.listarTodos();
    }

    @PostMapping
    public Artistas guardar(@Valid @RequestBody Artistas artista){
        return service.guardar(artista);
    }
}
