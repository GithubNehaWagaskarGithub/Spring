package com.SringMVCDesignPattern1.MVCDesignPattern1.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
	
	private int productId;
	private String productName;
	private double perProductPrice;
	private int productUnits;
	private double productRevenue;
	
	public Product(int productId, String productName, double perProductPrice, int productUnits, double productRevenue) {
	
		this.productId = productId;
		this.productName = productName;
		this.perProductPrice = perProductPrice;
		this.productUnits = productUnits;
		this.productRevenue = productRevenue;
	}
	
	
}
