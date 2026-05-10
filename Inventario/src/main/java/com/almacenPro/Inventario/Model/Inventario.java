package com.almacenPro.Inventario.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "inventario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre del producto es obligatorio" )
    @Column(nullable = false)
    private String nombreProducto;
    
    @NotBlank(message = "El SKU del producto es obligatorio")
    @Column(nullable = false)
    private String sku;
    
    @NotBlank(message = "El ID del rack/ubicación es obligatorio")
    @Column(name = "rack_id", nullable = false)
    private String rackId;

    @NotBlank(message = "El tipo de movimiento debe ser IN o OUT")
    @Column(name = "tipo_movimiento", nullable = false)
    private String tipoMovimiento; // Valores: "IN", "OUT"

    @NotNull(message = "La cantidad es obligatoria")
    @Min(value = 1, message = "La cantidad debe ser mayor a 0")
    @Column(nullable = false)
    private Integer cantidad;

    @Column(name = "fecha_creacion", nullable = false, updatable = false)
    private LocalDateTime fFechaCreacion;

    @PrePersist
    protected void onCreate() {
        this.fFechaCreacion = LocalDateTime.now();
    }
}
