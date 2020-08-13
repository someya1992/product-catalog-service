package com.weeeloop.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.weeeloop.model.ProductRating;


//@FeignClient(name = "rating-data-service")
public interface RatingDataServiceProxy {

	@GetMapping("/ratingdata/products/{productId}")
	public ProductRating getProductRating(@PathVariable("productId") String productId);
}