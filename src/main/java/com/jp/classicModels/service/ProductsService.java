package com.jp.classicModels.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jp.classicModels.domain.Products;
import com.jp.classicModels.repo.ProductsRepo;

@Service
public class ProductsService {

	private ProductsRepo productsRepo;

	public ProductsService(ProductsRepo productsRepo) {
		super();
		this.productsRepo = productsRepo;
	}

	public Optional<Products> findProductByProductCode(String code) {

		return this.productsRepo.findById(code);

	}

}
