package com.lgv.dsvendas.dto;

import java.io.Serializable;

import com.lgv.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Number visited;
	private Long deals;

	public SaleSuccessDTO() {
	}

	public SaleSuccessDTO(Seller seller, Number visited, Long deals) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Number getVisited() {
		return visited;
	}

	public void setVisited(Number visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

}
