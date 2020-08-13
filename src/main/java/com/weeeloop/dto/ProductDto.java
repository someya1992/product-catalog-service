package com.weeeloop.dto;

import java.util.List;

public class ProductDto {

	private Long productId;
	private String name;
	private String brand;
	private String model;
	private String type;
	private String description;

	public List<MobileFeatureDTO> getFeatures() {
		return features;
	}

	public void setFeatures(List<MobileFeatureDTO> features) {
		this.features = features;
	}

	private List<MobileFeatureDTO> features;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
