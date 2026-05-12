package com.ventaTickets.Artistas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ventaTickets.Artistas.Model.Artistas;

@Repository
public interface ArtistasRepository extends JpaRepository<Artistas, Long> {
     
}
