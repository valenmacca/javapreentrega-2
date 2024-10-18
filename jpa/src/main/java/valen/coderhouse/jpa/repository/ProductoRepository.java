package valen.coderhouse.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import valen.coderhouse.jpa.entity.Product;

public interface ProductoRepository extends JpaRepository<Product, Long> {
}
