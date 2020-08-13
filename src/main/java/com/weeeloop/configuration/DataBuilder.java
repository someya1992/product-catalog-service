package com.weeeloop.configuration;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.weeeloop.model.Product;

public class DataBuilder {
	
	private static List<Product> products = new LinkedList<Product>();
	
	public static List<Product> getProducts()
	{
		Product p1= new Product();
		p1.setId(1l);
		p1.setBrand("Apple");
		p1.setModel("XR");
		p1.setType("Mobile");
		p1.setName("Mobile");
		
		Product p2= new Product();
		p2.setId(2l);
		p2.setBrand("Apple");
		p2.setModel("11");
		p2.setType("Mobile");
		p2.setName("Mobile");
		
		Product p3= new Product();
		p3.setId(3l);
		p3.setBrand("Samsung");
		p3.setModel("Galaxy");
		p3.setType("Mobile");
		p3.setName("Mobile");
		
		Product p4= new Product();
		p4.setId(4l);
		p4.setBrand("Samsung");
		p4.setModel("Galaxy 6s");
		p4.setType("Mobile");
		p4.setName("Mobile");
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		return products;
	}
	
	
	public static List<Product> getProductsByBrand(String brand)
	{
	    List<Product> products = getProducts();
	    return products.stream().filter(product -> brand.equalsIgnoreCase(product.getBrand())).collect(Collectors.toList());
	}

}
