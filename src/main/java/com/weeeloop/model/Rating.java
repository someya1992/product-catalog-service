package com.weeeloop.model;

public class Rating {
	
	private String productId;
	private int rating;
	
	public Rating()
	{
		
	}
	
	public Rating(String productId, int rating) {
		this.productId = productId;
		this.rating = rating;
	}
	
	public String getproductId() {
		return productId;
	}
	public void setproductId(String productId) {
		this.productId = productId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}	

}
