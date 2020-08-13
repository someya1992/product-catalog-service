package com.weeeloop.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.weeeloop.model.Product;

//@FeignClient(name = "product-info-service")
public interface ProductInfoProxyService {
	
	@GetMapping("/products/{productId}")
	public Product getProductInfo(@PathVariable("productId")String productId);

}
