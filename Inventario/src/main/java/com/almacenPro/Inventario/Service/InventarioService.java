package com.almacenPro.Inventario.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.almacenPro.Inventario.Model.Inventario;
import com.almacenPro.Inventario.Repository.InventarioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class InventarioService {

    private InventarioRepository repository;

    public Inventario registrarMovimiento(Inventario movimiento) {
        movimiento.setTipoMovimiento(movimiento.getTipoMovimiento().toUpperCase());
        return repository.save(movimiento);
    }

    public Integer StockActual(String sku) {
        List<Inventario> movimientos = repository.findBySku(sku);
        return movimientos.stream()
                .mapToInt(m -> m.getTipoMovimiento().equals("IN") ? m.getCantidad() : -m.getCantidad())
                .sum();
    }

    public List<Inventario> getMovimientosByRack(String rackId) {
        return repository.findByRackId(rackId);
    }

    public List<Inventario> findByNombreProducto(String nombre) {
        return repository.findByNombreProductoContainingIgnoreCase(nombre);
    }


}
