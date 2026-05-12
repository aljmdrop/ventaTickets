package com.ventaTickets.Devoluciones.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Devoluciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 200, nullable = false)
    private String motivo;

    @Column(length = 10, nullable = false)
    private String estado; //pendiente, aprobada, rechazada

    @Column(nullable = false)
    private LocalDate fechaSolicitud;

    @Column(nullable = true)
    private LocalDate fechaDevolucion;

    @NotBlank
    private Long idVenta;
}
