package com.jp.classicModels.rest;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jp.classicModels.domain.Products;
import com.jp.classicModels.service.ProductsService;

@RestController
public class ProductsController {

	private ProductsService productsService;

	public ProductsController(ProductsService productsService) {
		super();
		this.productsService = productsService;
	}

	@GetMapping("/getProductByCode/{code}")
	public Optional<Products> getProductByCode(@PathVariable String code) {
		return this.productsService.findProductByProductCode(code);
	}

}
