package com.almacenPro.Inventario.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.almacenPro.Inventario.Model.Inventario;

@Repository
public interface InventarioRepository {
    List<Inventario> findBySku(String sku);
    List<Inventario> findByRackId(String rackId);
    List<Inventario> findByNombreProductoContainingIgnoreCase(String nombreProducto);
    Inventario save(Inventario movimiento);
    
}
