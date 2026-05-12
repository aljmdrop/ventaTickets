package com.ventaTickets.Artistas.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "artistas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtistasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (unique = true, length = 20, nullable = false)
    private String nombre;

    @Column (length = 20, nullable = false)
    private String apellido;

    @Column (length = 20, nullable = false)
    private String nacionalidad;

    @Column (length = 20, nullable = false)
    private String funciones;
}

