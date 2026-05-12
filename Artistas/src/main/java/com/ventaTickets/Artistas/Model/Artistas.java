package com.ventaTickets.Artistas.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "artistas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artistas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (unique = true, length = 20, nullable = false)
    private String nombre;

    @NotBlank
    @Column (unique = false, length = 20, nullable = false)
    private String generoMusical;

    @Column (length = 200, nullable = false)
    private String biografia;
}

