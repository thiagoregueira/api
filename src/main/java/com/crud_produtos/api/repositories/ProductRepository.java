package com.crud_produtos.api.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud_produtos.api.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

    Optional<ProductModel> findByName(String name);

}
