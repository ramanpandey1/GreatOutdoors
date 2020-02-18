package com.capgemini.greatoutdoors.dto;

public class ProductDTO {
int productCategory,productQuantity;
String productId,productName,color, dimension, specification, manufacturer;
double productPrice;


public ProductDTO(int productCategory, int productQuantity, String productId, String productName, String color,
		String dimension, String specification, String manufacturer, double productPrice) {
	super();
	this.productCategory = productCategory;
	this.productQuantity = productQuantity;
	this.productId = productId;
	this.productName = productName;
	this.color = color;
	this.dimension = dimension;
	this.specification = specification;
	this.manufacturer = manufacturer;
	this.productPrice = productPrice;
}
public int getProductCategory() {
	return productCategory;
}
public void setProductCategory(int productCategory) {
	this.productCategory = productCategory;
}
public int getProductQuantity() {
	return productQuantity;
}
public void setProductQuantity(int productQuantity) {
	this.productQuantity = productQuantity;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getDimension() {
	return dimension;
}
public void setDimension(String dimension) {
	this.dimension = dimension;
}
public String getSpecification() {
	return specification;
}
public void setSpecification(String specification) {
	this.specification = specification;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}






	
}
