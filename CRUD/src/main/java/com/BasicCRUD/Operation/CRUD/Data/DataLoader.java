package com.BasicCRUD.Operation.CRUD.Data;

import com.BasicCRUD.Operation.CRUD.Entities.Product;
import com.BasicCRUD.Operation.CRUD.Repo.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader {
    @Bean
    CommandLineRunner initDatabase(ProductRepository repository) {
        return args -> {
            repository.saveAll(List.of(
                new Product(null, "Laptop", 75000),
                new Product(null, "Phone", 50000),
                new Product(null, "Headphones", 3000)
            ));
        };
    }
}
