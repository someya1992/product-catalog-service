package com.weeeloop.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.weeeloop.model.CatalogItem;
import com.weeeloop.model.Product;
import com.weeeloop.model.ProductRating;
import com.weeeloop.service.ProductInfoProxyService;
import com.weeeloop.service.RatingDataServiceProxy;

@RestController
@RequestMapping("/catalog")
public class ProductCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	//@Autowired
	//RatingDataServiceProxy ratingDataServiceProxy;
	
	//@Autowired
	//ProductInfoProxyService  productInfoProxyService ;
	
	@Autowired
	WebClient.Builder builder ;
	
	@RequestMapping("/{productId}")
	public List<CatalogItem> getProduct(@PathVariable("productId")String productId)
	{
		//RestTemplate restTemplate = new RestTemplate();
		//restTemplate.getForObject("http://localhost:8082/products", Product.class);
		
		//ProductRating ratings = restTemplate.getForObject("http://rating-data-service/ratingdata/products/"+productId, ProductRating.class);
		
		//ProductRating ratings = ratingDataServiceProxy.getProductRating(productId);
		
		
		//return ratings.getProductRating().stream().map(rating -> {
				
//			builder.build().get().uri("http://localhost:8081/products/"+rating.getproductId(), Product.class)
//			.retrieve().bodyToMono(Product.class).block();
			//restTemplate.getForObject("http://product-info-service/products/"+rating.getproductId(), Product.class);
		//	productInfoProxyService.getProductInfo(rating.getproductId());
		//	return new CatalogItem("y", "test", rating.getRating());
			
		//}).collect(Collectors.toList());
		
		
		//return Collections.singletonList(new CatalogItem("mobile","m2",3));
		return null;
	}
	

}
