package com.ventaTickets.Recintos.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class recintosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "sector", nullable = false)
    private String sector;

    @Column(name = "fila", nullable = false)
    private String fila;

    @Column(unique = true, nullable = false)
    private Integer asiento;

    @Column(length=20, nullable = false)
    private String tipo;
    
}
