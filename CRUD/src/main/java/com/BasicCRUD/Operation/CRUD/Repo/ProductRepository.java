package com.BasicCRUD.Operation.CRUD.Repo;

import com.BasicCRUD.Operation.CRUD.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
