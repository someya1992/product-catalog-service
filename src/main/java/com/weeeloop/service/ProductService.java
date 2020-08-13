package com.weeeloop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weeeloop.exception.ResourceNotFoundException;
import com.weeeloop.model.Product;
import com.weeeloop.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getProduct() {
		 return productRepository.findAll();
		//return DataBuilder.getProducts();
	}

	public List<Product> getProductbyBrand(String brand) throws ResourceNotFoundException {
		if(productRepository.findByBrand(brand)==null)
			throw new ResourceNotFoundException("No device available under this brand");
		return productRepository.findByBrand(brand);

	//	if (DataBuilder.getProductsByBrand(brand) == null)
	//		throw new ResourceNotFoundException("No device available under this brand");
	//	return DataBuilder.getProductsByBrand(brand);

	}

}
