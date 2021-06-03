package com.jp.classicModels.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jp.classicModels.domain.Productlines;

@Repository
public interface ProductlinesRepo extends JpaRepository<String, Productlines> {

}
