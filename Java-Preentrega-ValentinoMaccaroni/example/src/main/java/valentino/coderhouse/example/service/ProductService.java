package tomi.coderhouse.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tomi.coderhouse.example.entity.Product;
import tomi.coderhouse.example.repository.ProductoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductoRepository productoRepository;

    // Método para encontrar todos los productos.
    public List<Product> findAll() {
        return productoRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productoRepository.findById(id);
    }

    // Método para calcular el total de una lista de productos
    public Double calcularTotal(List<Product> productos) {
        double total = 0;
        for (Product producto : productos) {
            total += producto.getPrice() * producto.getCantidad();
        }
        return total;
    }
}








