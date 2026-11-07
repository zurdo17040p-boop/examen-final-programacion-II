package com.examen.ferreteria.repository;

import com.examen.ferreteria.dto.FacturaDetalleReporteDto;
import com.examen.ferreteria.entity.FacturaDetalle;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FacturaDetalleRepository extends JpaRepository<FacturaDetalle, Integer> {

    @Query("SELECT new com.examen.ferreteria.dto.FacturaDetalleReporteDto(" +
           "f.fechaFactura, CONCAT(c.nombre, ' ', c.apellido), a.nombre, d.cantidad, a.precio, d.precioUnitario, d.subtotal) " +
           "FROM FacturaDetalle d " +
           "JOIN d.idFactura f " +
           "JOIN f.idCliente c " +
           "JOIN d.idArticulo a " +
           "WHERE f.estado = true " +
           "ORDER BY f.fechaFactura, c.nombre, a.nombre")
    List<FacturaDetalleReporteDto> reporteClienteFacturaDetalle();
}
