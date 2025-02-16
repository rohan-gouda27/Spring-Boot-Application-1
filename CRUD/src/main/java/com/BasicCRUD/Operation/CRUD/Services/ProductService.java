package com.BasicCRUD.Operation.CRUD.Services;

import com.BasicCRUD.Operation.CRUD.Entities.Product;
import com.BasicCRUD.Operation.CRUD.Repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product getProductById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        if (repository.existsById(id)) {
            product.setId(id);
            return repository.save(product);
        }
        return null;
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}
