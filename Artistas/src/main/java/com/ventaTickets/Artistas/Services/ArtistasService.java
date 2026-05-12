package com.ventaTickets.Artistas.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ventaTickets.Artistas.Model.Artistas;
import com.ventaTickets.Artistas.Repository.ArtistasRepository;

@Service
public class ArtistasService {
    private final ArtistasRepository repository;

    public ArtistasService(ArtistasRepository repository) {
        this.repository = repository;
    }

    public List<Artistas> listarTodos(){
        return repository.findAll();
    }

    public Artistas guardar(Artistas artista){
        return repository.save(artista);
    }   
}
