package valen.coderhouse.jpa.entity;

import jakarta.persistence.*;
import valen.coderhouse.jpa.model.Factura;

public class DetalleFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "factura_id")

    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Product
            producto;

}
