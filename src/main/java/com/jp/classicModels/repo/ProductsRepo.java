package com.jp.classicModels.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jp.classicModels.domain.Products;

@Repository
public interface ProductsRepo extends JpaRepository<Products, String> {

}
