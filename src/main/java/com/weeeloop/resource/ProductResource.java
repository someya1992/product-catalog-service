package com.weeeloop.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weeeloop.dto.Products;
import com.weeeloop.exception.ResourceNotFoundException;
import com.weeeloop.mapper.DtoMapper;
import com.weeeloop.model.Product;
import com.weeeloop.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/products")
@Api(value="Product Information", description="Get the related information of all devices")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@ApiOperation(value = "View a list of available devices", response = Products.class)
	@GetMapping(path="/all",produces = "application/json")
	public ResponseEntity<Products> getProduct()
	{
		List<Product> productList = service.getProduct(); 
		return ResponseEntity.ok().body(DtoMapper.getDevices(productList));
	}

	@ApiOperation(value = "View a list of available devices of particular brand", response = Products.class)
	@GetMapping(path="/{brand}", produces = "application/json")
	public ResponseEntity<Products> getProductbyBrand(@PathVariable String brand) throws ResourceNotFoundException
	{
		List<Product> productList = service.getProductbyBrand(brand); 
		return ResponseEntity.ok().body(DtoMapper.getDevices(productList));
	}	
	
}
