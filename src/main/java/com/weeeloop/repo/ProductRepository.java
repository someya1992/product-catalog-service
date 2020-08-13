package com.weeeloop.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weeeloop.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{	
	List<Product> findByBrand(String brand);
}
