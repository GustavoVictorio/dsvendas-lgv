package com.lgv.dsvendas.dto;

import java.io.Serializable;

import com.lgv.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Number sum;

	public SaleSumDTO() {
	}

	public SaleSumDTO(Seller seller, Number sum) {
		sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Number getSum() {
		return sum;
	}

	public void setSum(Number sum) {
		this.sum = sum;
	}

}
