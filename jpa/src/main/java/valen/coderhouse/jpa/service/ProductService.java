package valen.coderhouse.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import valen.coderhouse.jpa.entity.Product;
import valen.coderhouse.jpa.repository.ProductoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Product> findAll() {
        return productoRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productoRepository.findById(id);
    }


    public Double calcularTotal(List<Product> productos) {
        double total = 0;
        for (Product producto : productos) {
            total += producto.getPrice() * producto.getCantidad();
        }
        return total;
    }
}
